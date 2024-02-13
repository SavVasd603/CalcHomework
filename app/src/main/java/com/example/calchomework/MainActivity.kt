package com.example.calchomework

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var strResult = ""
    var calcResult = 0f
    var calcOper = 0
    fun numClick(`val`: String) {
        strResult = if (strResult.isEmpty()) {
            `val`
        } else {
            strResult + `val`
        }
    }

    fun numCalc(`val`: Float) {
        if (calcOper == 0) {
            calcResult = `val`
        } else {
            if (calcOper == 1) calcResult = calcResult + `val`
            if (calcOper == 2) calcResult = calcResult - `val`
            if (calcOper == 3) calcResult = calcResult * `val`
            if (calcOper == 4) calcResult = calcResult / `val`
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textResult = findViewById<TextView>(R.id.textView)
        val btnPlus = findViewById<Button>(R.id.buttonPlus)
        val btnMinus = findViewById<Button>(R.id.buttonMinus)
        val btnMult = findViewById<Button>(R.id.buttonMult)
        val btnDiv = findViewById<Button>(R.id.buttonDiv)
        val btn0 = findViewById<Button>(R.id.button0)
        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)
        val btn5 = findViewById<Button>(R.id.button5)
        val btn6 = findViewById<Button>(R.id.button6)
        val btn7 = findViewById<Button>(R.id.button7)
        val btn8 = findViewById<Button>(R.id.button8)
        val btn9 = findViewById<Button>(R.id.button9)
        val btnResult = findViewById<Button>(R.id.buttonEq)
        val btnClear = findViewById<Button>(R.id.buttonC)

        btnResult.setOnClickListener {
            if (!strResult.isEmpty()) {
                numCalc(java.lang.Float.valueOf(strResult))
                strResult = ""
            }
            calcOper = 0
            textResult.text = java.lang.Float.toString(calcResult)
        }
        btn0.setOnClickListener {
            numClick("0")
            textResult.text = strResult
        }
        btn1.setOnClickListener {
            numClick("1")
            textResult.text = strResult
        }
        btn2.setOnClickListener {
            numClick("2")
            textResult.text = strResult
        }
        btn3.setOnClickListener {
            numClick("3")
            textResult.text = strResult
        }
        btn4.setOnClickListener {
            numClick("4")
            textResult.text = strResult
        }
        btn5.setOnClickListener {
            numClick("5")
            textResult.text = strResult
        }
        btn6.setOnClickListener {
            numClick("6")
            textResult.text = strResult
        }
        btn7.setOnClickListener {
            numClick("7")
            textResult.text = strResult
        }
        btn8.setOnClickListener {
            numClick("8")
            textResult.text = strResult
        }
        btn9.setOnClickListener {
            numClick("9")
            textResult.text = strResult
        }
        /** Operations  */
        btnPlus.setOnClickListener {
            if (!strResult.isEmpty()) {
                numCalc(java.lang.Float.valueOf(strResult))
                strResult = ""
            }
            calcOper = 1
            textResult.text = java.lang.Float.toString(calcResult)
        }
        btnMinus.setOnClickListener {
            if (!strResult.isEmpty()) {
                numCalc(java.lang.Float.valueOf(strResult))
                strResult = ""
            }
            calcOper = 2
            textResult.text = java.lang.Float.toString(calcResult)
        }
        btnMult.setOnClickListener {
            if (!strResult.isEmpty()) {
                numCalc(java.lang.Float.valueOf(strResult))
                strResult = ""
            }
            calcOper = 3
            textResult.text = java.lang.Float.toString(calcResult)
        }
        btnDiv.setOnClickListener {
            if (!strResult.isEmpty()) {
                numCalc(java.lang.Float.valueOf(strResult))
                strResult = ""
            }
            calcOper = 4
            textResult.text = java.lang.Float.toString(calcResult)
        }
        btnClear.setOnClickListener {
            strResult = ""
            calcResult = 0f
            calcOper = 0
            textResult.text = "0"
        }
    }
}

