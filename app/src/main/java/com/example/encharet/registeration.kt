package com.example.encharet

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_registeration.view.*
import kotlin.math.log

class registeration : Fragment() {
    lateinit var username:EditText
    lateinit var password:EditText
    lateinit var address:EditText
    lateinit var pno : EditText
    lateinit var confirmpswd:EditText
    lateinit var loginbtn:Button
    lateinit var sigupbtn:Button

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        // if(context is onloginclicked){
        //   listener = context
        //}
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_registeration, container, false)
        username = view.un
        password = view.pass
        address = view.adress
        pno = view.phoneno
        confirmpswd = view.cpass
        loginbtn = view.login_btn
        sigupbtn = view.signup_btn
      loginbtn.setOnClickListener {


      }
        sigupbtn.setOnClickListener {
          if(validateFields()){
              Toast.makeText(context,"you are succesfully registered",Toast.LENGTH_SHORT)
          }
            else{
              Toast.makeText(context,"empty fields",Toast.LENGTH_SHORT)
          }
        }
        loginbtn.setOnClickListener {

        }




        return view
    }
    fun validateFields():Boolean{
        var u:String = username.text.toString()
        var p :String = password.text.toString()
        var ph:String = pno.text.toString()
        var a:String = address.text.toString()
        var cp :String = confirmpswd.text.toString()
        if(u.trim().isEmpty() || p.trim().isEmpty() || a.trim().isEmpty() || cp.trim().isEmpty() || ph.trim().isEmpty() ){
            return false
        }
        else{
            return true
        }
    }
    fun clearFields(){
        username.setText("")
        password.setText("")
        pno.setText("")
        address.setText("")
        confirmpswd.setText("")

    }


}