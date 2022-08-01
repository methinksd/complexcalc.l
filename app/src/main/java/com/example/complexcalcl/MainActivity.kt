package com.example.complexcalcl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Buttonadd: Button
    lateinit var Buttonsubtract: Button
    lateinit var Buttonmultiply: Button
    lateinit var Buttondivision: Button
    lateinit var Buttonequals: Button
    lateinit var edt_fnum: EditText
    lateinit var edt_snum: EditText
    lateinit var textresult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Buttonadd = findViewById(R.id.btn_add)
        Buttonsubtract = findViewById(R.id.btn_subtract)
        Buttonmultiply = findViewById(R.id.btn_multiply)
        Buttondivision = findViewById(R.id.btn_div)
        Buttonequals = findViewById(R.id.btn_equals)
        edt_fnum = findViewById(R.id.edt_fnum)
        edt_snum = findViewById(R.id.edt_snum)
        textresult = findViewById(R.id.textresult)

        Buttonadd.setOnClickListener {
            var firstnum = edt_fnum.text.toString()
            var snum = edt_snum.text.toString()
            if (firstnum.isEmpty() && snum.isEmpty()) {
                var also = "Please fill in all inputs".also { textresult.text = it }
            } else {
                var Answer = firstnum.toDouble() + snum.toDouble()
                textresult.text = Answer.toString()
            }
        }

        Buttonsubtract.setOnClickListener {
            var firstnum = edt_fnum.text.toString()
            var snum = edt_snum.text.toString()
            if (firstnum.isEmpty() && snum.isEmpty()) {
                var also = "Please fill in all inputs".also { textresult.text = it }
            } else {
                var Answer = firstnum.toDouble() - snum.toDouble()
                textresult.text = Answer.toString()
            }
        }
        Buttonmultiply.setOnClickListener {
            var firstnum = edt_fnum.text.toString()
            var snum = edt_snum.text.toString()
            if (firstnum.isEmpty() && snum.isEmpty()) {
                var also = "Please fill in all inputs".also { textresult.text = it }
            } else {
                var Answer = firstnum.toDouble() * snum.toDouble()
                textresult.text = Answer.toString()
            }
        }
        Buttondivision.setOnClickListener {
            var firstnum = edt_fnum.text.toString()
            var snum = edt_snum.text.toString()
            if (firstnum.isEmpty() && snum.isEmpty()) {
                var also = "Please fill in all inputs".also { textresult.text = it }
            } else {
                var Answer = firstnum.toDouble() / snum.toDouble()
                textresult.text = Answer.toString()
            }
        }

    }
}