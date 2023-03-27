package com.example.bacapp

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_adab.*
import kotlinx.android.synthetic.main.activity_lang.*
import kotlinx.android.synthetic.main.activity_math.*
import kotlinx.android.synthetic.main.activity_math.avfactor
import kotlinx.android.synthetic.main.activity_math.avtot
import kotlinx.android.synthetic.main.activity_math.back
import kotlinx.android.synthetic.main.activity_math.clear
import kotlinx.android.synthetic.main.activity_math.factor
import kotlinx.android.synthetic.main.activity_math.i1
import kotlinx.android.synthetic.main.activity_math.i2
import kotlinx.android.synthetic.main.activity_math.i3
import kotlinx.android.synthetic.main.activity_math.i4
import kotlinx.android.synthetic.main.activity_math.i5
import kotlinx.android.synthetic.main.activity_math.i6
import kotlinx.android.synthetic.main.activity_math.i7
import kotlinx.android.synthetic.main.activity_math.linearama
import kotlinx.android.synthetic.main.activity_math.linearsp
import kotlinx.android.synthetic.main.activity_math.textad
import kotlinx.android.synthetic.main.activity_math.textama
import kotlinx.android.synthetic.main.activity_math.textcha
import kotlinx.android.synthetic.main.activity_math.texteng
import kotlinx.android.synthetic.main.activity_math.textfrc
import kotlinx.android.synthetic.main.activity_math.textgio
import kotlinx.android.synthetic.main.activity_math.textma
import kotlinx.android.synthetic.main.activity_math.textmo
import kotlinx.android.synthetic.main.activity_math.textphi
import kotlinx.android.synthetic.main.activity_math.textphila
import kotlinx.android.synthetic.main.activity_math.textsp
import kotlinx.android.synthetic.main.activity_math.texttot
import kotlinx.android.synthetic.main.activity_math.tot1
import kotlinx.android.synthetic.main.activity_math.tot10
import kotlinx.android.synthetic.main.activity_math.tot2
import kotlinx.android.synthetic.main.activity_math.tot3
import kotlinx.android.synthetic.main.activity_math.tot4
import kotlinx.android.synthetic.main.activity_math.tot5
import kotlinx.android.synthetic.main.activity_math.tot6
import kotlinx.android.synthetic.main.activity_math.tot7
import kotlinx.android.synthetic.main.activity_math.tot8
import kotlinx.android.synthetic.main.activity_math.tot9

public var bz1 :Float= 0F
public var bz2 :Float= 0F
public var bz3 :Float= 0F
public var bz4 :Float= 0F
public var bz5 :Float= 0F
public var bz6 :Float= 0F
public var bz7 :Float= 0F
public var bz8 :Float= 0F
public var bz9 :Float= 0F
public var bz10 :Float= 0F
public var bz11 :Float= 0F
public var totalz1 :Float=0F
public var totalz2 :Float=0F
public var totalz3 :Float=0F
public var totalz4 :Float=0F


class lang : AppCompatActivity() ,TextWatcher{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lang)


        val bb = getSharedPreferences("transelat", Context.MODE_PRIVATE)
        val m = bb.getString("permetion", "nothing")
        if (m=="yes"){
            bbbbbbb1.setBackgroundResource(R.color.balck_main)

            a6.setBackgroundResource(R.color.black)
            majm036.setBackgroundResource(R.drawable.strok_night)
            bar6.setBackgroundResource(R.color.black)
            moa6.setBackgroundResource(R.drawable.button_background_darktheme)

            i1.setBackgroundResource(R.drawable.strok_night)
            i2.setBackgroundResource(R.drawable.strok_night)
            i3.setBackgroundResource(R.drawable.strok_night)
            i4.setBackgroundResource(R.drawable.strok_night)
            i5.setBackgroundResource(R.drawable.strok_night)
            i6.setBackgroundResource(R.drawable.strok_night)
            i7.setBackgroundResource(R.drawable.strok_night)
            iii8.setBackgroundResource(R.drawable.strok_night)


            linearsp.setBackgroundResource(R.drawable.strok_night)
            linearama.setBackgroundResource(R.drawable.strok_night)

            tot1.setTextColor(getResources().getColor(R.color.color_write2))
            tot8.setTextColor(getResources().getColor(R.color.color_write2))
            tot3.setTextColor(getResources().getColor(R.color.color_write2))
            tot4.setTextColor(getResources().getColor(R.color.color_write2))
            tot5.setTextColor(getResources().getColor(R.color.color_write2))
            tot6.setTextColor(getResources().getColor(R.color.color_write2))
            tot7.setTextColor(getResources().getColor(R.color.color_write2))
            tot2.setTextColor(getResources().getColor(R.color.color_write2))
            tot9.setTextColor(getResources().getColor(R.color.color_write2))
            tot10.setTextColor(getResources().getColor(R.color.color_write2))


            cc1.setTextColor(getResources().getColor(R.color.color_write2))
            cc2.setTextColor(getResources().getColor(R.color.color_write2))
            cc3.setTextColor(getResources().getColor(R.color.color_write2))
            cc4.setTextColor(getResources().getColor(R.color.color_write2))
            cc5.setTextColor(getResources().getColor(R.color.color_write2))
            cc6.setTextColor(getResources().getColor(R.color.color_write2))
            cc7.setTextColor(getResources().getColor(R.color.color_write2))
            cc8.setTextColor(getResources().getColor(R.color.color_write2))
            cc9.setTextColor(getResources().getColor(R.color.color_write2))
            cc10.setTextColor(getResources().getColor(R.color.color_write2))


            factor.setTextColor(getResources().getColor(R.color.color_write2))
            avfactor.setTextColor(getResources().getColor(R.color.color_write2))
            texttot.setTextColor(getResources().getColor(R.color.color_write2))
            avtot.setTextColor(getResources().getColor(R.color.color_write2))

            yy1.setTextColor(getResources().getColor(R.color.color_write2))
            yy2.setTextColor(getResources().getColor(R.color.color_write2))
            yy3.setTextColor(getResources().getColor(R.color.color_write2))
            yy4.setTextColor(getResources().getColor(R.color.color_write2))
            yy5.setTextColor(getResources().getColor(R.color.color_write2))
            yy6.setTextColor(getResources().getColor(R.color.color_write2))
            yy7.setTextColor(getResources().getColor(R.color.color_write2))
            yy8.setTextColor(getResources().getColor(R.color.color_write2))
            yy9.setTextColor(getResources().getColor(R.color.color_write2))
            yy10.setTextColor(getResources().getColor(R.color.color_write2))


            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.black)
        }



        back.setOnClickListener{
            val gotoo = Intent()
            setResult(Activity.RESULT_OK, gotoo)
            finish()
        }


        clear.setOnClickListener {
            totalz1 = 0F
            totalz2 = 0F
            totalz3 = 0F
            totalz4 = 0F
            bz1 = 0F
            bz2 = 0F
            bz3 = 0F
            bz4 = 0F
            bz5 = 0F
            bz6 = 0F
            bz7 = 0F
            bz8 = 0F
            bz9 = 0F
            bz10 = 0F
            bz11 = 0F

            textma.setText("")
            textma.setHint("20.00")
            textmo.setText("")
            textmo.setHint("20.00")
            textphi.setText("")
            textphi.setHint("20.00")
            textad.setText("")
            textad.setHint("20.00")
            textcha.setText("")
            textcha.setHint("20.00")
            textgio.setText("")
            textgio.setHint("20.00")
            texteng.setText("")
            texteng.setHint("20.00")
            textfrc.setText("")
            textfrc.setHint("20.00")
            textphila.setText("")
            textphila.setHint("20.00")
            textama.setText("")
            textama.setHint("20.00")
            textsp.setText("")
            textsp.setHint("20.00")


            tot1.setText("00.00")
            tot2.setText("00.00")
            tot3.setText("00.00")
            tot4.setText("00.00")
            tot5.setText("00.00")
            tot6.setText("00.00")
            tot7.setText("00.00")
            tot8.setText("00.00")
            tot9.setText("00.00")
            tot10.setText("00.00")

            texttot.setText("00.00")
            textmo.setText("00.00")
        }


        val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
        val b = getSharedPreferences("file3", Context.MODE_PRIVATE)
        val sport = a.getString("kly1", "nothing")
        val amazigh = b.getString("kly2", "nothing")
        val f1 = "start1"
        val f2 = "start2"
        if (sport == f1) {
            linearsp.visibility = View.GONE
            factor.setText("29")
        }
        if (amazigh == f2) {
            linearama.visibility = View.GONE
            factor.setText("28")
        }
        if (sport == f1 && amazigh == f2) {
            factor.setText("27")
        }



        textma.addTextChangedListener {
            val a = textma.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textma.setTextColor(getResources().getColor(R.color.black_write))
                    val a = textma.text.toString().toFloat()
                    bz1 = a * 2
                    tot1.setText(bz1.toString())
                    textma.setTextColor(Color.parseColor("#5BB318"))
                } else {
                    tot1.setText("00.00")
                    textma.setHint("20.00")
                    textma.setTextColor(Color.parseColor("#D61C4E"))
                    bz1=0F
                }
            } else {
                tot1.setText("00.00")
                textma.setHint("20.00")
                textma.setTextColor(Color.parseColor("#D61C4E"))
            }


        }
        textphi.addTextChangedListener {

            val a = textphi.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textphi.setTextColor(getResources().getColor(R.color.black_write))
                    val a = textphi.text.toString().toFloat()
                    bz2 = a * 4
                    tot2.setText(bz2.toString())
                    textphi.setTextColor(Color.parseColor("#5BB318"))
                } else {
                    tot2.setText("00.00")
                    textphi.setHint("20.00")
                    textphi.setTextColor(Color.parseColor("#D61C4E"))
                    bz2=0F
                }
            } else {
                tot2.setText("00.00")
                textphi.setHint("20.00")
                textphi.setTextColor(Color.parseColor("#D61C4E"))
            }

        }
        textad.addTextChangedListener {
            val a = textad.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textad.setTextColor(getResources().getColor(R.color.black_write))
                    val a = textad.text.toString().toFloat()
                    bz3 = a * 5
                    tot3.setText(bz3.toString())
                    textad.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot3.setText("00.00")
                    textad.setHint("20.00")
                    textad.setTextColor(Color.parseColor("#D61C4E"))
                    bz3=0F
                }

            } else {
                tot3.setText("00.00")
                textad.setHint("20.00")
                textad.setTextColor(Color.parseColor("#D61C4E"))

            }

        }
        textcha.addTextChangedListener {
            val a = textcha.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textcha.setTextColor(getResources().getColor(R.color.black_write))

                    val a = textcha.text.toString().toFloat()
                    bz4 = a * 2
                    tot4.setText(bz4.toString())
                    textcha.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot4.setText("00.00")
                    textcha.setHint("20.00")
                    textcha.setTextColor(Color.parseColor("#D61C4E"))
                    bz4=0F
                }
            } else {
                tot4.setText("00.00")
                textcha.setHint("20.00")
                textcha.setTextColor(Color.parseColor("#D61C4E"))

            }

        }
        textgio.addTextChangedListener {
            val a = textgio.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textgio.setTextColor(getResources().getColor(R.color.black_write))

                    val a = textgio.text.toString().toFloat()
                    bz5 = a * 2
                    tot5.setText(bz5.toString())
                    textgio.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot5.setText("00.00")
                    textgio.setHint("20.00")
                    textgio.setTextColor(Color.parseColor("#D61C4E"))
                    bz5=0F
                }
            } else {
                tot5.setText("00.00")
                textgio.setHint("20.00")
                textgio.setTextColor(Color.parseColor("#D61C4E"))

            }

        }
        texteng.addTextChangedListener {
            val a = texteng.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    texteng.setTextColor(getResources().getColor(R.color.black_write))

                    val a = texteng.text.toString().toFloat()
                    bz6 = a * 5
                    tot6.setText(bz6.toString())
                    texteng.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot6.setText("00.00")
                    texteng.setHint("20.00")
                    texteng.setTextColor(Color.parseColor("#D61C4E"))
                    bz6=0F
                }
            } else {
                tot6.setText("00.00")
                texteng.setHint("20.00")
                texteng.setTextColor(Color.parseColor("#D61C4E"))

            }}
        textfrc.addTextChangedListener {
            val a = textfrc.text.toString()
            if (a!="."){
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textfrc.setTextColor(getResources().getColor(R.color.black_write))

                    val a = textfrc.text.toString().toFloat()
                    bz7 = a * 5
                    tot7.setText(bz7.toString())
                    textfrc.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot7.setText("00.00")
                    textfrc.setHint("20.00")
                    textfrc.setTextColor(Color.parseColor("#D61C4E"))
                    bz7=0F
                }
            }else {
                tot7.setText("00.00")
                textfrc.setHint("20.00")
                textfrc.setTextColor(Color.parseColor("#D61C4E"))

            }


        }
        textphila.addTextChangedListener {
            val a = textphila.text.toString()
            if (a!="."){
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textphila.setTextColor(getResources().getColor(R.color.black_write))

                    val a = textphila.text.toString().toFloat()
                    bz8 = a * 2
                    tot8.setText(bz8.toString())
                    textphila.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot8.setText("00.00")
                    textphila.setHint("20.00")
                    textphila.setTextColor(Color.parseColor("#D61C4E"))
                    bz8=0F
                }
            }else {
                tot8.setText("00.00")
                textphila.setHint("20.00")
                textphila.setTextColor(Color.parseColor("#D61C4E"))

            }

        }
        textama.addTextChangedListener {
            val a = textama.text.toString()
            if (a!="."){
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textama.setTextColor(getResources().getColor(R.color.black_write))

                    val a = textama.text.toString().toFloat()
                    bz9 = a * 2
                    tot9.setText(bz9.toString())
                    textama.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot9.setText("00.00")
                    textama.setHint("20.00")
                    textama.setTextColor(Color.parseColor("#D61C4E"))
                    bz9=0F
                }
            }else {
                tot9.setText("00.00")
                textama.setHint("20.00")
                textama.setTextColor(Color.parseColor("#D61C4E"))

            }

        }
        textsp.addTextChangedListener {
            val a = textsp.text.toString()
            if (a!="."){
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textsp.setTextColor(getResources().getColor(R.color.black_write))

                    val a = textsp.text.toString().toFloat()
                    bz10 = a * 1
                    tot10.setText(bz10.toString())
                    textsp.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot10.setText("00.00")
                    textsp.setHint("20.00")
                    textsp.setTextColor(Color.parseColor("#D61C4E"))
                    bz10=0F
                }
            }else {
                tot10.setText("00.00")
                textsp.setHint("20.00")
                textsp.setTextColor(Color.parseColor("#D61C4E"))

            }

        }
        tot1.addTextChangedListener(this)
        tot2.addTextChangedListener(this)
        tot3.addTextChangedListener(this)
        tot4.addTextChangedListener(this)
        tot5.addTextChangedListener(this)
        tot6.addTextChangedListener(this)
        tot7.addTextChangedListener(this)
        tot8.addTextChangedListener(this)
        tot9.addTextChangedListener(this)
        tot10.addTextChangedListener(this)

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
        val b = getSharedPreferences("file3", Context.MODE_PRIVATE)
        val sport = a.getString("kly1", "nothing")
        val amazigh = b.getString("kly2", "nothing")
        val f1 = "start1"
        val f2 = "start2"

        if (sport!=f1 && amazigh!=f2){
            totalz1 = bz1+bz2+bz3+bz4+bz5+bz6+bz7+bz8+bz9+bz10
            texttot.setText(totalz1.toString())
            val moy = totalz1 / 30
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1) {
            totalz2 = bz1+bz2+bz3+bz4+bz5+bz6+bz7+bz8+bz9
            val moy = totalz2 / 29
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (amazigh == f2) {
            totalz3 = bz1+bz2+bz3+bz4+bz5+bz6+bz7+bz8+bz10
            texttot.setText(totalz3.toString())
            val moy = totalz3 / 28
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1 && amazigh == f2) {
            totalz4 = bz1+bz2+bz3+bz4+bz5+bz6+bz7+bz8
            texttot.setText(totalz4.toString())
            var moy = totalz4 / 27
            var moyy = String.format("%.2f",moy)
            textmo.setText(moyy)

        }

    }

    override fun afterTextChanged(p0: Editable?) {
    }


}