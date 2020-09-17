package com.example.attempt2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.widget.Button
import android.widget.Toast
import java.io.File

class generate_sheet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate_sheet)
        val filename = intent.getStringExtra("filename")
        val email = findViewById<Button>(R.id.sendemail)
        val builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())

        val filelocation = File(filename)
        val path = Uri.fromFile(filelocation)
        val filenameNew = filename?.drop(20)


        val subject = "CF-1 $filenameNew"
        val body = "Dear Sir,\n" +
                "Please find attached session report. \n" +
                "\n" +
                "Regards"
        val uri = Uri.parse("mailto:AFU-FSD@sbp.org.pk")
            .buildUpon()
            .appendQueryParameter("To", "AFU-FSD@sbp.org.pk")
            .appendQueryParameter("subject", subject)
            .appendQueryParameter("body", body)
            .build()

        email.setOnClickListener{
            Toast.makeText(this,"filePath", Toast.LENGTH_LONG).show()
            val intent2 = Intent(
                Intent.ACTION_SENDTO, uri
            );
            intent2.putExtra(Intent.EXTRA_STREAM, path);
            startActivity(Intent.createChooser(intent2, "Select email"))
        }
    }
}
