package com.example.emicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        calculate.setOnClickListener {
            val loan = etAmount.text.toString().toDouble()
            val interest = etInterest.text.toString().toDouble()
            val month = etTime.text.toString().toDouble()
            val rate = interest / 12/100
            val caldvnt = (1 + rate).toDouble().pow(month.toDouble())
            val fdvdnt = loan * rate * caldvnt
            val caldiv = caldvnt - 1
            val emi = fdvdnt / caldiv
            println(caldvnt)
            etEmi.text = emi.toString()
            Snackbar.make(it,"Emi is $emi",Snackbar.LENGTH_SHORT).show()
        }

    }
}
