package org.rec.exp8alertbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etMessage : EditText = findViewById(R.id.etmsg)
        val btDisplay : Button = findViewById(R.id.btdisplay)
        btDisplay.setOnClickListener { 
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("MAD LAB")
                .setMessage(etMessage.text.toString())
                .setPositiveButton("ok"){
                    dialog, which -> 
                    Toast.makeText(applicationContext,"you clicked ok",Toast.LENGTH_LONG)
                }
                .setNegativeButton("Cancel"){
                    dialog,which ->
                    Toast.makeText(applicationContext,"You clicked cancel",Toast.LENGTH_LONG)
                }
                .create()
                alertDialog.show()
        }
    }
}
activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity" >

    <EditText
        android:id="@+id/etmsg"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="Enter your message here"
        android:inputType="textPersonName" />

    <Button
        android:id="@+id/btdisplay"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Display" />
</LinearLayout>
