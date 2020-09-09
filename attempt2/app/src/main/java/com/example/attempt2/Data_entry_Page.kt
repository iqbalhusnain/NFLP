package com.example.attempt2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import androidx.appcompat.app.AppCompatActivity
// import java.util.*


class DataEntryPage : AppCompatActivity(), OnItemSelectedListener {
    var selectedAssociates = ""
    var selectedbank = ""
    var selectedcity = ""
    var selectedpartner = ""
    var selectedvenue = ""
    var selectedtrainer = ""
    var trainercell = ""
    var selectedDate = ""
    var selectedStartTime = ""
    var selectedEndTime = ""
    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_entry__page)


        val selectBanks = findViewById<Spinner>(R.id.inputLeadBank)
        val adapter1 =  ArrayAdapter.createFromResource(
            this,
            R.array.bank_names,
            android.R.layout.simple_spinner_item
        )
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        selectBanks.adapter = adapter1
        selectBanks.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedbank = parent?.getItemAtPosition(position).toString()

                // Toast.makeText(this@DataEntryPage,selectedAssociates,Toast.LENGTH_LONG).show()
            }
        }



        val selectAssociates: Spinner = findViewById(R.id.inputAssociateBank)
        val adapter2 = ArrayAdapter.createFromResource(
            this@DataEntryPage,
            R.array.associate_bank_names,
            android.R.layout.simple_spinner_item
        )
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        selectAssociates.adapter = adapter2
        selectAssociates.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                   selectedAssociates = parent?.getItemAtPosition(position).toString()

                // Toast.makeText(this@DataEntryPage,selectedAssociates,Toast.LENGTH_LONG).show()
            }
        }


        val partnerInstitute = findViewById<EditText>(R.id.inputPartnerName)
        partnerInstitute.setOnFocusChangeListener{ view, hasFocus ->
            if (!hasFocus){
                selectedpartner = partnerInstitute.text.toString()
                // Toast.makeText(this@participants_area, inputcnic1.text.toString(), Toast.LENGTH_LONG).show()
            }
        }


        val selectCity: Spinner = findViewById(R.id.inputDistrict)
        val adapter3 = ArrayAdapter.createFromResource(
            this,
            R.array.district_names,
            android.R.layout.simple_spinner_item
        )
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        selectCity.adapter = adapter3
        selectCity.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedcity = parent?.getItemAtPosition(position).toString()

                //Toast.makeText(this@DataEntryPage,selectedAssociates,Toast.LENGTH_LONG).show()
            }
        }



        val venue = findViewById<EditText>(R.id.inputVenue)
        venue.setOnFocusChangeListener{ view, hasFocus ->
            if (!hasFocus){
                selectedvenue = venue.text.toString()
                // Toast.makeText(this@participants_area, inputcnic1.text.toString(), Toast.LENGTH_LONG).show()
            }
        }


        val fieldTrainerName = findViewById<EditText>(R.id.inputFieldTrainerName)
        fieldTrainerName.setOnFocusChangeListener{ view, hasFocus ->
            if (!hasFocus){
                selectedtrainer = fieldTrainerName.text.toString()
                // Toast.makeText(this@participants_area, inputcnic1.text.toString(), Toast.LENGTH_LONG).show()
            }
        }


        val filedTrainerCell = findViewById<EditText>(R.id.inputFieldTrainerCell)
        filedTrainerCell.setOnFocusChangeListener{ view, hasFocus ->
            if (!hasFocus){
                trainercell = filedTrainerCell.text.toString()
                // Toast.makeText(this@participants_area, inputcnic1.text.toString(), Toast.LENGTH_LONG).show()
            }
        }


        val participantsNumber = findViewById<EditText>(R.id.inputparticipantsNumber).text


        val datePicker = findViewById<DatePicker>(R.id.inputDate)
        datePicker.setOnDateChangedListener { _, _, _, _ ->
            val dayOfMonth = datePicker.dayOfMonth
            val monthOfYear = datePicker.month
            val month = monthOfYear.toString().toInt()
            val month_real = month + 1
            val year =datePicker.year
            selectedDate = "$dayOfMonth/$month_real/$year"
        }

        val startTime = findViewById<TimePicker>(R.id.inputTimeStart)
        startTime.setOnTimeChangedListener { _, i, i2 ->
            val hours = startTime.hour
            val minutes = startTime.minute
            selectedStartTime = "$hours:$minutes"
        }

        val endTime = findViewById<TimePicker>(R.id.inputTimeEnd)
        endTime.setOnTimeChangedListener { _, i, i2 ->
            val hours2 = endTime.hour
            val minutes2 = endTime.minute
            selectedEndTime = "$hours2:$minutes2"
        }


        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener{
            Toast.makeText(
                this@DataEntryPage,
                "Bank = $selectedbank  Associate = $selectedAssociates   City = $selectedcity   Partner = $selectedpartner  Venue = $selectedvenue  Trainer = $selectedtrainer   trainercell = $trainercell  Date = $selectedDate  Start Time= $selectedStartTime  End Time = $selectedEndTime",
                Toast.LENGTH_LONG
            ).show()
            val intent = Intent(this@DataEntryPage, participants_area::class.java)
            intent.putExtra("participantsNumber", participantsNumber.toString())
            startActivity(intent)
        }
    }

    override fun onItemSelected(p0: AdapterView<*>, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


}

