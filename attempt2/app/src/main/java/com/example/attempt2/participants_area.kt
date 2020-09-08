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
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat


class participants_area : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_participants_area)
        // function to limit the lenght of EditText

        fun EditText.setMaxLength(maxLength: Int) {
            filters = arrayOf(InputFilter.LengthFilter(maxLength))
        }

        @SuppressLint("ResourceType")
        fun part1(){
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
            val inputgender1 = EditText(rootView.context)
            val contact1 = TextView(rootView.context)
            val inputcontact1 = EditText(rootView.context)
            val address1 = TextView(rootView.context)
            val inputaddress1 = EditText(rootView.context)
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
            val selectedName = findViewById<EditText>(inputName1.id)
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
            val selectedAge = findViewById<EditText>(inputage1.id)
            rootView.addView(inputage1)
            profession1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            profession1.text = "Profession"
            profession1.layoutParams.height = 80;
            profession1.visibility = GONE;
            profession1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(profession1)
            inputprofession1.layoutParams = LinearLayoutCompat.LayoutParams(
                MATCH_PARENT,
                WRAP_CONTENT
            )
            inputprofession1.layoutParams.height= 110;
            inputprofession1.visibility = GONE;
            inputprofession1.id = View.generateViewId()
            val selectedprofession = findViewById<EditText>(inputprofession1.id)
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
            gender1.text = "Gender  (M/F)"
            gender1.layoutParams.height = 80;
            gender1.visibility = GONE;
            gender1.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(gender1)
            inputgender1.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputgender1.layoutParams.height= 110;
            inputgender1.visibility = GONE;
            inputgender1.filters = arrayOf<InputFilter>(LengthFilter(1))
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
                    gender1.visibility = View.VISIBLE;
                    inputgender1.visibility = View.VISIBLE;
                    contact1.visibility = View.VISIBLE;
                    inputcontact1.visibility = View.VISIBLE;
                    address1.visibility = View.VISIBLE;
                    inputaddress1.visibility = View.VISIBLE;
                } else {
                    name1.visibility = View.GONE;
                    inputName1.visibility = View.GONE;
                    age1.visibility = View.GONE;
                    inputage1.visibility = View.GONE;
                    profession1.visibility = View.GONE;
                    inputprofession1.visibility = View.GONE;
                    cnic1.visibility = View.GONE;
                    inputcnic1.visibility = View.GONE;
                    gender1.visibility = View.GONE;
                    inputgender1.visibility = View.GONE;
                    contact1.visibility = View.GONE;
                    inputcontact1.visibility = View.GONE;
                    address1.visibility = View.GONE;
                    inputaddress1.visibility = View.GONE;
                }
            }


        }

        fun part2(){
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
            val inputgender2 = EditText(rootView.context)
            val contact2 = TextView(rootView.context)
            val inputcontact2 = EditText(rootView.context)
            val address2 = TextView(rootView.context)
            val inputaddress2 = EditText(rootView.context)
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
            gender2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            gender2.text = "Gender  (M/F)"
            gender2.layoutParams.height = 80;
            gender2.visibility = GONE;
            gender2.typeface = Typeface.DEFAULT_BOLD
            rootView.addView(gender2)
            inputgender2.layoutParams = LinearLayoutCompat.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            inputgender2.layoutParams.height= 110;
            inputgender2.visibility = GONE;
            inputgender2.filters = arrayOf<InputFilter>(LengthFilter(1))
            inputgender2.id = View.generateViewId()
            val selectedgender2 = findViewById<EditText>(inputgender2.id)
            rootView.addView(inputgender2)
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
                    gender2.visibility = View.VISIBLE;
                    inputgender2.visibility = View.VISIBLE;
                    contact2.visibility = View.VISIBLE;
                    inputcontact2.visibility = View.VISIBLE;
                    address2.visibility = View.VISIBLE;
                    inputaddress2.visibility = View.VISIBLE;
                } else {
                    name2.visibility = View.GONE;
                    inputName2.visibility = View.GONE;
                    age2.visibility = View.GONE;
                    inputage2.visibility = View.GONE;
                    profession2.visibility = View.GONE;
                    inputprofession2.visibility = View.GONE;
                    cnic2.visibility = View.GONE;
                    inputcnic2.visibility = View.GONE;
                    gender2.visibility = View.GONE;
                    inputgender2.visibility = View.GONE;
                    contact2.visibility = View.GONE;
                    inputcontact2.visibility = View.GONE;
                    address2.visibility = View.GONE;
                    inputaddress2.visibility = View.GONE;
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
