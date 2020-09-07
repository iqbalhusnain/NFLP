package com.example.attempt2

import android.annotation.SuppressLint
import android.app.TimePickerDialog
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import com.example.attempt2.ui.main.SectionsPagerAdapter
import java.text.SimpleDateFormat
import java.util.*

class DataEntryPage : AppCompatActivity() {

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_entry__page)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        val selectBanks: Spinner = findViewById(R.id.inputLeadBank)
//            SelectBanks.onItemSelectedListener = this

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
        //            SelectBanks.onItemSelectedListener = this

        ArrayAdapter.createFromResource(
            this,
            R.array.associate_bank_names,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            selectAssociates.adapter = adapter


            val selectCity: Spinner = findViewById(R.id.inputDistrict)
            //            SelectBanks.onItemSelectedListener = this

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

