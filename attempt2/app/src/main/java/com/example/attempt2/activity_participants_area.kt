package com.example.attempt2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.InputFilter
import android.text.InputFilter.LengthFilter
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import org.apache.poi.hssf.usermodel.HSSFFont
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


class participants_area : AppCompatActivity() {
    var selectedage1 = "";
    var selectedcontact1 = ""
    var selectedhasaccountalready = "";
    var selectedaddress1 = ""
    var selectedbank1 = "";
    var selectedaccountopened1 = ""
    var selectedname1 = "";
    var selectedacctype1: RadioButton? = null
    var selectedprofession1 = "";
    var selectedaccnumber1 = ""
    var selectedcnic1 = "";
    var selectedbranch1 = ""
    var selectedgender1 = ""
    var tempselectedbank1 = ""

    var selectedage2 = "";
    var selectedcontact2 = ""
    var selectedhasaccountalready2 = "";
    var selectedaddress2 = ""
    var selectedbank2 = "";
    var selectedaccountopened2 = ""
    var selectedname2 = "";
    var selectedacctype2: RadioButton? = null
    var selectedprofession2 = "";
    var selectedaccnumber2 = ""
    var selectedcnic2 = "";
    var selectedbranch2 = ""
    var selectedgender2 = ""
    var tempselectedbank2 = ""

    var selectedage3 = "";
    var selectedcontact3 = ""
    var selectedhasaccountalready3 = "";
    var selectedaddress3 = ""
    var selectedbank3 = "";
    var selectedaccountopened3 = ""
    var selectedname3 = "";
    var selectedacctype3: RadioButton? = null
    var selectedprofession3 = "";
    var selectedaccnumber3 = ""
    var selectedcnic3 = "";
    var selectedbranch3 = ""
    var selectedgender3 = ""
    var tempselectedbank3 = ""

    var selectedage4 = "";
    var selectedcontact4 = ""
    var selectedhasaccountalready4 = "";
    var selectedaddress4 = ""
    var selectedbank4 = "";
    var selectedaccountopened4 = ""
    var selectedname4 = "";
    var selectedacctype4: RadioButton? = null
    var selectedprofession4 = "";
    var selectedaccnumber4 = ""
    var selectedcnic4 = "";
    var selectedbranch4 = ""
    var selectedgender4 = ""
    var tempselectedbank4 = ""

    var selectedage5 = "";
    var selectedcontact5 = ""
    var selectedhasaccountalready5 = "";
    var selectedaddress5 = ""
    var selectedbank5 = "";
    var selectedaccountopened5 = ""
    var selectedname5 = "";
    var selectedacctype5: RadioButton? = null
    var selectedprofession5 = "";
    var selectedaccnumber5 = ""
    var selectedcnic5 = "";
    var selectedbranch5 = ""
    var selectedgender5 = ""
    var tempselectedbank5 = ""

    var selectedage6 = "";
    var selectedcontact6 = ""
    var selectedhasaccountalready6 = "";
    var selectedaddress6 = ""
    var selectedbank6 = "";
    var selectedaccountopened6 = ""
    var selectedname6 = "";
    var selectedacctype6: RadioButton? = null
    var selectedprofession6 = "";
    var selectedaccnumber6 = ""
    var selectedcnic6 = "";
    var selectedbranch6 = ""
    var selectedgender6 = ""
    var tempselectedbank6 = ""

    var selectedage7 = "";
    var selectedcontact7 = ""
    var selectedhasaccountalready7 = "";
    var selectedaddress7 = ""
    var selectedbank7 = "";
    var selectedaccountopened7 = ""
    var selectedname7 = "";
    var selectedacctype7: RadioButton? = null
    var selectedprofession7 = "";
    var selectedaccnumber7 = ""
    var selectedcnic7 = "";
    var selectedbranch7 = ""
    var selectedgender7 = ""
    var tempselectedbank7 = ""

    var selectedage8 = "";
    var selectedcontact8 = ""
    var selectedhasaccountalready8 = "";
    var selectedaddress8 = ""
    var selectedbank8 = "";
    var selectedaccountopened8 = ""
    var selectedname8 = "";
    var selectedacctype8: RadioButton? = null
    var selectedprofession8 = "";
    var selectedaccnumber8 = ""
    var selectedcnic8 = "";
    var selectedbranch8 = ""
    var selectedgender8 = ""
    var tempselectedbank8 = ""

    var selectedage9 = "";
    var selectedcontact9 = ""
    var selectedhasaccountalready9 = "";
    var selectedaddress9 = ""
    var selectedbank9 = "";
    var selectedaccountopened9 = ""
    var selectedname9 = "";
    var selectedacctype9: RadioButton? = null
    var selectedprofession9 = "";
    var selectedaccnumber9 = ""
    var selectedcnic9 = "";
    var selectedbranch9 = ""
    var selectedgender9 = ""
    var tempselectedbank9 = ""

    var selectedage10 = "";
    var selectedcontact10 = ""
    var selectedhasaccountalready10 = "";
    var selectedaddress10 = ""
    var selectedbank10 = "";
    var selectedaccountopened10 = ""
    var selectedname10 = "";
    var selectedacctype10: RadioButton? = null
    var selectedprofession10 = "";
    var selectedaccnumber10 = ""
    var selectedcnic10 = "";
    var selectedbranch10 = ""
    var selectedgender10 = ""
    var tempselectedbank10 = ""

    var selectedage11 = "";
    var selectedcontact11 = ""
    var selectedhasaccountalready11 = "";
    var selectedaddress11 = ""
    var selectedbank11 = "";
    var selectedaccountopened11 = ""
    var selectedname11 = "";
    var selectedacctype11: RadioButton? = null
    var selectedprofession11 = "";
    var selectedaccnumber11 = ""
    var selectedcnic11 = "";
    var selectedbranch11 = ""
    var selectedgender11 = ""
    var tempselectedbank11 = ""

    var selectedage12 = "";
    var selectedcontact12 = ""
    var selectedhasaccountalready12 = "";
    var selectedaddress12 = ""
    var selectedbank12 = "";
    var selectedaccountopened12 = ""
    var selectedname12 = "";
    var selectedacctype12: RadioButton? = null
    var selectedprofession12 = "";
    var selectedaccnumber12 = ""
    var selectedcnic12 = "";
    var selectedbranch12 = ""
    var selectedgender12 = ""
    var tempselectedbank12 = ""

    var selectedage13 = "";
    var selectedcontact13 = ""
    var selectedhasaccountalready13 = "";
    var selectedaddress13 = ""
    var selectedbank13 = "";
    var selectedaccountopened13 = ""
    var selectedname13 = "";
    var selectedacctype13: RadioButton? = null
    var selectedprofession13 = "";
    var selectedaccnumber13 = ""
    var selectedcnic13 = "";
    var selectedbranch13 = ""
    var selectedgender13 = ""
    var tempselectedbank13 = ""

    var selectedage14 = "";
    var selectedcontact14 = ""
    var selectedhasaccountalready14 = "";
    var selectedaddress14 = ""
    var selectedbank14 = "";
    var selectedaccountopened14 = ""
    var selectedname14 = "";
    var selectedacctype14: RadioButton? = null
    var selectedprofession14 = "";
    var selectedaccnumber14 = ""
    var selectedcnic14 = "";
    var selectedbranch14 = ""
    var selectedgender14 = ""
    var tempselectedbank14 = ""

    var selectedage15 = "";
    var selectedcontact15 = ""
    var selectedhasaccountalready15 = "";
    var selectedaddress15 = ""
    var selectedbank15 = "";
    var selectedaccountopened15 = ""
    var selectedname15 = "";
    var selectedacctype15: RadioButton? = null
    var selectedprofession15 = "";
    var selectedaccnumber15 = ""
    var selectedcnic15 = "";
    var selectedbranch15 = ""
    var selectedgender15 = ""
    var tempselectedbank15 = ""

    var selectedage16 = "";
    var selectedcontact16 = ""
    var selectedhasaccountalready16 = "";
    var selectedaddress16 = ""
    var selectedbank16 = "";
    var selectedaccountopened16 = ""
    var selectedname16 = "";
    var selectedacctype16: RadioButton? = null
    var selectedprofession16 = "";
    var selectedaccnumber16 = ""
    var selectedcnic16 = "";
    var selectedbranch16 = ""
    var selectedgender16 = ""
    var tempselectedbank16 = ""

    var selectedage17 = "";
    var selectedcontact17 = ""
    var selectedhasaccountalready17 = "";
    var selectedaddress17 = ""
    var selectedbank17 = "";
    var selectedaccountopened17 = ""
    var selectedname17 = "";
    var selectedacctype17: RadioButton? = null
    var selectedprofession17 = "";
    var selectedaccnumber17 = ""
    var selectedcnic17 = "";
    var selectedbranch17 = ""
    var selectedgender17 = ""
    var tempselectedbank17 = ""

    var selectedage18 = "";
    var selectedcontact18 = ""
    var selectedhasaccountalready18 = "";
    var selectedaddress18 = ""
    var selectedbank18 = "";
    var selectedaccountopened18 = ""
    var selectedname18 = "";
    var selectedacctype18: RadioButton? = null
    var selectedprofession18 = "";
    var selectedaccnumber18 = ""
    var selectedcnic18 = "";
    var selectedbranch18 = ""
    var selectedgender18 = ""
    var tempselectedbank18 = ""

    var selectedage19 = "";
    var selectedcontact19 = ""
    var selectedhasaccountalready19 = "";
    var selectedaddress19 = ""
    var selectedbank19 = "";
    var selectedaccountopened19 = ""
    var selectedname19 = "";
    var selectedacctype19: RadioButton? = null
    var selectedprofession19 = "";
    var selectedaccnumber19 = ""
    var selectedcnic19 = "";
    var selectedbranch19 = ""
    var selectedgender19 = ""
    var tempselectedbank19 = ""

    var selectedage20 = "";
    var selectedcontact20 = ""
    var selectedhasaccountalready20 = "";
    var selectedaddress20 = ""
    var selectedbank20 = "";
    var selectedaccountopened20 = ""
    var selectedname20 = "";
    var selectedacctype20: RadioButton? = null
    var selectedprofession20 = "";
    var selectedaccnumber20 = ""
    var selectedcnic20 = "";
    var selectedbranch20 = ""
    var selectedgender20 = ""
    var tempselectedbank20 = ""


    // function to limit the length of EditText
    fun EditText.setMaxLength(maxLength: Int) {
        filters = arrayOf(InputFilter.LengthFilter(maxLength))
    }

    @RequiresApi(Build.VERSION_CODES.N)
    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_participants_area)
        
        val participantsNumbers = intent.getStringExtra("participantsNumber")

        val filename = intent.getStringExtra("filename")

        val notice = findViewById<TextView>(R.id.notice)

        notice.text = "Your selected participant(s) number is $participantsNumbers," +
                "only details of $participantsNumbers participant(s) will go down to Spreadsheet , all other information will be discarded"

        val ageadapter = ArrayAdapter.createFromResource(
            this,
            R.array.age_input,
            android.R.layout.simple_spinner_item
        )
        ageadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val banknameadapter = ArrayAdapter.createFromResource(
            this,
            R.array.associate_bank_names,
            android.R.layout.simple_spinner_item
        )
        banknameadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val file = File(filename)
        val fip = FileInputStream(file)
        val workbook = XSSFWorkbook(fip)
        val sheet2: Sheet = workbook.createSheet("Participants Detail")
        val style: CellStyle = workbook.createCellStyle()
        style.setVerticalAlignment(VerticalAlignment.CENTER)
        val font: Font = workbook.createFont()
        font.fontName = HSSFFont.FONT_ARIAL
        font.fontHeightInPoints = 9.toShort()
        font.bold = true
        style.wrapText = true
        style.setAlignment(HorizontalAlignment.CENTER)
        style.setFont(font)
        val style2: CellStyle = workbook.createCellStyle()
        style2.wrapText = true
        style2.setAlignment(HorizontalAlignment.CENTER)
        style2.setVerticalAlignment(VerticalAlignment.CENTER)

        //------- For Participant 1 ------//

        val name1 = findViewById<EditText>(R.id.inputName1)
        val textname1 = findViewById<TextView>(R.id.name1)
        val age1 = findViewById<Spinner>(R.id.inputage1)
        val textage1 = findViewById<TextView>(R.id.age1)
        age1.adapter = ageadapter
        age1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) { selectedage1 = parent?.getItemAtPosition(position).toString() }
        }
        val gender1 = findViewById<TextView>(R.id.inputgender1)
        val textgender1 = findViewById<TextView>(R.id.gender1)
        val profession1 = findViewById<EditText>(R.id.inputprofession1)
        val textprofession1 = findViewById<TextView>(R.id.profession1)
        val cnic1 = findViewById<EditText>(R.id.inputcnic1)
        val textcnic1 = findViewById<TextView>(R.id.cnic1)
        cnic1.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic1.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed1: String = cnic1.text.toString()
                val size = ed1.length
                if (size == 13) {
                    val cnicinteger = cnic1.text.toString().toLong()
                    if (cnicinteger % 10 == 1L || cnicinteger % 10 == 3L || cnicinteger % 10 == 5L || cnicinteger % 10 == 7L || cnicinteger % 10 == 9L) {
                        gender1.text = "Male"
                    } else if (cnicinteger % 10 == 2L || cnicinteger % 10 == 4L || cnicinteger % 10 == 6L || cnicinteger % 10 == 8L || cnicinteger % 10 == 0L) {
                        gender1.text = "Female"
                    }
                }

            }
        }
        val contact1 = findViewById<EditText>(R.id.inputcontact1)
        val textcontact1 = findViewById<TextView>(R.id.contact1)
        val address1 = findViewById<EditText>(R.id.inputaddress1)
        val textaddress1 = findViewById<TextView>(R.id.address1)
        val hasaccountalready1 = findViewById<CheckBox>(R.id.inputhasaccalready)
        val texthasaccalready1 = findViewById<TextView>(R.id.hasaccalready)
        val accountopened1 = findViewById<CheckBox>(R.id.inputhasaccopened)
        val textaccountopened1 = findViewById<TextView>(R.id.hasaccopened)
        val acctype1 = findViewById<RadioGroup>(R.id.inpuaccountype1)
        val textacctype1 = findViewById<TextView>(R.id.accountype1)
        val textbranchless1 = findViewById<RadioButton>(R.id.typebranchless1)
        val textassan1 = findViewById<RadioButton>(R.id.typeAsaan1)
        val accnumber1 = findViewById<EditText>(R.id.inputaccnumber1)
        val textaccnumber1 = findViewById<TextView>(R.id.accnumber1)
        val bankname1 = findViewById<Spinner>(R.id.inputbankname1)
        val textbankname1 = findViewById<TextView>(R.id.bankname1)
        bankname1.adapter = banknameadapter
        bankname1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank1 =  parent?.getItemAtPosition(position).toString()
            }
        }
        val branchcode1 = findViewById<EditText>(R.id.inputbranchcode1)
        val textbranchcode1 = findViewById<TextView>(R.id.branchcode1)
        val switch1 = findViewById<ToggleButton>(R.id.toggle1)
        switch1.setOnCheckedChangeListener { _, isChecked ->
            if (switch1.isChecked) {
                name1.visibility = VISIBLE
                textname1.visibility = VISIBLE
                age1.visibility = VISIBLE
                textage1.visibility = VISIBLE
                profession1.visibility = VISIBLE
                textprofession1.visibility = VISIBLE
                cnic1.visibility = VISIBLE
                textcnic1.visibility = VISIBLE
                gender1.visibility = VISIBLE
                textgender1.visibility = VISIBLE
                contact1.visibility = VISIBLE
                textcontact1.visibility = VISIBLE
                address1.visibility = VISIBLE
                textaddress1.visibility = VISIBLE
                hasaccountalready1.visibility = VISIBLE
                texthasaccalready1.visibility = VISIBLE
                accountopened1.visibility = VISIBLE
                textaccountopened1.visibility = VISIBLE
                accountopened1.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened1.isChecked) {
                        selectedaccountopened1 = "Y"
                        selectedacctype1 = findViewById(textbranchless1.id)
                        acctype1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype1.checkedRadioButtonId
                            selectedacctype1 = findViewById<RadioButton>(id)
                        })
                        acctype1.visibility = VISIBLE;
                        textacctype1.visibility = VISIBLE
                        textbranchless1.visibility = VISIBLE
                        textassan1.visibility = VISIBLE
                        accnumber1.visibility = VISIBLE;
                        textaccnumber1.visibility = VISIBLE
                        bankname1.visibility = VISIBLE
                        textbankname1.visibility = VISIBLE
                        branchcode1.visibility = VISIBLE
                        textbranchcode1.visibility = VISIBLE
                    } else {
                        acctype1.clearCheck()
                        selectedaccountopened1 = "N"
                        acctype1.visibility = GONE;
                        textacctype1.visibility = GONE
                        textbranchless1.visibility = GONE
                        textassan1.visibility = GONE
                        accnumber1.visibility = GONE;
                        textaccnumber1.visibility = GONE
                        bankname1.visibility = GONE
                        textbankname1.visibility = GONE
                        branchcode1.visibility = GONE
                        textbranchcode1.visibility = GONE
                    }
                }
            } else {
                name1.visibility = GONE
                textname1.visibility = GONE
                age1.visibility = GONE
                textage1.visibility = GONE
                profession1.visibility = GONE
                textprofession1.visibility = GONE
                cnic1.visibility = GONE
                textcnic1.visibility = GONE
                gender1.visibility = GONE
                textgender1.visibility = GONE
                contact1.visibility = GONE
                textcontact1.visibility = GONE
                address1.visibility = GONE
                textaddress1.visibility = GONE
                hasaccountalready1.visibility = GONE
                texthasaccalready1.visibility = GONE
                accountopened1.visibility = GONE
                textaccountopened1.visibility = GONE
                acctype1.visibility = GONE
                textacctype1.visibility = GONE
                textbranchless1.visibility = GONE
                textassan1.visibility = GONE
                accnumber1.visibility = GONE
                textaccnumber1.visibility = GONE
                bankname1.visibility = GONE
                textbankname1.visibility = GONE
                branchcode1.visibility = GONE
                textbranchcode1.visibility = GONE
            }
        }


        // ------ For Participant 2 ------ //


        val name2 = findViewById<EditText>(R.id.inputName2)
        val textname2 = findViewById<TextView>(R.id.name2)
        val age2 = findViewById<Spinner>(R.id.inputage2)
        val textage2 = findViewById<TextView>(R.id.age2)
        age2.adapter = ageadapter
        age2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage2 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender2 = findViewById<TextView>(R.id.inputgender2)
        val textgender2 = findViewById<TextView>(R.id.gender2)
        val profession2 = findViewById<EditText>(R.id.inputprofession2)
        val textprofession2 = findViewById<TextView>(R.id.profession2)
        val cnic2 = findViewById<EditText>(R.id.inputcnic2)
        val textcnic2 = findViewById<TextView>(R.id.cnic2)
        cnic2.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic2.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed2: String = cnic2.text.toString()
                val size2 = ed2.length
                if (size2 == 13) {
                    val cnicinteger2 = cnic2.text.toString().toLong()
                    if (cnicinteger2 % 10 == 1L || cnicinteger2 % 10 == 3L || cnicinteger2 % 10 == 5L || cnicinteger2 % 10 == 7L || cnicinteger2 % 10 == 9L) {
                        gender2.text = "Male"
                    } else if (cnicinteger2 % 10 == 2L || cnicinteger2 % 10 == 4L || cnicinteger2 % 10 == 6L || cnicinteger2 % 10 == 8L || cnicinteger2 % 10 == 0L) {
                        gender2.text = "Female"
                    }
                }
            }
        }
        val contact2 = findViewById<EditText>(R.id.inputcontact2)
        val textcontact2 = findViewById<TextView>(R.id.contact2)
        val address2 = findViewById<EditText>(R.id.inputaddress2)
        val textaddress2 = findViewById<TextView>(R.id.address2)
        val hasaccountalready2 = findViewById<CheckBox>(R.id.inputhasaccalready2)
        val texthasaccalready2 = findViewById<TextView>(R.id.hasaccalready2)
        val accountopened2 = findViewById<CheckBox>(R.id.inputhasaccopened2)
        val textaccountopened2 = findViewById<TextView>(R.id.hasaccopened2)
        val acctype2 = findViewById<RadioGroup>(R.id.inpuaccountype2)
        val textacctype2 = findViewById<TextView>(R.id.accountype2)
        val textbranchless2 = findViewById<RadioButton>(R.id.typebranchless2)
        val textassan2 = findViewById<RadioButton>(R.id.typeAsaan2)
        val accnumber2 = findViewById<EditText>(R.id.inputaccnumber2)
        val textaccnumber2 = findViewById<TextView>(R.id.accnumber2)
        val bankname2 = findViewById<Spinner>(R.id.inputbankname2)
        val textbankname2 = findViewById<TextView>(R.id.bankname2)
        bankname2.adapter = banknameadapter
        bankname2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank2 = if (accountopened2.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode2 = findViewById<EditText>(R.id.inputbranchcode2)
        val textbranchcode2 = findViewById<TextView>(R.id.branchcode2)
        val switch2 = findViewById<ToggleButton>(R.id.toggle2)
        switch2.setOnCheckedChangeListener { _, isChecked2 ->
            if (switch2.isChecked) {
                name2.visibility = VISIBLE
                textname2.visibility = VISIBLE
                age2.visibility = VISIBLE
                textage2.visibility = VISIBLE
                profession2.visibility = VISIBLE
                textprofession2.visibility = VISIBLE
                cnic2.visibility = VISIBLE
                textcnic2.visibility = VISIBLE
                gender2.visibility = VISIBLE
                textgender2.visibility = VISIBLE
                contact2.visibility = VISIBLE
                textcontact2.visibility = VISIBLE
                address2.visibility = VISIBLE
                textaddress2.visibility = VISIBLE
                hasaccountalready2.visibility = VISIBLE
                texthasaccalready2.visibility = VISIBLE
                accountopened2.visibility = VISIBLE
                textaccountopened2.visibility = VISIBLE
                accountopened2.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened2.isChecked) {
                        selectedaccountopened2 = "Y"
                        selectedacctype2 = findViewById(textbranchless2.id)
                        acctype2.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype2.checkedRadioButtonId
                            selectedacctype2 = findViewById<RadioButton>(id)
                        })
                        acctype2.visibility = VISIBLE;
                        textacctype2.visibility = VISIBLE
                        textbranchless2.visibility = VISIBLE
                        textassan2.visibility = VISIBLE
                        accnumber2.visibility = VISIBLE;
                        textaccnumber2.visibility = VISIBLE
                        bankname2.visibility = VISIBLE
                        textbankname2.visibility = VISIBLE
                        branchcode2.visibility = VISIBLE
                        textbranchcode2.visibility = VISIBLE
                    } else {
                        acctype2.clearCheck()
                        selectedaccountopened2 = "N"
                        acctype2.visibility = GONE;
                        textacctype2.visibility = GONE
                        textbranchless2.visibility = GONE
                        textassan2.visibility = GONE
                        accnumber2.visibility = GONE;
                        textaccnumber2.visibility = GONE
                        bankname2.visibility = GONE
                        textbankname2.visibility = GONE
                        branchcode2.visibility = GONE
                        textbranchcode2.visibility = GONE
                    }
                }
            } else {
                name2.visibility = GONE
                textname2.visibility = GONE
                age2.visibility = GONE
                textage2.visibility = GONE
                profession2.visibility = GONE
                textprofession2.visibility = GONE
                cnic2.visibility = GONE
                textcnic2.visibility = GONE
                gender2.visibility = GONE
                textgender2.visibility = GONE
                contact2.visibility = GONE
                textcontact2.visibility = GONE
                address2.visibility = GONE
                textaddress2.visibility = GONE
                hasaccountalready2.visibility = GONE
                texthasaccalready2.visibility = GONE
                accountopened2.visibility = GONE
                textaccountopened2.visibility = GONE
                acctype2.visibility = GONE
                textacctype2.visibility = GONE
                textbranchless2.visibility = GONE
                textassan2.visibility = GONE
                accnumber2.visibility = GONE
                textaccnumber2.visibility = GONE
                bankname2.visibility = GONE
                textbankname2.visibility = GONE
                branchcode2.visibility = GONE
                textbranchcode2.visibility = GONE
            }
        }

        //------- For Participant 3 ------//

        val name3 = findViewById<EditText>(R.id.inputName3)
        val textname3 = findViewById<TextView>(R.id.name3)
        val age3 = findViewById<Spinner>(R.id.inputage3)
        val textage3 = findViewById<TextView>(R.id.age3)
        age3.adapter = ageadapter
        age3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) { selectedage3 = parent?.getItemAtPosition(position).toString() }
        }
        val gender3 = findViewById<TextView>(R.id.inputgender3)
        val textgender3 = findViewById<TextView>(R.id.gender3)
        val profession3 = findViewById<EditText>(R.id.inputprofession3)
        val textprofession3 = findViewById<TextView>(R.id.profession3)
        val cnic3 = findViewById<EditText>(R.id.inputcnic3)
        val textcnic3 = findViewById<TextView>(R.id.cnic3)
        cnic3.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic3.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed3: String = cnic3.text.toString()
                val size3 = ed3.length
                if (size3 == 13) {
                    val cnicinteger3 = cnic3.text.toString().toLong()
                    if (cnicinteger3 % 10 == 1L || cnicinteger3 % 10 == 3L || cnicinteger3 % 10 == 5L || cnicinteger3 % 10 == 7L || cnicinteger3 % 10 == 9L) {
                        gender3.text = "Male"
                    } else if (cnicinteger3 % 10 == 2L || cnicinteger3 % 10 == 4L || cnicinteger3 % 10 == 6L || cnicinteger3 % 10 == 8L || cnicinteger3 % 10 == 0L) {
                        gender3.text = "Female"
                    }
                }

            }
        }
        val contact3 = findViewById<EditText>(R.id.inputcontact3)
        val textcontact3 = findViewById<TextView>(R.id.contact3)
        val address3 = findViewById<EditText>(R.id.inputaddress3)
        val textaddress3 = findViewById<TextView>(R.id.address3)
        val hasaccountalready3 = findViewById<CheckBox>(R.id.inputhasaccalready3)
        val texthasaccalready3 = findViewById<TextView>(R.id.hasaccalready3)
        val accountopened3 = findViewById<CheckBox>(R.id.inputhasaccopened3)
        val textaccountopened3 = findViewById<TextView>(R.id.hasaccopened3)
        val acctype3 = findViewById<RadioGroup>(R.id.inpuaccountype3)
        val textacctype3 = findViewById<TextView>(R.id.accountype3)
        val textbranchless3 = findViewById<RadioButton>(R.id.typebranchless3)
        val textassan3 = findViewById<RadioButton>(R.id.typeAsaan3)
        val accnumber3 = findViewById<EditText>(R.id.inputaccnumber3)
        val textaccnumber3 = findViewById<TextView>(R.id.accnumber3)
        val bankname3 = findViewById<Spinner>(R.id.inputbankname3)
        val textbankname3 = findViewById<TextView>(R.id.bankname3)
        bankname3.adapter = banknameadapter
        bankname3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank3 =  parent?.getItemAtPosition(position).toString()
            }
        }
        val branchcode3 = findViewById<EditText>(R.id.inputbranchcode3)
        val textbranchcode3 = findViewById<TextView>(R.id.branchcode3)
        val switch3 = findViewById<ToggleButton>(R.id.toggle3)
        switch3.setOnCheckedChangeListener { _, isChecked ->
            if (switch3.isChecked) {
                name3.visibility = VISIBLE
                textname3.visibility = VISIBLE
                age3.visibility = VISIBLE
                textage3.visibility = VISIBLE
                profession3.visibility = VISIBLE
                textprofession3.visibility = VISIBLE
                cnic3.visibility = VISIBLE
                textcnic3.visibility = VISIBLE
                gender3.visibility = VISIBLE
                textgender3.visibility = VISIBLE
                contact3.visibility = VISIBLE
                textcontact3.visibility = VISIBLE
                address3.visibility = VISIBLE
                textaddress3.visibility = VISIBLE
                hasaccountalready3.visibility = VISIBLE
                texthasaccalready3.visibility = VISIBLE
                accountopened3.visibility = VISIBLE
                textaccountopened3.visibility = VISIBLE
                accountopened3.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened3.isChecked) {
                        selectedaccountopened3 = "Y"
                        selectedacctype3 = findViewById(textbranchless1.id)
                        acctype3.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype3.checkedRadioButtonId
                            selectedacctype3 = findViewById<RadioButton>(id)
                        })
                        acctype3.visibility = VISIBLE;
                        textacctype3.visibility = VISIBLE
                        textbranchless3.visibility = VISIBLE
                        textassan3.visibility = VISIBLE
                        accnumber3.visibility = VISIBLE;
                        textaccnumber3.visibility = VISIBLE
                        bankname3.visibility = VISIBLE
                        textbankname3.visibility = VISIBLE
                        branchcode3.visibility = VISIBLE
                        textbranchcode3.visibility = VISIBLE
                    } else {
                        acctype3.clearCheck()
                        selectedaccountopened3 = "N"
                        acctype3.visibility = GONE;
                        textacctype3.visibility = GONE
                        textbranchless3.visibility = GONE
                        textassan3.visibility = GONE
                        accnumber3.visibility = GONE;
                        textaccnumber3.visibility = GONE
                        bankname3.visibility = GONE
                        textbankname3.visibility = GONE
                        branchcode3.visibility = GONE
                        textbranchcode3.visibility = GONE
                    }
                }
            } else {
                name3.visibility = GONE
                textname3.visibility = GONE
                age3.visibility = GONE
                textage3.visibility = GONE
                profession3.visibility = GONE
                textprofession3.visibility = GONE
                cnic3.visibility = GONE
                textcnic3.visibility = GONE
                gender3.visibility = GONE
                textgender3.visibility = GONE
                contact3.visibility = GONE
                textcontact3.visibility = GONE
                address3.visibility = GONE
                textaddress3.visibility = GONE
                hasaccountalready3.visibility = GONE
                texthasaccalready3.visibility = GONE
                accountopened3.visibility = GONE
                textaccountopened3.visibility = GONE
                acctype3.visibility = GONE
                textacctype3.visibility = GONE
                textbranchless3.visibility = GONE
                textassan3.visibility = GONE
                accnumber3.visibility = GONE
                textaccnumber3.visibility = GONE
                bankname3.visibility = GONE
                textbankname3.visibility = GONE
                branchcode3.visibility = GONE
                textbranchcode3.visibility = GONE
            }
        }


        // ------ For Participant 4 ------ //


        val name4 = findViewById<EditText>(R.id.inputName4)
        val textname4 = findViewById<TextView>(R.id.name4)
        val age4 = findViewById<Spinner>(R.id.inputage4)
        val textage4 = findViewById<TextView>(R.id.age4)
        age4.adapter = ageadapter
        age4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage4 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender4 = findViewById<TextView>(R.id.inputgender4)
        val textgender4 = findViewById<TextView>(R.id.gender4)
        val profession4 = findViewById<EditText>(R.id.inputprofession4)
        val textprofession4 = findViewById<TextView>(R.id.profession4)
        val cnic4 = findViewById<EditText>(R.id.inputcnic4)
        val textcnic4 = findViewById<TextView>(R.id.cnic4)
        cnic4.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic4.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed4: String = cnic4.text.toString()
                val size4 = ed4.length
                if (size4 == 13) {
                    val cnicinteger4 = cnic4.text.toString().toLong()
                    if (cnicinteger4 % 10 == 1L || cnicinteger4 % 10 == 3L || cnicinteger4 % 10 == 5L || cnicinteger4 % 10 == 7L || cnicinteger4 % 10 == 9L) {
                        gender4.text = "Male"
                    } else if (cnicinteger4 % 10 == 2L || cnicinteger4 % 10 == 4L || cnicinteger4 % 10 == 6L || cnicinteger4 % 10 == 8L || cnicinteger4 % 10 == 0L) {
                        gender4.text = "Female"
                    }
                }
            }
        }
        val contact4 = findViewById<EditText>(R.id.inputcontact4)
        val textcontact4 = findViewById<TextView>(R.id.contact4)
        val address4 = findViewById<EditText>(R.id.inputaddress4)
        val textaddress4 = findViewById<TextView>(R.id.address4)
        val hasaccountalready4 = findViewById<CheckBox>(R.id.inputhasaccalready4)
        val texthasaccalready4 = findViewById<TextView>(R.id.hasaccalready4)
        val accountopened4 = findViewById<CheckBox>(R.id.inputhasaccopened4)
        val textaccountopened4 = findViewById<TextView>(R.id.hasaccopened4)
        val acctype4 = findViewById<RadioGroup>(R.id.inpuaccountype4)
        val textacctype4 = findViewById<TextView>(R.id.accountype4)
        val textbranchless4 = findViewById<RadioButton>(R.id.typebranchless4)
        val textassan4 = findViewById<RadioButton>(R.id.typeAsaan4)
        val accnumber4 = findViewById<EditText>(R.id.inputaccnumber4)
        val textaccnumber4 = findViewById<TextView>(R.id.accnumber4)
        val bankname4 = findViewById<Spinner>(R.id.inputbankname4)
        val textbankname4 = findViewById<TextView>(R.id.bankname4)
        bankname4.adapter = banknameadapter
        bankname4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank4 = if (accountopened4.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode4 = findViewById<EditText>(R.id.inputbranchcode4)
        val textbranchcode4 = findViewById<TextView>(R.id.branchcode4)
        val switch4 = findViewById<ToggleButton>(R.id.toggle4)
        switch4.setOnCheckedChangeListener { _, isChecked4 ->
            if (switch4.isChecked) {
                name4.visibility = VISIBLE
                textname4.visibility = VISIBLE
                age4.visibility = VISIBLE
                textage4.visibility = VISIBLE
                profession4.visibility = VISIBLE
                textprofession4.visibility = VISIBLE
                cnic4.visibility = VISIBLE
                textcnic4.visibility = VISIBLE
                gender4.visibility = VISIBLE
                textgender4.visibility = VISIBLE
                contact4.visibility = VISIBLE
                textcontact4.visibility = VISIBLE
                address4.visibility = VISIBLE
                textaddress4.visibility = VISIBLE
                hasaccountalready4.visibility = VISIBLE
                texthasaccalready4.visibility = VISIBLE
                accountopened4.visibility = VISIBLE
                textaccountopened4.visibility = VISIBLE
                accountopened4.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened4.isChecked) {
                        selectedaccountopened4 = "Y"
                        selectedacctype4 = findViewById(textbranchless4.id)
                        acctype4.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype4.checkedRadioButtonId
                            selectedacctype4 = findViewById<RadioButton>(id)
                        })
                        acctype4.visibility = VISIBLE;
                        textacctype4.visibility = VISIBLE
                        textbranchless4.visibility = VISIBLE
                        textassan4.visibility = VISIBLE
                        accnumber4.visibility = VISIBLE;
                        textaccnumber4.visibility = VISIBLE
                        bankname4.visibility = VISIBLE
                        textbankname4.visibility = VISIBLE
                        branchcode4.visibility = VISIBLE
                        textbranchcode4.visibility = VISIBLE
                    } else {
                        acctype4.clearCheck()
                        selectedaccountopened4 = "N"
                        acctype4.visibility = GONE;
                        textacctype4.visibility = GONE
                        textbranchless4.visibility = GONE
                        textassan4.visibility = GONE
                        accnumber4.visibility = GONE;
                        textaccnumber4.visibility = GONE
                        bankname4.visibility = GONE
                        textbankname4.visibility = GONE
                        branchcode4.visibility = GONE
                        textbranchcode4.visibility = GONE
                    }
                }
            } else {
                name4.visibility = GONE
                textname4.visibility = GONE
                age4.visibility = GONE
                textage4.visibility = GONE
                profession4.visibility = GONE
                textprofession4.visibility = GONE
                cnic4.visibility = GONE
                textcnic4.visibility = GONE
                gender4.visibility = GONE
                textgender4.visibility = GONE
                contact4.visibility = GONE
                textcontact4.visibility = GONE
                address4.visibility = GONE
                textaddress4.visibility = GONE
                hasaccountalready4.visibility = GONE
                texthasaccalready4.visibility = GONE
                accountopened4.visibility = GONE
                textaccountopened4.visibility = GONE
                acctype4.visibility = GONE
                textacctype4.visibility = GONE
                textbranchless4.visibility = GONE
                textassan4.visibility = GONE
                accnumber4.visibility = GONE
                textaccnumber4.visibility = GONE
                bankname4.visibility = GONE
                textbankname4.visibility = GONE
                branchcode4.visibility = GONE
                textbranchcode4.visibility = GONE
            }
        }

        // ------ For Participant 5 ------ //


        val name5 = findViewById<EditText>(R.id.inputName5)
        val textname5 = findViewById<TextView>(R.id.name5)
        val age5 = findViewById<Spinner>(R.id.inputage5)
        val textage5 = findViewById<TextView>(R.id.age5)
        age5.adapter = ageadapter
        age5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage5 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender5 = findViewById<TextView>(R.id.inputgender5)
        val textgender5 = findViewById<TextView>(R.id.gender5)
        val profession5 = findViewById<EditText>(R.id.inputprofession5)
        val textprofession5 = findViewById<TextView>(R.id.profession5)
        val cnic5 = findViewById<EditText>(R.id.inputcnic5)
        val textcnic5 = findViewById<TextView>(R.id.cnic5)
        cnic5.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic5.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed5: String = cnic5.text.toString()
                val size5 = ed5.length
                if (size5 == 13) {
                    val cnicinteger5 = cnic5.text.toString().toLong()
                    if (cnicinteger5 % 10 == 1L || cnicinteger5 % 10 == 3L || cnicinteger5 % 10 == 5L || cnicinteger5 % 10 == 7L || cnicinteger5 % 10 == 9L) {
                        gender5.text = "Male"
                    } else if (cnicinteger5 % 10 == 2L || cnicinteger5 % 10 == 4L || cnicinteger5 % 10 == 6L || cnicinteger5 % 10 == 8L || cnicinteger5 % 10 == 0L) {
                        gender5.text = "Female"
                    }
                }
            }
        }
        val contact5 = findViewById<EditText>(R.id.inputcontact5)
        val textcontact5 = findViewById<TextView>(R.id.contact5)
        val address5 = findViewById<EditText>(R.id.inputaddress5)
        val textaddress5 = findViewById<TextView>(R.id.address5)
        val hasaccountalready5 = findViewById<CheckBox>(R.id.inputhasaccalready5)
        val texthasaccalready5 = findViewById<TextView>(R.id.hasaccalready5)
        val accountopened5 = findViewById<CheckBox>(R.id.inputhasaccopened5)
        val textaccountopened5 = findViewById<TextView>(R.id.hasaccopened5)
        val acctype5 = findViewById<RadioGroup>(R.id.inpuaccountype5)
        val textacctype5 = findViewById<TextView>(R.id.accountype5)
        val textbranchless5 = findViewById<RadioButton>(R.id.typebranchless5)
        val textassan5 = findViewById<RadioButton>(R.id.typeAsaan5)
        val accnumber5 = findViewById<EditText>(R.id.inputaccnumber5)
        val textaccnumber5 = findViewById<TextView>(R.id.accnumber5)
        val bankname5 = findViewById<Spinner>(R.id.inputbankname5)
        val textbankname5 = findViewById<TextView>(R.id.bankname5)
        bankname5.adapter = banknameadapter
        bankname5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank5 = if (accountopened5.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode5 = findViewById<EditText>(R.id.inputbranchcode5)
        val textbranchcode5 = findViewById<TextView>(R.id.branchcode5)
        val switch5 = findViewById<ToggleButton>(R.id.toggle5)
        switch5.setOnCheckedChangeListener { _, isChecked5 ->
            if (switch5.isChecked) {
                name5.visibility = VISIBLE
                textname5.visibility = VISIBLE
                age5.visibility = VISIBLE
                textage5.visibility = VISIBLE
                profession5.visibility = VISIBLE
                textprofession5.visibility = VISIBLE
                cnic5.visibility = VISIBLE
                textcnic5.visibility = VISIBLE
                gender5.visibility = VISIBLE
                textgender5.visibility = VISIBLE
                contact5.visibility = VISIBLE
                textcontact5.visibility = VISIBLE
                address5.visibility = VISIBLE
                textaddress5.visibility = VISIBLE
                hasaccountalready5.visibility = VISIBLE
                texthasaccalready5.visibility = VISIBLE
                accountopened5.visibility = VISIBLE
                textaccountopened5.visibility = VISIBLE
                accountopened5.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened5.isChecked) {
                        selectedaccountopened5 = "Y"
                        selectedacctype5 = findViewById(textbranchless5.id)
                        acctype5.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype5.checkedRadioButtonId
                            selectedacctype5 = findViewById<RadioButton>(id)
                        })
                        acctype5.visibility = VISIBLE;
                        textacctype5.visibility = VISIBLE
                        textbranchless5.visibility = VISIBLE
                        textassan5.visibility = VISIBLE
                        accnumber5.visibility = VISIBLE;
                        textaccnumber5.visibility = VISIBLE
                        bankname5.visibility = VISIBLE
                        textbankname5.visibility = VISIBLE
                        branchcode5.visibility = VISIBLE
                        textbranchcode5.visibility = VISIBLE
                    } else {
                        acctype5.clearCheck()
                        selectedaccountopened5 = "N"
                        acctype5.visibility = GONE;
                        textacctype5.visibility = GONE
                        textbranchless5.visibility = GONE
                        textassan5.visibility = GONE
                        accnumber5.visibility = GONE;
                        textaccnumber5.visibility = GONE
                        bankname5.visibility = GONE
                        textbankname5.visibility = GONE
                        branchcode5.visibility = GONE
                        textbranchcode5.visibility = GONE
                    }
                }
            } else {
                name5.visibility = GONE
                textname5.visibility = GONE
                age5.visibility = GONE
                textage5.visibility = GONE
                profession5.visibility = GONE
                textprofession5.visibility = GONE
                cnic5.visibility = GONE
                textcnic5.visibility = GONE
                gender5.visibility = GONE
                textgender5.visibility = GONE
                contact5.visibility = GONE
                textcontact5.visibility = GONE
                address5.visibility = GONE
                textaddress5.visibility = GONE
                hasaccountalready5.visibility = GONE
                texthasaccalready5.visibility = GONE
                accountopened5.visibility = GONE
                textaccountopened5.visibility = GONE
                acctype5.visibility = GONE
                textacctype5.visibility = GONE
                textbranchless5.visibility = GONE
                textassan5.visibility = GONE
                accnumber5.visibility = GONE
                textaccnumber5.visibility = GONE
                bankname5.visibility = GONE
                textbankname5.visibility = GONE
                branchcode5.visibility = GONE
                textbranchcode5.visibility = GONE
            }
        }

        // ------ For Participant 6 ------ //


        val name6 = findViewById<EditText>(R.id.inputName6)
        val textname6 = findViewById<TextView>(R.id.name6)
        val age6 = findViewById<Spinner>(R.id.inputage6)
        val textage6 = findViewById<TextView>(R.id.age6)
        age6.adapter = ageadapter
        age6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage6 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender6 = findViewById<TextView>(R.id.inputgender6)
        val textgender6 = findViewById<TextView>(R.id.gender6)
        val profession6 = findViewById<EditText>(R.id.inputprofession6)
        val textprofession6 = findViewById<TextView>(R.id.profession6)
        val cnic6 = findViewById<EditText>(R.id.inputcnic6)
        val textcnic6 = findViewById<TextView>(R.id.cnic6)
        cnic6.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic6.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed6: String = cnic6.text.toString()
                val size6 = ed6.length
                if (size6 == 13) {
                    val cnicinteger6 = cnic6.text.toString().toLong()
                    if (cnicinteger6 % 10 == 1L || cnicinteger6 % 10 == 3L || cnicinteger6 % 10 == 5L || cnicinteger6 % 10 == 7L || cnicinteger6 % 10 == 9L) {
                        gender6.text = "Male"
                    } else if (cnicinteger6 % 10 == 2L || cnicinteger6 % 10 == 4L || cnicinteger6 % 10 == 6L || cnicinteger6 % 10 == 8L || cnicinteger6 % 10 == 0L) {
                        gender6.text = "Female"
                    }
                }
            }
        }
        val contact6 = findViewById<EditText>(R.id.inputcontact6)
        val textcontact6 = findViewById<TextView>(R.id.contact6)
        val address6 = findViewById<EditText>(R.id.inputaddress6)
        val textaddress6 = findViewById<TextView>(R.id.address6)
        val hasaccountalready6 = findViewById<CheckBox>(R.id.inputhasaccalready6)
        val texthasaccalready6 = findViewById<TextView>(R.id.hasaccalready6)
        val accountopened6 = findViewById<CheckBox>(R.id.inputhasaccopened6)
        val textaccountopened6 = findViewById<TextView>(R.id.hasaccopened6)
        val acctype6 = findViewById<RadioGroup>(R.id.inpuaccountype6)
        val textacctype6 = findViewById<TextView>(R.id.accountype6)
        val textbranchless6 = findViewById<RadioButton>(R.id.typebranchless6)
        val textassan6 = findViewById<RadioButton>(R.id.typeAsaan6)
        val accnumber6 = findViewById<EditText>(R.id.inputaccnumber6)
        val textaccnumber6 = findViewById<TextView>(R.id.accnumber6)
        val bankname6 = findViewById<Spinner>(R.id.inputbankname6)
        val textbankname6 = findViewById<TextView>(R.id.bankname6)
        bankname6.adapter = banknameadapter
        bankname6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank6 = if (accountopened6.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode6 = findViewById<EditText>(R.id.inputbranchcode6)
        val textbranchcode6 = findViewById<TextView>(R.id.branchcode6)
        val switch6 = findViewById<ToggleButton>(R.id.toggle6)
        switch6.setOnCheckedChangeListener { _, isChecked6 ->
            if (switch6.isChecked) {
                name6.visibility = VISIBLE
                textname6.visibility = VISIBLE
                age6.visibility = VISIBLE
                textage6.visibility = VISIBLE
                profession6.visibility = VISIBLE
                textprofession6.visibility = VISIBLE
                cnic6.visibility = VISIBLE
                textcnic6.visibility = VISIBLE
                gender6.visibility = VISIBLE
                textgender6.visibility = VISIBLE
                contact6.visibility = VISIBLE
                textcontact6.visibility = VISIBLE
                address6.visibility = VISIBLE
                textaddress6.visibility = VISIBLE
                hasaccountalready6.visibility = VISIBLE
                texthasaccalready6.visibility = VISIBLE
                accountopened6.visibility = VISIBLE
                textaccountopened6.visibility = VISIBLE
                accountopened6.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened6.isChecked) {
                        selectedaccountopened6 = "Y"
                        selectedacctype6 = findViewById(textbranchless6.id)
                        acctype6.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype6.checkedRadioButtonId
                            selectedacctype6 = findViewById<RadioButton>(id)
                        })
                        acctype6.visibility = VISIBLE;
                        textacctype6.visibility = VISIBLE
                        textbranchless6.visibility = VISIBLE
                        textassan6.visibility = VISIBLE
                        accnumber6.visibility = VISIBLE;
                        textaccnumber6.visibility = VISIBLE
                        bankname6.visibility = VISIBLE
                        textbankname6.visibility = VISIBLE
                        branchcode6.visibility = VISIBLE
                        textbranchcode6.visibility = VISIBLE
                    } else {
                        acctype6.clearCheck()
                        selectedaccountopened6 = "N"
                        acctype6.visibility = GONE;
                        textacctype6.visibility = GONE
                        textbranchless6.visibility = GONE
                        textassan6.visibility = GONE
                        accnumber6.visibility = GONE;
                        textaccnumber6.visibility = GONE
                        bankname6.visibility = GONE
                        textbankname6.visibility = GONE
                        branchcode6.visibility = GONE
                        textbranchcode6.visibility = GONE
                    }
                }
            } else {
                name6.visibility = GONE
                textname6.visibility = GONE
                age6.visibility = GONE
                textage6.visibility = GONE
                profession6.visibility = GONE
                textprofession6.visibility = GONE
                cnic6.visibility = GONE
                textcnic6.visibility = GONE
                gender6.visibility = GONE
                textgender6.visibility = GONE
                contact6.visibility = GONE
                textcontact6.visibility = GONE
                address6.visibility = GONE
                textaddress6.visibility = GONE
                hasaccountalready6.visibility = GONE
                texthasaccalready6.visibility = GONE
                accountopened6.visibility = GONE
                textaccountopened6.visibility = GONE
                acctype6.visibility = GONE
                textacctype6.visibility = GONE
                textbranchless6.visibility = GONE
                textassan6.visibility = GONE
                accnumber6.visibility = GONE
                textaccnumber6.visibility = GONE
                bankname6.visibility = GONE
                textbankname6.visibility = GONE
                branchcode6.visibility = GONE
                textbranchcode6.visibility = GONE
            }
        }

        // ------ For Participant 7 ------ //


        val name7 = findViewById<EditText>(R.id.inputName7)
        val textname7 = findViewById<TextView>(R.id.name7)
        val age7 = findViewById<Spinner>(R.id.inputage7)
        val textage7 = findViewById<TextView>(R.id.age7)
        age7.adapter = ageadapter
        age7.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage7 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender7 = findViewById<TextView>(R.id.inputgender7)
        val textgender7 = findViewById<TextView>(R.id.gender7)
        val profession7 = findViewById<EditText>(R.id.inputprofession7)
        val textprofession7 = findViewById<TextView>(R.id.profession7)
        val cnic7 = findViewById<EditText>(R.id.inputcnic7)
        val textcnic7 = findViewById<TextView>(R.id.cnic7)
        cnic7.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic7.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed7: String = cnic7.text.toString()
                val size7 = ed7.length
                if (size7 == 13) {
                    val cnicinteger7 = cnic7.text.toString().toLong()
                    if (cnicinteger7 % 10 == 1L || cnicinteger7 % 10 == 3L || cnicinteger7 % 10 == 5L || cnicinteger7 % 10 == 7L || cnicinteger7 % 10 == 9L) {
                        gender7.text = "Male"
                    } else if (cnicinteger7 % 10 == 2L || cnicinteger7 % 10 == 4L || cnicinteger7 % 10 == 6L || cnicinteger7 % 10 == 8L || cnicinteger7 % 10 == 0L) {
                        gender7.text = "Female"
                    }
                }
            }
        }
        val contact7 = findViewById<EditText>(R.id.inputcontact7)
        val textcontact7 = findViewById<TextView>(R.id.contact7)
        val address7 = findViewById<EditText>(R.id.inputaddress7)
        val textaddress7 = findViewById<TextView>(R.id.address7)
        val hasaccountalready7 = findViewById<CheckBox>(R.id.inputhasaccalready7)
        val texthasaccalready7 = findViewById<TextView>(R.id.hasaccalready7)
        val accountopened7 = findViewById<CheckBox>(R.id.inputhasaccopened7)
        val textaccountopened7 = findViewById<TextView>(R.id.hasaccopened7)
        val acctype7 = findViewById<RadioGroup>(R.id.inpuaccountype7)
        val textacctype7 = findViewById<TextView>(R.id.accountype7)
        val textbranchless7 = findViewById<RadioButton>(R.id.typebranchless7)
        val textassan7 = findViewById<RadioButton>(R.id.typeAsaan7)
        val accnumber7 = findViewById<EditText>(R.id.inputaccnumber7)
        val textaccnumber7 = findViewById<TextView>(R.id.accnumber7)
        val bankname7 = findViewById<Spinner>(R.id.inputbankname7)
        val textbankname7 = findViewById<TextView>(R.id.bankname7)
        bankname7.adapter = banknameadapter
        bankname7.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank7 = if (accountopened7.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode7 = findViewById<EditText>(R.id.inputbranchcode7)
        val textbranchcode7 = findViewById<TextView>(R.id.branchcode7)
        val switch7 = findViewById<ToggleButton>(R.id.toggle7)
        switch7.setOnCheckedChangeListener { _, isChecked7 ->
            if (switch7.isChecked) {
                name7.visibility = VISIBLE
                textname7.visibility = VISIBLE
                age7.visibility = VISIBLE
                textage7.visibility = VISIBLE
                profession7.visibility = VISIBLE
                textprofession7.visibility = VISIBLE
                cnic7.visibility = VISIBLE
                textcnic7.visibility = VISIBLE
                gender7.visibility = VISIBLE
                textgender7.visibility = VISIBLE
                contact7.visibility = VISIBLE
                textcontact7.visibility = VISIBLE
                address7.visibility = VISIBLE
                textaddress7.visibility = VISIBLE
                hasaccountalready7.visibility = VISIBLE
                texthasaccalready7.visibility = VISIBLE
                accountopened7.visibility = VISIBLE
                textaccountopened7.visibility = VISIBLE
                accountopened7.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened7.isChecked) {
                        selectedaccountopened7 = "Y"
                        selectedacctype7 = findViewById(textbranchless6.id)
                        acctype7.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype7.checkedRadioButtonId
                            selectedacctype7 = findViewById<RadioButton>(id)
                        })
                        acctype7.visibility = VISIBLE;
                        textacctype7.visibility = VISIBLE
                        textbranchless7.visibility = VISIBLE
                        textassan7.visibility = VISIBLE
                        accnumber7.visibility = VISIBLE;
                        textaccnumber7.visibility = VISIBLE
                        bankname7.visibility = VISIBLE
                        textbankname7.visibility = VISIBLE
                        branchcode7.visibility = VISIBLE
                        textbranchcode7.visibility = VISIBLE
                    } else {
                        acctype7.clearCheck()
                        selectedaccountopened7 = "N"
                        acctype7.visibility = GONE;
                        textacctype7.visibility = GONE
                        textbranchless7.visibility = GONE
                        textassan7.visibility = GONE
                        accnumber7.visibility = GONE;
                        textaccnumber7.visibility = GONE
                        bankname7.visibility = GONE
                        textbankname7.visibility = GONE
                        branchcode7.visibility = GONE
                        textbranchcode7.visibility = GONE
                    }
                }
            } else {
                name7.visibility = GONE
                textname7.visibility = GONE
                age7.visibility = GONE
                textage7.visibility = GONE
                profession7.visibility = GONE
                textprofession7.visibility = GONE
                cnic7.visibility = GONE
                textcnic7.visibility = GONE
                gender7.visibility = GONE
                textgender7.visibility = GONE
                contact7.visibility = GONE
                textcontact7.visibility = GONE
                address7.visibility = GONE
                textaddress7.visibility = GONE
                hasaccountalready7.visibility = GONE
                texthasaccalready7.visibility = GONE
                accountopened7.visibility = GONE
                textaccountopened7.visibility = GONE
                acctype7.visibility = GONE
                textacctype7.visibility = GONE
                textbranchless7.visibility = GONE
                textassan7.visibility = GONE
                accnumber7.visibility = GONE
                textaccnumber7.visibility = GONE
                bankname7.visibility = GONE
                textbankname7.visibility = GONE
                branchcode7.visibility = GONE
                textbranchcode7.visibility = GONE
            }
        }

        // ------ For Participant 8 ------ //


        val name8 = findViewById<EditText>(R.id.inputName8)
        val textname8 = findViewById<TextView>(R.id.name8)
        val age8 = findViewById<Spinner>(R.id.inputage8)
        val textage8 = findViewById<TextView>(R.id.age8)
        age8.adapter = ageadapter
        age8.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage8 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender8 = findViewById<TextView>(R.id.inputgender8)
        val textgender8 = findViewById<TextView>(R.id.gender8)
        val profession8 = findViewById<EditText>(R.id.inputprofession8)
        val textprofession8 = findViewById<TextView>(R.id.profession8)
        val cnic8 = findViewById<EditText>(R.id.inputcnic8)
        val textcnic8 = findViewById<TextView>(R.id.cnic8)
        cnic8.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic8.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed8: String = cnic8.text.toString()
                val size8 = ed8.length
                if (size8 == 13) {
                    val cnicinteger8 = cnic8.text.toString().toLong()
                    if (cnicinteger8 % 10 == 1L || cnicinteger8 % 10 == 3L || cnicinteger8 % 10 == 5L || cnicinteger8 % 10 == 7L || cnicinteger8 % 10 == 9L) {
                        gender8.text = "Male"
                    } else if (cnicinteger8 % 10 == 2L || cnicinteger8 % 10 == 4L || cnicinteger8 % 10 == 6L || cnicinteger8 % 10 == 8L || cnicinteger8 % 10 == 0L) {
                        gender8.text = "Female"
                    }
                }
            }
        }
        val contact8 = findViewById<EditText>(R.id.inputcontact8)
        val textcontact8 = findViewById<TextView>(R.id.contact8)
        val address8 = findViewById<EditText>(R.id.inputaddress8)
        val textaddress8 = findViewById<TextView>(R.id.address8)
        val hasaccountalready8 = findViewById<CheckBox>(R.id.inputhasaccalready8)
        val texthasaccalready8 = findViewById<TextView>(R.id.hasaccalready8)
        val accountopened8 = findViewById<CheckBox>(R.id.inputhasaccopened8)
        val textaccountopened8 = findViewById<TextView>(R.id.hasaccopened8)
        val acctype8 = findViewById<RadioGroup>(R.id.inpuaccountype8)
        val textacctype8 = findViewById<TextView>(R.id.accountype8)
        val textbranchless8 = findViewById<RadioButton>(R.id.typebranchless8)
        val textassan8= findViewById<RadioButton>(R.id.typeAsaan8)
        val accnumber8 = findViewById<EditText>(R.id.inputaccnumber8)
        val textaccnumber8 = findViewById<TextView>(R.id.accnumber8)
        val bankname8 = findViewById<Spinner>(R.id.inputbankname8)
        val textbankname8 = findViewById<TextView>(R.id.bankname8)
        bankname8.adapter = banknameadapter
        bankname8.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank8 = if (accountopened8.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode8 = findViewById<EditText>(R.id.inputbranchcode8)
        val textbranchcode8 = findViewById<TextView>(R.id.branchcode8)
        val switch8 = findViewById<ToggleButton>(R.id.toggle8)
        switch8.setOnCheckedChangeListener { _, isChecked8 ->
            if (switch8.isChecked) {
                name8.visibility = VISIBLE
                textname8.visibility = VISIBLE
                age8.visibility = VISIBLE
                textage8.visibility = VISIBLE
                profession8.visibility = VISIBLE
                textprofession8.visibility = VISIBLE
                cnic8.visibility = VISIBLE
                textcnic8.visibility = VISIBLE
                gender8.visibility = VISIBLE
                textgender8.visibility = VISIBLE
                contact8.visibility = VISIBLE
                textcontact8.visibility = VISIBLE
                address8.visibility = VISIBLE
                textaddress8.visibility = VISIBLE
                hasaccountalready8.visibility = VISIBLE
                texthasaccalready8.visibility = VISIBLE
                accountopened8.visibility = VISIBLE
                textaccountopened8.visibility = VISIBLE
                accountopened8.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened8.isChecked) {
                        selectedaccountopened8 = "Y"
                        selectedacctype8 = findViewById(textbranchless8.id)
                        acctype8.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype8.checkedRadioButtonId
                            selectedacctype8 = findViewById<RadioButton>(id)
                        })
                        acctype8.visibility = VISIBLE;
                        textacctype8.visibility = VISIBLE
                        textbranchless8.visibility = VISIBLE
                        textassan8.visibility = VISIBLE
                        accnumber8.visibility = VISIBLE;
                        textaccnumber8.visibility = VISIBLE
                        bankname8.visibility = VISIBLE
                        textbankname8.visibility = VISIBLE
                        branchcode8.visibility = VISIBLE
                        textbranchcode8.visibility = VISIBLE
                    } else {
                        acctype8.clearCheck()
                        selectedaccountopened8 = "N"
                        acctype8.visibility = GONE;
                        textacctype8.visibility = GONE
                        textbranchless8.visibility = GONE
                        textassan8.visibility = GONE
                        accnumber8.visibility = GONE;
                        textaccnumber8.visibility = GONE
                        bankname8.visibility = GONE
                        textbankname8.visibility = GONE
                        branchcode8.visibility = GONE
                        textbranchcode8.visibility = GONE
                    }
                }
            } else {
                name8.visibility = GONE
                textname8.visibility = GONE
                age8.visibility = GONE
                textage8.visibility = GONE
                profession8.visibility = GONE
                textprofession8.visibility = GONE
                cnic8.visibility = GONE
                textcnic8.visibility = GONE
                gender8.visibility = GONE
                textgender8.visibility = GONE
                contact8.visibility = GONE
                textcontact8.visibility = GONE
                address8.visibility = GONE
                textaddress8.visibility = GONE
                hasaccountalready8.visibility = GONE
                texthasaccalready8.visibility = GONE
                accountopened8.visibility = GONE
                textaccountopened8.visibility = GONE
                acctype8.visibility = GONE
                textacctype8.visibility = GONE
                textbranchless8.visibility = GONE
                textassan8.visibility = GONE
                accnumber8.visibility = GONE
                textaccnumber8.visibility = GONE
                bankname8.visibility = GONE
                textbankname8.visibility = GONE
                branchcode8.visibility = GONE
                textbranchcode8.visibility = GONE
            }
        }

        // ------ For Participant 9 ------ //


        val name9 = findViewById<EditText>(R.id.inputName9)
        val textname9 = findViewById<TextView>(R.id.name9)
        val age9 = findViewById<Spinner>(R.id.inputage9)
        val textage9 = findViewById<TextView>(R.id.age9)
        age9.adapter = ageadapter
        age9.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage9 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender9 = findViewById<TextView>(R.id.inputgender9)
        val textgender9 = findViewById<TextView>(R.id.gender9)
        val profession9 = findViewById<EditText>(R.id.inputprofession9)
        val textprofession9 = findViewById<TextView>(R.id.profession9)
        val cnic9 = findViewById<EditText>(R.id.inputcnic9)
        val textcnic9 = findViewById<TextView>(R.id.cnic9)
        cnic9.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic9.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed9: String = cnic9.text.toString()
                val size9 = ed9.length
                if (size9 == 13) {
                    val cnicinteger9 = cnic9.text.toString().toLong()
                    if (cnicinteger9 % 10 == 1L || cnicinteger9 % 10 == 3L || cnicinteger9 % 10 == 5L || cnicinteger9 % 10 == 7L || cnicinteger9 % 10 == 9L) {
                        gender9.text = "Male"
                    } else if (cnicinteger9 % 10 == 2L || cnicinteger9 % 10 == 4L || cnicinteger9 % 10 == 6L || cnicinteger9 % 10 == 8L || cnicinteger9 % 10 == 0L) {
                        gender9.text = "Female"
                    }
                }
            }
        }
        val contact9 = findViewById<EditText>(R.id.inputcontact9)
        val textcontact9 = findViewById<TextView>(R.id.contact9)
        val address9 = findViewById<EditText>(R.id.inputaddress9)
        val textaddress9 = findViewById<TextView>(R.id.address9)
        val hasaccountalready9 = findViewById<CheckBox>(R.id.inputhasaccalready9)
        val texthasaccalready9 = findViewById<TextView>(R.id.hasaccalready9)
        val accountopened9 = findViewById<CheckBox>(R.id.inputhasaccopened9)
        val textaccountopened9 = findViewById<TextView>(R.id.hasaccopened9)
        val acctype9 = findViewById<RadioGroup>(R.id.inpuaccountype9)
        val textacctype9 = findViewById<TextView>(R.id.accountype9)
        val textbranchless9 = findViewById<RadioButton>(R.id.typebranchless9)
        val textassan9= findViewById<RadioButton>(R.id.typeAsaan9)
        val accnumber9 = findViewById<EditText>(R.id.inputaccnumber9)
        val textaccnumber9 = findViewById<TextView>(R.id.accnumber9)
        val bankname9 = findViewById<Spinner>(R.id.inputbankname9)
        val textbankname9 = findViewById<TextView>(R.id.bankname9)
        bankname9.adapter = banknameadapter
        bankname9.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank9 = if (accountopened9.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode9 = findViewById<EditText>(R.id.inputbranchcode9)
        val textbranchcode9 = findViewById<TextView>(R.id.branchcode9)
        val switch9 = findViewById<ToggleButton>(R.id.toggle9)
        switch9.setOnCheckedChangeListener { _, isChecked9 ->
            if (switch9.isChecked) {
                name9.visibility = VISIBLE
                textname9.visibility = VISIBLE
                age9.visibility = VISIBLE
                textage9.visibility = VISIBLE
                profession9.visibility = VISIBLE
                textprofession9.visibility = VISIBLE
                cnic9.visibility = VISIBLE
                textcnic9.visibility = VISIBLE
                gender9.visibility = VISIBLE
                textgender9.visibility = VISIBLE
                contact9.visibility = VISIBLE
                textcontact9.visibility = VISIBLE
                address9.visibility = VISIBLE
                textaddress9.visibility = VISIBLE
                hasaccountalready9.visibility = VISIBLE
                texthasaccalready9.visibility = VISIBLE
                accountopened9.visibility = VISIBLE
                textaccountopened9.visibility = VISIBLE
                accountopened9.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened9.isChecked) {
                        selectedaccountopened9 = "Y"
                        selectedacctype9 = findViewById(textbranchless9.id)
                        acctype9.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype9.checkedRadioButtonId
                            selectedacctype9 = findViewById<RadioButton>(id)
                        })
                        acctype9.visibility = VISIBLE;
                        textacctype9.visibility = VISIBLE
                        textbranchless9.visibility = VISIBLE
                        textassan9.visibility = VISIBLE
                        accnumber9.visibility = VISIBLE;
                        textaccnumber9.visibility = VISIBLE
                        bankname9.visibility = VISIBLE
                        textbankname9.visibility = VISIBLE
                        branchcode9.visibility = VISIBLE
                        textbranchcode9.visibility = VISIBLE
                    } else {
                        acctype9.clearCheck()
                        selectedaccountopened9 = "N"
                        acctype9.visibility = GONE;
                        textacctype9.visibility = GONE
                        textbranchless9.visibility = GONE
                        textassan9.visibility = GONE
                        accnumber9.visibility = GONE;
                        textaccnumber9.visibility = GONE
                        bankname9.visibility = GONE
                        textbankname9.visibility = GONE
                        branchcode9.visibility = GONE
                        textbranchcode9.visibility = GONE
                    }
                }
            } else {
                name9.visibility = GONE
                textname9.visibility = GONE
                age9.visibility = GONE
                textage9.visibility = GONE
                profession9.visibility = GONE
                textprofession9.visibility = GONE
                cnic9.visibility = GONE
                textcnic9.visibility = GONE
                gender9.visibility = GONE
                textgender9.visibility = GONE
                contact9.visibility = GONE
                textcontact9.visibility = GONE
                address9.visibility = GONE
                textaddress9.visibility = GONE
                hasaccountalready9.visibility = GONE
                texthasaccalready9.visibility = GONE
                accountopened9.visibility = GONE
                textaccountopened9.visibility = GONE
                acctype9.visibility = GONE
                textacctype9.visibility = GONE
                textbranchless9.visibility = GONE
                textassan9.visibility = GONE
                accnumber9.visibility = GONE
                textaccnumber9.visibility = GONE
                bankname9.visibility = GONE
                textbankname9.visibility = GONE
                branchcode9.visibility = GONE
                textbranchcode9.visibility = GONE
            }
        }

        // ------ For Participant 10 ------ //


        val name10 = findViewById<EditText>(R.id.inputName10)
        val textname10 = findViewById<TextView>(R.id.name10)
        val age10 = findViewById<Spinner>(R.id.inputage10)
        val textage10 = findViewById<TextView>(R.id.age10)
        age10.adapter = ageadapter
        age10.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage10 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender10 = findViewById<TextView>(R.id.inputgender10)
        val textgender10 = findViewById<TextView>(R.id.gender10)
        val profession10 = findViewById<EditText>(R.id.inputprofession10)
        val textprofession10 = findViewById<TextView>(R.id.profession10)
        val cnic10 = findViewById<EditText>(R.id.inputcnic10)
        val textcnic10 = findViewById<TextView>(R.id.cnic10)
        cnic10.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic10.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed10: String = cnic10.text.toString()
                val size10 = ed10.length
                if (size10 == 13) {
                    val cnicinteger10 = cnic10.text.toString().toLong()
                    if (cnicinteger10 % 10 == 1L || cnicinteger10 % 10 == 3L || cnicinteger10 % 10 == 5L || cnicinteger10 % 10 == 7L || cnicinteger10 % 10 == 9L) {
                        gender10.text = "Male"
                    } else if (cnicinteger10 % 10 == 2L || cnicinteger10 % 10 == 4L || cnicinteger10 % 10 == 6L || cnicinteger10 % 10 == 8L || cnicinteger10 % 10 == 0L) {
                        gender10.text = "Female"
                    }
                }
            }
        }
        val contact10 = findViewById<EditText>(R.id.inputcontact10)
        val textcontact10 = findViewById<TextView>(R.id.contact10)
        val address10 = findViewById<EditText>(R.id.inputaddress10)
        val textaddress10 = findViewById<TextView>(R.id.address10)
        val hasaccountalready10 = findViewById<CheckBox>(R.id.inputhasaccalready10)
        val texthasaccalready10 = findViewById<TextView>(R.id.hasaccalready10)
        val accountopened10 = findViewById<CheckBox>(R.id.inputhasaccopened10)
        val textaccountopened10 = findViewById<TextView>(R.id.hasaccopened10)
        val acctype10 = findViewById<RadioGroup>(R.id.inpuaccountype10)
        val textacctype10 = findViewById<TextView>(R.id.accountype10)
        val textbranchless10 = findViewById<RadioButton>(R.id.typebranchless10)
        val textassan10= findViewById<RadioButton>(R.id.typeAsaan10)
        val accnumber10 = findViewById<EditText>(R.id.inputaccnumber10)
        val textaccnumber10 = findViewById<TextView>(R.id.accnumber10)
        val bankname10 = findViewById<Spinner>(R.id.inputbankname10)
        val textbankname10 = findViewById<TextView>(R.id.bankname10)
        bankname10.adapter = banknameadapter
        bankname10.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank10 = if (accountopened10.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode10 = findViewById<EditText>(R.id.inputbranchcode10)
        val textbranchcode10 = findViewById<TextView>(R.id.branchcode10)
        val switch10 = findViewById<ToggleButton>(R.id.toggle10)
        switch10.setOnCheckedChangeListener { _, isChecked10 ->
            if (switch10.isChecked) {
                name10.visibility = VISIBLE
                textname10.visibility = VISIBLE
                age10.visibility = VISIBLE
                textage10.visibility = VISIBLE
                profession10.visibility = VISIBLE
                textprofession10.visibility = VISIBLE
                cnic10.visibility = VISIBLE
                textcnic10.visibility = VISIBLE
                gender10.visibility = VISIBLE
                textgender10.visibility = VISIBLE
                contact10.visibility = VISIBLE
                textcontact10.visibility = VISIBLE
                address10.visibility = VISIBLE
                textaddress10.visibility = VISIBLE
                hasaccountalready10.visibility = VISIBLE
                texthasaccalready10.visibility = VISIBLE
                accountopened10.visibility = VISIBLE
                textaccountopened10.visibility = VISIBLE
                accountopened10.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened10.isChecked) {
                        selectedaccountopened10 = "Y"
                        selectedacctype10 = findViewById(textbranchless10.id)
                        acctype10.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype10.checkedRadioButtonId
                            selectedacctype10 = findViewById<RadioButton>(id)
                        })
                        acctype10.visibility = VISIBLE;
                        textacctype10.visibility = VISIBLE
                        textbranchless10.visibility = VISIBLE
                        textassan10.visibility = VISIBLE
                        accnumber10.visibility = VISIBLE;
                        textaccnumber10.visibility = VISIBLE
                        bankname10.visibility = VISIBLE
                        textbankname10.visibility = VISIBLE
                        branchcode10.visibility = VISIBLE
                        textbranchcode10.visibility = VISIBLE
                    } else {
                        acctype10.clearCheck()
                        selectedaccountopened10 = "N"
                        acctype10.visibility = GONE;
                        textacctype10.visibility = GONE
                        textbranchless10.visibility = GONE
                        textassan10.visibility = GONE
                        accnumber10.visibility = GONE;
                        textaccnumber10.visibility = GONE
                        bankname10.visibility = GONE
                        textbankname10.visibility = GONE
                        branchcode10.visibility = GONE
                        textbranchcode10.visibility = GONE
                    }
                }
            } else {
                name10.visibility = GONE
                textname10.visibility = GONE
                age10.visibility = GONE
                textage10.visibility = GONE
                profession10.visibility = GONE
                textprofession10.visibility = GONE
                cnic10.visibility = GONE
                textcnic10.visibility = GONE
                gender10.visibility = GONE
                textgender10.visibility = GONE
                contact10.visibility = GONE
                textcontact10.visibility = GONE
                address10.visibility = GONE
                textaddress10.visibility = GONE
                hasaccountalready10.visibility = GONE
                texthasaccalready10.visibility = GONE
                accountopened10.visibility = GONE
                textaccountopened10.visibility = GONE
                acctype10.visibility = GONE
                textacctype10.visibility = GONE
                textbranchless10.visibility = GONE
                textassan10.visibility = GONE
                accnumber10.visibility = GONE
                textaccnumber10.visibility = GONE
                bankname10.visibility = GONE
                textbankname10.visibility = GONE
                branchcode10.visibility = GONE
                textbranchcode10.visibility = GONE
            }
        }

        // ------ For Participant 11 ------ //


        val name11 = findViewById<EditText>(R.id.inputName11)
        val textname11 = findViewById<TextView>(R.id.name11)
        val age11 = findViewById<Spinner>(R.id.inputage11)
        val textage11 = findViewById<TextView>(R.id.age11)
        age11.adapter = ageadapter
        age11.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage11 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender11 = findViewById<TextView>(R.id.inputgender11)
        val textgender11 = findViewById<TextView>(R.id.gender11)
        val profession11 = findViewById<EditText>(R.id.inputprofession11)
        val textprofession11 = findViewById<TextView>(R.id.profession11)
        val cnic11 = findViewById<EditText>(R.id.inputcnic11)
        val textcnic11 = findViewById<TextView>(R.id.cnic11)
        cnic11.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic11.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed11: String = cnic11.text.toString()
                val size11 = ed11.length
                if (size11 == 13) {
                    val cnicinteger11 = cnic11.text.toString().toLong()
                    if (cnicinteger11 % 10 == 1L || cnicinteger11 % 10 == 3L || cnicinteger11 % 10 == 5L || cnicinteger11 % 10 == 7L || cnicinteger11 % 10 == 9L) {
                        gender11.text = "Male"
                    } else if (cnicinteger11 % 10 == 2L || cnicinteger11 % 10 == 4L || cnicinteger11 % 10 == 6L || cnicinteger11 % 10 == 8L || cnicinteger11 % 10 == 0L) {
                        gender11.text = "Female"
                    }
                }
            }
        }
        val contact11 = findViewById<EditText>(R.id.inputcontact11)
        val textcontact11 = findViewById<TextView>(R.id.contact11)
        val address11 = findViewById<EditText>(R.id.inputaddress11)
        val textaddress11 = findViewById<TextView>(R.id.address11)
        val hasaccountalready11 = findViewById<CheckBox>(R.id.inputhasaccalready11)
        val texthasaccalready11 = findViewById<TextView>(R.id.hasaccalready11)
        val accountopened11 = findViewById<CheckBox>(R.id.inputhasaccopened11)
        val textaccountopened11 = findViewById<TextView>(R.id.hasaccopened11)
        val acctype11 = findViewById<RadioGroup>(R.id.inpuaccountype11)
        val textacctype11 = findViewById<TextView>(R.id.accountype11)
        val textbranchless11 = findViewById<RadioButton>(R.id.typebranchless11)
        val textassan11= findViewById<RadioButton>(R.id.typeAsaan11)
        val accnumber11 = findViewById<EditText>(R.id.inputaccnumber11)
        val textaccnumber11 = findViewById<TextView>(R.id.accnumber11)
        val bankname11 = findViewById<Spinner>(R.id.inputbankname11)
        val textbankname11 = findViewById<TextView>(R.id.bankname11)
        bankname11.adapter = banknameadapter
        bankname11.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank11 = if (accountopened11.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode11 = findViewById<EditText>(R.id.inputbranchcode11)
        val textbranchcode11 = findViewById<TextView>(R.id.branchcode11)
        val switch11 = findViewById<ToggleButton>(R.id.toggle11)
        switch11.setOnCheckedChangeListener { _, isChecked11 ->
            if (switch11.isChecked) {
                name11.visibility = VISIBLE
                textname11.visibility = VISIBLE
                age11.visibility = VISIBLE
                textage11.visibility = VISIBLE
                profession11.visibility = VISIBLE
                textprofession11.visibility = VISIBLE
                cnic11.visibility = VISIBLE
                textcnic11.visibility = VISIBLE
                gender11.visibility = VISIBLE
                textgender11.visibility = VISIBLE
                contact11.visibility = VISIBLE
                textcontact11.visibility = VISIBLE
                address11.visibility = VISIBLE
                textaddress11.visibility = VISIBLE
                hasaccountalready11.visibility = VISIBLE
                texthasaccalready11.visibility = VISIBLE
                accountopened11.visibility = VISIBLE
                textaccountopened11.visibility = VISIBLE
                accountopened11.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened11.isChecked) {
                        selectedaccountopened11 = "Y"
                        selectedacctype11 = findViewById(textbranchless11.id)
                        acctype11.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype11.checkedRadioButtonId
                            selectedacctype11 = findViewById<RadioButton>(id)
                        })
                        acctype11.visibility = VISIBLE;
                        textacctype11.visibility = VISIBLE
                        textbranchless11.visibility = VISIBLE
                        textassan11.visibility = VISIBLE
                        accnumber11.visibility = VISIBLE;
                        textaccnumber11.visibility = VISIBLE
                        bankname11.visibility = VISIBLE
                        textbankname11.visibility = VISIBLE
                        branchcode11.visibility = VISIBLE
                        textbranchcode11.visibility = VISIBLE
                    } else {
                        acctype11.clearCheck()
                        selectedaccountopened11 = "N"
                        acctype11.visibility = GONE;
                        textacctype11.visibility = GONE
                        textbranchless11.visibility = GONE
                        textassan11.visibility = GONE
                        accnumber11.visibility = GONE;
                        textaccnumber11.visibility = GONE
                        bankname11.visibility = GONE
                        textbankname11.visibility = GONE
                        branchcode11.visibility = GONE
                        textbranchcode11.visibility = GONE
                    }
                }
            } else {
                name11.visibility = GONE
                textname11.visibility = GONE
                age11.visibility = GONE
                textage11.visibility = GONE
                profession11.visibility = GONE
                textprofession11.visibility = GONE
                cnic11.visibility = GONE
                textcnic11.visibility = GONE
                gender11.visibility = GONE
                textgender11.visibility = GONE
                contact11.visibility = GONE
                textcontact11.visibility = GONE
                address11.visibility = GONE
                textaddress11.visibility = GONE
                hasaccountalready11.visibility = GONE
                texthasaccalready11.visibility = GONE
                accountopened11.visibility = GONE
                textaccountopened11.visibility = GONE
                acctype11.visibility = GONE
                textacctype11.visibility = GONE
                textbranchless11.visibility = GONE
                textassan11.visibility = GONE
                accnumber11.visibility = GONE
                textaccnumber11.visibility = GONE
                bankname11.visibility = GONE
                textbankname11.visibility = GONE
                branchcode11.visibility = GONE
                textbranchcode11.visibility = GONE
            }
        }

        // ------ For Participant 12 ------ //


        val name12 = findViewById<EditText>(R.id.inputName12)
        val textname12 = findViewById<TextView>(R.id.name12)
        val age12 = findViewById<Spinner>(R.id.inputage12)
        val textage12 = findViewById<TextView>(R.id.age12)
        age12.adapter = ageadapter
        age12.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage12 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender12 = findViewById<TextView>(R.id.inputgender12)
        val textgender12 = findViewById<TextView>(R.id.gender12)
        val profession12 = findViewById<EditText>(R.id.inputprofession12)
        val textprofession12 = findViewById<TextView>(R.id.profession12)
        val cnic12 = findViewById<EditText>(R.id.inputcnic12)
        val textcnic12 = findViewById<TextView>(R.id.cnic12)
        cnic12.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic12.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed12: String = cnic12.text.toString()
                val size12 = ed12.length
                if (size12 == 13) {
                    val cnicinteger12 = cnic12.text.toString().toLong()
                    if (cnicinteger12 % 10 == 1L || cnicinteger12 % 10 == 3L || cnicinteger12 % 10 == 5L || cnicinteger12 % 10 == 7L || cnicinteger12 % 10 == 9L) {
                        gender12.text = "Male"
                    } else if (cnicinteger12 % 10 == 2L || cnicinteger12 % 10 == 4L || cnicinteger12 % 10 == 6L || cnicinteger12 % 10 == 8L || cnicinteger12 % 10 == 0L) {
                        gender12.text = "Female"
                    }
                }
            }
        }
        val contact12 = findViewById<EditText>(R.id.inputcontact12)
        val textcontact12 = findViewById<TextView>(R.id.contact12)
        val address12 = findViewById<EditText>(R.id.inputaddress12)
        val textaddress12 = findViewById<TextView>(R.id.address12)
        val hasaccountalready12 = findViewById<CheckBox>(R.id.inputhasaccalready12)
        val texthasaccalready12 = findViewById<TextView>(R.id.hasaccalready12)
        val accountopened12 = findViewById<CheckBox>(R.id.inputhasaccopened12)
        val textaccountopened12 = findViewById<TextView>(R.id.hasaccopened12)
        val acctype12 = findViewById<RadioGroup>(R.id.inpuaccountype12)
        val textacctype12 = findViewById<TextView>(R.id.accountype12)
        val textbranchless12 = findViewById<RadioButton>(R.id.typebranchless12)
        val textassan12= findViewById<RadioButton>(R.id.typeAsaan12)
        val accnumber12 = findViewById<EditText>(R.id.inputaccnumber12)
        val textaccnumber12 = findViewById<TextView>(R.id.accnumber12)
        val bankname12 = findViewById<Spinner>(R.id.inputbankname12)
        val textbankname12 = findViewById<TextView>(R.id.bankname12)
        bankname12.adapter = banknameadapter
        bankname12.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank12 = if (accountopened12.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode12 = findViewById<EditText>(R.id.inputbranchcode12)
        val textbranchcode12 = findViewById<TextView>(R.id.branchcode12)
        val switch12 = findViewById<ToggleButton>(R.id.toggle12)
        switch12.setOnCheckedChangeListener { _, isChecked12 ->
            if (switch12.isChecked) {
                name12.visibility = VISIBLE
                textname12.visibility = VISIBLE
                age12.visibility = VISIBLE
                textage12.visibility = VISIBLE
                profession12.visibility = VISIBLE
                textprofession12.visibility = VISIBLE
                cnic12.visibility = VISIBLE
                textcnic12.visibility = VISIBLE
                gender12.visibility = VISIBLE
                textgender12.visibility = VISIBLE
                contact12.visibility = VISIBLE
                textcontact12.visibility = VISIBLE
                address12.visibility = VISIBLE
                textaddress12.visibility = VISIBLE
                hasaccountalready12.visibility = VISIBLE
                texthasaccalready12.visibility = VISIBLE
                accountopened12.visibility = VISIBLE
                textaccountopened12.visibility = VISIBLE
                accountopened12.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened12.isChecked) {
                        selectedaccountopened12 = "Y"
                        selectedacctype12 = findViewById(textbranchless12.id)
                        acctype12.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype12.checkedRadioButtonId
                            selectedacctype12 = findViewById<RadioButton>(id)
                        })
                        acctype12.visibility = VISIBLE;
                        textacctype12.visibility = VISIBLE
                        textbranchless12.visibility = VISIBLE
                        textassan12.visibility = VISIBLE
                        accnumber12.visibility = VISIBLE;
                        textaccnumber12.visibility = VISIBLE
                        bankname12.visibility = VISIBLE
                        textbankname12.visibility = VISIBLE
                        branchcode12.visibility = VISIBLE
                        textbranchcode12.visibility = VISIBLE
                    } else {
                        acctype12.clearCheck()
                        selectedaccountopened12 = "N"
                        acctype12.visibility = GONE;
                        textacctype12.visibility = GONE
                        textbranchless12.visibility = GONE
                        textassan12.visibility = GONE
                        accnumber12.visibility = GONE;
                        textaccnumber12.visibility = GONE
                        bankname12.visibility = GONE
                        textbankname12.visibility = GONE
                        branchcode12.visibility = GONE
                        textbranchcode12.visibility = GONE
                    }
                }
            } else {
                name12.visibility = GONE
                textname12.visibility = GONE
                age12.visibility = GONE
                textage12.visibility = GONE
                profession12.visibility = GONE
                textprofession12.visibility = GONE
                cnic12.visibility = GONE
                textcnic12.visibility = GONE
                gender12.visibility = GONE
                textgender12.visibility = GONE
                contact12.visibility = GONE
                textcontact12.visibility = GONE
                address12.visibility = GONE
                textaddress12.visibility = GONE
                hasaccountalready12.visibility = GONE
                texthasaccalready12.visibility = GONE
                accountopened12.visibility = GONE
                textaccountopened12.visibility = GONE
                acctype12.visibility = GONE
                textacctype12.visibility = GONE
                textbranchless12.visibility = GONE
                textassan12.visibility = GONE
                accnumber12.visibility = GONE
                textaccnumber12.visibility = GONE
                bankname12.visibility = GONE
                textbankname12.visibility = GONE
                branchcode12.visibility = GONE
                textbranchcode12.visibility = GONE
            }
        }

        // ------ For Participant 13 ------ //


        val name13 = findViewById<EditText>(R.id.inputName13)
        val textname13 = findViewById<TextView>(R.id.name13)
        val age13 = findViewById<Spinner>(R.id.inputage13)
        val textage13 = findViewById<TextView>(R.id.age13)
        age13.adapter = ageadapter
        age13.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage13 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender13 = findViewById<TextView>(R.id.inputgender13)
        val textgender13 = findViewById<TextView>(R.id.gender13)
        val profession13 = findViewById<EditText>(R.id.inputprofession13)
        val textprofession13 = findViewById<TextView>(R.id.profession13)
        val cnic13 = findViewById<EditText>(R.id.inputcnic13)
        val textcnic13 = findViewById<TextView>(R.id.cnic13)
        cnic13.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic13.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed13: String = cnic13.text.toString()
                val size13 = ed13.length
                if (size13 == 13) {
                    val cnicinteger13 = cnic13.text.toString().toLong()
                    if (cnicinteger13 % 10 == 1L || cnicinteger13 % 10 == 3L || cnicinteger13 % 10 == 5L || cnicinteger13 % 10 == 7L || cnicinteger13 % 10 == 9L) {
                        gender13.text = "Male"
                    } else if (cnicinteger13 % 10 == 2L || cnicinteger13 % 10 == 4L || cnicinteger13 % 10 == 6L || cnicinteger13 % 10 == 8L || cnicinteger13 % 10 == 0L) {
                        gender13.text = "Female"
                    }
                }
            }
        }
        val contact13 = findViewById<EditText>(R.id.inputcontact13)
        val textcontact13 = findViewById<TextView>(R.id.contact13)
        val address13 = findViewById<EditText>(R.id.inputaddress13)
        val textaddress13 = findViewById<TextView>(R.id.address13)
        val hasaccountalready13= findViewById<CheckBox>(R.id.inputhasaccalready13)
        val texthasaccalready13 = findViewById<TextView>(R.id.hasaccalready13)
        val accountopened13 = findViewById<CheckBox>(R.id.inputhasaccopened13)
        val textaccountopened13 = findViewById<TextView>(R.id.hasaccopened13)
        val acctype13 = findViewById<RadioGroup>(R.id.inpuaccountype13)
        val textacctype13 = findViewById<TextView>(R.id.accountype13)
        val textbranchless13 = findViewById<RadioButton>(R.id.typebranchless13)
        val textassan13= findViewById<RadioButton>(R.id.typeAsaan13)
        val accnumber13 = findViewById<EditText>(R.id.inputaccnumber13)
        val textaccnumber13 = findViewById<TextView>(R.id.accnumber13)
        val bankname13 = findViewById<Spinner>(R.id.inputbankname13)
        val textbankname13 = findViewById<TextView>(R.id.bankname13)
        bankname13.adapter = banknameadapter
        bankname13.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank13 = if (accountopened13.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode13 = findViewById<EditText>(R.id.inputbranchcode13)
        val textbranchcode13 = findViewById<TextView>(R.id.branchcode13)
        val switch13 = findViewById<ToggleButton>(R.id.toggle13)
        switch13.setOnCheckedChangeListener { _, isChecked13 ->
            if (switch13.isChecked) {
                name13.visibility = VISIBLE
                textname13.visibility = VISIBLE
                age13.visibility = VISIBLE
                textage13.visibility = VISIBLE
                profession13.visibility = VISIBLE
                textprofession13.visibility = VISIBLE
                cnic13.visibility = VISIBLE
                textcnic13.visibility = VISIBLE
                gender13.visibility = VISIBLE
                textgender13.visibility = VISIBLE
                contact13.visibility = VISIBLE
                textcontact13.visibility = VISIBLE
                address13.visibility = VISIBLE
                textaddress13.visibility = VISIBLE
                hasaccountalready13.visibility = VISIBLE
                texthasaccalready13.visibility = VISIBLE
                accountopened13.visibility = VISIBLE
                textaccountopened13.visibility = VISIBLE
                accountopened13.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened13.isChecked) {
                        selectedaccountopened13 = "Y"
                        selectedacctype13 = findViewById(textbranchless13.id)
                        acctype13.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype13.checkedRadioButtonId
                            selectedacctype13 = findViewById<RadioButton>(id)
                        })
                        acctype13.visibility = VISIBLE;
                        textacctype13.visibility = VISIBLE
                        textbranchless13.visibility = VISIBLE
                        textassan13.visibility = VISIBLE
                        accnumber13.visibility = VISIBLE;
                        textaccnumber13.visibility = VISIBLE
                        bankname13.visibility = VISIBLE
                        textbankname13.visibility = VISIBLE
                        branchcode13.visibility = VISIBLE
                        textbranchcode13.visibility = VISIBLE
                    } else {
                        acctype13.clearCheck()
                        selectedaccountopened13 = "N"
                        acctype13.visibility = GONE;
                        textacctype13.visibility = GONE
                        textbranchless13.visibility = GONE
                        textassan13.visibility = GONE
                        accnumber13.visibility = GONE;
                        textaccnumber13.visibility = GONE
                        bankname13.visibility = GONE
                        textbankname13.visibility = GONE
                        branchcode13.visibility = GONE
                        textbranchcode13.visibility = GONE
                    }
                }
            } else {
                name13.visibility = GONE
                textname13.visibility = GONE
                age13.visibility = GONE
                textage13.visibility = GONE
                profession13.visibility = GONE
                textprofession13.visibility = GONE
                cnic13.visibility = GONE
                textcnic13.visibility = GONE
                gender13.visibility = GONE
                textgender13.visibility = GONE
                contact13.visibility = GONE
                textcontact13.visibility = GONE
                address13.visibility = GONE
                textaddress13.visibility = GONE
                hasaccountalready13.visibility = GONE
                texthasaccalready13.visibility = GONE
                accountopened13.visibility = GONE
                textaccountopened13.visibility = GONE
                acctype13.visibility = GONE
                textacctype13.visibility = GONE
                textbranchless13.visibility = GONE
                textassan13.visibility = GONE
                accnumber13.visibility = GONE
                textaccnumber13.visibility = GONE
                bankname13.visibility = GONE
                textbankname13.visibility = GONE
                branchcode13.visibility = GONE
                textbranchcode13.visibility = GONE
            }
        }

        // ------ For Participant 14 ------ //


        val name14 = findViewById<EditText>(R.id.inputName14)
        val textname14 = findViewById<TextView>(R.id.name14)
        val age14 = findViewById<Spinner>(R.id.inputage14)
        val textage14 = findViewById<TextView>(R.id.age14)
        age14.adapter = ageadapter
        age14.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage14 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender14 = findViewById<TextView>(R.id.inputgender14)
        val textgender14 = findViewById<TextView>(R.id.gender14)
        val profession14 = findViewById<EditText>(R.id.inputprofession14)
        val textprofession14 = findViewById<TextView>(R.id.profession14)
        val cnic14 = findViewById<EditText>(R.id.inputcnic14)
        val textcnic14 = findViewById<TextView>(R.id.cnic14)
        cnic14.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic14.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed14: String = cnic14.text.toString()
                val size14 = ed14.length
                if (size14 == 13) {
                    val cnicinteger14 = cnic14.text.toString().toLong()
                    if (cnicinteger14 % 10 == 1L || cnicinteger14 % 10 == 3L || cnicinteger14 % 10 == 5L || cnicinteger14 % 10 == 7L || cnicinteger14 % 10 == 9L) {
                        gender14.text = "Male"
                    } else if (cnicinteger14 % 10 == 2L || cnicinteger14 % 10 == 4L || cnicinteger14 % 10 == 6L || cnicinteger14 % 10 == 8L || cnicinteger14 % 10 == 0L) {
                        gender14.text = "Female"
                    }
                }
            }
        }
        val contact14 = findViewById<EditText>(R.id.inputcontact14)
        val textcontact14 = findViewById<TextView>(R.id.contact14)
        val address14 = findViewById<EditText>(R.id.inputaddress14)
        val textaddress14 = findViewById<TextView>(R.id.address14)
        val hasaccountalready14= findViewById<CheckBox>(R.id.inputhasaccalready14)
        val texthasaccalready14 = findViewById<TextView>(R.id.hasaccalready14)
        val accountopened14 = findViewById<CheckBox>(R.id.inputhasaccopened14)
        val textaccountopened14 = findViewById<TextView>(R.id.hasaccopened14)
        val acctype14 = findViewById<RadioGroup>(R.id.inpuaccountype14)
        val textacctype14 = findViewById<TextView>(R.id.accountype14)
        val textbranchless14 = findViewById<RadioButton>(R.id.typebranchless14)
        val textassan14= findViewById<RadioButton>(R.id.typeAsaan14)
        val accnumber14 = findViewById<EditText>(R.id.inputaccnumber14)
        val textaccnumber14 = findViewById<TextView>(R.id.accnumber14)
        val bankname14 = findViewById<Spinner>(R.id.inputbankname14)
        val textbankname14 = findViewById<TextView>(R.id.bankname14)
        bankname14.adapter = banknameadapter
        bankname14.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank14 = if (accountopened14.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode14 = findViewById<EditText>(R.id.inputbranchcode14)
        val textbranchcode14 = findViewById<TextView>(R.id.branchcode14)
        val switch14 = findViewById<ToggleButton>(R.id.toggle14)
        switch14.setOnCheckedChangeListener { _, isChecked14 ->
            if (switch14.isChecked) {
                name14.visibility = VISIBLE
                textname14.visibility = VISIBLE
                age14.visibility = VISIBLE
                textage14.visibility = VISIBLE
                profession14.visibility = VISIBLE
                textprofession14.visibility = VISIBLE
                cnic14.visibility = VISIBLE
                textcnic14.visibility = VISIBLE
                gender14.visibility = VISIBLE
                textgender14.visibility = VISIBLE
                contact14.visibility = VISIBLE
                textcontact14.visibility = VISIBLE
                address14.visibility = VISIBLE
                textaddress14.visibility = VISIBLE
                hasaccountalready14.visibility = VISIBLE
                texthasaccalready14.visibility = VISIBLE
                accountopened14.visibility = VISIBLE
                textaccountopened14.visibility = VISIBLE
                accountopened14.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened14.isChecked) {
                        selectedaccountopened14 = "Y"
                        selectedacctype14 = findViewById(textbranchless14.id)
                        acctype14.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype14.checkedRadioButtonId
                            selectedacctype14 = findViewById<RadioButton>(id)
                        })
                        acctype14.visibility = VISIBLE;
                        textacctype14.visibility = VISIBLE
                        textbranchless14.visibility = VISIBLE
                        textassan14.visibility = VISIBLE
                        accnumber14.visibility = VISIBLE;
                        textaccnumber14.visibility = VISIBLE
                        bankname14.visibility = VISIBLE
                        textbankname14.visibility = VISIBLE
                        branchcode14.visibility = VISIBLE
                        textbranchcode14.visibility = VISIBLE
                    } else {
                        acctype14.clearCheck()
                        selectedaccountopened14 = "N"
                        acctype14.visibility = GONE;
                        textacctype14.visibility = GONE
                        textbranchless14.visibility = GONE
                        textassan14.visibility = GONE
                        accnumber14.visibility = GONE;
                        textaccnumber14.visibility = GONE
                        bankname14.visibility = GONE
                        textbankname14.visibility = GONE
                        branchcode14.visibility = GONE
                        textbranchcode14.visibility = GONE
                    }
                }
            } else {
                name14.visibility = GONE
                textname14.visibility = GONE
                age14.visibility = GONE
                textage14.visibility = GONE
                profession14.visibility = GONE
                textprofession14.visibility = GONE
                cnic14.visibility = GONE
                textcnic14.visibility = GONE
                gender14.visibility = GONE
                textgender14.visibility = GONE
                contact14.visibility = GONE
                textcontact14.visibility = GONE
                address14.visibility = GONE
                textaddress14.visibility = GONE
                hasaccountalready14.visibility = GONE
                texthasaccalready14.visibility = GONE
                accountopened14.visibility = GONE
                textaccountopened14.visibility = GONE
                acctype14.visibility = GONE
                textacctype14.visibility = GONE
                textbranchless14.visibility = GONE
                textassan14.visibility = GONE
                accnumber14.visibility = GONE
                textaccnumber14.visibility = GONE
                bankname14.visibility = GONE
                textbankname14.visibility = GONE
                branchcode14.visibility = GONE
                textbranchcode14.visibility = GONE
            }
        }

        // ------ For Participant 15 ------ //


        val name15 = findViewById<EditText>(R.id.inputName15)
        val textname15 = findViewById<TextView>(R.id.name15)
        val age15 = findViewById<Spinner>(R.id.inputage15)
        val textage15 = findViewById<TextView>(R.id.age15)
        age15.adapter = ageadapter
        age15.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage15 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender15 = findViewById<TextView>(R.id.inputgender15)
        val textgender15 = findViewById<TextView>(R.id.gender15)
        val profession15 = findViewById<EditText>(R.id.inputprofession15)
        val textprofession15 = findViewById<TextView>(R.id.profession15)
        val cnic15 = findViewById<EditText>(R.id.inputcnic15)
        val textcnic15 = findViewById<TextView>(R.id.cnic15)
        cnic15.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic15.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed15: String = cnic15.text.toString()
                val size15 = ed15.length
                if (size15 == 13) {
                    val cnicinteger15 = cnic15.text.toString().toLong()
                    if (cnicinteger15 % 10 == 1L || cnicinteger15 % 10 == 3L || cnicinteger15 % 10 == 5L || cnicinteger15 % 10 == 7L || cnicinteger15 % 10 == 9L) {
                        gender15.text = "Male"
                    } else if (cnicinteger15 % 10 == 2L || cnicinteger15 % 10 == 4L || cnicinteger15 % 10 == 6L || cnicinteger15 % 10 == 8L || cnicinteger15 % 10 == 0L) {
                        gender15.text = "Female"
                    }
                }
            }
        }
        val contact15 = findViewById<EditText>(R.id.inputcontact15)
        val textcontact15 = findViewById<TextView>(R.id.contact15)
        val address15 = findViewById<EditText>(R.id.inputaddress15)
        val textaddress15 = findViewById<TextView>(R.id.address15)
        val hasaccountalready15= findViewById<CheckBox>(R.id.inputhasaccalready15)
        val texthasaccalready15 = findViewById<TextView>(R.id.hasaccalready15)
        val accountopened15 = findViewById<CheckBox>(R.id.inputhasaccopened15)
        val textaccountopened15 = findViewById<TextView>(R.id.hasaccopened15)
        val acctype15 = findViewById<RadioGroup>(R.id.inpuaccountype15)
        val textacctype15 = findViewById<TextView>(R.id.accountype15)
        val textbranchless15 = findViewById<RadioButton>(R.id.typebranchless15)
        val textassan15= findViewById<RadioButton>(R.id.typeAsaan15)
        val accnumber15 = findViewById<EditText>(R.id.inputaccnumber15)
        val textaccnumber15 = findViewById<TextView>(R.id.accnumber15)
        val bankname15 = findViewById<Spinner>(R.id.inputbankname15)
        val textbankname15 = findViewById<TextView>(R.id.bankname15)
        bankname15.adapter = banknameadapter
        bankname15.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank15 = if (accountopened15.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode15 = findViewById<EditText>(R.id.inputbranchcode15)
        val textbranchcode15 = findViewById<TextView>(R.id.branchcode15)
        val switch15 = findViewById<ToggleButton>(R.id.toggle15)
        switch15.setOnCheckedChangeListener { _, isChecked15 ->
            if (switch15.isChecked) {
                name15.visibility = VISIBLE
                textname15.visibility = VISIBLE
                age15.visibility = VISIBLE
                textage15.visibility = VISIBLE
                profession15.visibility = VISIBLE
                textprofession15.visibility = VISIBLE
                cnic15.visibility = VISIBLE
                textcnic15.visibility = VISIBLE
                gender15.visibility = VISIBLE
                textgender15.visibility = VISIBLE
                contact15.visibility = VISIBLE
                textcontact15.visibility = VISIBLE
                address15.visibility = VISIBLE
                textaddress15.visibility = VISIBLE
                hasaccountalready15.visibility = VISIBLE
                texthasaccalready15.visibility = VISIBLE
                accountopened15.visibility = VISIBLE
                textaccountopened15.visibility = VISIBLE
                accountopened15.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened15.isChecked) {
                        selectedaccountopened15 = "Y"
                        selectedacctype15 = findViewById(textbranchless15.id)
                        acctype15.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype15.checkedRadioButtonId
                            selectedacctype15 = findViewById<RadioButton>(id)
                        })
                        acctype15.visibility = VISIBLE;
                        textacctype15.visibility = VISIBLE
                        textbranchless15.visibility = VISIBLE
                        textassan15.visibility = VISIBLE
                        accnumber15.visibility = VISIBLE;
                        textaccnumber15.visibility = VISIBLE
                        bankname15.visibility = VISIBLE
                        textbankname15.visibility = VISIBLE
                        branchcode15.visibility = VISIBLE
                        textbranchcode15.visibility = VISIBLE
                    } else {
                        acctype15.clearCheck()
                        selectedaccountopened15 = "N"
                        acctype15.visibility = GONE;
                        textacctype15.visibility = GONE
                        textbranchless15.visibility = GONE
                        textassan15.visibility = GONE
                        accnumber15.visibility = GONE;
                        textaccnumber15.visibility = GONE
                        bankname15.visibility = GONE
                        textbankname15.visibility = GONE
                        branchcode15.visibility = GONE
                        textbranchcode15.visibility = GONE
                    }
                }
            } else {
                name15.visibility = GONE
                textname15.visibility = GONE
                age15.visibility = GONE
                textage15.visibility = GONE
                profession15.visibility = GONE
                textprofession15.visibility = GONE
                cnic15.visibility = GONE
                textcnic15.visibility = GONE
                gender15.visibility = GONE
                textgender15.visibility = GONE
                contact15.visibility = GONE
                textcontact15.visibility = GONE
                address15.visibility = GONE
                textaddress15.visibility = GONE
                hasaccountalready15.visibility = GONE
                texthasaccalready15.visibility = GONE
                accountopened15.visibility = GONE
                textaccountopened15.visibility = GONE
                acctype15.visibility = GONE
                textacctype15.visibility = GONE
                textbranchless15.visibility = GONE
                textassan15.visibility = GONE
                accnumber15.visibility = GONE
                textaccnumber15.visibility = GONE
                bankname15.visibility = GONE
                textbankname15.visibility = GONE
                branchcode15.visibility = GONE
                textbranchcode15.visibility = GONE
            }
        }

        // ------ For Participant 16 ------ //


        val name16 = findViewById<EditText>(R.id.inputName16)
        val textname16 = findViewById<TextView>(R.id.name16)
        val age16 = findViewById<Spinner>(R.id.inputage16)
        val textage16 = findViewById<TextView>(R.id.age16)
        age16.adapter = ageadapter
        age16.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage16 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender16 = findViewById<TextView>(R.id.inputgender16)
        val textgender16 = findViewById<TextView>(R.id.gender16)
        val profession16 = findViewById<EditText>(R.id.inputprofession16)
        val textprofession16 = findViewById<TextView>(R.id.profession16)
        val cnic16 = findViewById<EditText>(R.id.inputcnic16)
        val textcnic16 = findViewById<TextView>(R.id.cnic16)
        cnic16.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic16.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed16: String = cnic16.text.toString()
                val size16 = ed16.length
                if (size16 == 13) {
                    val cnicinteger16 = cnic16.text.toString().toLong()
                    if (cnicinteger16 % 10 == 1L || cnicinteger16 % 10 == 3L || cnicinteger16 % 10 == 5L || cnicinteger16 % 10 == 7L || cnicinteger16 % 10 == 9L) {
                        gender16.text = "Male"
                    } else if (cnicinteger16 % 10 == 2L || cnicinteger16 % 10 == 4L || cnicinteger16 % 10 == 6L || cnicinteger16 % 10 == 8L || cnicinteger16 % 10 == 0L) {
                        gender16.text = "Female"
                    }
                }
            }
        }
        val contact16 = findViewById<EditText>(R.id.inputcontact16)
        val textcontact16 = findViewById<TextView>(R.id.contact16)
        val address16 = findViewById<EditText>(R.id.inputaddress16)
        val textaddress16 = findViewById<TextView>(R.id.address16)
        val hasaccountalready16= findViewById<CheckBox>(R.id.inputhasaccalready16)
        val texthasaccalready16 = findViewById<TextView>(R.id.hasaccalready16)
        val accountopened16 = findViewById<CheckBox>(R.id.inputhasaccopened16)
        val textaccountopened16 = findViewById<TextView>(R.id.hasaccopened16)
        val acctype16 = findViewById<RadioGroup>(R.id.inpuaccountype16)
        val textacctype16 = findViewById<TextView>(R.id.accountype16)
        val textbranchless16 = findViewById<RadioButton>(R.id.typebranchless16)
        val textassan16= findViewById<RadioButton>(R.id.typeAsaan16)
        val accnumber16 = findViewById<EditText>(R.id.inputaccnumber16)
        val textaccnumber16 = findViewById<TextView>(R.id.accnumber16)
        val bankname16 = findViewById<Spinner>(R.id.inputbankname16)
        val textbankname16 = findViewById<TextView>(R.id.bankname16)
        bankname16.adapter = banknameadapter
        bankname16.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank16 = if (accountopened16.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode16 = findViewById<EditText>(R.id.inputbranchcode16)
        val textbranchcode16 = findViewById<TextView>(R.id.branchcode16)
        val switch16 = findViewById<ToggleButton>(R.id.toggle16)
        switch16.setOnCheckedChangeListener { _, isChecked16 ->
            if (switch16.isChecked) {
                name16.visibility = VISIBLE
                textname16.visibility = VISIBLE
                age16.visibility = VISIBLE
                textage16.visibility = VISIBLE
                profession16.visibility = VISIBLE
                textprofession16.visibility = VISIBLE
                cnic16.visibility = VISIBLE
                textcnic16.visibility = VISIBLE
                gender16.visibility = VISIBLE
                textgender16.visibility = VISIBLE
                contact16.visibility = VISIBLE
                textcontact16.visibility = VISIBLE
                address16.visibility = VISIBLE
                textaddress16.visibility = VISIBLE
                hasaccountalready16.visibility = VISIBLE
                texthasaccalready16.visibility = VISIBLE
                accountopened16.visibility = VISIBLE
                textaccountopened16.visibility = VISIBLE
                accountopened16.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened16.isChecked) {
                        selectedaccountopened16 = "Y"
                        selectedacctype16 = findViewById(textbranchless16.id)
                        acctype1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype16.checkedRadioButtonId
                            selectedacctype16 = findViewById<RadioButton>(id)
                        })
                        acctype16.visibility = VISIBLE;
                        textacctype16.visibility = VISIBLE
                        textbranchless16.visibility = VISIBLE
                        textassan16.visibility = VISIBLE
                        accnumber16.visibility = VISIBLE;
                        textaccnumber16.visibility = VISIBLE
                        bankname16.visibility = VISIBLE
                        textbankname16.visibility = VISIBLE
                        branchcode16.visibility = VISIBLE
                        textbranchcode16.visibility = VISIBLE
                    } else {
                        acctype16.clearCheck()
                        selectedaccountopened16 = "N"
                        acctype16.visibility = GONE;
                        textacctype16.visibility = GONE
                        textbranchless16.visibility = GONE
                        textassan16.visibility = GONE
                        accnumber16.visibility = GONE;
                        textaccnumber16.visibility = GONE
                        bankname16.visibility = GONE
                        textbankname16.visibility = GONE
                        branchcode16.visibility = GONE
                        textbranchcode16.visibility = GONE
                    }
                }
            } else {
                name16.visibility = GONE
                textname16.visibility = GONE
                age16.visibility = GONE
                textage16.visibility = GONE
                profession16.visibility = GONE
                textprofession16.visibility = GONE
                cnic16.visibility = GONE
                textcnic16.visibility = GONE
                gender16.visibility = GONE
                textgender16.visibility = GONE
                contact16.visibility = GONE
                textcontact16.visibility = GONE
                address16.visibility = GONE
                textaddress16.visibility = GONE
                hasaccountalready16.visibility = GONE
                texthasaccalready16.visibility = GONE
                accountopened16.visibility = GONE
                textaccountopened16.visibility = GONE
                acctype16.visibility = GONE
                textacctype16.visibility = GONE
                textbranchless16.visibility = GONE
                textassan16.visibility = GONE
                accnumber16.visibility = GONE
                textaccnumber16.visibility = GONE
                bankname16.visibility = GONE
                textbankname16.visibility = GONE
                branchcode16.visibility = GONE
                textbranchcode16.visibility = GONE
            }
        }

        // ------ For Participant 17 ------ //


        val name17 = findViewById<EditText>(R.id.inputName17)
        val textname17 = findViewById<TextView>(R.id.name17)
        val age17 = findViewById<Spinner>(R.id.inputage17)
        val textage17 = findViewById<TextView>(R.id.age17)
        age17.adapter = ageadapter
        age17.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage17 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender17 = findViewById<TextView>(R.id.inputgender17)
        val textgender17 = findViewById<TextView>(R.id.gender17)
        val profession17 = findViewById<EditText>(R.id.inputprofession17)
        val textprofession17 = findViewById<TextView>(R.id.profession17)
        val cnic17 = findViewById<EditText>(R.id.inputcnic17)
        val textcnic17 = findViewById<TextView>(R.id.cnic17)
        cnic17.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic17.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed17: String = cnic17.text.toString()
                val size17 = ed17.length
                if (size17 == 13) {
                    val cnicinteger17 = cnic17.text.toString().toLong()
                    if (cnicinteger17 % 10 == 1L || cnicinteger17 % 10 == 3L || cnicinteger17 % 10 == 5L || cnicinteger17 % 10 == 7L || cnicinteger17 % 10 == 9L) {
                        gender17.text = "Male"
                    } else if (cnicinteger17 % 10 == 2L || cnicinteger17 % 10 == 4L || cnicinteger17 % 10 == 6L || cnicinteger17 % 10 == 8L || cnicinteger17 % 10 == 0L) {
                        gender17.text = "Female"
                    }
                }
            }
        }
        val contact17 = findViewById<EditText>(R.id.inputcontact17)
        val textcontact17 = findViewById<TextView>(R.id.contact17)
        val address17 = findViewById<EditText>(R.id.inputaddress17)
        val textaddress17 = findViewById<TextView>(R.id.address17)
        val hasaccountalready17= findViewById<CheckBox>(R.id.inputhasaccalready17)
        val texthasaccalready17 = findViewById<TextView>(R.id.hasaccalready17)
        val accountopened17 = findViewById<CheckBox>(R.id.inputhasaccopened17)
        val textaccountopened17 = findViewById<TextView>(R.id.hasaccopened17)
        val acctype17 = findViewById<RadioGroup>(R.id.inpuaccountype17)
        val textacctype17 = findViewById<TextView>(R.id.accountype17)
        val textbranchless17 = findViewById<RadioButton>(R.id.typebranchless17)
        val textassan17= findViewById<RadioButton>(R.id.typeAsaan17)
        val accnumber17 = findViewById<EditText>(R.id.inputaccnumber17)
        val textaccnumber17 = findViewById<TextView>(R.id.accnumber17)
        val bankname17 = findViewById<Spinner>(R.id.inputbankname17)
        val textbankname17 = findViewById<TextView>(R.id.bankname17)
        bankname17.adapter = banknameadapter
        bankname17.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank17 = if (accountopened17.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode17 = findViewById<EditText>(R.id.inputbranchcode17)
        val textbranchcode17 = findViewById<TextView>(R.id.branchcode17)
        val switch17 = findViewById<ToggleButton>(R.id.toggle17)
        switch17.setOnCheckedChangeListener { _, isChecked17 ->
            if (switch17.isChecked) {
                name17.visibility = VISIBLE
                textname17.visibility = VISIBLE
                age17.visibility = VISIBLE
                textage17.visibility = VISIBLE
                profession17.visibility = VISIBLE
                textprofession17.visibility = VISIBLE
                cnic17.visibility = VISIBLE
                textcnic17.visibility = VISIBLE
                gender17.visibility = VISIBLE
                textgender17.visibility = VISIBLE
                contact17.visibility = VISIBLE
                textcontact17.visibility = VISIBLE
                address17.visibility = VISIBLE
                textaddress17.visibility = VISIBLE
                hasaccountalready17.visibility = VISIBLE
                texthasaccalready17.visibility = VISIBLE
                accountopened17.visibility = VISIBLE
                textaccountopened17.visibility = VISIBLE
                accountopened17.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened17.isChecked) {
                        selectedaccountopened17 = "Y"
                        selectedacctype17 = findViewById(textbranchless17.id)
                        acctype17.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype17.checkedRadioButtonId
                            selectedacctype17 = findViewById<RadioButton>(id)
                        })
                        acctype17.visibility = VISIBLE;
                        textacctype17.visibility = VISIBLE
                        textbranchless17.visibility = VISIBLE
                        textassan17.visibility = VISIBLE
                        accnumber17.visibility = VISIBLE;
                        textaccnumber17.visibility = VISIBLE
                        bankname17.visibility = VISIBLE
                        textbankname17.visibility = VISIBLE
                        branchcode17.visibility = VISIBLE
                        textbranchcode17.visibility = VISIBLE
                    } else {
                        acctype17.clearCheck()
                        selectedaccountopened17 = "N"
                        acctype17.visibility = GONE;
                        textacctype17.visibility = GONE
                        textbranchless17.visibility = GONE
                        textassan17.visibility = GONE
                        accnumber17.visibility = GONE;
                        textaccnumber17.visibility = GONE
                        bankname17.visibility = GONE
                        textbankname17.visibility = GONE
                        branchcode17.visibility = GONE
                        textbranchcode17.visibility = GONE
                    }
                }
            } else {
                name17.visibility = GONE
                textname17.visibility = GONE
                age17.visibility = GONE
                textage17.visibility = GONE
                profession17.visibility = GONE
                textprofession17.visibility = GONE
                cnic17.visibility = GONE
                textcnic17.visibility = GONE
                gender17.visibility = GONE
                textgender17.visibility = GONE
                contact17.visibility = GONE
                textcontact17.visibility = GONE
                address17.visibility = GONE
                textaddress17.visibility = GONE
                hasaccountalready17.visibility = GONE
                texthasaccalready17.visibility = GONE
                accountopened17.visibility = GONE
                textaccountopened17.visibility = GONE
                acctype17.visibility = GONE
                textacctype17.visibility = GONE
                textbranchless17.visibility = GONE
                textassan17.visibility = GONE
                accnumber17.visibility = GONE
                textaccnumber17.visibility = GONE
                bankname17.visibility = GONE
                textbankname17.visibility = GONE
                branchcode17.visibility = GONE
                textbranchcode17.visibility = GONE
            }
        }

        // ------ For Participant 18 ------ //


        val name18 = findViewById<EditText>(R.id.inputName18)
        val textname18 = findViewById<TextView>(R.id.name18)
        val age18 = findViewById<Spinner>(R.id.inputage18)
        val textage18 = findViewById<TextView>(R.id.age18)
        age18.adapter = ageadapter
        age18.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage18 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender18 = findViewById<TextView>(R.id.inputgender18)
        val textgender18 = findViewById<TextView>(R.id.gender18)
        val profession18 = findViewById<EditText>(R.id.inputprofession18)
        val textprofession18 = findViewById<TextView>(R.id.profession18)
        val cnic18 = findViewById<EditText>(R.id.inputcnic18)
        val textcnic18 = findViewById<TextView>(R.id.cnic18)
        cnic18.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic18.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed18: String = cnic18.text.toString()
                val size18 = ed18.length
                if (size18 == 13) {
                    val cnicinteger18 = cnic18.text.toString().toLong()
                    if (cnicinteger18 % 10 == 1L || cnicinteger18 % 10 == 3L || cnicinteger18 % 10 == 5L || cnicinteger18 % 10 == 7L || cnicinteger18 % 10 == 9L) {
                        gender18.text = "Male"
                    } else if (cnicinteger18 % 10 == 2L || cnicinteger18 % 10 == 4L || cnicinteger18 % 10 == 6L || cnicinteger18 % 10 == 8L || cnicinteger18 % 10 == 0L) {
                        gender18.text = "Female"
                    }
                }
            }
        }
        val contact18 = findViewById<EditText>(R.id.inputcontact18)
        val textcontact18 = findViewById<TextView>(R.id.contact18)
        val address18 = findViewById<EditText>(R.id.inputaddress18)
        val textaddress18 = findViewById<TextView>(R.id.address18)
        val hasaccountalready18= findViewById<CheckBox>(R.id.inputhasaccalready18)
        val texthasaccalready18 = findViewById<TextView>(R.id.hasaccalready18)
        val accountopened18 = findViewById<CheckBox>(R.id.inputhasaccopened18)
        val textaccountopened18 = findViewById<TextView>(R.id.hasaccopened18)
        val acctype18 = findViewById<RadioGroup>(R.id.inpuaccountype18)
        val textacctype18 = findViewById<TextView>(R.id.accountype18)
        val textbranchless18 = findViewById<RadioButton>(R.id.typebranchless18)
        val textassan18= findViewById<RadioButton>(R.id.typeAsaan18)
        val accnumber18 = findViewById<EditText>(R.id.inputaccnumber18)
        val textaccnumber18 = findViewById<TextView>(R.id.accnumber18)
        val bankname18 = findViewById<Spinner>(R.id.inputbankname18)
        val textbankname18 = findViewById<TextView>(R.id.bankname18)
        bankname18.adapter = banknameadapter
        bankname18.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank18 = if (accountopened18.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode18 = findViewById<EditText>(R.id.inputbranchcode18)
        val textbranchcode18 = findViewById<TextView>(R.id.branchcode18)
        val switch18 = findViewById<ToggleButton>(R.id.toggle18)
        switch18.setOnCheckedChangeListener { _, isChecked18 ->
            if (switch18.isChecked) {
                name18.visibility = VISIBLE
                textname18.visibility = VISIBLE
                age18.visibility = VISIBLE
                textage18.visibility = VISIBLE
                profession18.visibility = VISIBLE
                textprofession18.visibility = VISIBLE
                cnic18.visibility = VISIBLE
                textcnic18.visibility = VISIBLE
                gender18.visibility = VISIBLE
                textgender18.visibility = VISIBLE
                contact18.visibility = VISIBLE
                textcontact18.visibility = VISIBLE
                address18.visibility = VISIBLE
                textaddress18.visibility = VISIBLE
                hasaccountalready18.visibility = VISIBLE
                texthasaccalready18.visibility = VISIBLE
                accountopened18.visibility = VISIBLE
                textaccountopened18.visibility = VISIBLE
                accountopened18.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened18.isChecked) {
                        selectedaccountopened18 = "Y"
                        selectedacctype18 = findViewById(textbranchless18.id)
                        acctype18.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype18.checkedRadioButtonId
                            selectedacctype18 = findViewById<RadioButton>(id)
                        })
                        acctype18.visibility = VISIBLE;
                        textacctype18.visibility = VISIBLE
                        textbranchless18.visibility = VISIBLE
                        textassan18.visibility = VISIBLE
                        accnumber18.visibility = VISIBLE;
                        textaccnumber18.visibility = VISIBLE
                        bankname18.visibility = VISIBLE
                        textbankname18.visibility = VISIBLE
                        branchcode18.visibility = VISIBLE
                        textbranchcode18.visibility = VISIBLE
                    } else {
                        acctype18.clearCheck()
                        selectedaccountopened18 = "N"
                        acctype18.visibility = GONE;
                        textacctype18.visibility = GONE
                        textbranchless18.visibility = GONE
                        textassan18.visibility = GONE
                        accnumber18.visibility = GONE;
                        textaccnumber18.visibility = GONE
                        bankname18.visibility = GONE
                        textbankname18.visibility = GONE
                        branchcode18.visibility = GONE
                        textbranchcode18.visibility = GONE
                    }
                }
            } else {
                name18.visibility = GONE
                textname18.visibility = GONE
                age18.visibility = GONE
                textage18.visibility = GONE
                profession18.visibility = GONE
                textprofession18.visibility = GONE
                cnic18.visibility = GONE
                textcnic18.visibility = GONE
                gender18.visibility = GONE
                textgender18.visibility = GONE
                contact18.visibility = GONE
                textcontact18.visibility = GONE
                address18.visibility = GONE
                textaddress18.visibility = GONE
                hasaccountalready18.visibility = GONE
                texthasaccalready18.visibility = GONE
                accountopened18.visibility = GONE
                textaccountopened18.visibility = GONE
                acctype18.visibility = GONE
                textacctype18.visibility = GONE
                textbranchless18.visibility = GONE
                textassan18.visibility = GONE
                accnumber18.visibility = GONE
                textaccnumber18.visibility = GONE
                bankname18.visibility = GONE
                textbankname18.visibility = GONE
                branchcode18.visibility = GONE
                textbranchcode18.visibility = GONE
            }
        }

        // ------ For Participant 19 ------ //


        val name19 = findViewById<EditText>(R.id.inputName19)
        val textname19 = findViewById<TextView>(R.id.name19)
        val age19 = findViewById<Spinner>(R.id.inputage19)
        val textage19 = findViewById<TextView>(R.id.age19)
        age19.adapter = ageadapter
        age19.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage19 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender19 = findViewById<TextView>(R.id.inputgender19)
        val textgender19 = findViewById<TextView>(R.id.gender19)
        val profession19 = findViewById<EditText>(R.id.inputprofession19)
        val textprofession19 = findViewById<TextView>(R.id.profession19)
        val cnic19 = findViewById<EditText>(R.id.inputcnic19)
        val textcnic19 = findViewById<TextView>(R.id.cnic19)
        cnic19.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic19.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed19: String = cnic19.text.toString()
                val size19 = ed19.length
                if (size19 == 13) {
                    val cnicinteger19 = cnic19.text.toString().toLong()
                    if (cnicinteger19 % 10 == 1L || cnicinteger19 % 10 == 3L || cnicinteger19 % 10 == 5L || cnicinteger19 % 10 == 7L || cnicinteger19 % 10 == 9L) {
                        gender19.text = "Male"
                    } else if (cnicinteger19 % 10 == 2L || cnicinteger19 % 10 == 4L || cnicinteger19 % 10 == 6L || cnicinteger19 % 10 == 8L || cnicinteger19 % 10 == 0L) {
                        gender19.text = "Female"
                    }
                }
            }
        }
        val contact19 = findViewById<EditText>(R.id.inputcontact19)
        val textcontact19 = findViewById<TextView>(R.id.contact19)
        val address19 = findViewById<EditText>(R.id.inputaddress19)
        val textaddress19 = findViewById<TextView>(R.id.address19)
        val hasaccountalready19= findViewById<CheckBox>(R.id.inputhasaccalready19)
        val texthasaccalready19 = findViewById<TextView>(R.id.hasaccalready19)
        val accountopened19 = findViewById<CheckBox>(R.id.inputhasaccopened19)
        val textaccountopened19 = findViewById<TextView>(R.id.hasaccopened19)
        val acctype19 = findViewById<RadioGroup>(R.id.inpuaccountype19)
        val textacctype19 = findViewById<TextView>(R.id.accountype19)
        val textbranchless19 = findViewById<RadioButton>(R.id.typebranchless19)
        val textassan19= findViewById<RadioButton>(R.id.typeAsaan19)
        val accnumber19 = findViewById<EditText>(R.id.inputaccnumber19)
        val textaccnumber19 = findViewById<TextView>(R.id.accnumber19)
        val bankname19 = findViewById<Spinner>(R.id.inputbankname19)
        val textbankname19 = findViewById<TextView>(R.id.bankname19)
        bankname19.adapter = banknameadapter
        bankname19.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank19 = if (accountopened19.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode19 = findViewById<EditText>(R.id.inputbranchcode19)
        val textbranchcode19 = findViewById<TextView>(R.id.branchcode19)
        val switch19 = findViewById<ToggleButton>(R.id.toggle19)
        switch19.setOnCheckedChangeListener { _, isChecked19 ->
            if (switch19.isChecked) {
                name19.visibility = VISIBLE
                textname19.visibility = VISIBLE
                age19.visibility = VISIBLE
                textage19.visibility = VISIBLE
                profession19.visibility = VISIBLE
                textprofession19.visibility = VISIBLE
                cnic19.visibility = VISIBLE
                textcnic19.visibility = VISIBLE
                gender19.visibility = VISIBLE
                textgender19.visibility = VISIBLE
                contact19.visibility = VISIBLE
                textcontact19.visibility = VISIBLE
                address19.visibility = VISIBLE
                textaddress19.visibility = VISIBLE
                hasaccountalready19.visibility = VISIBLE
                texthasaccalready19.visibility = VISIBLE
                accountopened19.visibility = VISIBLE
                textaccountopened19.visibility = VISIBLE
                accountopened19.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened19.isChecked) {
                        selectedaccountopened19 = "Y"
                        selectedacctype19 = findViewById(textbranchless19.id)
                        acctype19.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype19.checkedRadioButtonId
                            selectedacctype19 = findViewById<RadioButton>(id)
                        })
                        acctype19.visibility = VISIBLE;
                        textacctype19.visibility = VISIBLE
                        textbranchless19.visibility = VISIBLE
                        textassan19.visibility = VISIBLE
                        accnumber19.visibility = VISIBLE;
                        textaccnumber19.visibility = VISIBLE
                        bankname19.visibility = VISIBLE
                        textbankname19.visibility = VISIBLE
                        branchcode19.visibility = VISIBLE
                        textbranchcode19.visibility = VISIBLE
                    } else {
                        acctype19.clearCheck()
                        selectedaccountopened19 = "N"
                        acctype19.visibility = GONE;
                        textacctype19.visibility = GONE
                        textbranchless19.visibility = GONE
                        textassan19.visibility = GONE
                        accnumber19.visibility = GONE;
                        textaccnumber19.visibility = GONE
                        bankname19.visibility = GONE
                        textbankname19.visibility = GONE
                        branchcode19.visibility = GONE
                        textbranchcode19.visibility = GONE
                    }
                }
            } else {
                name19.visibility = GONE
                textname19.visibility = GONE
                age19.visibility = GONE
                textage19.visibility = GONE
                profession19.visibility = GONE
                textprofession19.visibility = GONE
                cnic19.visibility = GONE
                textcnic19.visibility = GONE
                gender19.visibility = GONE
                textgender19.visibility = GONE
                contact19.visibility = GONE
                textcontact19.visibility = GONE
                address19.visibility = GONE
                textaddress19.visibility = GONE
                hasaccountalready19.visibility = GONE
                texthasaccalready19.visibility = GONE
                accountopened19.visibility = GONE
                textaccountopened19.visibility = GONE
                acctype19.visibility = GONE
                textacctype19.visibility = GONE
                textbranchless19.visibility = GONE
                textassan19.visibility = GONE
                accnumber19.visibility = GONE
                textaccnumber19.visibility = GONE
                bankname19.visibility = GONE
                textbankname19.visibility = GONE
                branchcode19.visibility = GONE
                textbranchcode19.visibility = GONE
            }
        }

        // ------ For Participant 20 ------ //


        val name20 = findViewById<EditText>(R.id.inputName20)
        val textname20 = findViewById<TextView>(R.id.name20)
        val age20 = findViewById<Spinner>(R.id.inputage20)
        val textage20 = findViewById<TextView>(R.id.age20)
        age20.adapter = ageadapter
        age20.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedage20 = parent?.getItemAtPosition(position).toString()
            }
        }
        val gender20 = findViewById<TextView>(R.id.inputgender20)
        val textgender20 = findViewById<TextView>(R.id.gender20)
        val profession20 = findViewById<EditText>(R.id.inputprofession20)
        val textprofession20 = findViewById<TextView>(R.id.profession20)
        val cnic20 = findViewById<EditText>(R.id.inputcnic20)
        val textcnic20 = findViewById<TextView>(R.id.cnic20)
        cnic20.filters = arrayOf<InputFilter>(LengthFilter(13))
        cnic20.setOnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                val ed20: String = cnic20.text.toString()
                val size20 = ed20.length
                if (size20 == 13) {
                    val cnicinteger20 = cnic20.text.toString().toLong()
                    if (cnicinteger20 % 10 == 1L || cnicinteger20 % 10 == 3L || cnicinteger20 % 10 == 5L || cnicinteger20 % 10 == 7L || cnicinteger20 % 10 == 9L) {
                        gender20.text = "Male"
                    } else if (cnicinteger20 % 10 == 2L || cnicinteger20 % 10 == 4L || cnicinteger20 % 10 == 6L || cnicinteger20 % 10 == 8L || cnicinteger20 % 10 == 0L) {
                        gender20.text = "Female"
                    }
                }
            }
        }
        val contact20 = findViewById<EditText>(R.id.inputcontact20)
        val textcontact20 = findViewById<TextView>(R.id.contact20)
        val address20 = findViewById<EditText>(R.id.inputaddress20)
        val textaddress20 = findViewById<TextView>(R.id.address20)
        val hasaccountalready20= findViewById<CheckBox>(R.id.inputhasaccalready20)
        val texthasaccalready20 = findViewById<TextView>(R.id.hasaccalready20)
        val accountopened20 = findViewById<CheckBox>(R.id.inputhasaccopened20)
        val textaccountopened20 = findViewById<TextView>(R.id.hasaccopened20)
        val acctype20 = findViewById<RadioGroup>(R.id.inpuaccountype20)
        val textacctype20 = findViewById<TextView>(R.id.accountype20)
        val textbranchless20 = findViewById<RadioButton>(R.id.typebranchless20)
        val textassan20= findViewById<RadioButton>(R.id.typeAsaan20)
        val accnumber20 = findViewById<EditText>(R.id.inputaccnumber20)
        val textaccnumber20 = findViewById<TextView>(R.id.accnumber20)
        val bankname20 = findViewById<Spinner>(R.id.inputbankname20)
        val textbankname20 = findViewById<TextView>(R.id.bankname20)
        bankname20.adapter = banknameadapter
        bankname20.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tempselectedbank20 = if (accountopened20.isChecked){ parent?.getItemAtPosition(position).toString() }else{ "N/A" }
            }
        }
        val branchcode20 = findViewById<EditText>(R.id.inputbranchcode20)
        val textbranchcode20 = findViewById<TextView>(R.id.branchcode20)
        val switch20 = findViewById<ToggleButton>(R.id.toggle20)
        switch20.setOnCheckedChangeListener { _, isChecked20 ->
            if (switch20.isChecked) {
                name20.visibility = VISIBLE
                textname20.visibility = VISIBLE
                age20.visibility = VISIBLE
                textage20.visibility = VISIBLE
                profession20.visibility = VISIBLE
                textprofession20.visibility = VISIBLE
                cnic20.visibility = VISIBLE
                textcnic20.visibility = VISIBLE
                gender20.visibility = VISIBLE
                textgender20.visibility = VISIBLE
                contact20.visibility = VISIBLE
                textcontact20.visibility = VISIBLE
                address20.visibility = VISIBLE
                textaddress20.visibility = VISIBLE
                hasaccountalready20.visibility = VISIBLE
                texthasaccalready20.visibility = VISIBLE
                accountopened20.visibility = VISIBLE
                textaccountopened20.visibility = VISIBLE
                accountopened20.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened20.isChecked) {
                        selectedaccountopened20 = "Y"
                        selectedacctype20 = findViewById(textbranchless20.id)
                        acctype20.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype20.checkedRadioButtonId
                            selectedacctype20 = findViewById<RadioButton>(id)
                        })
                        acctype20.visibility = VISIBLE;
                        textacctype20.visibility = VISIBLE
                        textbranchless20.visibility = VISIBLE
                        textassan20.visibility = VISIBLE
                        accnumber20.visibility = VISIBLE;
                        textaccnumber20.visibility = VISIBLE
                        bankname20.visibility = VISIBLE
                        textbankname20.visibility = VISIBLE
                        branchcode20.visibility = VISIBLE
                        textbranchcode20.visibility = VISIBLE
                    } else {
                        acctype20.clearCheck()
                        selectedaccountopened20 = "N"
                        acctype20.visibility = GONE;
                        textacctype20.visibility = GONE
                        textbranchless20.visibility = GONE
                        textassan20.visibility = GONE
                        accnumber20.visibility = GONE;
                        textaccnumber20.visibility = GONE
                        bankname20.visibility = GONE
                        textbankname20.visibility = GONE
                        branchcode20.visibility = GONE
                        textbranchcode20.visibility = GONE
                    }
                }
            } else {
                name20.visibility = GONE
                textname20.visibility = GONE
                age20.visibility = GONE
                textage20.visibility = GONE
                profession20.visibility = GONE
                textprofession20.visibility = GONE
                cnic20.visibility = GONE
                textcnic20.visibility = GONE
                gender20.visibility = GONE
                textgender20.visibility = GONE
                contact20.visibility = GONE
                textcontact20.visibility = GONE
                address20.visibility = GONE
                textaddress20.visibility = GONE
                hasaccountalready20.visibility = GONE
                texthasaccalready20.visibility = GONE
                accountopened20.visibility = GONE
                textaccountopened20.visibility = GONE
                acctype20.visibility = GONE
                textacctype20.visibility = GONE
                textbranchless20.visibility = GONE
                textassan20.visibility = GONE
                accnumber20.visibility = GONE
                textaccnumber20.visibility = GONE
                bankname20.visibility = GONE
                textbankname20.visibility = GONE
                branchcode20.visibility = GONE
                textbranchcode20.visibility = GONE
            }
        }

        // ------- On Clicking Submit Button ------- //


        val submit1 = findViewById<Button>(R.id.submit1)
        submit1.setOnClickListener {

            selectedname1 = name1.text.toString()
            selectedprofession1 = profession1.text.toString()
            selectedcontact1 = contact1.text.toString()
            selectedcnic1 = cnic1.text.toString()
            selectedgender1 = gender1.text.toString()
            selectedaddress1 = address1.text.toString()
            selectedhasaccountalready = if (hasaccountalready1.isChecked) { "Y" } else { "N" }
            selectedaccountopened1 = if (accountopened1.isChecked) { "Y" } else { "N" }
            selectedbank1 = if (accountopened1.isChecked) { tempselectedbank1 } else { "N/A" }
            selectedaccnumber1 = if (accountopened1.isChecked) { accnumber1.text.toString() } else { "N/A" }
            selectedbranch1 = if (accountopened1.isChecked) { branchcode1.text.toString() } else { "N/A" }

            // ---- For Participant 2 ------ //

            selectedname2 = name2.text.toString()
            selectedprofession2 = profession2.text.toString()
            selectedcontact2 = contact2.text.toString()
            selectedcnic2 = cnic2.text.toString()
            selectedgender2 = gender2.text.toString()
            selectedaddress2 = address2.text.toString()
            selectedhasaccountalready2 = if (hasaccountalready2.isChecked) { "Y" } else { "N" }
            selectedaccountopened2 = if (accountopened2.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank2 = if (accountopened2.isChecked) {
                tempselectedbank2
            } else {
                "N/A"
            }
            selectedaccnumber2 = if (accountopened2.isChecked) {
                accnumber2.text.toString()
            } else {
                "N/A"
            }
            selectedbranch2 = if (accountopened2.isChecked) {
                branchcode2.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 3 ------ //

            selectedname3 = name3.text.toString()
            selectedprofession3 = profession3.text.toString()
            selectedcontact3 = contact3.text.toString()
            selectedcnic3 = cnic3.text.toString()
            selectedgender3 = gender3.text.toString()
            selectedaddress3 = address3.text.toString()
            selectedhasaccountalready3 = if (hasaccountalready3.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened3 = if (accountopened3.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank3 = if (accountopened3.isChecked) {
                tempselectedbank3
            } else {
                "N/A"
            }
            selectedaccnumber3 = if (accountopened3.isChecked) {
                accnumber3.text.toString()
            } else {
                "N/A"
            }
            selectedbranch3 = if (accountopened3.isChecked) {
                branchcode3.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 4 ------ //

            selectedname4 = name4.text.toString()
            selectedprofession4 = profession4.text.toString()
            selectedcontact4 = contact4.text.toString()
            selectedcnic4 = cnic4.text.toString()
            selectedgender4 = gender4.text.toString()
            selectedaddress4 = address4.text.toString()
            selectedhasaccountalready4 = if (hasaccountalready4.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened4 = if (accountopened4.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank4 = if (accountopened4.isChecked) {
                tempselectedbank4
            } else {
                "N/A"
            }
            selectedaccnumber4 = if (accountopened4.isChecked) {
                accnumber4.text.toString()
            } else {
                "N/A"
            }
            selectedbranch4 = if (accountopened4.isChecked) {
                branchcode4.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 5 ------ //

            selectedname5 = name5.text.toString()
            selectedprofession5 = profession5.text.toString()
            selectedcontact5 = contact5.text.toString()
            selectedcnic5 = cnic5.text.toString()
            selectedgender5 = gender5.text.toString()
            selectedaddress5 = address5.text.toString()
            selectedhasaccountalready5 = if (hasaccountalready5.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened5 = if (accountopened5.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank5 = if (accountopened5.isChecked) {
                tempselectedbank5
            } else {
                "N/A"
            }
            selectedaccnumber5 = if (accountopened5.isChecked) {
                accnumber5.text.toString()
            } else {
                "N/A"
            }
            selectedbranch5 = if (accountopened5.isChecked) {
                branchcode5.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 6 ------ //

            selectedname6 = name6.text.toString()
            selectedprofession6 = profession6.text.toString()
            selectedcontact6 = contact6.text.toString()
            selectedcnic6 = cnic6.text.toString()
            selectedgender6 = gender6.text.toString()
            selectedaddress6 = address6.text.toString()
            selectedhasaccountalready6 = if (hasaccountalready6.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened6 = if (accountopened6.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank6 = if (accountopened6.isChecked) {
                tempselectedbank6
            } else {
                "N/A"
            }
            selectedaccnumber6 = if (accountopened6.isChecked) {
                accnumber6.text.toString()
            } else {
                "N/A"
            }
            selectedbranch6 = if (accountopened6.isChecked) {
                branchcode6.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 7 ------ //

            selectedname7 = name7.text.toString()
            selectedprofession7 = profession7.text.toString()
            selectedcontact7 = contact7.text.toString()
            selectedcnic7 = cnic7.text.toString()
            selectedgender7 = gender7.text.toString()
            selectedaddress7 = address7.text.toString()
            selectedhasaccountalready7 = if (hasaccountalready7.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened7 = if (accountopened7.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank7 = if (accountopened7.isChecked) {
                tempselectedbank7
            } else {
                "N/A"
            }
            selectedaccnumber7 = if (accountopened7.isChecked) {
                accnumber7.text.toString()
            } else {
                "N/A"
            }
            selectedbranch7 = if (accountopened7.isChecked) {
                branchcode7.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 8 ------ //

            selectedname8 = name8.text.toString()
            selectedprofession8 = profession8.text.toString()
            selectedcontact8 = contact8.text.toString()
            selectedcnic8 = cnic8.text.toString()
            selectedgender8 = gender8.text.toString()
            selectedaddress8 = address8.text.toString()
            selectedhasaccountalready8 = if (hasaccountalready8.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened8 = if (accountopened8.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank8 = if (accountopened8.isChecked) {
                tempselectedbank8
            } else {
                "N/A"
            }
            selectedaccnumber8 = if (accountopened8.isChecked) {
                accnumber8.text.toString()
            } else {
                "N/A"
            }
            selectedbranch8 = if (accountopened8.isChecked) {
                branchcode8.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 9 ------ //

            selectedname9 = name9.text.toString()
            selectedprofession9 = profession9.text.toString()
            selectedcontact9 = contact9.text.toString()
            selectedcnic9 = cnic9.text.toString()
            selectedgender9 = gender9.text.toString()
            selectedaddress9 = address9.text.toString()
            selectedhasaccountalready9 = if (hasaccountalready9.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened9 = if (accountopened9.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank9 = if (accountopened9.isChecked) {
                tempselectedbank9
            } else {
                "N/A"
            }
            selectedaccnumber9 = if (accountopened9.isChecked) {
                accnumber9.text.toString()
            } else {
                "N/A"
            }
            selectedbranch9 = if (accountopened9.isChecked) {
                branchcode9.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 10 ------ //

            selectedname10 = name10.text.toString()
            selectedprofession10 = profession10.text.toString()
            selectedcontact10 = contact10.text.toString()
            selectedcnic10 = cnic10.text.toString()
            selectedgender10 = gender10.text.toString()
            selectedaddress10 = address10.text.toString()
            selectedhasaccountalready10 = if (hasaccountalready10.isChecked) { "Y" } else { "N" }
            selectedaccountopened10 = if (accountopened10.isChecked) { "Y" } else { "N" }
            selectedbank10 = if (accountopened10.isChecked) { tempselectedbank10 } else { "N/A" }
            selectedaccnumber10 = if (accountopened10.isChecked) { accnumber10.text.toString() } else { "N/A" }
            selectedbranch10 = if (accountopened10.isChecked) { branchcode10.text.toString() } else { "N/A" }

            // ---- For Participant 11 ------ //

            selectedname11 = name11.text.toString()
            selectedprofession11 = profession11.text.toString()
            selectedcontact11 = contact11.text.toString()
            selectedcnic11 = cnic11.text.toString()
            selectedgender11 = gender11.text.toString()
            selectedaddress11 = address11.text.toString()
            selectedhasaccountalready11 = if (hasaccountalready11.isChecked) { "Y" } else { "N" }
            selectedaccountopened11 = if (accountopened11.isChecked) { "Y" } else { "N" }
            selectedbank11 = if (accountopened11.isChecked) { tempselectedbank11 } else { "N/A" }
            selectedaccnumber11 = if (accountopened11.isChecked) { accnumber11.text.toString() } else { "N/A" }
            selectedbranch11 = if (accountopened11.isChecked) { branchcode11.text.toString() } else { "N/A" }

            // ---- For Participant 12 ------ //

            selectedname12 = name12.text.toString()
            selectedprofession12 = profession12.text.toString()
            selectedcontact12 = contact12.text.toString()
            selectedcnic12 = cnic12.text.toString()
            selectedgender12 = gender12.text.toString()
            selectedaddress12 = address12.text.toString()
            selectedhasaccountalready12 = if (hasaccountalready12.isChecked) { "Y" } else { "N" }
            selectedaccountopened12 = if (accountopened12.isChecked) { "Y" } else { "N" }
            selectedbank12 = if (accountopened12.isChecked) { tempselectedbank12 } else { "N/A" }
            selectedaccnumber12 = if (accountopened12.isChecked) { accnumber12.text.toString() } else { "N/A" }
            selectedbranch12 = if (accountopened12.isChecked) { branchcode12.text.toString() } else { "N/A" }

            // ---- For Participant 13 ------ //

            selectedname13 = name13.text.toString()
            selectedprofession13 = profession13.text.toString()
            selectedcontact13 = contact13.text.toString()
            selectedcnic13 = cnic13.text.toString()
            selectedgender13 = gender13.text.toString()
            selectedaddress13 = address13.text.toString()
            selectedhasaccountalready13 = if (hasaccountalready13.isChecked) { "Y" } else { "N" }
            selectedaccountopened13 = if (accountopened13.isChecked) { "Y" } else { "N" }
            selectedbank13 = if (accountopened13.isChecked) { tempselectedbank13 } else { "N/A" }
            selectedaccnumber13 = if (accountopened13.isChecked) { accnumber13.text.toString() } else { "N/A" }
            selectedbranch13 = if (accountopened13.isChecked) { branchcode13.text.toString() } else { "N/A" }

            // ---- For Participant 14 ------ //

            selectedname14 = name14.text.toString()
            selectedprofession14 = profession14.text.toString()
            selectedcontact14 = contact14.text.toString()
            selectedcnic14 = cnic14.text.toString()
            selectedgender14 = gender14.text.toString()
            selectedaddress14 = address14.text.toString()
            selectedhasaccountalready14 = if (hasaccountalready14.isChecked) { "Y" } else { "N" }
            selectedaccountopened14 = if (accountopened14.isChecked) { "Y" } else { "N" }
            selectedbank14 = if (accountopened14.isChecked) { tempselectedbank14 } else { "N/A" }
            selectedaccnumber14 = if (accountopened14.isChecked) { accnumber14.text.toString() } else { "N/A" }
            selectedbranch14 = if (accountopened14.isChecked) { branchcode14.text.toString() } else { "N/A" }

            // ---- For Participant 15 ------ //

            selectedname15 = name15.text.toString()
            selectedprofession15 = profession15.text.toString()
            selectedcontact15 = contact15.text.toString()
            selectedcnic15 = cnic15.text.toString()
            selectedgender15 = gender15.text.toString()
            selectedaddress15 = address15.text.toString()
            selectedhasaccountalready15 = if (hasaccountalready15.isChecked) { "Y" } else { "N" }
            selectedaccountopened15 = if (accountopened15.isChecked) { "Y" } else { "N" }
            selectedbank15 = if (accountopened15.isChecked) { tempselectedbank15 } else { "N/A" }
            selectedaccnumber15 = if (accountopened15.isChecked) { accnumber15.text.toString() } else { "N/A" }
            selectedbranch15 = if (accountopened15.isChecked) { branchcode15.text.toString() } else { "N/A" }

            // ---- For Participant 16 ------ //

            selectedname16 = name16.text.toString()
            selectedprofession16 = profession16.text.toString()
            selectedcontact16 = contact16.text.toString()
            selectedcnic16 = cnic16.text.toString()
            selectedgender16 = gender16.text.toString()
            selectedaddress16 = address16.text.toString()
            selectedhasaccountalready16 = if (hasaccountalready16.isChecked) { "Y" } else { "N" }
            selectedaccountopened16 = if (accountopened16.isChecked) { "Y" } else { "N" }
            selectedbank16 = if (accountopened16.isChecked) { tempselectedbank16 } else { "N/A" }
            selectedaccnumber16 = if (accountopened16.isChecked) { accnumber16.text.toString() } else { "N/A" }
            selectedbranch16 = if (accountopened16.isChecked) { branchcode16.text.toString() } else { "N/A" }

            // ---- For Participant 17 ------ //

            selectedname17 = name17.text.toString()
            selectedprofession17 = profession17.text.toString()
            selectedcontact17 = contact17.text.toString()
            selectedcnic17 = cnic17.text.toString()
            selectedgender17 = gender17.text.toString()
            selectedaddress17 = address17.text.toString()
            selectedhasaccountalready17 = if (hasaccountalready17.isChecked) { "Y" } else { "N" }
            selectedaccountopened17 = if (accountopened17.isChecked) { "Y" } else { "N" }
            selectedbank17 = if (accountopened17.isChecked) { tempselectedbank17 } else { "N/A" }
            selectedaccnumber17 = if (accountopened17.isChecked) { accnumber17.text.toString() } else { "N/A" }
            selectedbranch17 = if (accountopened17.isChecked) { branchcode17.text.toString() } else { "N/A" }

            // ---- For Participant 18 ------ //

            selectedname18 = name18.text.toString()
            selectedprofession18 = profession18.text.toString()
            selectedcontact18 = contact18.text.toString()
            selectedcnic18 = cnic18.text.toString()
            selectedgender18 = gender18.text.toString()
            selectedaddress18 = address18.text.toString()
            selectedhasaccountalready18 = if (hasaccountalready18.isChecked) { "Y" } else { "N" }
            selectedaccountopened18 = if (accountopened18.isChecked) { "Y" } else { "N" }
            selectedbank18 = if (accountopened18.isChecked) { tempselectedbank18 } else { "N/A" }
            selectedaccnumber18 = if (accountopened18.isChecked) { accnumber18.text.toString() } else { "N/A" }
            selectedbranch18 = if (accountopened18.isChecked) { branchcode18.text.toString() } else { "N/A" }

            // ---- For Participant 19 ------ //

            selectedname19 = name19.text.toString()
            selectedprofession19 = profession19.text.toString()
            selectedcontact19 = contact19.text.toString()
            selectedcnic19 = cnic19.text.toString()
            selectedgender19 = gender19.text.toString()
            selectedaddress19 = address19.text.toString()
            selectedhasaccountalready19 = if (hasaccountalready19.isChecked) { "Y" } else { "N" }
            selectedaccountopened19 = if (accountopened19.isChecked) { "Y" } else { "N" }
            selectedbank19 = if (accountopened19.isChecked) { tempselectedbank19 } else { "N/A" }
            selectedaccnumber19 = if (accountopened19.isChecked) { accnumber19.text.toString() } else { "N/A" }
            selectedbranch19 = if (accountopened19.isChecked) { branchcode19.text.toString() } else { "N/A" }

            // ---- For Participant 20 ------ //

            selectedname20 = name20.text.toString()
            selectedprofession20 = profession20.text.toString()
            selectedcontact20 = contact20.text.toString()
            selectedcnic20 = cnic20.text.toString()
            selectedgender20 = gender20.text.toString()
            selectedaddress20 = address20.text.toString()
            selectedhasaccountalready20 = if (hasaccountalready20.isChecked) { "Y" } else { "N" }
            selectedaccountopened20 = if (accountopened20.isChecked) { "Y" } else { "N" }
            selectedbank20 = if (accountopened20.isChecked) { tempselectedbank20 } else { "N/A" }
            selectedaccnumber20 = if (accountopened20.isChecked) { accnumber20.text.toString() } else { "N/A" }
            selectedbranch20 = if (accountopened20.isChecked) { branchcode20.text.toString() } else { "N/A" }

            val ed1: String = cnic1.text.toString()
            val size1 = ed1.length
            val ed2: String = cnic2.text.toString()
            val size2 = ed2.length
            val ed3: String = cnic3.text.toString()
            val size3 = ed3.length
            val ed4: String = cnic4.text.toString()
            val size4 = ed4.length
            val ed5: String = cnic5.text.toString()
            val size5 = ed5.length
            val ed6: String = cnic6.text.toString()
            val size6 = ed6.length
            val ed7: String = cnic7.text.toString()
            val size7 = ed7.length
            val ed8: String = cnic8.text.toString()
            val size8 = ed8.length
            val ed9: String = cnic9.text.toString()
            val size9 = ed9.length
            val ed10: String = cnic10.text.toString()
            val size10 = ed10.length
            val ed11: String = cnic11.text.toString()
            val size11 = ed11.length
            val ed12: String = cnic12.text.toString()
            val size12 = ed12.length
            val ed13: String = cnic13.text.toString()
            val size13 = ed13.length
            val ed14: String = cnic14.text.toString()
            val size14 = ed14.length
            val ed15: String = cnic15.text.toString()
            val size15 = ed15.length
            val ed16: String = cnic16.text.toString()
            val size16 = ed16.length
            val ed17: String = cnic17.text.toString()
            val size17 = ed17.length
            val ed18: String = cnic18.text.toString()
            val size18 = ed18.length
            val ed19: String = cnic19.text.toString()
            val size19 = ed19.length
            val ed20: String = cnic20.text.toString()
            val size20 = ed20.length

            if (size1 != 13) {
                cnic1.error = "Invalid CNIC"
                cnic1.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 1", Toast.LENGTH_LONG).show()
            }
            else if (accountopened1.isChecked && accnumber1.text.toString().isEmpty() ){
                accnumber1.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 1", Toast.LENGTH_LONG).show()
            }else if (accountopened1.isChecked && branchcode1.text.toString().isEmpty() ){
                accnumber1.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 1", Toast.LENGTH_LONG).show()
            } else if (size2 != 13) {
                cnic2.error = "Invalid CNIC"
                cnic2.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 2", Toast.LENGTH_LONG).show()
            }else if (accountopened2.isChecked && accnumber2.text.toString().isEmpty() ){
                accnumber2.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 2", Toast.LENGTH_LONG).show()
            }else if (accountopened2.isChecked && branchcode2.text.toString().isEmpty() ){
                accnumber2.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 2", Toast.LENGTH_LONG).show()
            } else if (size3 != 13) {
                cnic3.error = "Invalid CNIC"
                cnic3.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 3", Toast.LENGTH_LONG).show()
            }else if (accountopened3.isChecked && accnumber3.text.toString().isEmpty() ){
                accnumber3.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 3", Toast.LENGTH_LONG).show()
            }else if (accountopened3.isChecked && branchcode3.text.toString().isEmpty() ){
                accnumber3.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 3", Toast.LENGTH_LONG).show()
            } else if (size4 != 13) {
                cnic4.error = "Invalid CNIC"
                cnic4.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 4", Toast.LENGTH_LONG).show()
            }else if (accountopened4.isChecked && accnumber4.text.toString().isEmpty() ){
                accnumber4.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 4", Toast.LENGTH_LONG).show()
            }else if (accountopened4.isChecked && branchcode4.text.toString().isEmpty() ){
                accnumber4.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 4", Toast.LENGTH_LONG).show()
            } else if (size5 != 13) {
                cnic5.error = "Invalid CNIC"
                cnic5.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 5", Toast.LENGTH_LONG).show()
            }else if (accountopened5.isChecked && accnumber5.text.toString().isEmpty() ){
                accnumber5.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 5", Toast.LENGTH_LONG).show()
            }else if (accountopened5.isChecked && branchcode5.text.toString().isEmpty() ){
                accnumber5.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 5", Toast.LENGTH_LONG).show()
            } else if (size6 != 13) {
                cnic6.error = "Invalid CNIC"
                cnic6.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 6", Toast.LENGTH_LONG).show()
            }else if (accountopened6.isChecked && accnumber6.text.toString().isEmpty() ){
                accnumber6.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 6", Toast.LENGTH_LONG).show()
            }else if (accountopened6.isChecked && branchcode6.text.toString().isEmpty() ){
                accnumber6.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 6", Toast.LENGTH_LONG).show()
            } else if (size7 != 13) {
                cnic7.error = "Invalid CNIC"
                cnic7.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 7", Toast.LENGTH_LONG).show()
            }else if (accountopened7.isChecked && accnumber7.text.toString().isEmpty() ){
                accnumber7.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 7", Toast.LENGTH_LONG).show()
            }else if (accountopened7.isChecked && branchcode7.text.toString().isEmpty() ){
                accnumber7.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 7", Toast.LENGTH_LONG).show()
            } else if (size8 != 13) {
                cnic8.error = "Invalid CNIC"
                cnic8.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 8", Toast.LENGTH_LONG).show()
            }else if (accountopened8.isChecked && accnumber8.text.toString().isEmpty() ){
                accnumber8.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 8", Toast.LENGTH_LONG).show()
            }else if (accountopened8.isChecked && branchcode8.text.toString().isEmpty() ){
                accnumber8.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 8", Toast.LENGTH_LONG).show()
            } else if (size9 != 13) {
                cnic9.error = "Invalid CNIC"
                cnic9.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 9", Toast.LENGTH_LONG).show()
            }else if (accountopened9.isChecked && accnumber9.text.toString().isEmpty() ){
                accnumber9.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 9", Toast.LENGTH_LONG).show()
            }else if (accountopened9.isChecked && branchcode9.text.toString().isEmpty() ){
                accnumber9.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 9", Toast.LENGTH_LONG).show()
            }else if (size10 != 13) {
                cnic10.error = "Invalid CNIC"
                cnic10.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 10", Toast.LENGTH_LONG).show()
            }else if (accountopened10.isChecked && accnumber10.text.toString().isEmpty() ){
                accnumber10.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 10", Toast.LENGTH_LONG).show()
            }else if (accountopened10.isChecked && branchcode10.text.toString().isEmpty() ){
                accnumber10.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 10", Toast.LENGTH_LONG).show()
            }else if (size11 != 13) {
               cnic11.error = "Invalid CNIC"
                cnic11.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 11", Toast.LENGTH_LONG).show()
            }else if (accountopened11.isChecked && accnumber11.text.toString().isEmpty() ){
                accnumber11.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 11", Toast.LENGTH_LONG).show()
            }else if (accountopened11.isChecked && branchcode11.text.toString().isEmpty() ){
                accnumber11.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 11", Toast.LENGTH_LONG).show()
            }else if (size12 != 13) {
               cnic12.error = "Invalid CNIC"
                cnic12.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 12", Toast.LENGTH_LONG).show()
            }else if (accountopened12.isChecked && accnumber12.text.toString().isEmpty() ){
                accnumber12.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 12", Toast.LENGTH_LONG).show()
            }else if (accountopened12.isChecked && branchcode12.text.toString().isEmpty() ){
                accnumber12.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 12", Toast.LENGTH_LONG).show()
            }else if (size13 != 13) {
               cnic13.error = "Invalid CNIC"
                cnic13.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 13", Toast.LENGTH_LONG).show()
            }else if (accountopened13.isChecked && accnumber13.text.toString().isEmpty() ){
                accnumber13.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 13", Toast.LENGTH_LONG).show()
            }else if (accountopened13.isChecked && branchcode13.text.toString().isEmpty() ){
                accnumber13.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 13", Toast.LENGTH_LONG).show()
            }else if (size14 != 13) {
               cnic14.error = "Invalid CNIC"
                cnic14.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 14", Toast.LENGTH_LONG).show()
            }else if (accountopened14.isChecked && accnumber14.text.toString().isEmpty() ){
                accnumber14.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 14", Toast.LENGTH_LONG).show()
            }else if (accountopened14.isChecked && branchcode14.text.toString().isEmpty() ){
                accnumber14.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 14", Toast.LENGTH_LONG).show()
            }else if (size15 != 13) {
               cnic15.error = "Invalid CNIC"
                cnic15.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 15", Toast.LENGTH_LONG).show()
            }else if (accountopened15.isChecked && accnumber15.text.toString().isEmpty() ){
                accnumber15.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 15", Toast.LENGTH_LONG).show()
            }else if (accountopened15.isChecked && branchcode15.text.toString().isEmpty() ){
                accnumber15.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 15", Toast.LENGTH_LONG).show()
            }else if (size16 != 13) {
                cnic16.error = "Invalid CNIC"
                cnic16.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 16", Toast.LENGTH_LONG).show()
            }else if (accountopened16.isChecked && accnumber16.text.toString().isEmpty() ){
                accnumber16.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 16", Toast.LENGTH_LONG).show()
            }else if (accountopened16.isChecked && branchcode16.text.toString().isEmpty() ){
                accnumber16.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 16", Toast.LENGTH_LONG).show()
            }else if (size17 != 13) {
                cnic17.error = "Invalid CNIC"
                cnic17.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 17", Toast.LENGTH_LONG).show()
            }else if (accountopened17.isChecked && accnumber17.text.toString().isEmpty() ){
                accnumber17.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 17", Toast.LENGTH_LONG).show()
            }else if (accountopened17.isChecked && branchcode17.text.toString().isEmpty() ){
                accnumber17.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 17", Toast.LENGTH_LONG).show()
            }else if (size18 != 13) {
                cnic18.error = "Invalid CNIC"
                cnic18.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 18", Toast.LENGTH_LONG).show()
            }else if (accountopened18.isChecked && accnumber18.text.toString().isEmpty() ){
                accnumber18.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 18", Toast.LENGTH_LONG).show()
            }else if (accountopened18.isChecked && branchcode18.text.toString().isEmpty() ){
                accnumber18.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 18", Toast.LENGTH_LONG).show()
            }else if (size19 != 13) {
                cnic19.error = "Invalid CNIC"
                cnic19.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 19", Toast.LENGTH_LONG).show()
            }else if (accountopened19.isChecked && accnumber19.text.toString().isEmpty() ){
                accnumber19.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 19", Toast.LENGTH_LONG).show()
            }else if (accountopened19.isChecked && branchcode19.text.toString().isEmpty() ){
                accnumber19.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 19", Toast.LENGTH_LONG).show()
            }else if (size20 != 13) {
                cnic20.error = "Invalid CNIC"
                cnic20.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 20", Toast.LENGTH_LONG).show()
            }else if (accountopened20.isChecked && accnumber20.text.toString().isEmpty() ){
                accnumber20.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 20", Toast.LENGTH_LONG).show()
            }else if (accountopened20.isChecked && branchcode20.text.toString().isEmpty() ){
                accnumber20.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 20", Toast.LENGTH_LONG).show()
            }
            else {
                val row1: Row = sheet2.createRow(0)
                val row1cell1: Cell = row1.createCell(0)
                row1cell1.setCellValue("Sr.")
                row1cell1.cellStyle = style
                sheet2.setColumnWidth(0, 5 * 256)
                val row2: Row = sheet2.createRow(1)
                val row2cell1: Cell = row2.createCell(0)
                row2cell1.setCellValue("1")
                row2cell1.cellStyle = style2
                val row1cell2: Cell = row1.createCell(1)
                row1cell2.setCellValue("Participants Name")
                row1cell2.cellStyle = style
                sheet2.setColumnWidth(1, 30 * 256)
                val row2cell2: Cell = row2.createCell(1)
                row2cell2.setCellValue(selectedname1)
                row2cell2.cellStyle = style2
                val row1cell3: Cell = row1.createCell(2)
                row1cell3.setCellValue("Gender")
                row1cell3.cellStyle = style
                sheet2.setColumnWidth(2, 8 * 256)
                val row2cell3: Cell = row2.createCell(2)
                row2cell3.setCellValue(selectedgender1)
                row2cell3.cellStyle = style2
                val row1cell4: Cell = row1.createCell(3)
                row1cell4.setCellValue("Age")
                row1cell4.cellStyle = style
                sheet2.setColumnWidth(3, 8 * 256)
                val row2cell4: Cell = row2.createCell(3)
                row2cell4.setCellValue(selectedage1)
                row2cell4.cellStyle = style
                val row1cell5: Cell = row1.createCell(4)
                row1cell5.setCellValue("Profession")
                row1cell5.cellStyle = style
                sheet2.setColumnWidth(4, 15 * 256)
                val row2cell5: Cell = row2.createCell(4)
                row2cell5.setCellValue(selectedprofession1)
                row2cell5.cellStyle = style2
                val row1cell6: Cell = row1.createCell(5)
                row1cell6.setCellValue("CNIC Of Participant")
                row1cell6.cellStyle = style
                sheet2.setColumnWidth(5, 20 * 256)
                val row2cell6: Cell = row2.createCell(5)
                row2cell6.setCellValue(selectedcnic1)
                row2cell6.cellStyle = style2
                val row1cell7: Cell = row1.createCell(6)
                row1cell7.setCellValue("Contact Number")
                row1cell7.cellStyle = style
                sheet2.setColumnWidth(6, 15 * 256)
                val row2cell7: Cell = row2.createCell(6)
                row2cell7.setCellValue(selectedcontact1)
                row2cell7.cellStyle = style2
                val row1cell8: Cell = row1.createCell(7)
                row1cell8.setCellValue("Address of Participant")
                row1cell8.cellStyle = style
                sheet2.setColumnWidth(7, 35 * 256)
                val row2cell8: Cell = row2.createCell(7)
                row2cell8.setCellValue(selectedaddress1)
                row2cell8.cellStyle = style2
                val row1cell9: Cell = row1.createCell(8)
                row1cell9.setCellValue("Already an Account holder in any Bank?")
                row1cell9.cellStyle = style
                sheet2.setColumnWidth(8, 15 * 256)
                val row2cell9: Cell = row2.createCell(8)
                row2cell9.setCellValue(selectedhasaccountalready)
                row2cell9.cellStyle = style2
                val row1cell10: Cell = row1.createCell(9)
                row1cell10.setCellValue("Account Opened in current Session?")
                row1cell10.cellStyle = style
                sheet2.setColumnWidth(9, 15 * 256)
                val row2cell10: Cell = row2.createCell(9)
                row2cell10.setCellValue(selectedaccountopened1)
                row2cell10.cellStyle = style2
                val row1cell11: Cell = row1.createCell(10)
                row1cell11.setCellValue("Account Type" + "(Asaan Account / Branchless etc)")
                row1cell11.cellStyle = style
                sheet2.setColumnWidth(10, 15 * 256)
                val row2cell11: Cell = row2.createCell(10)
                row2cell11.setCellValue(selectedacctype1?.text.toString())
                row2cell11.cellStyle = style2
                val row1cell12: Cell = row1.createCell(11)
                row1cell12.setCellValue("Account Number")
                row1cell12.cellStyle = style
                sheet2.setColumnWidth(11, 18 * 256)
                val row2cell12: Cell = row2.createCell(11)
                row2cell12.setCellValue(selectedaccnumber1)
                row2cell12.cellStyle = style2
                val row1cell13: Cell = row1.createCell(12)
                row1cell13.setCellValue("Name of Bank where account is opened.")
                row1cell13.cellStyle = style
                sheet2.setColumnWidth(12, 18 * 256)
                val row2cell13: Cell = row2.createCell(12)
                row2cell13.setCellValue(selectedbank1)
                row2cell13.cellStyle = style2
                val row1cell14: Cell = row1.createCell(13)
                row1cell14.setCellValue("Branch code where account opened")
                row1cell14.cellStyle = style
                sheet2.setColumnWidth(13, 10 * 256)
                val row2cell14: Cell = row2.createCell(13)
                row2cell14.setCellValue(selectedbranch1)
                row2cell14.cellStyle = style2

                // --- Add second participant detail to Spreadsheet ----- //

                val row3: Row = sheet2.createRow(2)
                val row3cell1: Cell = row3.createCell(0)
                row3cell1.setCellValue("2")
                row3cell1.cellStyle = style2
                val row3cell2: Cell = row3.createCell(1)
                row3cell2.setCellValue(selectedname2)
                row3cell2.cellStyle = style2
                val row3cell3: Cell = row3.createCell(2)
                row3cell3.setCellValue(selectedgender2)
                row3cell3.cellStyle = style2
                val row3cell4: Cell = row3.createCell(3)
                row3cell4.setCellValue(selectedage2)
                row3cell4.cellStyle = style2
                val row3cell5: Cell = row3.createCell(4)
                row3cell5.setCellValue(selectedprofession2)
                row3cell5.cellStyle = style2
                val row3cell6: Cell = row3.createCell(5)
                row3cell6.setCellValue(selectedcnic2)
                row3cell6.cellStyle = style2
                val row3cell7: Cell = row3.createCell(6)
                row3cell7.setCellValue(selectedcontact2)
                row3cell7.cellStyle = style2
                val row3cell8: Cell = row3.createCell(7)
                row3cell8.setCellValue(selectedaddress2)
                row3cell8.cellStyle = style2
                val row3cell9: Cell = row3.createCell(8)
                row3cell9.setCellValue(selectedhasaccountalready2)
                row3cell9.cellStyle = style2
                val row3cell10: Cell = row3.createCell(9)
                row3cell10.setCellValue(selectedaccountopened2)
                row3cell10.cellStyle = style2
                val row3cell11: Cell = row3.createCell(10)
                row3cell11.setCellValue(selectedacctype2?.text.toString())
                row3cell11.cellStyle = style2
                val row3cell12: Cell = row3.createCell(11)
                row3cell12.setCellValue(selectedaccnumber2)
                row3cell12.cellStyle = style2
                val row3cell13: Cell = row3.createCell(12)
                row3cell13.setCellValue(selectedbank2)
                row3cell13.cellStyle = style2
                val row3cell14: Cell = row3.createCell(13)
                row3cell14.setCellValue(selectedbranch2)
                row3cell14.cellStyle = style2

                // --- Add third participant detail to Spreadsheet ----- //

                val row4: Row = sheet2.createRow(3)
                val row4cell1: Cell = row4.createCell(0)
                row4cell1.setCellValue("3")
                row4cell1.cellStyle = style2
                val row4cell2: Cell = row4.createCell(1)
                row4cell2.setCellValue(selectedname3)
                row4cell2.cellStyle = style2
                val row4cell3: Cell = row4.createCell(2)
                row4cell3.setCellValue(selectedgender3)
                row4cell3.cellStyle = style2
                val row4cell4: Cell = row4.createCell(3)
                row4cell4.setCellValue(selectedage3)
                row4cell4.cellStyle = style2
                val row4cell5: Cell = row4.createCell(4)
                row4cell5.setCellValue(selectedprofession3)
                row4cell5.cellStyle = style2
                val row4cell6: Cell = row4.createCell(5)
                row4cell6.setCellValue(selectedcnic3)
                row4cell6.cellStyle = style2
                val row4cell7: Cell = row4.createCell(6)
                row4cell7.setCellValue(selectedcontact3)
                row4cell7.cellStyle = style2
                val row4cell8: Cell = row4.createCell(7)
                row4cell8.setCellValue(selectedaddress3)
                row4cell8.cellStyle = style2
                val row4cell9: Cell = row4.createCell(8)
                row4cell9.setCellValue(selectedhasaccountalready3)
                row4cell9.cellStyle = style2
                val row4cell10: Cell = row4.createCell(9)
                row4cell10.setCellValue(selectedaccountopened3)
                row4cell10.cellStyle = style2
                val row4cell11: Cell = row4.createCell(10)
                row4cell11.setCellValue(selectedacctype3?.text.toString())
                row4cell11.cellStyle = style2
                val row4cell12: Cell = row4.createCell(11)
                row4cell12.setCellValue(selectedaccnumber3)
                row4cell12.cellStyle = style2
                val row4cell13: Cell = row4.createCell(12)
                row4cell13.setCellValue(selectedbank3)
                row4cell13.cellStyle = style2
                val row4cell14: Cell = row4.createCell(13)
                row4cell14.setCellValue(selectedbranch3)
                row4cell14.cellStyle = style2

                // --- Add fourth participant detail to Spreadsheet ----- //

                val row5: Row = sheet2.createRow(4)
                val row5cell1: Cell = row5.createCell(0)
                row5cell1.setCellValue("4")
                row5cell1.cellStyle = style2
                val row5cell2: Cell = row5.createCell(1)
                row5cell2.setCellValue(selectedname4)
                row5cell2.cellStyle = style2
                val row5cell3: Cell = row5.createCell(2)
                row5cell3.setCellValue(selectedgender4)
                row5cell3.cellStyle = style2
                val row5cell4: Cell = row5.createCell(3)
                row5cell4.setCellValue(selectedage4)
                row5cell4.cellStyle = style2
                val row5cell5: Cell = row5.createCell(4)
                row5cell5.setCellValue(selectedprofession4)
                row5cell5.cellStyle = style2
                val row5cell6: Cell = row5.createCell(5)
                row5cell6.setCellValue(selectedcnic4)
                row5cell6.cellStyle = style2
                val row5cell7: Cell = row5.createCell(6)
                row5cell7.setCellValue(selectedcontact4)
                row5cell7.cellStyle = style2
                val row5cell8: Cell = row5.createCell(7)
                row5cell8.setCellValue(selectedaddress4)
                row5cell8.cellStyle = style2
                val row5cell9: Cell = row5.createCell(8)
                row5cell9.setCellValue(selectedhasaccountalready4)
                row5cell9.cellStyle = style2
                val row5cell10: Cell = row5.createCell(9)
                row5cell10.setCellValue(selectedaccountopened4)
                row5cell10.cellStyle = style2
                val row5cell11: Cell = row5.createCell(10)
                row5cell11.setCellValue(selectedacctype4?.text.toString())
                row5cell11.cellStyle = style2
                val row5cell12: Cell = row5.createCell(11)
                row5cell12.setCellValue(selectedaccnumber4)
                row5cell12.cellStyle = style2
                val row5cell13: Cell = row5.createCell(12)
                row5cell13.setCellValue(selectedbank4)
                row5cell13.cellStyle = style2
                val row5cell14: Cell = row5.createCell(13)
                row5cell14.setCellValue(selectedbranch4)
                row5cell14.cellStyle = style2

                // --- Add fifth participant detail to Spreadsheet ----- //

                val row6: Row = sheet2.createRow(5)
                val row6cell1: Cell = row6.createCell(0)
                row6cell1.setCellValue("5")
                row6cell1.cellStyle = style2
                val row6cell2: Cell = row6.createCell(1)
                row6cell2.setCellValue(selectedname5)
                row6cell2.cellStyle = style2
                val row6cell3: Cell = row6.createCell(2)
                row6cell3.setCellValue(selectedgender5)
                row6cell3.cellStyle = style2
                val row6cell4: Cell = row6.createCell(3)
                row6cell4.setCellValue(selectedage5)
                row6cell4.cellStyle = style2
                val row6cell5: Cell = row6.createCell(4)
                row6cell5.setCellValue(selectedprofession5)
                row6cell5.cellStyle = style2
                val row6cell6: Cell = row6.createCell(5)
                row6cell6.setCellValue(selectedcnic5)
                row6cell6.cellStyle = style2
                val row6cell7: Cell = row6.createCell(6)
                row6cell7.setCellValue(selectedcontact5)
                row6cell7.cellStyle = style2
                val row6cell8: Cell = row6.createCell(7)
                row6cell8.setCellValue(selectedaddress5)
                row6cell8.cellStyle = style2
                val row6cell9: Cell = row6.createCell(8)
                row6cell9.setCellValue(selectedhasaccountalready5)
                row6cell9.cellStyle = style2
                val row6cell10: Cell = row6.createCell(9)
                row6cell10.setCellValue(selectedaccountopened5)
                row6cell10.cellStyle = style2
                val row6cell11: Cell = row6.createCell(10)
                row6cell11.setCellValue(selectedacctype5?.text.toString())
                row6cell11.cellStyle = style2
                val row6cell12: Cell = row6.createCell(11)
                row6cell12.setCellValue(selectedaccnumber5)
                row6cell12.cellStyle = style2
                val row6cell13: Cell = row6.createCell(12)
                row6cell13.setCellValue(selectedbank5)
                row6cell13.cellStyle = style2
                val row6cell14: Cell = row6.createCell(13)
                row6cell14.setCellValue(selectedbranch5)
                row6cell14.cellStyle = style2

                // --- Add sixth participant detail to Spreadsheet ----- //

                val row7: Row = sheet2.createRow(6)
                val row7cell1: Cell = row7.createCell(0)
                row7cell1.setCellValue("6")
                row7cell1.cellStyle = style2
                val row7cell2: Cell = row7.createCell(1)
                row7cell2.setCellValue(selectedname6)
                row7cell2.cellStyle = style2
                val row7cell3: Cell = row7.createCell(2)
                row7cell3.setCellValue(selectedgender6)
                row7cell3.cellStyle = style2
                val row7cell4: Cell = row7.createCell(3)
                row7cell4.setCellValue(selectedage6)
                row7cell4.cellStyle = style2
                val row7cell5: Cell = row7.createCell(4)
                row7cell5.setCellValue(selectedprofession6)
                row7cell5.cellStyle = style2
                val row7cell6: Cell = row7.createCell(5)
                row7cell6.setCellValue(selectedcnic6)
                row7cell6.cellStyle = style2
                val row7cell7: Cell = row7.createCell(6)
                row7cell7.setCellValue(selectedcontact6)
                row7cell7.cellStyle = style2
                val row7cell8: Cell = row7.createCell(7)
                row7cell8.setCellValue(selectedaddress6)
                row7cell8.cellStyle = style2
                val row7cell9: Cell = row7.createCell(8)
                row7cell9.setCellValue(selectedhasaccountalready6)
                row7cell9.cellStyle = style2
                val row7cell10: Cell = row7.createCell(9)
                row7cell10.setCellValue(selectedaccountopened6)
                row7cell10.cellStyle = style2
                val row7cell11: Cell = row7.createCell(10)
                row7cell11.setCellValue(selectedacctype6?.text.toString())
                row7cell11.cellStyle = style2
                val row7cell12: Cell = row7.createCell(11)
                row7cell12.setCellValue(selectedaccnumber6)
                row7cell12.cellStyle = style2
                val row7cell13: Cell = row7.createCell(12)
                row7cell13.setCellValue(selectedbank6)
                row7cell13.cellStyle = style2
                val row7cell14: Cell = row7.createCell(13)
                row7cell14.setCellValue(selectedbranch6)
                row7cell14.cellStyle = style2


                // --- Add seventh participant detail to Spreadsheet ----- //

                val row8: Row = sheet2.createRow(7)
                val row8cell1: Cell = row8.createCell(0)
                row8cell1.setCellValue("7")
                row8cell1.cellStyle = style2
                val row8cell2: Cell = row8.createCell(1)
                row8cell2.setCellValue(selectedname7)
                row8cell2.cellStyle = style2
                val row8cell3: Cell = row8.createCell(2)
                row8cell3.setCellValue(selectedgender7)
                row8cell3.cellStyle = style2
                val row8cell4: Cell = row8.createCell(3)
                row8cell4.setCellValue(selectedage7)
                row8cell4.cellStyle = style2
                val row8cell5: Cell = row8.createCell(4)
                row8cell5.setCellValue(selectedprofession7)
                row8cell5.cellStyle = style2
                val row8cell6: Cell = row8.createCell(5)
                row8cell6.setCellValue(selectedcnic7)
                row8cell6.cellStyle = style2
                val row8cell7: Cell = row8.createCell(6)
                row8cell7.setCellValue(selectedcontact7)
                row8cell7.cellStyle = style2
                val row8cell8: Cell = row8.createCell(7)
                row8cell8.setCellValue(selectedaddress7)
                row8cell8.cellStyle = style2
                val row8cell9: Cell = row8.createCell(8)
                row8cell9.setCellValue(selectedhasaccountalready7)
                row8cell9.cellStyle = style2
                val row8cell10: Cell = row8.createCell(9)
                row8cell10.setCellValue(selectedaccountopened7)
                row8cell10.cellStyle = style2
                val row8cell11: Cell = row8.createCell(10)
                row8cell11.setCellValue(selectedacctype7?.text.toString())
                row8cell11.cellStyle = style2
                val row8cell12: Cell = row8.createCell(11)
                row8cell12.setCellValue(selectedaccnumber7)
                row8cell12.cellStyle = style2
                val row8cell13: Cell = row8.createCell(12)
                row8cell13.setCellValue(selectedbank7)
                row8cell13.cellStyle = style2
                val row8cell14: Cell = row8.createCell(13)
                row8cell14.setCellValue(selectedbranch7)
                row8cell14.cellStyle = style2

                // --- Add eighth participant detail to Spreadsheet ----- //

                val row9: Row = sheet2.createRow(8)
                val row9cell1: Cell = row9.createCell(0)
                row9cell1.setCellValue("8")
                row9cell1.cellStyle = style2
                val row9cell2: Cell = row9.createCell(1)
                row9cell2.setCellValue(selectedname8)
                row9cell2.cellStyle = style2
                val row9cell3: Cell = row9.createCell(2)
                row9cell3.setCellValue(selectedgender8)
                row9cell3.cellStyle = style2
                val row9cell4: Cell = row9.createCell(3)
                row9cell4.setCellValue(selectedage8)
                row9cell4.cellStyle = style2
                val row9cell5: Cell = row9.createCell(4)
                row9cell5.setCellValue(selectedprofession8)
                row9cell5.cellStyle = style2
                val row9cell6: Cell = row9.createCell(5)
                row9cell6.setCellValue(selectedcnic8)
                row9cell6.cellStyle = style2
                val row9cell7: Cell = row9.createCell(6)
                row9cell7.setCellValue(selectedcontact8)
                row9cell7.cellStyle = style2
                val row9cell8: Cell = row9.createCell(7)
                row9cell8.setCellValue(selectedaddress8)
                row9cell8.cellStyle = style2
                val row9cell9: Cell = row9.createCell(8)
                row9cell9.setCellValue(selectedhasaccountalready8)
                row9cell9.cellStyle = style2
                val row9cell10: Cell = row9.createCell(9)
                row9cell10.setCellValue(selectedaccountopened8)
                row9cell10.cellStyle = style2
                val row9cell11: Cell = row9.createCell(10)
                row9cell11.setCellValue(selectedacctype8?.text.toString())
                row9cell11.cellStyle = style2
                val row9cell12: Cell = row9.createCell(11)
                row9cell12.setCellValue(selectedaccnumber8)
                row9cell12.cellStyle = style2
                val row9cell13: Cell = row9.createCell(12)
                row9cell13.setCellValue(selectedbank8)
                row9cell13.cellStyle = style2
                val row9cell14: Cell = row9.createCell(13)
                row9cell14.setCellValue(selectedbranch8)
                row9cell14.cellStyle = style2

                // --- Add nineth participant detail to Spreadsheet ----- //

                val row10: Row = sheet2.createRow(9)
                val row10cell1: Cell = row10.createCell(0)
                row10cell1.setCellValue("9")
                row10cell1.cellStyle = style2
                val row10cell2: Cell = row10.createCell(1)
                row10cell2.setCellValue(selectedname9)
                row10cell2.cellStyle = style2
                val row10cell3: Cell = row10.createCell(2)
                row10cell3.setCellValue(selectedgender9)
                row10cell3.cellStyle = style2
                val row10cell4: Cell = row10.createCell(3)
                row10cell4.setCellValue(selectedage9)
                row10cell4.cellStyle = style2
                val row10cell5: Cell = row10.createCell(4)
                row10cell5.setCellValue(selectedprofession9)
                row10cell5.cellStyle = style2
                val row10cell6: Cell = row10.createCell(5)
                row10cell6.setCellValue(selectedcnic9)
                row10cell6.cellStyle = style2
                val row10cell7: Cell = row10.createCell(6)
                row10cell7.setCellValue(selectedcontact9)
                row10cell7.cellStyle = style2
                val row10cell8: Cell = row10.createCell(7)
                row10cell8.setCellValue(selectedaddress9)
                row10cell8.cellStyle = style2
                val row10cell9: Cell = row10.createCell(8)
                row10cell9.setCellValue(selectedhasaccountalready9)
                row10cell9.cellStyle = style2
                val row10cell10: Cell = row10.createCell(9)
                row10cell10.setCellValue(selectedaccountopened9)
                row10cell10.cellStyle = style2
                val row10cell11: Cell = row10.createCell(10)
                row10cell11.setCellValue(selectedacctype9?.text.toString())
                row10cell11.cellStyle = style2
                val row10cell12: Cell = row10.createCell(11)
                row10cell12.setCellValue(selectedaccnumber9)
                row10cell12.cellStyle = style2
                val row10cell13: Cell = row10.createCell(12)
                row10cell13.setCellValue(selectedbank9)
                row10cell13.cellStyle = style2
                val row10cell14: Cell = row10.createCell(13)
                row10cell14.setCellValue(selectedbranch9)
                row10cell14.cellStyle = style2

                // --- Add tenth participant detail to Spreadsheet ----- //

                val row11: Row = sheet2.createRow(10)
                val row11cell1: Cell = row11.createCell(0)
                row11cell1.setCellValue("10")
                row11cell1.cellStyle = style2
                val row11cell2: Cell = row11.createCell(1)
                row11cell2.setCellValue(selectedname10)
                row11cell2.cellStyle = style2
                val row11cell3: Cell = row11.createCell(2)
                row11cell3.setCellValue(selectedgender10)
                row11cell3.cellStyle = style2
                val row11cell4: Cell = row11.createCell(3)
                row11cell4.setCellValue(selectedage10)
                row11cell4.cellStyle = style2
                val row11cell5: Cell = row11.createCell(4)
                row11cell5.setCellValue(selectedprofession10)
                row11cell5.cellStyle = style2
                val row11cell6: Cell = row11.createCell(5)
                row11cell6.setCellValue(selectedcnic10)
                row11cell6.cellStyle = style2
                val row11cell7: Cell = row11.createCell(6)
                row11cell7.setCellValue(selectedcontact10)
                row11cell7.cellStyle = style2
                val row11cell8: Cell = row11.createCell(7)
                row11cell8.setCellValue(selectedaddress10)
                row11cell8.cellStyle = style2
                val row11cell9: Cell = row11.createCell(8)
                row11cell9.setCellValue(selectedhasaccountalready10)
                row11cell9.cellStyle = style2
                val row11cell10: Cell = row11.createCell(9)
                row11cell10.setCellValue(selectedaccountopened10)
                row11cell10.cellStyle = style2
                val row11cell11: Cell = row11.createCell(10)
                row11cell11.setCellValue(selectedacctype10?.text.toString())
                row11cell11.cellStyle = style2
                val row11cell12: Cell = row11.createCell(11)
                row11cell12.setCellValue(selectedaccnumber10)
                row11cell12.cellStyle = style2
                val row11cell13: Cell = row11.createCell(12)
                row11cell13.setCellValue(selectedbank10)
                row11cell13.cellStyle = style2
                val row11cell14: Cell = row11.createCell(13)
                row11cell14.setCellValue(selectedbranch10)
                row11cell14.cellStyle = style2

                // --- Add eleventh participant detail to Spreadsheet ----- //

                val row12: Row = sheet2.createRow(11)
                val row12cell1: Cell = row12.createCell(0)
                row12cell1.setCellValue("11")
                row12cell1.cellStyle = style2
                val row12cell2: Cell = row12.createCell(1)
                row12cell2.setCellValue(selectedname11)
                row12cell2.cellStyle = style2
                val row12cell3: Cell = row12.createCell(2)
                row12cell3.setCellValue(selectedgender11)
                row12cell3.cellStyle = style2
                val row12cell4: Cell = row12.createCell(3)
                row12cell4.setCellValue(selectedage11)
                row12cell4.cellStyle = style2
                val row12cell5: Cell = row12.createCell(4)
                row12cell5.setCellValue(selectedprofession11)
                row12cell5.cellStyle = style2
                val row12cell6: Cell = row12.createCell(5)
                row12cell6.setCellValue(selectedcnic11)
                row12cell6.cellStyle = style2
                val row12cell7: Cell = row12.createCell(6)
                row12cell7.setCellValue(selectedcontact11)
                row12cell7.cellStyle = style2
                val row12cell8: Cell = row12.createCell(7)
                row12cell8.setCellValue(selectedaddress11)
                row12cell8.cellStyle = style2
                val row12cell9: Cell = row12.createCell(8)
                row12cell9.setCellValue(selectedhasaccountalready11)
                row12cell9.cellStyle = style2
                val row12cell10: Cell = row12.createCell(9)
                row12cell10.setCellValue(selectedaccountopened11)
                row12cell10.cellStyle = style2
                val row12cell11: Cell = row12.createCell(10)
                row12cell11.setCellValue(selectedacctype11?.text.toString())
                row12cell11.cellStyle = style2
                val row12cell12: Cell = row12.createCell(11)
                row12cell12.setCellValue(selectedaccnumber11)
                row12cell12.cellStyle = style2
                val row12cell13: Cell = row12.createCell(12)
                row12cell13.setCellValue(selectedbank11)
                row12cell13.cellStyle = style2
                val row12cell14: Cell = row12.createCell(13)
                row12cell14.setCellValue(selectedbranch11)
                row12cell14.cellStyle = style2

                // --- Add twelveth participant detail to Spreadsheet ----- //

                val row13: Row = sheet2.createRow(12)
                val row13cell1: Cell = row13.createCell(0)
                row13cell1.setCellValue("12")
                row13cell1.cellStyle = style2
                val row13cell2: Cell = row13.createCell(1)
                row13cell2.setCellValue(selectedname12)
                row13cell2.cellStyle = style2
                val row13cell3: Cell = row13.createCell(2)
                row13cell3.setCellValue(selectedgender12)
                row13cell3.cellStyle = style2
                val row13cell4: Cell = row13.createCell(3)
                row13cell4.setCellValue(selectedage12)
                row13cell4.cellStyle = style2
                val row13cell5: Cell = row13.createCell(4)
                row13cell5.setCellValue(selectedprofession12)
                row13cell5.cellStyle = style2
                val row13cell6: Cell = row13.createCell(5)
                row13cell6.setCellValue(selectedcnic12)
                row13cell6.cellStyle = style2
                val row13cell7: Cell = row13.createCell(6)
                row13cell7.setCellValue(selectedcontact12)
                row13cell7.cellStyle = style2
                val row13cell8: Cell = row13.createCell(7)
                row13cell8.setCellValue(selectedaddress12)
                row13cell8.cellStyle = style2
                val row13cell9: Cell = row13.createCell(8)
                row13cell9.setCellValue(selectedhasaccountalready12)
                row13cell9.cellStyle = style2
                val row13cell10: Cell = row13.createCell(9)
                row13cell10.setCellValue(selectedaccountopened12)
                row13cell10.cellStyle = style2
                val row13cell11: Cell = row13.createCell(10)
                row13cell11.setCellValue(selectedacctype12?.text.toString())
                row13cell11.cellStyle = style2
                val row13cell12: Cell = row13.createCell(11)
                row13cell12.setCellValue(selectedaccnumber12)
                row13cell12.cellStyle = style2
                val row13cell13: Cell = row13.createCell(12)
                row13cell13.setCellValue(selectedbank12)
                row13cell13.cellStyle = style2
                val row13cell14: Cell = row13.createCell(13)
                row13cell14.setCellValue(selectedbranch12)
                row13cell14.cellStyle = style2

                // --- Add thirteenth participant detail to Spreadsheet ----- //

                val row14: Row = sheet2.createRow(13)
                val row14cell1: Cell = row14.createCell(0)
                row14cell1.setCellValue("13")
                row14cell1.cellStyle = style2
                val row14cell2: Cell = row14.createCell(1)
                row14cell2.setCellValue(selectedname13)
                row14cell2.cellStyle = style2
                val row14cell3: Cell = row14.createCell(2)
                row14cell3.setCellValue(selectedgender13)
                row14cell3.cellStyle = style2
                val row14cell4: Cell = row14.createCell(3)
                row14cell4.setCellValue(selectedage13)
                row14cell4.cellStyle = style2
                val row14cell5: Cell = row14.createCell(4)
                row14cell5.setCellValue(selectedprofession13)
                row14cell5.cellStyle = style2
                val row14cell6: Cell = row14.createCell(5)
                row14cell6.setCellValue(selectedcnic13)
                row14cell6.cellStyle = style2
                val row14cell7: Cell = row14.createCell(6)
                row14cell7.setCellValue(selectedcontact13)
                row14cell7.cellStyle = style2
                val row14cell8: Cell = row14.createCell(7)
                row14cell8.setCellValue(selectedaddress13)
                row14cell8.cellStyle = style2
                val row14cell9: Cell = row14.createCell(8)
                row14cell9.setCellValue(selectedhasaccountalready13)
                row14cell9.cellStyle = style2
                val row14cell10: Cell = row14.createCell(9)
                row14cell10.setCellValue(selectedaccountopened13)
                row14cell10.cellStyle = style2
                val row14cell11: Cell = row14.createCell(10)
                row14cell11.setCellValue(selectedacctype13?.text.toString())
                row14cell11.cellStyle = style2
                val row14cell12: Cell = row14.createCell(11)
                row14cell12.setCellValue(selectedaccnumber13)
                row14cell12.cellStyle = style2
                val row14cell13: Cell = row14.createCell(12)
                row14cell13.setCellValue(selectedbank13)
                row14cell13.cellStyle = style2
                val row14cell14: Cell = row14.createCell(13)
                row14cell14.setCellValue(selectedbranch13)
                row14cell14.cellStyle = style2

                // --- Add thirteenth participant detail to Spreadsheet ----- //

                val row15: Row = sheet2.createRow(14)
                val row15cell1: Cell = row15.createCell(0)
                row15cell1.setCellValue("14")
                row15cell1.cellStyle = style2
                val row15cell2: Cell = row15.createCell(1)
                row15cell2.setCellValue(selectedname14)
                row15cell2.cellStyle = style2
                val row15cell3: Cell = row15.createCell(2)
                row15cell3.setCellValue(selectedgender14)
                row15cell3.cellStyle = style2
                val row15cell4: Cell = row15.createCell(3)
                row15cell4.setCellValue(selectedage14)
                row15cell4.cellStyle = style2
                val row15cell5: Cell = row15.createCell(4)
                row15cell5.setCellValue(selectedprofession14)
                row15cell5.cellStyle = style2
                val row15cell6: Cell = row15.createCell(5)
                row15cell6.setCellValue(selectedcnic14)
                row15cell6.cellStyle = style2
                val row15cell7: Cell = row15.createCell(6)
                row15cell7.setCellValue(selectedcontact14)
                row15cell7.cellStyle = style2
                val row15cell8: Cell = row15.createCell(7)
                row15cell8.setCellValue(selectedaddress14)
                row15cell8.cellStyle = style2
                val row15cell9: Cell = row15.createCell(8)
                row15cell9.setCellValue(selectedhasaccountalready14)
                row15cell9.cellStyle = style2
                val row15cell10: Cell = row15.createCell(9)
                row15cell10.setCellValue(selectedaccountopened14)
                row15cell10.cellStyle = style2
                val row15cell11: Cell = row15.createCell(10)
                row15cell11.setCellValue(selectedacctype14?.text.toString())
                row15cell11.cellStyle = style2
                val row15cell12: Cell = row15.createCell(11)
                row15cell12.setCellValue(selectedaccnumber14)
                row15cell12.cellStyle = style2
                val row15cell13: Cell = row15.createCell(12)
                row15cell13.setCellValue(selectedbank14)
                row15cell13.cellStyle = style2
                val row15cell14: Cell = row15.createCell(13)
                row15cell14.setCellValue(selectedbranch14)
                row15cell14.cellStyle = style2

                // --- Add thirteenth participant detail to Spreadsheet ----- //

                val row16: Row = sheet2.createRow(15)
                val row16cell1: Cell = row16.createCell(0)
                row16cell1.setCellValue("15")
                row16cell1.cellStyle = style2
                val row16cell2: Cell = row16.createCell(1)
                row16cell2.setCellValue(selectedname15)
                row16cell2.cellStyle = style2
                val row16cell3: Cell = row16.createCell(2)
                row16cell3.setCellValue(selectedgender15)
                row16cell3.cellStyle = style2
                val row16cell4: Cell = row16.createCell(3)
                row16cell4.setCellValue(selectedage15)
                row16cell4.cellStyle = style2
                val row16cell5: Cell = row16.createCell(4)
                row16cell5.setCellValue(selectedprofession15)
                row16cell5.cellStyle = style2
                val row16cell6: Cell = row16.createCell(5)
                row16cell6.setCellValue(selectedcnic15)
                row16cell6.cellStyle = style2
                val row16cell7: Cell = row16.createCell(6)
                row16cell7.setCellValue(selectedcontact15)
                row16cell7.cellStyle = style2
                val row16cell8: Cell = row16.createCell(7)
                row16cell8.setCellValue(selectedaddress15)
                row16cell8.cellStyle = style2
                val row16cell9: Cell = row16.createCell(8)
                row16cell9.setCellValue(selectedhasaccountalready15)
                row16cell9.cellStyle = style2
                val row16cell10: Cell = row16.createCell(9)
                row16cell10.setCellValue(selectedaccountopened15)
                row16cell10.cellStyle = style2
                val row16cell11: Cell = row16.createCell(10)
                row16cell11.setCellValue(selectedacctype15?.text.toString())
                row16cell11.cellStyle = style2
                val row16cell12: Cell = row16.createCell(11)
                row16cell12.setCellValue(selectedaccnumber15)
                row16cell12.cellStyle = style2
                val row16cell13: Cell = row16.createCell(12)
                row16cell13.setCellValue(selectedbank15)
                row16cell13.cellStyle = style2
                val row16cell14: Cell = row16.createCell(13)
                row16cell14.setCellValue(selectedbranch15)
                row16cell14.cellStyle = style2

                // --- Add thirteenth participant detail to Spreadsheet ----- //

                val row17: Row = sheet2.createRow(16)
                val row17cell1: Cell = row17.createCell(0)
                row17cell1.setCellValue("16")
                row17cell1.cellStyle = style2
                val row17cell2: Cell = row17.createCell(1)
                row17cell2.setCellValue(selectedname16)
                row17cell2.cellStyle = style2
                val row17cell3: Cell = row17.createCell(2)
                row17cell3.setCellValue(selectedgender16)
                row17cell3.cellStyle = style2
                val row17cell4: Cell = row17.createCell(3)
                row17cell4.setCellValue(selectedage16)
                row17cell4.cellStyle = style2
                val row17cell5: Cell = row17.createCell(4)
                row17cell5.setCellValue(selectedprofession16)
                row17cell5.cellStyle = style2
                val row17cell6: Cell = row17.createCell(5)
                row17cell6.setCellValue(selectedcnic16)
                row17cell6.cellStyle = style2
                val row17cell7: Cell = row17.createCell(6)
                row17cell7.setCellValue(selectedcontact16)
                row17cell7.cellStyle = style2
                val row17cell8: Cell = row17.createCell(7)
                row17cell8.setCellValue(selectedaddress16)
                row17cell8.cellStyle = style2
                val row17cell9: Cell = row17.createCell(8)
                row17cell9.setCellValue(selectedhasaccountalready16)
                row17cell9.cellStyle = style2
                val row17cell10: Cell = row17.createCell(9)
                row17cell10.setCellValue(selectedaccountopened16)
                row17cell10.cellStyle = style2
                val row17cell11: Cell = row17.createCell(10)
                row17cell11.setCellValue(selectedacctype16?.text.toString())
                row17cell11.cellStyle = style2
                val row17cell12: Cell = row17.createCell(11)
                row17cell12.setCellValue(selectedaccnumber16)
                row17cell12.cellStyle = style2
                val row17cell13: Cell = row17.createCell(12)
                row17cell13.setCellValue(selectedbank16)
                row17cell13.cellStyle = style2
                val row17cell14: Cell = row17.createCell(13)
                row17cell14.setCellValue(selectedbranch16)
                row17cell14.cellStyle = style2

                // --- Add thirteenth participant detail to Spreadsheet ----- //

                val row18: Row = sheet2.createRow(17)
                val row18cell1: Cell = row18.createCell(0)
                row18cell1.setCellValue("17")
                row18cell1.cellStyle = style2
                val row18cell2: Cell = row18.createCell(1)
                row18cell2.setCellValue(selectedname17)
                row18cell2.cellStyle = style2
                val row18cell3: Cell = row18.createCell(2)
                row18cell3.setCellValue(selectedgender17)
                row18cell3.cellStyle = style2
                val row18cell4: Cell = row18.createCell(3)
                row18cell4.setCellValue(selectedage17)
                row18cell4.cellStyle = style2
                val row18cell5: Cell = row18.createCell(4)
                row18cell5.setCellValue(selectedprofession17)
                row18cell5.cellStyle = style2
                val row18cell6: Cell = row18.createCell(5)
                row18cell6.setCellValue(selectedcnic17)
                row18cell6.cellStyle = style2
                val row18cell7: Cell = row18.createCell(6)
                row18cell7.setCellValue(selectedcontact17)
                row18cell7.cellStyle = style2
                val row18cell8: Cell = row18.createCell(7)
                row18cell8.setCellValue(selectedaddress17)
                row18cell8.cellStyle = style2
                val row18cell9: Cell = row18.createCell(8)
                row18cell9.setCellValue(selectedhasaccountalready17)
                row18cell9.cellStyle = style2
                val row18cell10: Cell = row18.createCell(9)
                row18cell10.setCellValue(selectedaccountopened17)
                row18cell10.cellStyle = style2
                val row18cell11: Cell = row18.createCell(10)
                row18cell11.setCellValue(selectedacctype17?.text.toString())
                row18cell11.cellStyle = style2
                val row18cell12: Cell = row18.createCell(11)
                row18cell12.setCellValue(selectedaccnumber17)
                row18cell12.cellStyle = style2
                val row18cell13: Cell = row18.createCell(12)
                row18cell13.setCellValue(selectedbank17)
                row18cell13.cellStyle = style2
                val row18cell14: Cell = row18.createCell(13)
                row18cell14.setCellValue(selectedbranch17)
                row18cell14.cellStyle = style2

                // --- Add thirteenth participant detail to Spreadsheet ----- //

                val row19: Row = sheet2.createRow(18)
                val row19cell1: Cell = row19.createCell(0)
                row19cell1.setCellValue("18")
                row19cell1.cellStyle = style2
                val row19cell2: Cell = row19.createCell(1)
                row19cell2.setCellValue(selectedname18)
                row19cell2.cellStyle = style2
                val row19cell3: Cell = row19.createCell(2)
                row19cell3.setCellValue(selectedgender18)
                row19cell3.cellStyle = style2
                val row19cell4: Cell = row19.createCell(3)
                row19cell4.setCellValue(selectedage18)
                row19cell4.cellStyle = style2
                val row19cell5: Cell = row19.createCell(4)
                row19cell5.setCellValue(selectedprofession18)
                row19cell5.cellStyle = style2
                val row19cell6: Cell = row19.createCell(5)
                row19cell6.setCellValue(selectedcnic18)
                row19cell6.cellStyle = style2
                val row19cell7: Cell = row19.createCell(6)
                row19cell7.setCellValue(selectedcontact18)
                row19cell7.cellStyle = style2
                val row19cell8: Cell = row19.createCell(7)
                row19cell8.setCellValue(selectedaddress18)
                row19cell8.cellStyle = style2
                val row19cell9: Cell = row19.createCell(8)
                row19cell9.setCellValue(selectedhasaccountalready18)
                row19cell9.cellStyle = style2
                val row19cell10: Cell = row19.createCell(9)
                row19cell10.setCellValue(selectedaccountopened18)
                row19cell10.cellStyle = style2
                val row19cell11: Cell = row19.createCell(10)
                row19cell11.setCellValue(selectedacctype18?.text.toString())
                row19cell11.cellStyle = style2
                val row19cell12: Cell = row19.createCell(11)
                row19cell12.setCellValue(selectedaccnumber18)
                row19cell12.cellStyle = style2
                val row19cell13: Cell = row19.createCell(12)
                row19cell13.setCellValue(selectedbank18)
                row19cell13.cellStyle = style2
                val row19cell14: Cell = row19.createCell(13)
                row19cell14.setCellValue(selectedbranch18)
                row19cell14.cellStyle = style2

                // --- Add thirteenth participant detail to Spreadsheet ----- //

                val row20: Row = sheet2.createRow(19)
                val row20cell1: Cell = row20.createCell(0)
                row20cell1.setCellValue("19")
                row20cell1.cellStyle = style2
                val row20cell2: Cell = row20.createCell(1)
                row20cell2.setCellValue(selectedname19)
                row20cell2.cellStyle = style2
                val row20cell3: Cell = row20.createCell(2)
                row20cell3.setCellValue(selectedgender19)
                row20cell3.cellStyle = style2
                val row20cell4: Cell = row20.createCell(3)
                row20cell4.setCellValue(selectedage19)
                row20cell4.cellStyle = style2
                val row20cell5: Cell = row20.createCell(4)
                row20cell5.setCellValue(selectedprofession19)
                row20cell5.cellStyle = style2
                val row20cell6: Cell = row20.createCell(5)
                row20cell6.setCellValue(selectedcnic19)
                row20cell6.cellStyle = style2
                val row20cell7: Cell = row20.createCell(6)
                row20cell7.setCellValue(selectedcontact19)
                row20cell7.cellStyle = style2
                val row20cell8: Cell = row20.createCell(7)
                row20cell8.setCellValue(selectedaddress19)
                row20cell8.cellStyle = style2
                val row20cell9: Cell = row20.createCell(8)
                row20cell9.setCellValue(selectedhasaccountalready19)
                row20cell9.cellStyle = style2
                val row20cell10: Cell = row20.createCell(9)
                row20cell10.setCellValue(selectedaccountopened19)
                row20cell10.cellStyle = style2
                val row20cell11: Cell = row20.createCell(10)
                row20cell11.setCellValue(selectedacctype19?.text.toString())
                row20cell11.cellStyle = style2
                val row20cell12: Cell = row20.createCell(11)
                row20cell12.setCellValue(selectedaccnumber19)
                row20cell12.cellStyle = style2
                val row20cell13: Cell = row20.createCell(12)
                row20cell13.setCellValue(selectedbank19)
                row20cell13.cellStyle = style2
                val row20cell14: Cell = row20.createCell(13)
                row20cell14.setCellValue(selectedbranch19)
                row20cell14.cellStyle = style2

                // --- Add thirteenth participant detail to Spreadsheet ----- //

                val row21: Row = sheet2.createRow(20)
                val row21cell1: Cell = row21.createCell(0)
                row21cell1.setCellValue("20")
                row21cell1.cellStyle = style2
                val row21cell2: Cell = row21.createCell(1)
                row21cell2.setCellValue(selectedname20)
                row21cell2.cellStyle = style2
                val row21cell3: Cell = row21.createCell(2)
                row21cell3.setCellValue(selectedgender20)
                row21cell3.cellStyle = style2
                val row21cell4: Cell = row21.createCell(3)
                row21cell4.setCellValue(selectedage20)
                row21cell4.cellStyle = style2
                val row21cell5: Cell = row21.createCell(4)
                row21cell5.setCellValue(selectedprofession20)
                row21cell5.cellStyle = style2
                val row21cell6: Cell = row21.createCell(5)
                row21cell6.setCellValue(selectedcnic20)
                row21cell6.cellStyle = style2
                val row21cell7: Cell = row21.createCell(6)
                row21cell7.setCellValue(selectedcontact20)
                row21cell7.cellStyle = style2
                val row21cell8: Cell = row21.createCell(7)
                row21cell8.setCellValue(selectedaddress20)
                row21cell8.cellStyle = style2
                val row21cell9: Cell = row21.createCell(8)
                row21cell9.setCellValue(selectedhasaccountalready20)
                row21cell9.cellStyle = style2
                val row21cell10: Cell = row21.createCell(9)
                row21cell10.setCellValue(selectedaccountopened20)
                row21cell10.cellStyle = style2
                val row21cell11: Cell = row21.createCell(10)
                row21cell11.setCellValue(selectedacctype20?.text.toString())
                row21cell11.cellStyle = style2
                val row21cell12: Cell = row21.createCell(11)
                row21cell12.setCellValue(selectedaccnumber20)
                row21cell12.cellStyle = style2
                val row21cell13: Cell = row21.createCell(12)
                row21cell13.setCellValue(selectedbank20)
                row21cell13.cellStyle = style2
                val row21cell14: Cell = row21.createCell(13)
                row21cell14.setCellValue(selectedbranch20)
                row21cell14.cellStyle = style2


                val fileOut = FileOutputStream(filename)
                workbook.write(fileOut)
                fileOut.close()
                workbook.close()
                val intent = Intent(this@participants_area, participants_area_second::class.java)
                intent.putExtra("filename", filename)
                intent.putExtra("participantsNumbers",participantsNumbers)
                startActivity(intent)


                }
            }
        }
    }





