package com.cookandroid.project4_2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var Agree : Switch
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoOreo : RadioButton
    lateinit var rdoPie : RadioButton
    lateinit var rdoQ : RadioButton
    lateinit var  img : ImageView
    lateinit var btnEnd : Button
    lateinit var btnRe : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "안드로이드 사진 보기"

        text1 = findViewById<TextView>(R.id.Text1)
        Agree = findViewById<Switch>(R.id.Agree)

        text2 = findViewById<TextView>(R.id.Text2)
        rGroup1 = findViewById<RadioGroup>(R.id.Rgroup1)
        rdoOreo = findViewById<RadioButton>(R.id.RdoOreo)
        rdoPie = findViewById<RadioButton>(R.id.RdoPie)
        rdoQ = findViewById<RadioButton>(R.id.RdoQ)

        img = findViewById<ImageView>(R.id.Img)
        btnEnd = findViewById<Button>(R.id.BtnEnd)
        btnRe = findViewById<Button>(R.id.BtnRe)

        Agree.setOnCheckedChangeListener { compoundButton, b ->
            if(Agree.isChecked == true){
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                img.visibility = android.view.View.VISIBLE
                btnEnd.visibility = android.view.View.VISIBLE
                btnRe.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                img.visibility = android.view.View.INVISIBLE
                btnEnd.visibility = android.view.View.INVISIBLE
                btnRe.visibility = android.view.View.INVISIBLE
            }

        }

        rdoOreo.setOnClickListener {
            when (rGroup1.checkedRadioButtonId){
                R.id.RdoOreo ->img.setImageResource(R.drawable.oreo)
                R.id.RdoPie ->img.setImageResource(R.drawable.pie)
                R.id.RdoQ ->img.setImageResource(R.drawable.q)
            }
        }
        rdoPie.setOnClickListener {
            when (rGroup1.checkedRadioButtonId){
                R.id.RdoOreo ->img.setImageResource(R.drawable.oreo)
                R.id.RdoPie ->img.setImageResource(R.drawable.pie)
                R.id.RdoQ ->img.setImageResource(R.drawable.q)
            }
        }
        rdoQ.setOnClickListener {
            when (rGroup1.checkedRadioButtonId){
                R.id.RdoOreo ->img.setImageResource(R.drawable.oreo)
                R.id.RdoPie ->img.setImageResource(R.drawable.pie)
                R.id.RdoQ ->img.setImageResource(R.drawable.q)
            }
        }
        btnEnd.setOnClickListener{
            finish()
        }
        btnRe.setOnClickListener {
            Agree.isChecked = false
            rdoQ.isChecked =false
            rdoPie.isChecked=false
            rdoOreo.isChecked=false
            img.setImageResource(0)
        }

    }
}