package com.example.attempt2

import android.annotation.SuppressLint
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import com.example.attempt2.ui.main.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_data_entry__page.*
import java.text.SimpleDateFormat
import java.util.*

class DataEntryPage : AppCompatActivity() {

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_entry__page)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        val selectBanks: Spinner = findViewById(R.id.inputLeadBank)
          val selectedBank = selectBanks.getSelectedItem()//.toString();

        ArrayAdapter.createFromResource(
            this,
            R.array.bank_names,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            selectBanks.adapter = adapter
        }

        val selectAssociates: Spinner = findViewById(R.id.inputAssociateBank)
            val selectedAssociates = selectAssociates.getSelectedItem()//.toString();

        ArrayAdapter.createFromResource(
            this,
            R.array.associate_bank_names,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            selectAssociates.adapter = adapter
        }

        val partnerInstitute = findViewById<EditText>(R.id.inputPartnerName).text//.toString()

        val selectCity: Spinner = findViewById(R.id.inputDistrict)
            val selectedCity = selectCity.getSelectedItem()//.toString();

        ArrayAdapter.createFromResource(
            this,
            R.array.district_names,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            selectCity.adapter = adapter
        }

        val venue = findViewById<EditText>(R.id.inputVenue).text//.toString()

        val fieldTrainerName = findViewById<EditText>(R.id.inputFieldTrainerName).text//.toString()

        val filedTrainerCell = findViewById<EditText>(R.id.inputFieldTrainerCell).text//.toString().toInt()

        val participantsNumber = findViewById<EditText>(R.id.inputparticipantsNumber).text

        val datePicker = findViewById<DatePicker>(R.id.inputDate)

            val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener{
            val intent = Intent(this@DataEntryPage, participants_area::class.java)
            intent.putExtra("participantsNumber", participantsNumber.toString())
            startActivity(intent)
        }
    }
}

//    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//        TODO("Not yet implemented")
//    }
//
//    override fun onNothingSelected(p0: AdapterView<*>?) {
//        TODO("Not yet implemented")
//    }
