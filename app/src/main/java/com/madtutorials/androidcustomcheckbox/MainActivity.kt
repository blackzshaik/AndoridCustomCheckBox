package com.madtutorials.androidcustomcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    private lateinit var checkBox1: CheckBox
    private lateinit var checkBox2:CheckBox
    private lateinit var customCheckBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkBox1 = findViewById(R.id.normalCheckBox)
        checkBox2 = findViewById(R.id.normalCheckBox2)
        customCheckBox = findViewById(R.id.customCheckBox)

        checkBox1.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                Toast.makeText(applicationContext,"Checkbox One Checked",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Checkbox One Unchecked",Toast.LENGTH_SHORT).show()
            }
        }
        checkBox2.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                Toast.makeText(applicationContext,"Checkbox Two Checked",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Checkbox Two Unchecked",Toast.LENGTH_SHORT).show()
            }
        }

        customCheckBox.setOnCheckedChangeListener{ _,isChecked ->
            val text = if(isChecked) "Checkbox Three Checked"
                       else
                       "Checkbox Three Unchecked"
            Toast.makeText(applicationContext,text,Toast.LENGTH_SHORT).show()
        }

    }
}
