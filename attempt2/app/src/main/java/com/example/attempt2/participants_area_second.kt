package com.example.attempt2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.view.View
import android.text.InputFilter.LengthFilter
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.*
import org.apache.poi.hssf.usermodel.HSSFFont
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class participants_area_second : AppCompatActivity() {

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

    // function to limit the length of EditText
    fun EditText.setMaxLength(maxLength: Int) {
        filters = arrayOf(InputFilter.LengthFilter(maxLength))
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_participants_area_second)

        val participantsNumbers = intent.getStringExtra("participantsNumbers")

        val filename = intent.getStringExtra("filename")

        val notice = findViewById<TextView>(R.id.notice)

        notice.text = "Your selected participant(s) number is $participantsNumbers ," +
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
        val sheet2: Sheet = workbook.getSheet("Participants Detail")
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
        cnic1.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name1.visibility = View.VISIBLE
                textname1.visibility = View.VISIBLE
                age1.visibility = View.VISIBLE
                textage1.visibility = View.VISIBLE
                profession1.visibility = View.VISIBLE
                textprofession1.visibility = View.VISIBLE
                cnic1.visibility = View.VISIBLE
                textcnic1.visibility = View.VISIBLE
                gender1.visibility = View.VISIBLE
                textgender1.visibility = View.VISIBLE
                contact1.visibility = View.VISIBLE
                textcontact1.visibility = View.VISIBLE
                address1.visibility = View.VISIBLE
                textaddress1.visibility = View.VISIBLE
                hasaccountalready1.visibility = View.VISIBLE
                texthasaccalready1.visibility = View.VISIBLE
                accountopened1.visibility = View.VISIBLE
                textaccountopened1.visibility = View.VISIBLE
                accountopened1.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened1.isChecked) {
                        selectedaccountopened1 = "Y"
                        selectedacctype1 = findViewById(textbranchless1.id)
                        acctype1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype1.checkedRadioButtonId
                            selectedacctype1 = findViewById<RadioButton>(id)
                        })
                        acctype1.visibility = View.VISIBLE;
                        textacctype1.visibility = View.VISIBLE
                        textbranchless1.visibility = View.VISIBLE
                        textassan1.visibility = View.VISIBLE
                        accnumber1.visibility = View.VISIBLE;
                        textaccnumber1.visibility = View.VISIBLE
                        bankname1.visibility = View.VISIBLE
                        textbankname1.visibility = View.VISIBLE
                        branchcode1.visibility = View.VISIBLE
                        textbranchcode1.visibility = View.VISIBLE
                    } else {
                        acctype1.clearCheck()
                        selectedaccountopened1 = "N"
                        acctype1.visibility = View.GONE;
                        textacctype1.visibility = View.GONE
                        textbranchless1.visibility = View.GONE
                        textassan1.visibility = View.GONE
                        accnumber1.visibility = View.GONE;
                        textaccnumber1.visibility = View.GONE
                        bankname1.visibility = View.GONE
                        textbankname1.visibility = View.GONE
                        branchcode1.visibility = View.GONE
                        textbranchcode1.visibility = View.GONE
                    }
                }
            } else {
                name1.visibility = View.GONE
                textname1.visibility = View.GONE
                age1.visibility = View.GONE
                textage1.visibility = View.GONE
                profession1.visibility = View.GONE
                textprofession1.visibility = View.GONE
                cnic1.visibility = View.GONE
                textcnic1.visibility = View.GONE
                gender1.visibility = View.GONE
                textgender1.visibility = View.GONE
                contact1.visibility = View.GONE
                textcontact1.visibility = View.GONE
                address1.visibility = View.GONE
                textaddress1.visibility = View.GONE
                hasaccountalready1.visibility = View.GONE
                texthasaccalready1.visibility = View.GONE
                accountopened1.visibility = View.GONE
                textaccountopened1.visibility = View.GONE
                acctype1.visibility = View.GONE
                textacctype1.visibility = View.GONE
                textbranchless1.visibility = View.GONE
                textassan1.visibility = View.GONE
                accnumber1.visibility = View.GONE
                textaccnumber1.visibility = View.GONE
                bankname1.visibility = View.GONE
                textbankname1.visibility = View.GONE
                branchcode1.visibility = View.GONE
                textbranchcode1.visibility = View.GONE
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
        cnic2.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name2.visibility = View.VISIBLE
                textname2.visibility = View.VISIBLE
                age2.visibility = View.VISIBLE
                textage2.visibility = View.VISIBLE
                profession2.visibility = View.VISIBLE
                textprofession2.visibility = View.VISIBLE
                cnic2.visibility = View.VISIBLE
                textcnic2.visibility = View.VISIBLE
                gender2.visibility = View.VISIBLE
                textgender2.visibility = View.VISIBLE
                contact2.visibility = View.VISIBLE
                textcontact2.visibility = View.VISIBLE
                address2.visibility = View.VISIBLE
                textaddress2.visibility = View.VISIBLE
                hasaccountalready2.visibility = View.VISIBLE
                texthasaccalready2.visibility = View.VISIBLE
                accountopened2.visibility = View.VISIBLE
                textaccountopened2.visibility = View.VISIBLE
                accountopened2.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened2.isChecked) {
                        selectedaccountopened2 = "Y"
                        selectedacctype2 = findViewById(textbranchless2.id)
                        acctype2.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype2.checkedRadioButtonId
                            selectedacctype2 = findViewById<RadioButton>(id)
                        })
                        acctype2.visibility = View.VISIBLE;
                        textacctype2.visibility = View.VISIBLE
                        textbranchless2.visibility = View.VISIBLE
                        textassan2.visibility = View.VISIBLE
                        accnumber2.visibility = View.VISIBLE;
                        textaccnumber2.visibility = View.VISIBLE
                        bankname2.visibility = View.VISIBLE
                        textbankname2.visibility = View.VISIBLE
                        branchcode2.visibility = View.VISIBLE
                        textbranchcode2.visibility = View.VISIBLE
                    } else {
                        acctype2.clearCheck()
                        selectedaccountopened2 = "N"
                        acctype2.visibility = View.GONE;
                        textacctype2.visibility = View.GONE
                        textbranchless2.visibility = View.GONE
                        textassan2.visibility = View.GONE
                        accnumber2.visibility = View.GONE;
                        textaccnumber2.visibility = View.GONE
                        bankname2.visibility = View.GONE
                        textbankname2.visibility = View.GONE
                        branchcode2.visibility = View.GONE
                        textbranchcode2.visibility = View.GONE
                    }
                }
            } else {
                name2.visibility = View.GONE
                textname2.visibility = View.GONE
                age2.visibility = View.GONE
                textage2.visibility = View.GONE
                profession2.visibility = View.GONE
                textprofession2.visibility = View.GONE
                cnic2.visibility = View.GONE
                textcnic2.visibility = View.GONE
                gender2.visibility = View.GONE
                textgender2.visibility = View.GONE
                contact2.visibility = View.GONE
                textcontact2.visibility = View.GONE
                address2.visibility = View.GONE
                textaddress2.visibility = View.GONE
                hasaccountalready2.visibility = View.GONE
                texthasaccalready2.visibility = View.GONE
                accountopened2.visibility = View.GONE
                textaccountopened2.visibility = View.GONE
                acctype2.visibility = View.GONE
                textacctype2.visibility = View.GONE
                textbranchless2.visibility = View.GONE
                textassan2.visibility = View.GONE
                accnumber2.visibility = View.GONE
                textaccnumber2.visibility = View.GONE
                bankname2.visibility = View.GONE
                textbankname2.visibility = View.GONE
                branchcode2.visibility = View.GONE
                textbranchcode2.visibility = View.GONE
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
        cnic3.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name3.visibility = View.VISIBLE
                textname3.visibility = View.VISIBLE
                age3.visibility = View.VISIBLE
                textage3.visibility = View.VISIBLE
                profession3.visibility = View.VISIBLE
                textprofession3.visibility = View.VISIBLE
                cnic3.visibility = View.VISIBLE
                textcnic3.visibility = View.VISIBLE
                gender3.visibility = View.VISIBLE
                textgender3.visibility = View.VISIBLE
                contact3.visibility = View.VISIBLE
                textcontact3.visibility = View.VISIBLE
                address3.visibility = View.VISIBLE
                textaddress3.visibility = View.VISIBLE
                hasaccountalready3.visibility = View.VISIBLE
                texthasaccalready3.visibility = View.VISIBLE
                accountopened3.visibility = View.VISIBLE
                textaccountopened3.visibility = View.VISIBLE
                accountopened3.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened3.isChecked) {
                        selectedaccountopened3 = "Y"
                        selectedacctype3 = findViewById(textbranchless1.id)
                        acctype3.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype3.checkedRadioButtonId
                            selectedacctype3 = findViewById<RadioButton>(id)
                        })
                        acctype3.visibility = View.VISIBLE;
                        textacctype3.visibility = View.VISIBLE
                        textbranchless3.visibility = View.VISIBLE
                        textassan3.visibility = View.VISIBLE
                        accnumber3.visibility = View.VISIBLE;
                        textaccnumber3.visibility = View.VISIBLE
                        bankname3.visibility = View.VISIBLE
                        textbankname3.visibility = View.VISIBLE
                        branchcode3.visibility = View.VISIBLE
                        textbranchcode3.visibility = View.VISIBLE
                    } else {
                        acctype3.clearCheck()
                        selectedaccountopened3 = "N"
                        acctype3.visibility = View.GONE;
                        textacctype3.visibility = View.GONE
                        textbranchless3.visibility = View.GONE
                        textassan3.visibility = View.GONE
                        accnumber3.visibility = View.GONE;
                        textaccnumber3.visibility = View.GONE
                        bankname3.visibility = View.GONE
                        textbankname3.visibility = View.GONE
                        branchcode3.visibility = View.GONE
                        textbranchcode3.visibility = View.GONE
                    }
                }
            } else {
                name3.visibility = View.GONE
                textname3.visibility = View.GONE
                age3.visibility = View.GONE
                textage3.visibility = View.GONE
                profession3.visibility = View.GONE
                textprofession3.visibility = View.GONE
                cnic3.visibility = View.GONE
                textcnic3.visibility = View.GONE
                gender3.visibility = View.GONE
                textgender3.visibility = View.GONE
                contact3.visibility = View.GONE
                textcontact3.visibility = View.GONE
                address3.visibility = View.GONE
                textaddress3.visibility = View.GONE
                hasaccountalready3.visibility = View.GONE
                texthasaccalready3.visibility = View.GONE
                accountopened3.visibility = View.GONE
                textaccountopened3.visibility = View.GONE
                acctype3.visibility = View.GONE
                textacctype3.visibility = View.GONE
                textbranchless3.visibility = View.GONE
                textassan3.visibility = View.GONE
                accnumber3.visibility = View.GONE
                textaccnumber3.visibility = View.GONE
                bankname3.visibility = View.GONE
                textbankname3.visibility = View.GONE
                branchcode3.visibility = View.GONE
                textbranchcode3.visibility = View.GONE
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
        cnic4.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name4.visibility = View.VISIBLE
                textname4.visibility = View.VISIBLE
                age4.visibility = View.VISIBLE
                textage4.visibility = View.VISIBLE
                profession4.visibility = View.VISIBLE
                textprofession4.visibility = View.VISIBLE
                cnic4.visibility = View.VISIBLE
                textcnic4.visibility = View.VISIBLE
                gender4.visibility = View.VISIBLE
                textgender4.visibility = View.VISIBLE
                contact4.visibility = View.VISIBLE
                textcontact4.visibility = View.VISIBLE
                address4.visibility = View.VISIBLE
                textaddress4.visibility = View.VISIBLE
                hasaccountalready4.visibility = View.VISIBLE
                texthasaccalready4.visibility = View.VISIBLE
                accountopened4.visibility = View.VISIBLE
                textaccountopened4.visibility = View.VISIBLE
                accountopened4.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened4.isChecked) {
                        selectedaccountopened4 = "Y"
                        selectedacctype4 = findViewById(textbranchless4.id)
                        acctype4.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype4.checkedRadioButtonId
                            selectedacctype4 = findViewById<RadioButton>(id)
                        })
                        acctype4.visibility = View.VISIBLE;
                        textacctype4.visibility = View.VISIBLE
                        textbranchless4.visibility = View.VISIBLE
                        textassan4.visibility = View.VISIBLE
                        accnumber4.visibility = View.VISIBLE;
                        textaccnumber4.visibility = View.VISIBLE
                        bankname4.visibility = View.VISIBLE
                        textbankname4.visibility = View.VISIBLE
                        branchcode4.visibility = View.VISIBLE
                        textbranchcode4.visibility = View.VISIBLE
                    } else {
                        acctype4.clearCheck()
                        selectedaccountopened4 = "N"
                        acctype4.visibility = View.GONE;
                        textacctype4.visibility = View.GONE
                        textbranchless4.visibility = View.GONE
                        textassan4.visibility = View.GONE
                        accnumber4.visibility = View.GONE;
                        textaccnumber4.visibility = View.GONE
                        bankname4.visibility = View.GONE
                        textbankname4.visibility = View.GONE
                        branchcode4.visibility = View.GONE
                        textbranchcode4.visibility = View.GONE
                    }
                }
            } else {
                name4.visibility = View.GONE
                textname4.visibility = View.GONE
                age4.visibility = View.GONE
                textage4.visibility = View.GONE
                profession4.visibility = View.GONE
                textprofession4.visibility = View.GONE
                cnic4.visibility = View.GONE
                textcnic4.visibility = View.GONE
                gender4.visibility = View.GONE
                textgender4.visibility = View.GONE
                contact4.visibility = View.GONE
                textcontact4.visibility = View.GONE
                address4.visibility = View.GONE
                textaddress4.visibility = View.GONE
                hasaccountalready4.visibility = View.GONE
                texthasaccalready4.visibility = View.GONE
                accountopened4.visibility = View.GONE
                textaccountopened4.visibility = View.GONE
                acctype4.visibility = View.GONE
                textacctype4.visibility = View.GONE
                textbranchless4.visibility = View.GONE
                textassan4.visibility = View.GONE
                accnumber4.visibility = View.GONE
                textaccnumber4.visibility = View.GONE
                bankname4.visibility = View.GONE
                textbankname4.visibility = View.GONE
                branchcode4.visibility = View.GONE
                textbranchcode4.visibility = View.GONE
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
        cnic5.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name5.visibility = View.VISIBLE
                textname5.visibility = View.VISIBLE
                age5.visibility = View.VISIBLE
                textage5.visibility = View.VISIBLE
                profession5.visibility = View.VISIBLE
                textprofession5.visibility = View.VISIBLE
                cnic5.visibility = View.VISIBLE
                textcnic5.visibility = View.VISIBLE
                gender5.visibility = View.VISIBLE
                textgender5.visibility = View.VISIBLE
                contact5.visibility = View.VISIBLE
                textcontact5.visibility = View.VISIBLE
                address5.visibility = View.VISIBLE
                textaddress5.visibility = View.VISIBLE
                hasaccountalready5.visibility = View.VISIBLE
                texthasaccalready5.visibility = View.VISIBLE
                accountopened5.visibility = View.VISIBLE
                textaccountopened5.visibility = View.VISIBLE
                accountopened5.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened5.isChecked) {
                        selectedaccountopened5 = "Y"
                        selectedacctype5 = findViewById(textbranchless5.id)
                        acctype5.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype5.checkedRadioButtonId
                            selectedacctype5 = findViewById<RadioButton>(id)
                        })
                        acctype5.visibility = View.VISIBLE;
                        textacctype5.visibility = View.VISIBLE
                        textbranchless5.visibility = View.VISIBLE
                        textassan5.visibility = View.VISIBLE
                        accnumber5.visibility = View.VISIBLE;
                        textaccnumber5.visibility = View.VISIBLE
                        bankname5.visibility = View.VISIBLE
                        textbankname5.visibility = View.VISIBLE
                        branchcode5.visibility = View.VISIBLE
                        textbranchcode5.visibility = View.VISIBLE
                    } else {
                        acctype5.clearCheck()
                        selectedaccountopened5 = "N"
                        acctype5.visibility = View.GONE;
                        textacctype5.visibility = View.GONE
                        textbranchless5.visibility = View.GONE
                        textassan5.visibility = View.GONE
                        accnumber5.visibility = View.GONE;
                        textaccnumber5.visibility = View.GONE
                        bankname5.visibility = View.GONE
                        textbankname5.visibility = View.GONE
                        branchcode5.visibility = View.GONE
                        textbranchcode5.visibility = View.GONE
                    }
                }
            } else {
                name5.visibility = View.GONE
                textname5.visibility = View.GONE
                age5.visibility = View.GONE
                textage5.visibility = View.GONE
                profession5.visibility = View.GONE
                textprofession5.visibility = View.GONE
                cnic5.visibility = View.GONE
                textcnic5.visibility = View.GONE
                gender5.visibility = View.GONE
                textgender5.visibility = View.GONE
                contact5.visibility = View.GONE
                textcontact5.visibility = View.GONE
                address5.visibility = View.GONE
                textaddress5.visibility = View.GONE
                hasaccountalready5.visibility = View.GONE
                texthasaccalready5.visibility = View.GONE
                accountopened5.visibility = View.GONE
                textaccountopened5.visibility = View.GONE
                acctype5.visibility = View.GONE
                textacctype5.visibility = View.GONE
                textbranchless5.visibility = View.GONE
                textassan5.visibility = View.GONE
                accnumber5.visibility = View.GONE
                textaccnumber5.visibility = View.GONE
                bankname5.visibility = View.GONE
                textbankname5.visibility = View.GONE
                branchcode5.visibility = View.GONE
                textbranchcode5.visibility = View.GONE
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
        cnic6.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name6.visibility = View.VISIBLE
                textname6.visibility = View.VISIBLE
                age6.visibility = View.VISIBLE
                textage6.visibility = View.VISIBLE
                profession6.visibility = View.VISIBLE
                textprofession6.visibility = View.VISIBLE
                cnic6.visibility = View.VISIBLE
                textcnic6.visibility = View.VISIBLE
                gender6.visibility = View.VISIBLE
                textgender6.visibility = View.VISIBLE
                contact6.visibility = View.VISIBLE
                textcontact6.visibility = View.VISIBLE
                address6.visibility = View.VISIBLE
                textaddress6.visibility = View.VISIBLE
                hasaccountalready6.visibility = View.VISIBLE
                texthasaccalready6.visibility = View.VISIBLE
                accountopened6.visibility = View.VISIBLE
                textaccountopened6.visibility = View.VISIBLE
                accountopened6.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened6.isChecked) {
                        selectedaccountopened6 = "Y"
                        selectedacctype6 = findViewById(textbranchless6.id)
                        acctype6.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype6.checkedRadioButtonId
                            selectedacctype6 = findViewById<RadioButton>(id)
                        })
                        acctype6.visibility = View.VISIBLE;
                        textacctype6.visibility = View.VISIBLE
                        textbranchless6.visibility = View.VISIBLE
                        textassan6.visibility = View.VISIBLE
                        accnumber6.visibility = View.VISIBLE;
                        textaccnumber6.visibility = View.VISIBLE
                        bankname6.visibility = View.VISIBLE
                        textbankname6.visibility = View.VISIBLE
                        branchcode6.visibility = View.VISIBLE
                        textbranchcode6.visibility = View.VISIBLE
                    } else {
                        acctype6.clearCheck()
                        selectedaccountopened6 = "N"
                        acctype6.visibility = View.GONE;
                        textacctype6.visibility = View.GONE
                        textbranchless6.visibility = View.GONE
                        textassan6.visibility = View.GONE
                        accnumber6.visibility = View.GONE;
                        textaccnumber6.visibility = View.GONE
                        bankname6.visibility = View.GONE
                        textbankname6.visibility = View.GONE
                        branchcode6.visibility = View.GONE
                        textbranchcode6.visibility = View.GONE
                    }
                }
            } else {
                name6.visibility = View.GONE
                textname6.visibility = View.GONE
                age6.visibility = View.GONE
                textage6.visibility = View.GONE
                profession6.visibility = View.GONE
                textprofession6.visibility = View.GONE
                cnic6.visibility = View.GONE
                textcnic6.visibility = View.GONE
                gender6.visibility = View.GONE
                textgender6.visibility = View.GONE
                contact6.visibility = View.GONE
                textcontact6.visibility = View.GONE
                address6.visibility = View.GONE
                textaddress6.visibility = View.GONE
                hasaccountalready6.visibility = View.GONE
                texthasaccalready6.visibility = View.GONE
                accountopened6.visibility = View.GONE
                textaccountopened6.visibility = View.GONE
                acctype6.visibility = View.GONE
                textacctype6.visibility = View.GONE
                textbranchless6.visibility = View.GONE
                textassan6.visibility = View.GONE
                accnumber6.visibility = View.GONE
                textaccnumber6.visibility = View.GONE
                bankname6.visibility = View.GONE
                textbankname6.visibility = View.GONE
                branchcode6.visibility = View.GONE
                textbranchcode6.visibility = View.GONE
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
        cnic7.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name7.visibility = View.VISIBLE
                textname7.visibility = View.VISIBLE
                age7.visibility = View.VISIBLE
                textage7.visibility = View.VISIBLE
                profession7.visibility = View.VISIBLE
                textprofession7.visibility = View.VISIBLE
                cnic7.visibility = View.VISIBLE
                textcnic7.visibility = View.VISIBLE
                gender7.visibility = View.VISIBLE
                textgender7.visibility = View.VISIBLE
                contact7.visibility = View.VISIBLE
                textcontact7.visibility = View.VISIBLE
                address7.visibility = View.VISIBLE
                textaddress7.visibility = View.VISIBLE
                hasaccountalready7.visibility = View.VISIBLE
                texthasaccalready7.visibility = View.VISIBLE
                accountopened7.visibility = View.VISIBLE
                textaccountopened7.visibility = View.VISIBLE
                accountopened7.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened7.isChecked) {
                        selectedaccountopened7 = "Y"
                        selectedacctype7 = findViewById(textbranchless6.id)
                        acctype7.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype7.checkedRadioButtonId
                            selectedacctype7 = findViewById<RadioButton>(id)
                        })
                        acctype7.visibility = View.VISIBLE;
                        textacctype7.visibility = View.VISIBLE
                        textbranchless7.visibility = View.VISIBLE
                        textassan7.visibility = View.VISIBLE
                        accnumber7.visibility = View.VISIBLE;
                        textaccnumber7.visibility = View.VISIBLE
                        bankname7.visibility = View.VISIBLE
                        textbankname7.visibility = View.VISIBLE
                        branchcode7.visibility = View.VISIBLE
                        textbranchcode7.visibility = View.VISIBLE
                    } else {
                        acctype7.clearCheck()
                        selectedaccountopened7 = "N"
                        acctype7.visibility = View.GONE;
                        textacctype7.visibility = View.GONE
                        textbranchless7.visibility = View.GONE
                        textassan7.visibility = View.GONE
                        accnumber7.visibility = View.GONE;
                        textaccnumber7.visibility = View.GONE
                        bankname7.visibility = View.GONE
                        textbankname7.visibility = View.GONE
                        branchcode7.visibility = View.GONE
                        textbranchcode7.visibility = View.GONE
                    }
                }
            } else {
                name7.visibility = View.GONE
                textname7.visibility = View.GONE
                age7.visibility = View.GONE
                textage7.visibility = View.GONE
                profession7.visibility = View.GONE
                textprofession7.visibility = View.GONE
                cnic7.visibility = View.GONE
                textcnic7.visibility = View.GONE
                gender7.visibility = View.GONE
                textgender7.visibility = View.GONE
                contact7.visibility = View.GONE
                textcontact7.visibility = View.GONE
                address7.visibility = View.GONE
                textaddress7.visibility = View.GONE
                hasaccountalready7.visibility = View.GONE
                texthasaccalready7.visibility = View.GONE
                accountopened7.visibility = View.GONE
                textaccountopened7.visibility = View.GONE
                acctype7.visibility = View.GONE
                textacctype7.visibility = View.GONE
                textbranchless7.visibility = View.GONE
                textassan7.visibility = View.GONE
                accnumber7.visibility = View.GONE
                textaccnumber7.visibility = View.GONE
                bankname7.visibility = View.GONE
                textbankname7.visibility = View.GONE
                branchcode7.visibility = View.GONE
                textbranchcode7.visibility = View.GONE
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
        cnic8.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name8.visibility = View.VISIBLE
                textname8.visibility = View.VISIBLE
                age8.visibility = View.VISIBLE
                textage8.visibility = View.VISIBLE
                profession8.visibility = View.VISIBLE
                textprofession8.visibility = View.VISIBLE
                cnic8.visibility = View.VISIBLE
                textcnic8.visibility = View.VISIBLE
                gender8.visibility = View.VISIBLE
                textgender8.visibility = View.VISIBLE
                contact8.visibility = View.VISIBLE
                textcontact8.visibility = View.VISIBLE
                address8.visibility = View.VISIBLE
                textaddress8.visibility = View.VISIBLE
                hasaccountalready8.visibility = View.VISIBLE
                texthasaccalready8.visibility = View.VISIBLE
                accountopened8.visibility = View.VISIBLE
                textaccountopened8.visibility = View.VISIBLE
                accountopened8.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened8.isChecked) {
                        selectedaccountopened8 = "Y"
                        selectedacctype8 = findViewById(textbranchless8.id)
                        acctype8.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype8.checkedRadioButtonId
                            selectedacctype8 = findViewById<RadioButton>(id)
                        })
                        acctype8.visibility = View.VISIBLE;
                        textacctype8.visibility = View.VISIBLE
                        textbranchless8.visibility = View.VISIBLE
                        textassan8.visibility = View.VISIBLE
                        accnumber8.visibility = View.VISIBLE;
                        textaccnumber8.visibility = View.VISIBLE
                        bankname8.visibility = View.VISIBLE
                        textbankname8.visibility = View.VISIBLE
                        branchcode8.visibility = View.VISIBLE
                        textbranchcode8.visibility = View.VISIBLE
                    } else {
                        acctype8.clearCheck()
                        selectedaccountopened8 = "N"
                        acctype8.visibility = View.GONE;
                        textacctype8.visibility = View.GONE
                        textbranchless8.visibility = View.GONE
                        textassan8.visibility = View.GONE
                        accnumber8.visibility = View.GONE;
                        textaccnumber8.visibility = View.GONE
                        bankname8.visibility = View.GONE
                        textbankname8.visibility = View.GONE
                        branchcode8.visibility = View.GONE
                        textbranchcode8.visibility = View.GONE
                    }
                }
            } else {
                name8.visibility = View.GONE
                textname8.visibility = View.GONE
                age8.visibility = View.GONE
                textage8.visibility = View.GONE
                profession8.visibility = View.GONE
                textprofession8.visibility = View.GONE
                cnic8.visibility = View.GONE
                textcnic8.visibility = View.GONE
                gender8.visibility = View.GONE
                textgender8.visibility = View.GONE
                contact8.visibility = View.GONE
                textcontact8.visibility = View.GONE
                address8.visibility = View.GONE
                textaddress8.visibility = View.GONE
                hasaccountalready8.visibility = View.GONE
                texthasaccalready8.visibility = View.GONE
                accountopened8.visibility = View.GONE
                textaccountopened8.visibility = View.GONE
                acctype8.visibility = View.GONE
                textacctype8.visibility = View.GONE
                textbranchless8.visibility = View.GONE
                textassan8.visibility = View.GONE
                accnumber8.visibility = View.GONE
                textaccnumber8.visibility = View.GONE
                bankname8.visibility = View.GONE
                textbankname8.visibility = View.GONE
                branchcode8.visibility = View.GONE
                textbranchcode8.visibility = View.GONE
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
        cnic9.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name9.visibility = View.VISIBLE
                textname9.visibility = View.VISIBLE
                age9.visibility = View.VISIBLE
                textage9.visibility = View.VISIBLE
                profession9.visibility = View.VISIBLE
                textprofession9.visibility = View.VISIBLE
                cnic9.visibility = View.VISIBLE
                textcnic9.visibility = View.VISIBLE
                gender9.visibility = View.VISIBLE
                textgender9.visibility = View.VISIBLE
                contact9.visibility = View.VISIBLE
                textcontact9.visibility = View.VISIBLE
                address9.visibility = View.VISIBLE
                textaddress9.visibility = View.VISIBLE
                hasaccountalready9.visibility = View.VISIBLE
                texthasaccalready9.visibility = View.VISIBLE
                accountopened9.visibility = View.VISIBLE
                textaccountopened9.visibility = View.VISIBLE
                accountopened9.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened9.isChecked) {
                        selectedaccountopened9 = "Y"
                        selectedacctype9 = findViewById(textbranchless9.id)
                        acctype9.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype9.checkedRadioButtonId
                            selectedacctype9 = findViewById<RadioButton>(id)
                        })
                        acctype9.visibility = View.VISIBLE;
                        textacctype9.visibility = View.VISIBLE
                        textbranchless9.visibility = View.VISIBLE
                        textassan9.visibility = View.VISIBLE
                        accnumber9.visibility = View.VISIBLE;
                        textaccnumber9.visibility = View.VISIBLE
                        bankname9.visibility = View.VISIBLE
                        textbankname9.visibility = View.VISIBLE
                        branchcode9.visibility = View.VISIBLE
                        textbranchcode9.visibility = View.VISIBLE
                    } else {
                        acctype9.clearCheck()
                        selectedaccountopened9 = "N"
                        acctype9.visibility = View.GONE;
                        textacctype9.visibility = View.GONE
                        textbranchless9.visibility = View.GONE
                        textassan9.visibility = View.GONE
                        accnumber9.visibility = View.GONE;
                        textaccnumber9.visibility = View.GONE
                        bankname9.visibility = View.GONE
                        textbankname9.visibility = View.GONE
                        branchcode9.visibility = View.GONE
                        textbranchcode9.visibility = View.GONE
                    }
                }
            } else {
                name9.visibility = View.GONE
                textname9.visibility = View.GONE
                age9.visibility = View.GONE
                textage9.visibility = View.GONE
                profession9.visibility = View.GONE
                textprofession9.visibility = View.GONE
                cnic9.visibility = View.GONE
                textcnic9.visibility = View.GONE
                gender9.visibility = View.GONE
                textgender9.visibility = View.GONE
                contact9.visibility = View.GONE
                textcontact9.visibility = View.GONE
                address9.visibility = View.GONE
                textaddress9.visibility = View.GONE
                hasaccountalready9.visibility = View.GONE
                texthasaccalready9.visibility = View.GONE
                accountopened9.visibility = View.GONE
                textaccountopened9.visibility = View.GONE
                acctype9.visibility = View.GONE
                textacctype9.visibility = View.GONE
                textbranchless9.visibility = View.GONE
                textassan9.visibility = View.GONE
                accnumber9.visibility = View.GONE
                textaccnumber9.visibility = View.GONE
                bankname9.visibility = View.GONE
                textbankname9.visibility = View.GONE
                branchcode9.visibility = View.GONE
                textbranchcode9.visibility = View.GONE
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
        cnic10.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(13))
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
                name10.visibility = View.VISIBLE
                textname10.visibility = View.VISIBLE
                age10.visibility = View.VISIBLE
                textage10.visibility = View.VISIBLE
                profession10.visibility = View.VISIBLE
                textprofession10.visibility = View.VISIBLE
                cnic10.visibility = View.VISIBLE
                textcnic10.visibility = View.VISIBLE
                gender10.visibility = View.VISIBLE
                textgender10.visibility = View.VISIBLE
                contact10.visibility = View.VISIBLE
                textcontact10.visibility = View.VISIBLE
                address10.visibility = View.VISIBLE
                textaddress10.visibility = View.VISIBLE
                hasaccountalready10.visibility = View.VISIBLE
                texthasaccalready10.visibility = View.VISIBLE
                accountopened10.visibility = View.VISIBLE
                textaccountopened10.visibility = View.VISIBLE
                accountopened10.setOnCheckedChangeListener { compoundButton, b ->
                    if (accountopened10.isChecked) {
                        selectedaccountopened10 = "Y"
                        selectedacctype10 = findViewById(textbranchless10.id)
                        acctype10.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
                            val id = acctype10.checkedRadioButtonId
                            selectedacctype10 = findViewById<RadioButton>(id)
                        })
                        acctype10.visibility = View.VISIBLE;
                        textacctype10.visibility = View.VISIBLE
                        textbranchless10.visibility = View.VISIBLE
                        textassan10.visibility = View.VISIBLE
                        accnumber10.visibility = View.VISIBLE;
                        textaccnumber10.visibility = View.VISIBLE
                        bankname10.visibility = View.VISIBLE
                        textbankname10.visibility = View.VISIBLE
                        branchcode10.visibility = View.VISIBLE
                        textbranchcode10.visibility = View.VISIBLE
                    } else {
                        acctype10.clearCheck()
                        selectedaccountopened10 = "N"
                        acctype10.visibility = View.GONE;
                        textacctype10.visibility = View.GONE
                        textbranchless10.visibility = View.GONE
                        textassan10.visibility = View.GONE
                        accnumber10.visibility = View.GONE;
                        textaccnumber10.visibility = View.GONE
                        bankname10.visibility = View.GONE
                        textbankname10.visibility = View.GONE
                        branchcode10.visibility = View.GONE
                        textbranchcode10.visibility = View.GONE
                    }
                }
            } else {
                name10.visibility = View.GONE
                textname10.visibility = View.GONE
                age10.visibility = View.GONE
                textage10.visibility = View.GONE
                profession10.visibility = View.GONE
                textprofession10.visibility = View.GONE
                cnic10.visibility = View.GONE
                textcnic10.visibility = View.GONE
                gender10.visibility = View.GONE
                textgender10.visibility = View.GONE
                contact10.visibility = View.GONE
                textcontact10.visibility = View.GONE
                address10.visibility = View.GONE
                textaddress10.visibility = View.GONE
                hasaccountalready10.visibility = View.GONE
                texthasaccalready10.visibility = View.GONE
                accountopened10.visibility = View.GONE
                textaccountopened10.visibility = View.GONE
                acctype10.visibility = View.GONE
                textacctype10.visibility = View.GONE
                textbranchless10.visibility = View.GONE
                textassan10.visibility = View.GONE
                accnumber10.visibility = View.GONE
                textaccnumber10.visibility = View.GONE
                bankname10.visibility = View.GONE
                textbankname10.visibility = View.GONE
                branchcode10.visibility = View.GONE
                textbranchcode10.visibility = View.GONE
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
            selectedhasaccountalready = if (hasaccountalready1.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened1 = if (accountopened1.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank1 = if (accountopened1.isChecked) {
                tempselectedbank1
            } else {
                "N/A"
            }
            selectedaccnumber1 = if (accountopened1.isChecked) {
                accnumber1.text.toString()
            } else {
                "N/A"
            }
            selectedbranch1 = if (accountopened1.isChecked) {
                branchcode1.text.toString()
            } else {
                "N/A"
            }

            // ---- For Participant 2 ------ //

            selectedname2 = name2.text.toString()
            selectedprofession2 = profession2.text.toString()
            selectedcontact2 = contact2.text.toString()
            selectedcnic2 = cnic2.text.toString()
            selectedgender2 = gender2.text.toString()
            selectedaddress2 = address2.text.toString()
            selectedhasaccountalready2 = if (hasaccountalready2.isChecked) {
                "Y"
            } else {
                "N"
            }
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
            selectedhasaccountalready10 = if (hasaccountalready10.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedaccountopened10 = if (accountopened10.isChecked) {
                "Y"
            } else {
                "N"
            }
            selectedbank10 = if (accountopened10.isChecked) {
                tempselectedbank10
            } else {
                "N/A"
            }
            selectedaccnumber10 = if (accountopened10.isChecked) {
                accnumber10.text.toString()
            } else {
                "N/A"
            }
            selectedbranch10 = if (accountopened10.isChecked) {
                branchcode10.text.toString()
            } else {
                "N/A"
            }

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

            if (size1 != 13) {
                cnic1.error = "Invalid CNIC"
                cnic1.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 1", Toast.LENGTH_LONG).show()
            } else if (accountopened1.isChecked && accnumber1.text.toString().isEmpty()) {
                accnumber1.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 1", Toast.LENGTH_LONG)
                    .show()
            } else if (accountopened1.isChecked && branchcode1.text.toString().isEmpty()) {
                accnumber1.error = "Mandatory Field"
                Toast.makeText(
                    this,
                    "Branch Code Of Bank Required Of Participant 1",
                    Toast.LENGTH_LONG
                ).show()
            } else if (size2 != 13) {
                cnic2.error = "Invalid CNIC"
                cnic2.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 2", Toast.LENGTH_LONG).show()
            } else if (accountopened2.isChecked && accnumber2.text.toString().isEmpty()) {
                accnumber2.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 2", Toast.LENGTH_LONG)
                    .show()
            } else if (accountopened2.isChecked && branchcode2.text.toString().isEmpty()) {
                accnumber2.error = "Mandatory Field"
                Toast.makeText(
                    this,
                    "Branch Code Of Bank Required Of Participant 2",
                    Toast.LENGTH_LONG
                ).show()
            } else if (size3 != 13) {
                cnic3.error = "Invalid CNIC"
                cnic3.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 3", Toast.LENGTH_LONG).show()
            } else if (accountopened3.isChecked && accnumber3.text.toString().isEmpty()) {
                accnumber3.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 3", Toast.LENGTH_LONG)
                    .show()
            } else if (accountopened3.isChecked && branchcode3.text.toString().isEmpty()) {
                accnumber3.error = "Mandatory Field"
                Toast.makeText(
                    this,
                    "Branch Code Of Bank Required Of Participant 3",
                    Toast.LENGTH_LONG
                ).show()
            } else if (size4 != 13) {
                cnic4.error = "Invalid CNIC"
                cnic4.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 4", Toast.LENGTH_LONG).show()
            } else if (accountopened4.isChecked && accnumber4.text.toString().isEmpty()) {
                accnumber4.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 4", Toast.LENGTH_LONG)
                    .show()
            } else if (accountopened4.isChecked && branchcode4.text.toString().isEmpty()) {
                accnumber4.error = "Mandatory Field"
                Toast.makeText(
                    this,
                    "Branch Code Of Bank Required Of Participant 4",
                    Toast.LENGTH_LONG
                ).show()
            } else if (size5 != 13) {
                cnic5.error = "Invalid CNIC"
                cnic5.requestFocus()
                Toast.makeText(this, "Invalid CNIC of Participant 5", Toast.LENGTH_LONG).show()
            } else if (accountopened5.isChecked && accnumber5.text.toString().isEmpty()) {
                accnumber5.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 5", Toast.LENGTH_LONG)
                    .show()
            } else if (accountopened5.isChecked && branchcode5.text.toString().isEmpty()) {
                accnumber5.error = "Mandatory Field"
                Toast.makeText(
                    this,
                    "Branch Code Of Bank Required Of Participant 5",
                    Toast.LENGTH_LONG
                ).show()
            }
            else if (participantsNumbers == "25") {
                val row1: Row = sheet2.createRow(21)
                val row1cell1: Cell = row1.createCell(0)
                row1cell1.setCellValue("21")
                row1cell1.cellStyle = style2
                val row1cell2: Cell = row1.createCell(1)
                row1cell2.setCellValue(selectedname1)
                row1cell2.cellStyle = style2
                val row1cell3: Cell = row1.createCell(2)
                row1cell3.setCellValue(selectedgender1)
                row1cell3.cellStyle = style2
                val row1cell4: Cell = row1.createCell(3)
                row1cell4.setCellValue(selectedage1)
                row1cell4.cellStyle = style2
                val row1cell5: Cell = row1.createCell(4)
                row1cell5.setCellValue(selectedprofession1)
                row1cell5.cellStyle = style2
                val row1cell6: Cell = row1.createCell(5)
                row1cell6.setCellValue(selectedcnic1)
                row1cell6.cellStyle = style2
                val row1cell7: Cell = row1.createCell(6)
                row1cell7.setCellValue(selectedcontact1)
                row1cell7.cellStyle = style2
                val row1cell8: Cell = row1.createCell(7)
                row1cell8.setCellValue(selectedaddress1)
                row1cell8.cellStyle = style2
                val row1cell9: Cell = row1.createCell(8)
                row1cell9.setCellValue(selectedhasaccountalready)
                row1cell9.cellStyle = style2
                val row1cell10: Cell = row1.createCell(9)
                row1cell10.setCellValue(selectedaccountopened1)
                row1cell10.cellStyle = style2
                val row1cell11: Cell = row1.createCell(10)
                row1cell11.setCellValue(selectedacctype1?.text.toString())
                row1cell11.cellStyle = style2
                val row1cell12: Cell = row1.createCell(11)
                row1cell12.setCellValue(selectedaccnumber1)
                row1cell12.cellStyle = style2
                val row1cell13: Cell = row1.createCell(12)
                row1cell13.setCellValue(selectedbank1)
                row1cell13.cellStyle = style2
                val row1cell14: Cell = row1.createCell(13)
                row1cell14.setCellValue(selectedbranch1)
                row1cell14.cellStyle = style2

                // --- Add second participant detail to Spreadsheet ----- //

                val row3: Row = sheet2.createRow(22)
                val row3cell1: Cell = row3.createCell(0)
                row3cell1.setCellValue("22")
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

                val row4: Row = sheet2.createRow(23)
                val row4cell1: Cell = row4.createCell(0)
                row4cell1.setCellValue("23")
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

                val row5: Row = sheet2.createRow(24)
                val row5cell1: Cell = row5.createCell(0)
                row5cell1.setCellValue("24")
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

                val row6: Row = sheet2.createRow(25)
                val row6cell1: Cell = row6.createCell(0)
                row6cell1.setCellValue("25")
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
                val fileOut = FileOutputStream(filename)
                workbook.write(fileOut)
                fileOut.close()
                workbook.close()
                val intent = Intent(this@participants_area_second, thankyou::class.java)
                intent.putExtra("filename", filename)
                intent.putExtra("participantsNumbers", participantsNumbers)
                startActivity(intent)
            } else if (participantsNumbers == "26"){
                val row1: Row = sheet2.createRow(21)
                val row1cell1: Cell = row1.createCell(0)
                row1cell1.setCellValue("21")
                row1cell1.cellStyle = style2
                val row1cell2: Cell = row1.createCell(1)
                row1cell2.setCellValue(selectedname1)
                row1cell2.cellStyle = style2
                val row1cell3: Cell = row1.createCell(2)
                row1cell3.setCellValue(selectedgender1)
                row1cell3.cellStyle = style2
                val row1cell4: Cell = row1.createCell(3)
                row1cell4.setCellValue(selectedage1)
                row1cell4.cellStyle = style2
                val row1cell5: Cell = row1.createCell(4)
                row1cell5.setCellValue(selectedprofession1)
                row1cell5.cellStyle = style2
                val row1cell6: Cell = row1.createCell(5)
                row1cell6.setCellValue(selectedcnic1)
                row1cell6.cellStyle = style2
                val row1cell7: Cell = row1.createCell(6)
                row1cell7.setCellValue(selectedcontact1)
                row1cell7.cellStyle = style2
                val row1cell8: Cell = row1.createCell(7)
                row1cell8.setCellValue(selectedaddress1)
                row1cell8.cellStyle = style2
                val row1cell9: Cell = row1.createCell(8)
                row1cell9.setCellValue(selectedhasaccountalready)
                row1cell9.cellStyle = style2
                val row1cell10: Cell = row1.createCell(9)
                row1cell10.setCellValue(selectedaccountopened1)
                row1cell10.cellStyle = style2
                val row1cell11: Cell = row1.createCell(10)
                row1cell11.setCellValue(selectedacctype1?.text.toString())
                row1cell11.cellStyle = style2
                val row1cell12: Cell = row1.createCell(11)
                row1cell12.setCellValue(selectedaccnumber1)
                row1cell12.cellStyle = style2
                val row1cell13: Cell = row1.createCell(12)
                row1cell13.setCellValue(selectedbank1)
                row1cell13.cellStyle = style2
                val row1cell14: Cell = row1.createCell(13)
                row1cell14.setCellValue(selectedbranch1)
                row1cell14.cellStyle = style2

                // --- Add second participant detail to Spreadsheet ----- //

                val row3: Row = sheet2.createRow(22)
                val row3cell1: Cell = row3.createCell(0)
                row3cell1.setCellValue("22")
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

                val row4: Row = sheet2.createRow(23)
                val row4cell1: Cell = row4.createCell(0)
                row4cell1.setCellValue("23")
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

                val row5: Row = sheet2.createRow(24)
                val row5cell1: Cell = row5.createCell(0)
                row5cell1.setCellValue("24")
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

                val row6: Row = sheet2.createRow(25)
                val row6cell1: Cell = row6.createCell(0)
                row6cell1.setCellValue("25")
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

                val ed6: String = cnic6.text.toString()
                val size6 = ed6.length
                if (size6 != 13 ) {
                    cnic6.error = "Invalid CNIC"
                    cnic6.requestFocus()
                     Toast.makeText(this, "Invalid CNIC of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && accnumber6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && branchcode6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else{
                    val row7: Row = sheet2.createRow(26)
                    val row7cell1: Cell = row7.createCell(0)
                    row7cell1.setCellValue("26")
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

                    val fileOut = FileOutputStream(filename)
                    workbook.write(fileOut)
                    fileOut.close()
                    workbook.close()
                    val intent = Intent(this@participants_area_second, thankyou::class.java)
                    intent.putExtra("filename", filename)
                    intent.putExtra("participantsNumbers",participantsNumbers)
                    startActivity(intent)
                }
            }else if (participantsNumbers == "27"){
                val row1: Row = sheet2.createRow(21)
                val row1cell1: Cell = row1.createCell(0)
                row1cell1.setCellValue("21")
                row1cell1.cellStyle = style2
                val row1cell2: Cell = row1.createCell(1)
                row1cell2.setCellValue(selectedname1)
                row1cell2.cellStyle = style2
                val row1cell3: Cell = row1.createCell(2)
                row1cell3.setCellValue(selectedgender1)
                row1cell3.cellStyle = style2
                val row1cell4: Cell = row1.createCell(3)
                row1cell4.setCellValue(selectedage1)
                row1cell4.cellStyle = style2
                val row1cell5: Cell = row1.createCell(4)
                row1cell5.setCellValue(selectedprofession1)
                row1cell5.cellStyle = style2
                val row1cell6: Cell = row1.createCell(5)
                row1cell6.setCellValue(selectedcnic1)
                row1cell6.cellStyle = style2
                val row1cell7: Cell = row1.createCell(6)
                row1cell7.setCellValue(selectedcontact1)
                row1cell7.cellStyle = style2
                val row1cell8: Cell = row1.createCell(7)
                row1cell8.setCellValue(selectedaddress1)
                row1cell8.cellStyle = style2
                val row1cell9: Cell = row1.createCell(8)
                row1cell9.setCellValue(selectedhasaccountalready)
                row1cell9.cellStyle = style2
                val row1cell10: Cell = row1.createCell(9)
                row1cell10.setCellValue(selectedaccountopened1)
                row1cell10.cellStyle = style2
                val row1cell11: Cell = row1.createCell(10)
                row1cell11.setCellValue(selectedacctype1?.text.toString())
                row1cell11.cellStyle = style2
                val row1cell12: Cell = row1.createCell(11)
                row1cell12.setCellValue(selectedaccnumber1)
                row1cell12.cellStyle = style2
                val row1cell13: Cell = row1.createCell(12)
                row1cell13.setCellValue(selectedbank1)
                row1cell13.cellStyle = style2
                val row1cell14: Cell = row1.createCell(13)
                row1cell14.setCellValue(selectedbranch1)
                row1cell14.cellStyle = style2

                // --- Add second participant detail to Spreadsheet ----- //

                val row3: Row = sheet2.createRow(22)
                val row3cell1: Cell = row3.createCell(0)
                row3cell1.setCellValue("22")
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

                val row4: Row = sheet2.createRow(23)
                val row4cell1: Cell = row4.createCell(0)
                row4cell1.setCellValue("23")
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

                val row5: Row = sheet2.createRow(24)
                val row5cell1: Cell = row5.createCell(0)
                row5cell1.setCellValue("24")
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

                val row6: Row = sheet2.createRow(25)
                val row6cell1: Cell = row6.createCell(0)
                row6cell1.setCellValue("25")
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

                val ed6: String = cnic6.text.toString()
                val size6 = ed6.length
                val ed7: String = cnic7.text.toString()
                val size7 = ed7.length
                if (size6 != 13 ) {
                    cnic6.error = "Invalid CNIC"
                    cnic6.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && accnumber6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && branchcode6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (size7 != 13 ) {
                    cnic7.error = "Invalid CNIC"
                    cnic7.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && accnumber7.text.toString().isEmpty() ){
                accnumber7.error = "Mandatory Field"
                Toast.makeText(this, "Account Number Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && branchcode7.text.toString().isEmpty() ){
                accnumber7.error = "Mandatory Field"
                Toast.makeText(this, "Branch Code Of Bank Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else {
                    val row7: Row = sheet2.createRow(26)
                    val row7cell1: Cell = row7.createCell(0)
                    row7cell1.setCellValue("26")
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

                    val row8: Row = sheet2.createRow(27)
                    val row8cell1: Cell = row8.createCell(0)
                    row8cell1.setCellValue("27")
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

                    val fileOut = FileOutputStream(filename)
                    workbook.write(fileOut)
                    fileOut.close()
                    workbook.close()
                    val intent = Intent(this@participants_area_second, thankyou::class.java)
                    intent.putExtra("filename", filename)
                    intent.putExtra("participantsNumbers", participantsNumbers)
                    startActivity(intent)
                }
            }else if (participantsNumbers == "28"){
                val row1: Row = sheet2.createRow(21)
                val row1cell1: Cell = row1.createCell(0)
                row1cell1.setCellValue("21")
                row1cell1.cellStyle = style2
                val row1cell2: Cell = row1.createCell(1)
                row1cell2.setCellValue(selectedname1)
                row1cell2.cellStyle = style2
                val row1cell3: Cell = row1.createCell(2)
                row1cell3.setCellValue(selectedgender1)
                row1cell3.cellStyle = style2
                val row1cell4: Cell = row1.createCell(3)
                row1cell4.setCellValue(selectedage1)
                row1cell4.cellStyle = style2
                val row1cell5: Cell = row1.createCell(4)
                row1cell5.setCellValue(selectedprofession1)
                row1cell5.cellStyle = style2
                val row1cell6: Cell = row1.createCell(5)
                row1cell6.setCellValue(selectedcnic1)
                row1cell6.cellStyle = style2
                val row1cell7: Cell = row1.createCell(6)
                row1cell7.setCellValue(selectedcontact1)
                row1cell7.cellStyle = style2
                val row1cell8: Cell = row1.createCell(7)
                row1cell8.setCellValue(selectedaddress1)
                row1cell8.cellStyle = style2
                val row1cell9: Cell = row1.createCell(8)
                row1cell9.setCellValue(selectedhasaccountalready)
                row1cell9.cellStyle = style2
                val row1cell10: Cell = row1.createCell(9)
                row1cell10.setCellValue(selectedaccountopened1)
                row1cell10.cellStyle = style2
                val row1cell11: Cell = row1.createCell(10)
                row1cell11.setCellValue(selectedacctype1?.text.toString())
                row1cell11.cellStyle = style2
                val row1cell12: Cell = row1.createCell(11)
                row1cell12.setCellValue(selectedaccnumber1)
                row1cell12.cellStyle = style2
                val row1cell13: Cell = row1.createCell(12)
                row1cell13.setCellValue(selectedbank1)
                row1cell13.cellStyle = style2
                val row1cell14: Cell = row1.createCell(13)
                row1cell14.setCellValue(selectedbranch1)
                row1cell14.cellStyle = style2

                // --- Add second participant detail to Spreadsheet ----- //

                val row3: Row = sheet2.createRow(22)
                val row3cell1: Cell = row3.createCell(0)
                row3cell1.setCellValue("22")
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

                val row4: Row = sheet2.createRow(23)
                val row4cell1: Cell = row4.createCell(0)
                row4cell1.setCellValue("23")
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

                val row5: Row = sheet2.createRow(24)
                val row5cell1: Cell = row5.createCell(0)
                row5cell1.setCellValue("24")
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

                val row6: Row = sheet2.createRow(25)
                val row6cell1: Cell = row6.createCell(0)
                row6cell1.setCellValue("25")
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

                val ed6: String = cnic6.text.toString()
                val size6 = ed6.length
                val ed7: String = cnic7.text.toString()
                val size7 = ed7.length
                val ed8: String = cnic8.text.toString()
                val size8 = ed8.length
                if (size6 != 13 ) {
                    cnic6.error = "Invalid CNIC"
                    cnic6.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && accnumber6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && branchcode6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (size7 != 13 ) {
                    cnic7.error = "Invalid CNIC"
                    cnic7.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && accnumber7.text.toString().isEmpty() ){
                    accnumber7.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && branchcode7.text.toString().isEmpty() ){
                    accnumber7.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (size8 != 13 ) {
                    cnic8.error = "Invalid CNIC"
                    cnic8.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 8", Toast.LENGTH_LONG).show()
                }else if (accountopened8.isChecked && accnumber8.text.toString().isEmpty() ){
                    accnumber8.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 8", Toast.LENGTH_LONG).show()
                }else if (accountopened8.isChecked && branchcode8.text.toString().isEmpty() ){
                    accnumber8.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 8", Toast.LENGTH_LONG).show()
                }else {
                    val row7: Row = sheet2.createRow(26)
                    val row7cell1: Cell = row7.createCell(0)
                    row7cell1.setCellValue("26")
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

                    val row8: Row = sheet2.createRow(27)
                    val row8cell1: Cell = row8.createCell(0)
                    row8cell1.setCellValue("27")
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

                    val row9: Row = sheet2.createRow(28)
                    val row9cell1: Cell = row9.createCell(0)
                    row9cell1.setCellValue("28")
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


                    val fileOut = FileOutputStream(filename)
                    workbook.write(fileOut)
                    fileOut.close()
                    workbook.close()
                    val intent = Intent(this@participants_area_second, thankyou::class.java)
                    intent.putExtra("filename", filename)
                    intent.putExtra("participantsNumbers", participantsNumbers)
                    startActivity(intent)
                }
            }else if (participantsNumbers == "29"){
                val row1: Row = sheet2.createRow(21)
                val row1cell1: Cell = row1.createCell(0)
                row1cell1.setCellValue("21")
                row1cell1.cellStyle = style2
                val row1cell2: Cell = row1.createCell(1)
                row1cell2.setCellValue(selectedname1)
                row1cell2.cellStyle = style2
                val row1cell3: Cell = row1.createCell(2)
                row1cell3.setCellValue(selectedgender1)
                row1cell3.cellStyle = style2
                val row1cell4: Cell = row1.createCell(3)
                row1cell4.setCellValue(selectedage1)
                row1cell4.cellStyle = style2
                val row1cell5: Cell = row1.createCell(4)
                row1cell5.setCellValue(selectedprofession1)
                row1cell5.cellStyle = style2
                val row1cell6: Cell = row1.createCell(5)
                row1cell6.setCellValue(selectedcnic1)
                row1cell6.cellStyle = style2
                val row1cell7: Cell = row1.createCell(6)
                row1cell7.setCellValue(selectedcontact1)
                row1cell7.cellStyle = style2
                val row1cell8: Cell = row1.createCell(7)
                row1cell8.setCellValue(selectedaddress1)
                row1cell8.cellStyle = style2
                val row1cell9: Cell = row1.createCell(8)
                row1cell9.setCellValue(selectedhasaccountalready)
                row1cell9.cellStyle = style2
                val row1cell10: Cell = row1.createCell(9)
                row1cell10.setCellValue(selectedaccountopened1)
                row1cell10.cellStyle = style2
                val row1cell11: Cell = row1.createCell(10)
                row1cell11.setCellValue(selectedacctype1?.text.toString())
                row1cell11.cellStyle = style2
                val row1cell12: Cell = row1.createCell(11)
                row1cell12.setCellValue(selectedaccnumber1)
                row1cell12.cellStyle = style2
                val row1cell13: Cell = row1.createCell(12)
                row1cell13.setCellValue(selectedbank1)
                row1cell13.cellStyle = style2
                val row1cell14: Cell = row1.createCell(13)
                row1cell14.setCellValue(selectedbranch1)
                row1cell14.cellStyle = style2

                // --- Add second participant detail to Spreadsheet ----- //

                val row3: Row = sheet2.createRow(22)
                val row3cell1: Cell = row3.createCell(0)
                row3cell1.setCellValue("22")
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

                val row4: Row = sheet2.createRow(23)
                val row4cell1: Cell = row4.createCell(0)
                row4cell1.setCellValue("23")
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

                val row5: Row = sheet2.createRow(24)
                val row5cell1: Cell = row5.createCell(0)
                row5cell1.setCellValue("24")
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

                val row6: Row = sheet2.createRow(25)
                val row6cell1: Cell = row6.createCell(0)
                row6cell1.setCellValue("25")
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

                val ed6: String = cnic6.text.toString()
                val size6 = ed6.length
                val ed7: String = cnic7.text.toString()
                val size7 = ed7.length
                val ed8: String = cnic8.text.toString()
                val size8 = ed8.length
                val ed9: String = cnic9.text.toString()
                val size9 = ed9.length
                if (size6 != 13 ) {
                    cnic6.error = "Invalid CNIC"
                    cnic6.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && accnumber6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && branchcode6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (size7 != 13 ) {
                    cnic7.error = "Invalid CNIC"
                    cnic7.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && accnumber7.text.toString().isEmpty() ){
                    accnumber7.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && branchcode7.text.toString().isEmpty() ){
                    accnumber7.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (size8 != 13 ) {
                    cnic8.error = "Invalid CNIC"
                    cnic8.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 8", Toast.LENGTH_LONG).show()
                }else if (accountopened8.isChecked && accnumber8.text.toString().isEmpty() ){
                    accnumber8.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 8", Toast.LENGTH_LONG).show()
                }else if (accountopened8.isChecked && branchcode8.text.toString().isEmpty() ){
                    accnumber8.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 8", Toast.LENGTH_LONG).show()
                }else if (size9 != 13 ) {
                    cnic9.error = "Invalid CNIC"
                    cnic9.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 9", Toast.LENGTH_LONG).show()
                }else if (accountopened9.isChecked && accnumber9.text.toString().isEmpty() ){
                    accnumber9.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 9", Toast.LENGTH_LONG).show()
                }else if (accountopened9.isChecked && branchcode9.text.toString().isEmpty() ){
                    accnumber9.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 9", Toast.LENGTH_LONG).show()
                }else {
                    val row7: Row = sheet2.createRow(26)
                    val row7cell1: Cell = row7.createCell(0)
                    row7cell1.setCellValue("26")
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

                    val row8: Row = sheet2.createRow(27)
                    val row8cell1: Cell = row8.createCell(0)
                    row8cell1.setCellValue("27")
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

                    val row9: Row = sheet2.createRow(28)
                    val row9cell1: Cell = row9.createCell(0)
                    row9cell1.setCellValue("28")
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

                    val row10: Row = sheet2.createRow(29)
                    val row10cell1: Cell = row10.createCell(0)
                    row10cell1.setCellValue("29")
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

                    val fileOut = FileOutputStream(filename)
                    workbook.write(fileOut)
                    fileOut.close()
                    workbook.close()
                    val intent = Intent(this@participants_area_second, thankyou::class.java)
                    intent.putExtra("filename", filename)
                    intent.putExtra("participantsNumbers", participantsNumbers)
                    startActivity(intent)
                }
            }else if (participantsNumbers == "30"){
                val row1: Row = sheet2.createRow(21)
                val row1cell1: Cell = row1.createCell(0)
                row1cell1.setCellValue("21")
                row1cell1.cellStyle = style2
                val row1cell2: Cell = row1.createCell(1)
                row1cell2.setCellValue(selectedname1)
                row1cell2.cellStyle = style2
                val row1cell3: Cell = row1.createCell(2)
                row1cell3.setCellValue(selectedgender1)
                row1cell3.cellStyle = style2
                val row1cell4: Cell = row1.createCell(3)
                row1cell4.setCellValue(selectedage1)
                row1cell4.cellStyle = style2
                val row1cell5: Cell = row1.createCell(4)
                row1cell5.setCellValue(selectedprofession1)
                row1cell5.cellStyle = style2
                val row1cell6: Cell = row1.createCell(5)
                row1cell6.setCellValue(selectedcnic1)
                row1cell6.cellStyle = style2
                val row1cell7: Cell = row1.createCell(6)
                row1cell7.setCellValue(selectedcontact1)
                row1cell7.cellStyle = style2
                val row1cell8: Cell = row1.createCell(7)
                row1cell8.setCellValue(selectedaddress1)
                row1cell8.cellStyle = style2
                val row1cell9: Cell = row1.createCell(8)
                row1cell9.setCellValue(selectedhasaccountalready)
                row1cell9.cellStyle = style2
                val row1cell10: Cell = row1.createCell(9)
                row1cell10.setCellValue(selectedaccountopened1)
                row1cell10.cellStyle = style2
                val row1cell11: Cell = row1.createCell(10)
                row1cell11.setCellValue(selectedacctype1?.text.toString())
                row1cell11.cellStyle = style2
                val row1cell12: Cell = row1.createCell(11)
                row1cell12.setCellValue(selectedaccnumber1)
                row1cell12.cellStyle = style2
                val row1cell13: Cell = row1.createCell(12)
                row1cell13.setCellValue(selectedbank1)
                row1cell13.cellStyle = style2
                val row1cell14: Cell = row1.createCell(13)
                row1cell14.setCellValue(selectedbranch1)
                row1cell14.cellStyle = style2

                // --- Add second participant detail to Spreadsheet ----- //

                val row3: Row = sheet2.createRow(22)
                val row3cell1: Cell = row3.createCell(0)
                row3cell1.setCellValue("22")
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

                val row4: Row = sheet2.createRow(23)
                val row4cell1: Cell = row4.createCell(0)
                row4cell1.setCellValue("23")
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

                val row5: Row = sheet2.createRow(24)
                val row5cell1: Cell = row5.createCell(0)
                row5cell1.setCellValue("24")
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

                val row6: Row = sheet2.createRow(25)
                val row6cell1: Cell = row6.createCell(0)
                row6cell1.setCellValue("25")
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
                if (size6 != 13 ) {
                    cnic6.error = "Invalid CNIC"
                    cnic6.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && accnumber6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && branchcode6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (size7 != 13 ) {
                    cnic7.error = "Invalid CNIC"
                    cnic7.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && accnumber7.text.toString().isEmpty() ){
                    accnumber7.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && branchcode7.text.toString().isEmpty() ){
                    accnumber7.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (size8 != 13 ) {
                    cnic8.error = "Invalid CNIC"
                    cnic8.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 8", Toast.LENGTH_LONG).show()
                }else if (accountopened8.isChecked && accnumber8.text.toString().isEmpty() ){
                    accnumber8.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 8", Toast.LENGTH_LONG).show()
                }else if (accountopened8.isChecked && branchcode8.text.toString().isEmpty() ){
                    accnumber8.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 8", Toast.LENGTH_LONG).show()
                }else if (size9 != 13 ) {
                    cnic9.error = "Invalid CNIC"
                    cnic9.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 9", Toast.LENGTH_LONG).show()
                }else if (accountopened9.isChecked && accnumber9.text.toString().isEmpty() ){
                    accnumber9.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 9", Toast.LENGTH_LONG).show()
                }else if (accountopened9.isChecked && branchcode9.text.toString().isEmpty() ){
                    accnumber9.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 9", Toast.LENGTH_LONG).show()
                }else if (size10 != 13 ) {
                    cnic10.error = "Invalid CNIC"
                    cnic10.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 10", Toast.LENGTH_LONG).show()
                }else if (accountopened10.isChecked && accnumber10.text.toString().isEmpty() ){
                    accnumber10.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 10", Toast.LENGTH_LONG).show()
                }else if (accountopened10.isChecked && branchcode10.text.toString().isEmpty() ){
                    accnumber10.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 10", Toast.LENGTH_LONG).show()
                }else {
                    val row7: Row = sheet2.createRow(26)
                    val row7cell1: Cell = row7.createCell(0)
                    row7cell1.setCellValue("26")
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

                    val row8: Row = sheet2.createRow(27)
                    val row8cell1: Cell = row8.createCell(0)
                    row8cell1.setCellValue("27")
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

                    val row9: Row = sheet2.createRow(28)
                    val row9cell1: Cell = row9.createCell(0)
                    row9cell1.setCellValue("28")
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

                    val row10: Row = sheet2.createRow(29)
                    val row10cell1: Cell = row10.createCell(0)
                    row10cell1.setCellValue("29")
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

                    val row11: Row = sheet2.createRow(30)
                    val row11cell1: Cell = row11.createCell(0)
                    row11cell1.setCellValue("30")
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

                    val fileOut = FileOutputStream(filename)
                    workbook.write(fileOut)
                    fileOut.close()
                    workbook.close()
                    val intent = Intent(this@participants_area_second, thankyou::class.java)
                    intent.putExtra("filename", filename)
                    intent.putExtra("participantsNumbers", participantsNumbers)
                    startActivity(intent)
                }
            }else if (participantsNumbers == "31" || participantsNumbers == "32" || participantsNumbers == "33" || participantsNumbers == "34" || participantsNumbers == "35" || participantsNumbers == "36" || participantsNumbers == "37" || participantsNumbers == "38" || participantsNumbers == "39" || participantsNumbers == "40"){
                val row1: Row = sheet2.createRow(21)
                val row1cell1: Cell = row1.createCell(0)
                row1cell1.setCellValue("21")
                row1cell1.cellStyle = style2
                val row1cell2: Cell = row1.createCell(1)
                row1cell2.setCellValue(selectedname1)
                row1cell2.cellStyle = style2
                val row1cell3: Cell = row1.createCell(2)
                row1cell3.setCellValue(selectedgender1)
                row1cell3.cellStyle = style2
                val row1cell4: Cell = row1.createCell(3)
                row1cell4.setCellValue(selectedage1)
                row1cell4.cellStyle = style2
                val row1cell5: Cell = row1.createCell(4)
                row1cell5.setCellValue(selectedprofession1)
                row1cell5.cellStyle = style2
                val row1cell6: Cell = row1.createCell(5)
                row1cell6.setCellValue(selectedcnic1)
                row1cell6.cellStyle = style2
                val row1cell7: Cell = row1.createCell(6)
                row1cell7.setCellValue(selectedcontact1)
                row1cell7.cellStyle = style2
                val row1cell8: Cell = row1.createCell(7)
                row1cell8.setCellValue(selectedaddress1)
                row1cell8.cellStyle = style2
                val row1cell9: Cell = row1.createCell(8)
                row1cell9.setCellValue(selectedhasaccountalready)
                row1cell9.cellStyle = style2
                val row1cell10: Cell = row1.createCell(9)
                row1cell10.setCellValue(selectedaccountopened1)
                row1cell10.cellStyle = style2
                val row1cell11: Cell = row1.createCell(10)
                row1cell11.setCellValue(selectedacctype1?.text.toString())
                row1cell11.cellStyle = style2
                val row1cell12: Cell = row1.createCell(11)
                row1cell12.setCellValue(selectedaccnumber1)
                row1cell12.cellStyle = style2
                val row1cell13: Cell = row1.createCell(12)
                row1cell13.setCellValue(selectedbank1)
                row1cell13.cellStyle = style2
                val row1cell14: Cell = row1.createCell(13)
                row1cell14.setCellValue(selectedbranch1)
                row1cell14.cellStyle = style2

                // --- Add second participant detail to Spreadsheet ----- //

                val row3: Row = sheet2.createRow(22)
                val row3cell1: Cell = row3.createCell(0)
                row3cell1.setCellValue("22")
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

                val row4: Row = sheet2.createRow(23)
                val row4cell1: Cell = row4.createCell(0)
                row4cell1.setCellValue("23")
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

                val row5: Row = sheet2.createRow(24)
                val row5cell1: Cell = row5.createCell(0)
                row5cell1.setCellValue("24")
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

                val row6: Row = sheet2.createRow(25)
                val row6cell1: Cell = row6.createCell(0)
                row6cell1.setCellValue("25")
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
                if (size6 != 13 ) {
                    cnic6.error = "Invalid CNIC"
                    cnic6.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && accnumber6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (accountopened6.isChecked && branchcode6.text.toString().isEmpty() ){
                    accnumber6.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 6", Toast.LENGTH_LONG).show()
                }else if (size7 != 13 ) {
                    cnic7.error = "Invalid CNIC"
                    cnic7.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && accnumber7.text.toString().isEmpty() ){
                    accnumber7.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (accountopened7.isChecked && branchcode7.text.toString().isEmpty() ){
                    accnumber7.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 7", Toast.LENGTH_LONG).show()
                }else if (size8 != 13 ) {
                    cnic8.error = "Invalid CNIC"
                    cnic8.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 8", Toast.LENGTH_LONG).show()
                }else if (accountopened8.isChecked && accnumber8.text.toString().isEmpty() ){
                    accnumber8.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 8", Toast.LENGTH_LONG).show()
                }else if (accountopened8.isChecked && branchcode8.text.toString().isEmpty() ){
                    accnumber8.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 8", Toast.LENGTH_LONG).show()
                }else if (size9 != 13 ) {
                    cnic9.error = "Invalid CNIC"
                    cnic9.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 9", Toast.LENGTH_LONG).show()
                }else if (accountopened9.isChecked && accnumber9.text.toString().isEmpty() ){
                    accnumber9.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 9", Toast.LENGTH_LONG).show()
                }else if (accountopened9.isChecked && branchcode9.text.toString().isEmpty() ){
                    accnumber9.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 9", Toast.LENGTH_LONG).show()
                }else if (size10 != 13 ) {
                    cnic10.error = "Invalid CNIC"
                    cnic10.requestFocus()
                    Toast.makeText(this, "Invalid CNIC of Participant 10", Toast.LENGTH_LONG).show()
                }else if (accountopened10.isChecked && accnumber10.text.toString().isEmpty() ){
                    accnumber10.error = "Mandatory Field"
                    Toast.makeText(this, "Account Number Required Of Participant 10", Toast.LENGTH_LONG).show()
                }else if (accountopened10.isChecked && branchcode10.text.toString().isEmpty() ){
                    accnumber10.error = "Mandatory Field"
                    Toast.makeText(this, "Branch Code Of Bank Required Of Participant 10", Toast.LENGTH_LONG).show()
                }else {
                    val row7: Row = sheet2.createRow(26)
                    val row7cell1: Cell = row7.createCell(0)
                    row7cell1.setCellValue("26")
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

                    val row8: Row = sheet2.createRow(27)
                    val row8cell1: Cell = row8.createCell(0)
                    row8cell1.setCellValue("27")
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

                    val row9: Row = sheet2.createRow(28)
                    val row9cell1: Cell = row9.createCell(0)
                    row9cell1.setCellValue("28")
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

                    val row10: Row = sheet2.createRow(29)
                    val row10cell1: Cell = row10.createCell(0)
                    row10cell1.setCellValue("29")
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

                    val row11: Row = sheet2.createRow(30)
                    val row11cell1: Cell = row11.createCell(0)
                    row11cell1.setCellValue("30")
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

                    val fileOut = FileOutputStream(filename)
                    workbook.write(fileOut)
                    fileOut.close()
                    workbook.close()
                    val intent = Intent(this@participants_area_second, participants_area_third::class.java)
                    intent.putExtra("filename", filename)
                    intent.putExtra("participantsNumbers", participantsNumbers)
                    startActivity(intent)
                }
            }
        }
    }
}
