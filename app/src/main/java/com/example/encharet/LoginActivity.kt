package com.example.encharet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
lateinit var usname:EditText
    lateinit var pas:EditText
    lateinit var sb:Button
    lateinit var lb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
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
           val encharetIntent = Intent(this, MainActivity::class.java)
           this.startActivity(encharetIntent)
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
