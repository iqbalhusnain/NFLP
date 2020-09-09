package com.example.attempt2

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.text.InputFilter
import android.text.InputFilter.LengthFilter
import android.text.InputType
import android.view.Gravity
import android.view.KeyEvent
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import org.w3c.dom.Text


class participants_area : AppCompatActivity() {


    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_participants_area)
        // function to limit the length of EditText

        fun EditText.setMaxLength(maxLength: Int) {
            filters = arrayOf(InputFilter.LengthFilter(maxLength))
        }

        @SuppressLint("ResourceType")
        fun part1(){
            val bankname = resources.getStringArray(R.array.bank_names)
            val rootView = findViewById<LinearLayout>(R.id.main_screen)
            val name1 = TextView(rootView.context)
            val inputName1 = EditText(rootView.context)
            val age1 = TextView(rootView.context)
            val inputage1 = EditText(rootView.context)
            val profession1 = TextView(rootView.context)
            val inputprofession1 = EditText(rootView.context)
            val cnic1 = TextView(rootView.context)
            val inputcnic1 = EditText(rootView.context)
            val gender1 = TextView(rootView.context)
            val inputgender1 = TextView(rootView.context)
            val contact1 = TextView(rootView.context)
            val inputcontact1 = EditText(rootView.context)
            val address1 = TextView(rootView.context)
            val inputaddress1 = EditText(rootView.context)
            val accalready1 = TextView(rootView.context)
            val inputaccalready1 = CheckBox(rootView.context)
            val accopen1 = TextView(rootView.context)
            val inputaccopen1 = CheckBox(rootView.context)
            val acctype1 = TextView(rootView.context)
            val inputacctype1_1 = RadioButton(rootView.context)
            val inputacctype1_2 = RadioButton(rootView.context)
            val inputacctype1 = RadioGroup(rootView.context)
            val accnumber1 = TextView(rootView.context)
            val inputaccnumber1 = EditText(rootView.context)
            val bankname1 = TextView(rootView.context)
            val inputbankname1 = Spinner(rootView.context)
            val branchcode1 = TextView(rootView.context)
            val inputbranchcode1 = EditText(rootView.context)
            val mySwitch1 = ToggleButton(rootView.context)
            mySwitch1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            mySwitch1.text = "Participant 1"
            mySwitch1.textOff = "Participant 1"
            mySwitch1.textOn = "Participant 1"
            mySwitch1.layoutParams.height = 150;
            rootView.addView(mySwitch1)
            name1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            name1.text = "Name of participant"
            name1.layoutParams.height = 80;
            name1.visibility = GONE;
            name1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(name1)
            inputName1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputName1.layoutParams.height= 110;
            inputName1.visibility = GONE;
            inputName1.id = View.generateViewId()
            val selectedName1 = findViewById<EditText>(inputName1.id)
            rootView.addView(inputName1)
            age1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            age1.text = "Age"
            age1.layoutParams.height = 80;
            age1.visibility = GONE;
            age1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(age1)
            inputage1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputage1.layoutParams.height= 110;
            inputage1.inputType = InputType.TYPE_CLASS_NUMBER
            inputage1.visibility = GONE;
            inputage1.filters = arrayOf<InputFilter>(LengthFilter(2))
            inputage1.id = View.generateViewId()
            val selectedAge1 = findViewById<EditText>(inputage1.id)
            rootView.addView(inputage1)
            profession1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            profession1.text = "Profession"
            profession1.layoutParams.height = 80;
            profession1.visibility = GONE;
            profession1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(profession1)
            inputprofession1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputprofession1.layoutParams.height= 110;
            inputprofession1.visibility = GONE;
            inputprofession1.id = View.generateViewId()
            val selectedprofession1 = findViewById<EditText>(inputprofession1.id)
            rootView.addView(inputprofession1)
            cnic1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            cnic1.text = "CNIC (Without Dashes)"
            cnic1.layoutParams.height = 80;
            cnic1.visibility = GONE;
            cnic1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(cnic1)
            inputcnic1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputcnic1.layoutParams.height= 110;
            inputcnic1.inputType = InputType.TYPE_CLASS_NUMBER
            inputcnic1.visibility = GONE;
            inputcnic1.filters = arrayOf<InputFilter>(LengthFilter(13))
            inputcnic1.id = View.generateViewId()
            val selectedcnic1 = findViewById<EditText>(inputcnic1.id)
            rootView.addView(inputcnic1)
            gender1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            gender1.text = "Gender"
            gender1.layoutParams.height = 80;
            gender1.visibility = GONE;
            gender1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(gender1)
            val genderparam1 = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            genderparam1.setMargins(40, 0, 0, 0);
            inputgender1.layoutParams = genderparam1
            inputgender1.layoutParams.height= 110;
            inputgender1.visibility = GONE;
            inputgender1.id = View.generateViewId()
            val selectedgender1 = findViewById<EditText>(inputgender1.id)
            rootView.addView(inputgender1)
            contact1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            contact1.text = "Contact No."
            contact1.layoutParams.height = 80;
            contact1.visibility = GONE;
            contact1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(contact1)
            inputcontact1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputcontact1.layoutParams.height= 110;
            inputcontact1.inputType = InputType.TYPE_CLASS_NUMBER
            inputcontact1.visibility = GONE;
            inputcontact1.filters = arrayOf<InputFilter>(LengthFilter(11))
            inputcontact1.id = View.generateViewId()
            val selectedcontact1 = findViewById<EditText>(inputcontact1.id)
            rootView.addView(inputcontact1)
            address1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            address1.text = "Address"
            address1.layoutParams.height = 80;
            address1.visibility = GONE;
            address1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(address1)
            inputaddress1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputaddress1.layoutParams.height= 110;
            inputaddress1.visibility = GONE;
            inputaddress1.id = View.generateViewId()
            val selectedaddress1 = findViewById<EditText>(inputaddress1.id)
            rootView.addView(inputaddress1)
            accalready1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            accalready1.text = "Already an account holder in any bank?"
            accalready1.layoutParams.height = 80;
            accalready1.visibility = GONE;
            accalready1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(accalready1)
            inputaccalready1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputaccalready1.layoutParams.height= 110;
            inputaccalready1.text = "Yes"
            inputaccalready1.visibility = GONE;
            inputaccalready1.id = View.generateViewId()
            val selectedaccalready1 = findViewById<EditText>(inputaccalready1.id)
            rootView.addView(inputaccalready1)
            accopen1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            accopen1.text = "Account opened in current session?"
            accopen1.layoutParams.height = 80;
            accopen1.visibility = GONE;
            accopen1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(accopen1)
            inputaccopen1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputaccopen1.layoutParams.height= 110;
            inputaccopen1.text = "Yes"
            inputaccopen1.visibility = GONE;
            inputaccopen1.id = View.generateViewId()
            val selectedaccopen1 = findViewById<EditText>(inputaccopen1.id)
            rootView.addView(inputaccopen1)
            acctype1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            acctype1.text = "Account Type?"
            acctype1.layoutParams.height = 80;
            acctype1.visibility = GONE;
            acctype1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(acctype1)
            inputacctype1_1.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            inputacctype1_1.setText(R.string.acctype1)
            inputacctype1_1.id = View.generateViewId()
            inputacctype1_1.visibility = GONE
            inputacctype1_2.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            inputacctype1_2.setText(R.string.acctype2)
            inputacctype1_1.visibility = GONE
            inputacctype1_2.id = View.generateViewId()
            val params = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            params.setMargins(40, 0, 0, 0)
            inputacctype1.layoutParams = params
            inputacctype1.visibility = GONE
            inputacctype1.addView(inputacctype1_2)
            inputacctype1.addView(inputacctype1_1)
            rootView.addView(inputacctype1)
            accnumber1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            accnumber1.text = "Account Number."
            accnumber1.layoutParams.height = 80;
            accnumber1.visibility = GONE;
            accnumber1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(accnumber1)
            inputaccnumber1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputaccnumber1.layoutParams.height= 110;
            inputaccnumber1.inputType = InputType.TYPE_CLASS_NUMBER
            inputaccnumber1.visibility = GONE;
            inputaccnumber1.id = View.generateViewId()
            val selectedaccnumber1 = findViewById<EditText>(inputaccnumber1.id)
            rootView.addView(inputaccnumber1)
            bankname1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            bankname1.text = "Name of Bank where account is created."
            bankname1.layoutParams.height = 80;
            bankname1.visibility = GONE;
            bankname1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(bankname1)
            inputbankname1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputbankname1.layoutParams.height= 110;
            if (inputbankname1 != null) {
                val adapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_spinner_item, bankname
                )
                inputbankname1.adapter = adapter
            }
            inputbankname1.visibility = GONE;
            inputbankname1.id = View.generateViewId()
            val selectedbankname1 = findViewById<EditText>(inputbankname1.id)
            rootView.addView(inputbankname1)
            branchcode1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            branchcode1.text = "Branch code where account is opened."
            branchcode1.layoutParams.height = 80;
            branchcode1.visibility = GONE;
            branchcode1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(branchcode1)
            inputbranchcode1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputbranchcode1.layoutParams.height= 110;
            inputbranchcode1.inputType = InputType.TYPE_CLASS_NUMBER
            inputbranchcode1.visibility = GONE;
            inputbranchcode1.filters = arrayOf<InputFilter>(LengthFilter(2))
            inputbranchcode1.id = View.generateViewId()
            val selectedbranchcode1 = findViewById<EditText>(inputbranchcode1.id)
            rootView.addView(inputbranchcode1)
            mySwitch1.setOnCheckedChangeListener { _, isChecked ->
                if (mySwitch1.isChecked) {
                    name1.visibility = View.VISIBLE;
                    inputName1.visibility = View.VISIBLE;
                    age1.visibility = View.VISIBLE;
                    inputage1.visibility = View.VISIBLE;
                    profession1.visibility = View.VISIBLE;
                    inputprofession1.visibility = View.VISIBLE;
                    cnic1.visibility = View.VISIBLE;
                    inputcnic1.visibility = View.VISIBLE;
                    contact1.visibility = View.VISIBLE;
                    gender1.visibility = VISIBLE;
                    inputgender1.visibility = VISIBLE;
                    inputcontact1.visibility = View.VISIBLE;
                    address1.visibility = View.VISIBLE;
                    inputaddress1.visibility = View.VISIBLE;
                    accalready1.visibility = View.VISIBLE;
                    inputaccalready1.visibility = View.VISIBLE;
                    accopen1.visibility = View.VISIBLE;
                    inputaccopen1.visibility = View.VISIBLE;
                } else {
                    name1.visibility = View.GONE;
                    inputName1.visibility = View.GONE;
                    age1.visibility = View.GONE;
                    inputage1.visibility = View.GONE;
                    profession1.visibility = View.GONE;
                    inputprofession1.visibility = View.GONE;
                    cnic1.visibility = View.GONE;
                    inputcnic1.visibility = View.GONE;
                    gender1.visibility = GONE;
                    inputgender1.visibility = GONE;
                    contact1.visibility = View.GONE;
                    inputcontact1.visibility = View.GONE;
                    address1.visibility = View.GONE;
                    inputaddress1.visibility = View.GONE;
                    accalready1.visibility = View.GONE;
                    inputaccalready1.visibility = View.GONE;
                    accopen1.visibility = View.GONE;
                    inputaccopen1.visibility = View.GONE;
                }
                inputcnic1.setOnFocusChangeListener{view, hasFocus ->
                    if (!hasFocus){
                        val cnicinteger = inputcnic1.text.toString().toLong()
                        if (cnicinteger % 10 == 1L || cnicinteger % 10 == 3L || cnicinteger % 10 == 5L || cnicinteger % 10 == 7L || cnicinteger % 10 == 9L ){
                            inputgender1.text = "Male"
                        }else if(cnicinteger % 10 == 2L || cnicinteger % 10 == 4L || cnicinteger % 10 == 6L || cnicinteger % 10 == 8L || cnicinteger % 10 == 0L){
                            inputgender1.text = "Female"
                        }
                        // Toast.makeText(this@participants_area, inputcnic1.text.toString(), Toast.LENGTH_LONG).show()
                    }else{
                        // Toast.makeText(this@participants_area, "inputcnic1.text.toString()", Toast.LENGTH_LONG).show()
                    }
                }
                inputaccopen1.setOnCheckedChangeListener { compoundButton, b ->
                    if(b){
                        acctype1.visibility = VISIBLE;
                        inputacctype1.visibility = VISIBLE
                        inputacctype1_1.visibility = VISIBLE
                        inputacctype1_2.visibility = VISIBLE
                        accnumber1.visibility = VISIBLE;
                        inputaccnumber1.visibility = VISIBLE
                        bankname1.visibility = VISIBLE
                        inputbankname1.visibility = VISIBLE
                        branchcode1.visibility = VISIBLE
                        inputbranchcode1.visibility = VISIBLE
                        // Toast.makeText(this@participants_area, "Checked" , Toast.LENGTH_LONG).show()
                    }else{
                        acctype1.visibility = GONE;
                        inputacctype1.visibility = GONE
                        inputacctype1_1.visibility = GONE
                        inputacctype1_2.visibility = GONE
                        accnumber1.visibility = GONE;
                        inputaccnumber1.visibility = GONE
                        bankname1.visibility = GONE
                        inputbankname1.visibility = GONE
                        branchcode1.visibility = GONE
                        inputbranchcode1.visibility = GONE
                        // Toast.makeText(this@participants_area, "UnChecked", Toast.LENGTH_LONG).show()
                    }
                }
            }


        }

        fun part2(){
            val bankname = resources.getStringArray(R.array.bank_names)
            val rootView = findViewById<LinearLayout>(R.id.main_screen)
            val name2 = TextView(rootView.context)
            val inputName2 = EditText(rootView.context)
            val age2 = TextView(rootView.context)
            val inputage2 = EditText(rootView.context)
            val profession2 = TextView(rootView.context)
            val inputprofession2 = EditText(rootView.context)
            val cnic2 = TextView(rootView.context)
            val inputcnic2 = EditText(rootView.context)
            val gender2 = TextView(rootView.context)
            val inputgender2 = TextView(rootView.context)
            val contact2 = TextView(rootView.context)
            val inputcontact2 = EditText(rootView.context)
            val address2 = TextView(rootView.context)
            val inputaddress2 = EditText(rootView.context)
            val accalready2 = TextView(rootView.context)
            val inputaccalready2 = CheckBox(rootView.context)
            val accopen2 = TextView(rootView.context)
            val inputaccopen2 = CheckBox(rootView.context)
            val acctype2 = TextView(rootView.context)
            val inputacctype2_1 = RadioButton(rootView.context)
            val inputacctype2_2 = RadioButton(rootView.context)
            val inputacctype2 = RadioGroup(rootView.context)
            val accnumber2 = TextView(rootView.context)
            val inputaccnumber2 = EditText(rootView.context)
            val bankname2 = TextView(rootView.context)
            val inputbankname2 = Spinner(rootView.context)
            val branchcode2 = TextView(rootView.context)
            val inputbranchcode2 = EditText(rootView.context)
            val mySwitch2 = ToggleButton(rootView.context)
            mySwitch2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            mySwitch2.text = "Participant 2"
            mySwitch2.textOff = "Participant 2"
            mySwitch2.textOn = "Participant 2"
            mySwitch2.layoutParams.height = 150;
            rootView.addView(mySwitch2)
            name2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            name2.text = "Name of participant"
            name2.layoutParams.height = 80;
            name2.visibility = GONE;
            name2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(name2)
            inputName2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputName2.layoutParams.height= 110;
            inputName2.visibility = GONE;
            inputName2.id = View.generateViewId()
            val selectedName2 = findViewById<EditText>(inputName2.id)
            rootView.addView(inputName2)
            age2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            age2.text = "Age"
            age2.layoutParams.height = 80;
            age2.visibility = GONE;
            age2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(age2)
            inputage2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputage2.layoutParams.height= 110;
            inputage2.inputType = InputType.TYPE_CLASS_NUMBER
            inputage2.visibility = GONE;
            inputage2.filters = arrayOf<InputFilter>(LengthFilter(2))
            inputage2.id = View.generateViewId()
            val selectedAge2 = findViewById<EditText>(inputage2.id)
            rootView.addView(inputage2)
            profession2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            profession2.text = "Profession"
            profession2.layoutParams.height = 80;
            profession2.visibility = GONE;
            profession2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(profession2)
            inputprofession2.layoutParams = LinearLayoutCompat.LayoutParams(
                MATCH_PARENT,
                WRAP_CONTENT
            )
            inputprofession2.layoutParams.height= 110;
            inputprofession2.visibility = GONE;
            inputprofession2.id = View.generateViewId()
            val selectedprofession2 = findViewById<EditText>(inputprofession2.id)
            rootView.addView(inputprofession2)
            cnic2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            cnic2.text = "CNIC (Without Dashes)"
            cnic2.layoutParams.height = 80;
            cnic2.visibility = GONE;
            cnic2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(cnic2)
            inputcnic2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputcnic2.layoutParams.height= 110;
            inputcnic2.inputType = InputType.TYPE_CLASS_NUMBER
            inputcnic2.visibility = GONE;
            inputcnic2.filters = arrayOf<InputFilter>(LengthFilter(13))
            inputcnic2.id = View.generateViewId()
            val selectedcnic2 = findViewById<EditText>(inputcnic2.id)
            rootView.addView(inputcnic2)
            contact2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            contact2.text = "Contact No."
            contact2.layoutParams.height = 80;
            contact2.visibility = GONE;
            contact2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(contact2)
            inputcontact2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputcontact2.layoutParams.height= 110;
            inputcontact2.visibility = GONE;
            inputcontact2.inputType = InputType.TYPE_CLASS_NUMBER
            inputcontact2.filters = arrayOf<InputFilter>(LengthFilter(11))
            inputcontact2.id = View.generateViewId()
            val selectedcontact2 = findViewById<EditText>(inputcontact2.id)
            rootView.addView(inputcontact2)
            gender2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            gender2.text = "Gender"
            gender2.layoutParams.height = 80;
            gender2.visibility = GONE;
            gender2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(gender2)
            val genderparam2 = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            genderparam2.setMargins(40, 0, 0, 0);
            inputgender2.layoutParams = genderparam2
            inputgender2.layoutParams.height= 110;
            inputgender2.visibility = GONE;
            inputgender2.id = View.generateViewId()
            val selectedgender2 = findViewById<EditText>(inputgender2.id)
            rootView.addView(inputgender2)
            address2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            address2.text = "Address"
            address2.layoutParams.height = 80;
            address2.visibility = GONE;
            address2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(address2)
            inputaddress2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputaddress2.layoutParams.height= 110;
            inputaddress2.visibility = GONE;
            inputaddress2.id = View.generateViewId()
            val selectedaddress2 = findViewById<EditText>(inputaddress2.id)
            rootView.addView(inputaddress2)
            accalready2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            accalready2.text = "Already an account holder in any bank?"
            accalready2.layoutParams.height = 80;
            accalready2.visibility = GONE;
            accalready2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(accalready2)
            inputaccalready2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputaccalready2.layoutParams.height= 110;
            inputaccalready2.text = "Yes"
            inputaccalready2.visibility = GONE;
            inputaccalready2.id = View.generateViewId()
            val selectedaccalready2 = findViewById<EditText>(inputaccalready2.id)
            rootView.addView(inputaccalready2)
            inputaccalready2.setOnCheckedChangeListener { compoundButton, b ->
                if(b){
                    Toast.makeText(this@participants_area, "Checked", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@participants_area, "UnChecked", Toast.LENGTH_LONG).show()
                }
            }
            accopen2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            accopen2.text = "Account opened in current session?"
            accopen2.layoutParams.height = 80;
            accopen2.visibility = GONE;
            accopen2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(accopen2)
            inputaccopen2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputaccopen2.layoutParams.height= 110;
            inputaccopen2.text = "Yes"
            inputaccopen2.visibility = GONE;
            inputaccopen2.id = View.generateViewId()
            val selectedaccopen2 = findViewById<EditText>(inputaccopen2.id)
            rootView.addView(inputaccopen2)
            acctype2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            acctype2.text = "Account Type?"
            acctype2.layoutParams.height = 80;
            acctype2.visibility = GONE;
            acctype2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(acctype2)
            inputacctype2_1.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            inputacctype2_1.setText(R.string.acctype1)
            inputacctype2_1.id = View.generateViewId()
            inputacctype2_1.visibility = GONE
            inputacctype2_2.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            inputacctype2_2.setText(R.string.acctype2)
            inputacctype2_1.visibility = GONE
            inputacctype2_2.id = View.generateViewId()
            val params = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            params.setMargins(40, 0, 0, 0)
            inputacctype2.layoutParams = params
            inputacctype2.visibility = GONE
            inputacctype2.addView(inputacctype2_2)
            inputacctype2.addView(inputacctype2_1)
            rootView.addView(inputacctype2)
            accnumber2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            accnumber2.text = "Account Number."
            accnumber2.layoutParams.height = 80;
            accnumber2.visibility = GONE;
            accnumber2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(accnumber2)
            inputaccnumber2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputaccnumber2.layoutParams.height= 110;
            inputaccnumber2.inputType = InputType.TYPE_CLASS_NUMBER
            inputaccnumber2.visibility = GONE;
            inputaccnumber2.id = View.generateViewId()
            val selectedaccnumber2 = findViewById<EditText>(inputaccnumber2.id)
            rootView.addView(inputaccnumber2)
            bankname2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            bankname2.text = "Name of Bank where account is created."
            bankname2.layoutParams.height = 80;
            bankname2.visibility = GONE;
            bankname2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(bankname2)
            inputbankname2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputbankname2.layoutParams.height= 110;
            if (inputbankname2 != null) {
                val adapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_spinner_item, bankname
                )
                inputbankname2.adapter = adapter
            }
            inputbankname2.visibility = GONE;
            inputbankname2.id = View.generateViewId()
            val selectedbankname2 = findViewById<EditText>(inputbankname2.id)
            rootView.addView(inputbankname2)
            branchcode2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            branchcode2.text = "Branch code where account is opened."
            branchcode2.layoutParams.height = 80;
            branchcode2.visibility = GONE;
            branchcode2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(branchcode2)
            inputbranchcode2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputbranchcode2.layoutParams.height= 110;
            inputbranchcode2.inputType = InputType.TYPE_CLASS_NUMBER
            inputbranchcode2.visibility = GONE;
            inputbranchcode2.filters = arrayOf<InputFilter>(LengthFilter(2))
            inputbranchcode2.id = View.generateViewId()
            val selectedbranchcode2 = findViewById<EditText>(inputbranchcode2.id)
            rootView.addView(inputbranchcode2)
            mySwitch2.setOnCheckedChangeListener { _, isChecked ->
                if (mySwitch2.isChecked) {
                    name2.visibility = View.VISIBLE;
                    inputName2.visibility = View.VISIBLE;
                    age2.visibility = View.VISIBLE;
                    inputage2.visibility = View.VISIBLE;
                    profession2.visibility = View.VISIBLE;
                    inputprofession2.visibility = View.VISIBLE;
                    cnic2.visibility = View.VISIBLE;
                    inputcnic2.visibility = View.VISIBLE;
                    gender2.visibility = VISIBLE;
                    inputgender2.visibility = VISIBLE;
                    contact2.visibility = View.VISIBLE;
                    inputcontact2.visibility = View.VISIBLE;
                    address2.visibility = View.VISIBLE;
                    inputaddress2.visibility = View.VISIBLE;
                    accalready2.visibility = View.VISIBLE;
                    inputaccalready2.visibility = View.VISIBLE;
                    accopen2.visibility = View.VISIBLE;
                    inputaccopen2.visibility = View.VISIBLE;
                } else {
                    name2.visibility = View.GONE;
                    inputName2.visibility = View.GONE;
                    age2.visibility = View.GONE;
                    inputage2.visibility = View.GONE;
                    profession2.visibility = View.GONE;
                    inputprofession2.visibility = View.GONE;
                    cnic2.visibility = View.GONE;
                    inputcnic2.visibility = View.GONE;
                    gender2.visibility = GONE;
                    inputgender2.visibility = GONE;
                    contact2.visibility = View.GONE;
                    inputcontact2.visibility = View.GONE;
                    address2.visibility = View.GONE;
                    inputaddress2.visibility = View.GONE;
                    accalready2.visibility = View.GONE;
                    inputaccalready2.visibility = View.GONE;
                    accopen2.visibility = View.GONE;
                    inputaccopen2.visibility = View.GONE;
                }
                inputcnic2.setOnFocusChangeListener{view, hasFocus ->
                    if (!hasFocus){
                        val cnicinteger = inputcnic2.text.toString().toLong()
                        if (cnicinteger % 10 == 1L || cnicinteger % 10 == 3L || cnicinteger % 10 == 5L || cnicinteger % 10 == 7L || cnicinteger % 10 == 9L ){
                            inputgender2.text = "Male"
                        }else if(cnicinteger % 10 == 2L || cnicinteger % 10 == 4L || cnicinteger % 10 == 6L || cnicinteger % 10 == 8L || cnicinteger % 10 == 0L){
                            inputgender2.text = "Female"
                        }
                        // Toast.makeText(this@participants_area, inputcnic1.text.toString(), Toast.LENGTH_LONG).show()
                    }else{
                        // Toast.makeText(this@participants_area, "inputcnic1.text.toString()", Toast.LENGTH_LONG).show()
                    }
                }
                inputaccopen2.setOnCheckedChangeListener { compoundButton, b ->
                    if(b){
                        acctype2.visibility = VISIBLE;
                        inputacctype2.visibility = VISIBLE
                        inputacctype2_1.visibility = VISIBLE
                        inputacctype2_2.visibility = VISIBLE
                        accnumber2.visibility = VISIBLE;
                        inputaccnumber2.visibility = VISIBLE
                        bankname2.visibility = VISIBLE
                        inputbankname2.visibility = VISIBLE
                        branchcode2.visibility = VISIBLE
                        inputbranchcode2.visibility = VISIBLE
                        // Toast.makeText(this@participants_area, "Checked" , Toast.LENGTH_LONG).show()
                    }else{
                        acctype2.visibility = GONE;
                        inputacctype2.visibility = GONE
                        inputacctype2_1.visibility = GONE
                        inputacctype2_2.visibility = GONE
                        accnumber2.visibility = GONE;
                        inputaccnumber2.visibility = GONE
                        bankname2.visibility = GONE
                        inputbankname2.visibility = GONE
                        branchcode2.visibility = GONE
                        inputbranchcode2.visibility = GONE
                        // Toast.makeText(this@participants_area, "UnChecked", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        if (intent.getStringExtra("participantsNumber") == "1"){
            part1()

        }else if(intent.getStringExtra("participantsNumber") == "2") {
            part1()
            part2()
        }else{
            val rootView = findViewById<LinearLayout>(R.id.main_screen)
            val error = TextView(rootView.context)
            error.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            error.text = "Error"
            error.textSize = 100f
            error.gravity = Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL
            error.layoutParams.height = 400;
            error.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(error)
        }
    }
}
