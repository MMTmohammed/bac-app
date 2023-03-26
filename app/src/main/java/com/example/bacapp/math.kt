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
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.graphics.toColorInt
import androidx.core.view.isInvisible
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_math.*
import org.w3c.dom.Text

public var b1 :Float= 0F
public var b2 :Float= 0F
public var b3 :Float= 0F
public var b4 :Float= 0F
public var b5 :Float= 0F
public var b6 :Float= 0F
public var b7 :Float= 0F
public var b8 :Float= 0F
public var b9 :Float= 0F
public var b10 :Float= 0F
public var b11 :Float= 0F
public var total1 :Float=0F
public var total2 :Float=0F
public var total3 :Float=0F
public var total4 :Float=0F



class math : AppCompatActivity() ,TextWatcher{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)

        val bb = getSharedPreferences("transelat", Context.MODE_PRIVATE)
        val m = bb.getString("permetion", "nothing")
        if (m=="yes"){
            bbb1.setBackgroundResource(R.color.balck_main)

            a1.setBackgroundResource(R.color.black)
            majmo3.setBackgroundResource(R.drawable.strok_night)
            bar1.setBackgroundResource(R.color.black)
            moa1.setBackgroundResource(R.drawable.button_background_darktheme)

            i1.setBackgroundResource(R.drawable.strok_night)
            i2.setBackgroundResource(R.drawable.strok_night)
            i3.setBackgroundResource(R.drawable.strok_night)
            i4.setBackgroundResource(R.drawable.strok_night)
            i5.setBackgroundResource(R.drawable.strok_night)
            i6.setBackgroundResource(R.drawable.strok_night)
            i7.setBackgroundResource(R.drawable.strok_night)
            i8.setBackgroundResource(R.drawable.strok_night)
            i9.setBackgroundResource(R.drawable.strok_night)
            linearsp.setBackgroundResource(R.drawable.strok_night)
            linearama.setBackgroundResource(R.drawable.strok_night)

            tot1.setTextColor(getResources().getColor(R.color.color_write2))
            tot2.setTextColor(getResources().getColor(R.color.color_write2))
            tot3.setTextColor(getResources().getColor(R.color.color_write2))
            tot4.setTextColor(getResources().getColor(R.color.color_write2))
            tot5.setTextColor(getResources().getColor(R.color.color_write2))
            tot6.setTextColor(getResources().getColor(R.color.color_write2))
            tot7.setTextColor(getResources().getColor(R.color.color_write2))
            tot8.setTextColor(getResources().getColor(R.color.color_write2))
            tot9.setTextColor(getResources().getColor(R.color.color_write2))
            tot10.setTextColor(getResources().getColor(R.color.color_write2))
            tot11.setTextColor(getResources().getColor(R.color.color_write2))

            con1.setTextColor(getResources().getColor(R.color.color_write2))
            con2.setTextColor(getResources().getColor(R.color.color_write2))
            con3.setTextColor(getResources().getColor(R.color.color_write2))
            con4.setTextColor(getResources().getColor(R.color.color_write2))
            con5.setTextColor(getResources().getColor(R.color.color_write2))
            con6.setTextColor(getResources().getColor(R.color.color_write2))
            con7.setTextColor(getResources().getColor(R.color.color_write2))
            con8.setTextColor(getResources().getColor(R.color.color_write2))
            con9.setTextColor(getResources().getColor(R.color.color_write2))
            con10.setTextColor(getResources().getColor(R.color.color_write2))
            con11.setTextColor(getResources().getColor(R.color.color_write2))

            factor.setTextColor(getResources().getColor(R.color.color_write2))
            avfactor.setTextColor(getResources().getColor(R.color.color_write2))
            texttot.setTextColor(getResources().getColor(R.color.color_write2))
            avtot.setTextColor(getResources().getColor(R.color.color_write2))

            pp1.setTextColor(getResources().getColor(R.color.color_write2))
            pp2.setTextColor(getResources().getColor(R.color.color_write2))
            pp3.setTextColor(getResources().getColor(R.color.color_write2))
            pp4.setTextColor(getResources().getColor(R.color.color_write2))
            pp5.setTextColor(getResources().getColor(R.color.color_write2))
            pp6.setTextColor(getResources().getColor(R.color.color_write2))
            pp7.setTextColor(getResources().getColor(R.color.color_write2))
            pp8.setTextColor(getResources().getColor(R.color.color_write2))
            pp9.setTextColor(getResources().getColor(R.color.color_write2))
            pp10.setTextColor(getResources().getColor(R.color.color_write2))
            pp11.setTextColor(getResources().getColor(R.color.color_write2))

            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.black)
        }
        else{
            a1.setBackgroundResource(R.color.colorf)
            bar1.setBackgroundResource(R.color.colorf)
        }










        back.setOnClickListener {
            val gotoo = Intent()
            setResult(Activity.RESULT_OK, gotoo)
            finish()
        }


        clear.setOnClickListener {
            total1 = 0F
            total2 = 0F
            total3 = 0F
            total4 = 0F
            b1 = 0F
            b2 = 0F
            b3 = 0F
            b4 = 0F
            b5 = 0F
            b6 = 0F
            b7 = 0F
            b8 = 0F
            b9 = 0F
            b10 = 0F
            b11 = 0F

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
            text3o.setText("")
            text3o.setHint("20.00")

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
            tot11.setText("00.00")
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
            factor.setText("30")
        }
        if (amazigh == f2) {
            linearama.visibility = View.GONE
            factor.setText("29")
        }
        if (sport == f1 && amazigh == f2) {
            factor.setText("28")
        }



            textma.addTextChangedListener {
                val a = textma.text.toString()
                if (a != ".") {
                    if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                        textma.setTextColor(getResources().getColor(R.color.black_write))
                        val a = textma.text.toString().toFloat()
                        b1 = a * 7
                        tot1.setText(b1.toString())
                        textma.setTextColor(Color.parseColor("#5BB318"))
                    } else {
                        tot1.setText("00.00")
                        textma.setHint("20.00")
                        textma.setTextColor(Color.parseColor("#D61C4E"))
                        b1=0F
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
                        b2 = a * 6
                        tot2.setText(b2.toString())
                        textphi.setTextColor(Color.parseColor("#5BB318"))
                    } else {
                        tot2.setText("00.00")
                        textphi.setHint("20.00")
                        textphi.setTextColor(Color.parseColor("#D61C4E"))
                        b2=0F
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
                        b3 = a * 3
                        tot3.setText(b3.toString())
                        textad.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot3.setText("00.00")
                        textad.setHint("20.00")
                        textad.setTextColor(Color.parseColor("#D61C4E"))
                        b3=0F
                    }

                } else {
                    tot3.setText("00.00")
                    textad.setHint("20.00")
                    textad.setTextColor(Color.parseColor("#D61C4E"))

                }

            }
            text3o.addTextChangedListener {
                val a = text3o.text.toString()
                if (a != ".") {
                    if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                        text3o.setTextColor(getResources().getColor(R.color.black_write))
                        val a = text3o.text.toString().toFloat()
                        b11 = a * 2
                        tot11.setText(b11.toString())
                        text3o.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot11.setText("00.00")
                        text3o.setHint("20.00")
                        text3o.setTextColor(Color.parseColor("#D61C4E"))
b11=0F
                    }

                } else {
                    tot11.setText("00.00")
                    text3o.setHint("20.00")
                    text3o.setTextColor(Color.parseColor("#D61C4E"))

                }

            }
            textcha.addTextChangedListener {
                val a = textcha.text.toString()
                if (a != ".") {
                    if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                        textcha.setTextColor(getResources().getColor(R.color.black_write))

                        val a = textcha.text.toString().toFloat()
                        b4 = a * 2
                        tot4.setText(b4.toString())
                        textcha.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot4.setText("00.00")
                        textcha.setHint("20.00")
                        textcha.setTextColor(Color.parseColor("#D61C4E"))
                        b4=0F
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
                        b5 = a * 2
                        tot5.setText(b5.toString())
                        textgio.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot5.setText("00.00")
                        textgio.setHint("20.00")
                        textgio.setTextColor(Color.parseColor("#D61C4E"))
                        b5=0F
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
                        b6 = a * 2
                        tot6.setText(b6.toString())
                        texteng.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot6.setText("00.00")
                        texteng.setHint("20.00")
                        texteng.setTextColor(Color.parseColor("#D61C4E"))
                        b6=0F
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
                        b7 = a * 2
                        tot7.setText(b7.toString())
                        textfrc.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot7.setText("00.00")
                        textfrc.setHint("20.00")
                        textfrc.setTextColor(Color.parseColor("#D61C4E"))
                        b7=0F
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
                        b8 = a * 2
                        tot8.setText(b8.toString())
                        textphila.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot8.setText("00.00")
                        textphila.setHint("20.00")
                        textphila.setTextColor(Color.parseColor("#D61C4E"))
                        b8=0F
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
                        b9 = a * 2
                        tot9.setText(b9.toString())
                        textama.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot9.setText("00.00")
                        textama.setHint("20.00")
                        textama.setTextColor(Color.parseColor("#D61C4E"))
                        b9=0F
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
                        b10 = a * 1
                        tot10.setText(b10.toString())
                        textsp.setTextColor(Color.parseColor("#5BB218"))
                    } else {
                        tot10.setText("00.00")
                        textsp.setHint("20.00")
                        textsp.setTextColor(Color.parseColor("#D61C4E"))
                        b10=0F
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
            tot11.addTextChangedListener(this)

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
             total1 = b1+b2+b3+b4+b5+b6+b7+b8+b9+b10+b11
            texttot.setText(total1.toString())
            val moy = total1 / 31
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1) {
             total2 = b1+b2+b3+b4+b5+b6+b7+b8+b9+b11
            texttot.setText(total2.toString())
            val moy = total2 / 30
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (amazigh == f2) {
             total3 = b1+b2+b3+b4+b5+b6+b7+b8+b10+b11
            texttot.setText(total3.toString())
            val moy = total3 / 29
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1 && amazigh == f2) {
             total4 = b1+b2+b3+b4+b5+b6+b7+b8+b11
            texttot.setText(total4.toString())
            var moy = total4 / 28
            var moyy = String.format("%.2f",moy)
            textmo.setText(moyy)

        }

    }

    override fun afterTextChanged(p0: Editable?) {
    }


}
