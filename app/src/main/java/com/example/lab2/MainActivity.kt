package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //createSimpleDialog2()
    }

    fun String.floatToInt(): Int {
        return this.toFloat().toInt()
    }
    val strDemo = "42.22"
    val intDemo = strDemo.floatToInt()


    fun createSimpleDialog(view: View) {
        val a3 = findViewById<View>(R.id.name) as EditText
        var a2: String  = a3.getText().toString()
        var a1: Float = a2.toFloat()
        //var a1 = 1.0

        val b3 = findViewById<View>(R.id.name4) as EditText
        var b2: String  = b3.getText().toString()
        var b1: Float = b2.toFloat()
        //var b1 = 2.0

        val c3 = findViewById<View>(R.id.name5) as EditText
        var c2: String  = c3.getText().toString()
        var c1: Float = c2.toFloat()
       // var c1 = -3

        var dis1 = (b1.pow((2).toFloat()))-4*a1*c1
        var dis = (dis1).toFloat()

        if (((dis > 0) and (a1 != (0.0).toFloat()) and (b1 !=(0.0).toFloat())) or ((dis > 0) and (a1 != (0.0).toFloat()) and (b1 ==(0.0).toFloat())) ) {
            val builder = AlertDialog.Builder(this)

            var kor1 = (-b1+(dis.pow((0.5).toFloat())))/(2*a1)
            var kor1_norm = kor1.toInt()
            var kor2 = (-b1-(dis.pow((0.5).toFloat())))/(2*a1)
            val kor2_norm = kor2.toInt()


            builder.setTitle("Результаты")
            builder.setMessage("Уравнение имеет 2 корня: \n x1=" + kor1_norm + "\n x2=" + kor2_norm)
            builder.show()
        }

        if ((dis == (0.0).toFloat()) and (a1 != (0.0).toFloat()) and (b1 !=(0.0).toFloat())) {
            var kor1 = (-b1)/(2*a1)
            var kor1_norm = kor1.toInt()
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Результаты")
            builder.setMessage("Уравнение имеет 1 корень: \n x1="+ kor1_norm )
            builder.show()

        }
        if ((dis<0) and (a1 != (0.0).toFloat()) and (b1 !=(0.0).toFloat())) {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Результаты")
            builder.setMessage("Уравнение не имеет корней")
            builder.show()

        }
        if ((a1 == (0.0).toFloat()) and (b1 != (0.0).toFloat())){
            var kor1 = (c1*-1)/b1
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Результаты")
            builder.setMessage("Уравнение не является квадратным\n"+"x1="+ kor1)
            builder.show()
        }
        if ((a1 == (0.0).toFloat()) and (b1 == (0.0).toFloat())){
            val text11 = ""
            if (c1 == (0).toFloat()){
                val text11= "Части уравнения тождественно верны "
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Результаты")
                builder.setMessage("Уравнение не является квадратным\n"+ text11 +"\n" +"0==0")
                builder.show()
            }
            if (c1 != (0).toFloat()){
                val text11= "Части уравнения тождественно НЕ верны"
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Результаты")
                builder.setMessage("Уравнение не является квадратным\n"+ text11 +"\n" +(c1).toInt()+"!=0")
                builder.show()
            }

        }
        }

    }
