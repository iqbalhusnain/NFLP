package com.example.attempt2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import androidx.appcompat.app.AppCompatActivity
import org.apache.poi.hssf.usermodel.HSSFFont
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.util.CellRangeAddress
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileOutputStream


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


    @SuppressLint("SimpleDateFormat", "SdCardPath")
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

            }
        }


        val partnerInstitute = findViewById<EditText>(R.id.inputPartnerName)

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

            }
        }



        val venue = findViewById<EditText>(R.id.inputVenue)
        venue.setOnFocusChangeListener{ view, hasFocus ->
            if (!hasFocus){
                selectedvenue = venue.text.toString()
            }
        }


        val fieldTrainerName = findViewById<EditText>(R.id.inputFieldTrainerName)
        fieldTrainerName.setOnFocusChangeListener{ view, hasFocus ->
            if (!hasFocus){
                selectedtrainer = fieldTrainerName.text.toString()
            }
        }


        val filedTrainerCell = findViewById<EditText>(R.id.inputFieldTrainerCell)
        filedTrainerCell.setOnFocusChangeListener{ view, hasFocus ->
            if (!hasFocus){
                trainercell = filedTrainerCell.text.toString()

            }
        }

        val participantsNumber = findViewById<EditText>(R.id.inputparticipantsNumber).text

        val datePicker = findViewById<DatePicker>(R.id.inputDate)

        val startTime = findViewById<TimePicker>(R.id.inputTimeStart)

        val endTime = findViewById<TimePicker>(R.id.inputTimeEnd)



        val nextButton = findViewById<Button>(R.id.nextButton)

        nextButton.setOnClickListener{

            selectedpartner = partnerInstitute.text.toString()

            val dayOfMonth = datePicker.dayOfMonth
            val monthOfYear = datePicker.month
            val month2 = monthOfYear.toString().toInt()
            val monthreal = month2 + 1
            val year2 =datePicker.year
            selectedDate = "$dayOfMonth-$monthreal-$year2"
            val hours = startTime.hour
            val minutes = startTime.minute
            selectedStartTime = "$hours:$minutes"
            val hours2 = endTime.hour
            val minutes2 = endTime.minute
            selectedEndTime = "$hours2:$minutes2"

//            Toast.makeText(
//                this@DataEntryPage,
//                "Bank = $selectedbank  Associate = $selectedAssociates   City = $selectedcity   Partner = $selectedpartner  Venue = $selectedvenue  Trainer = $selectedtrainer   trainercell = $trainercell  Date = $selectedDate  Start Time= $selectedStartTime  End Time = $selectedEndTime",
//                Toast.LENGTH_LONG
//            ).show()

            val wb: Workbook = XSSFWorkbook()
            val createHelper = wb.creationHelper
            val sheet: Sheet = wb.createSheet("Trainer Area")
            //sheet.addMergedRegion(CellRangeAddress(5, 7, 0,1))
            val style: CellStyle = wb.createCellStyle()
            style.setVerticalAlignment(VerticalAlignment.CENTER)
            val font: Font = wb.createFont()
            font.fontName = HSSFFont.FONT_ARIAL
            font.fontHeightInPoints = 10.toShort()
            font.bold = true
            style.wrapText = true
            style.setAlignment(HorizontalAlignment.CENTER)
            style.setFont(font)
            val style2 : CellStyle = wb.createCellStyle()
            style2.wrapText = true
            style2.setAlignment(HorizontalAlignment.CENTER)
            style2.setVerticalAlignment(VerticalAlignment.CENTER)

            val row1: Row = sheet.createRow(0)
            val cell1: Cell = row1.createCell(0)
            cell1.setCellValue("Lead bank")
            cell1.cellStyle = style;
            sheet.setColumnWidth(0, 40 * 256)
            val cell2 : Cell = row1.createCell(1)
            cell2.setCellValue("Associate Bank")
            cell2.cellStyle = style;
            val row2 : Row = sheet.createRow(1)
            val cell3 : Cell = row2.createCell(0)
            cell3.setCellValue(selectedbank)
            cell3.cellStyle = style2;
            val cell4 : Cell = row2.createCell(1)
            cell4.setCellValue(selectedAssociates)
            cell4.cellStyle = style2
            sheet.setColumnWidth(1, 20 * 256);
            val cell5: Cell = row1.createCell(2)
            cell5.setCellValue("Partner")
            cell5.cellStyle = style;
            val cell6 : Cell = row2.createCell(2)
            cell6.setCellValue(selectedpartner)
            cell6.cellStyle = style2;
            sheet.setColumnWidth(2, 40 * 256);
            val cell7 : Cell = row1.createCell(3)
            cell7.setCellValue("District")
            cell7.cellStyle = style
            val cell8 : Cell = row2.createCell(3)
            cell8.setCellValue(selectedcity)
            cell8.cellStyle = style2;
            sheet.setColumnWidth(3, 14 * 256);
            val cell9 : Cell = row1.createCell(4)
            cell9.setCellValue("Venue")
            cell9.cellStyle = style
            val cell10 : Cell = row2.createCell(4)
            cell10.setCellValue(selectedvenue)
            cell10.cellStyle = style2;
            sheet.setColumnWidth(4, 40 * 256);
            val cell11 : Cell = row1.createCell(5)
            cell11.setCellValue("Trainer Name")
            cell11.cellStyle = style
            val cell12 : Cell = row2.createCell(5)
            cell12.setCellValue(selectedtrainer)
            cell12.cellStyle = style2;
            sheet.setColumnWidth(5, 40 * 256);
            val cell13 : Cell = row1.createCell(6)
            cell13.setCellValue("Trainer Cell No.")
            cell13.cellStyle = style
            val cell14 : Cell = row2.createCell(6)
            cell14.setCellValue(trainercell)
            cell14.cellStyle = style2;
            sheet.setColumnWidth(6, 18 * 256);
            val cell15 : Cell = row1.createCell(7)
            cell15.setCellValue("Date")
            cell15.cellStyle = style
            val cell16 : Cell = row2.createCell(7)
            cell16.setCellValue(selectedDate)
            cell16.cellStyle = style2;
            sheet.setColumnWidth(7, 10 * 256);
            val cell17 : Cell = row1.createCell(8)
            cell17.setCellValue("Start Time")
            cell17.cellStyle = style
            val cell18 : Cell = row2.createCell(8)
            cell18.setCellValue(selectedStartTime)
            cell18.cellStyle = style2;
            sheet.setColumnWidth(8, 10 * 256);
            val cell19 : Cell = row1.createCell(9)
            cell19.setCellValue("End Time")
            cell19.cellStyle = style
            val cell20 : Cell = row2.createCell(9)
            cell20.setCellValue(selectedEndTime)
            cell20.cellStyle = style2;
            sheet.setColumnWidth(9, 10 * 256);
            val cell21 : Cell = row1.createCell(10)
            cell21.setCellValue("Participants NO.")
            cell21.cellStyle = style
            val cell22 : Cell = row2.createCell(10)
            cell22.setCellValue(participantsNumber.toString())
            cell22.cellStyle = style2;
            sheet.setColumnWidth(10, 15 * 256);


            val filename = "Internal Storage/$selectedDate"+"_"+selectedbank+".xlsx"
            val fileOut = FileOutputStream("/storage/emulated/0/$selectedDate"+"_"+selectedbank+".xlsx")
            wb.write(fileOut);
            fileOut.close()
            wb.close()

            Toast.makeText(this@DataEntryPage, "SpreadSheet Created At: $filename" , Toast.LENGTH_LONG).show()

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

