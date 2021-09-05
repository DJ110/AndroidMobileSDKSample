package com.daiji110.androidmobilesdksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.daiji110.androidfirstsdk.FirstObject
import com.daiji110.androidfirstsdk.OpenClassA

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.func1).setOnClickListener {
            Toast.makeText(this, FirstObject.getGreeting("Sab"), Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.func2).setOnClickListener {
            Toast.makeText(this, OpenClassA("Shiro").message(), Toast.LENGTH_SHORT).show()
        }
    }
}