package com.example.encharet.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


import com.example.encharet.R
import kotlinx.android.synthetic.main.fragment_post_item.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PostItemFragment : Fragment() {
    lateinit var itemname: EditText
    lateinit var filename: EditText
    lateinit var postdate: EditText
    lateinit var expiredate: EditText
    lateinit var startingprice: EditText
    lateinit var description: EditText
    lateinit var uploadbtn: Button
    lateinit var postbtn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_post_item, container, false)
        itemname = view.item_name_edittext
        postdate = view.post_date_edittext
        expiredate = view.expire_date_edittext
        startingprice = view.starting_price_edittext
        description = view.description_edittext
        uploadbtn = view.upload_btn
        postbtn = view.post_btn
        filename = view.file_edittext
        uploadbtn.setOnClickListener {

        }
        postbtn.setOnClickListener {
            if (checkfields()) {
                //do something
            }

else{
                //do something
            }

        }
        return view
    }


    fun checkfields():Boolean{
        val name:String = itemname.text.toString().trim()
        val pdate:String = postdate.text.toString().trim()
        val edate:String = expiredate.text.toString().trim()
        val sp:String = startingprice.text.toString().trim()
        val des:String = description.text.toString().trim()
        if(name.isEmpty()||pdate.isEmpty() || edate.isEmpty() || sp.isEmpty() || des.isEmpty()){
            return false
        }
        else{
            return true
        }
    }
}
