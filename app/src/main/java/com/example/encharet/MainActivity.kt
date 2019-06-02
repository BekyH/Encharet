package com.example.encharet

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
lateinit var usname:EditText
    lateinit var pas:EditText
    lateinit var sb:Button
    lateinit var lb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usname = uname
        pas = ps
        sb = sbtn
        lb = lbtn
        val registerfragement = registeration()
        sb.setOnClickListener {
       supportFragmentManager.beginTransaction()
           .replace(R.id.co,registerfragement)
           .commit()
        }
        lb.setOnClickListener {
            if(checkfields()){
              //  Toast.makeText(context,"loginned",Toast.LENGTH_SHORT)

            }
        }

    }
    fun checkfields():Boolean{
      var u:String = usname.text.toString()
        var p:String = pas.text.toString()
        if(u.trim().isEmpty() || p.trim().isEmpty()){
            return false
        }
        else{
            return false
        }

    }
    fun clearFields(){
        usname.setText("")
        pas.setText("")
    }

}
