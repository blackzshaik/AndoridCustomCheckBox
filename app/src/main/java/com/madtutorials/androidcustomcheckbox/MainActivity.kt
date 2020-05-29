package com.madtutorials.androidcustomcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    private lateinit var normalCheckBox:CheckBox
    private lateinit var customCheckBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        normalCheckBox = findViewById(R.id.normalCheckBox)
        customCheckBox = findViewById(R.id.customCheckBox)

        normalCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                Toast.makeText(applicationContext,"Normal Checkbox Checked",Toast.LENGTH_SHORT).show()
            }
        }

        customCheckBox.setOnCheckedChangeListener{ _,isChecked ->
            if(isChecked) Toast.makeText(applicationContext,"Custom Checkbox Checked",Toast.LENGTH_SHORT)
                .show()
        }


    }
}
