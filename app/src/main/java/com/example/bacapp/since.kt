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
import kotlinx.android.synthetic.main.activity_math.*
import kotlinx.android.synthetic.main.activity_since.*
import kotlinx.android.synthetic.main.activity_teck.*
import kotlinx.android.synthetic.main.activity_teck.avfactor
import kotlinx.android.synthetic.main.activity_teck.avtot
import kotlinx.android.synthetic.main.activity_teck.back
import kotlinx.android.synthetic.main.activity_teck.bbb1
import kotlinx.android.synthetic.main.activity_teck.clear
import kotlinx.android.synthetic.main.activity_teck.factor
import kotlinx.android.synthetic.main.activity_teck.i1
import kotlinx.android.synthetic.main.activity_teck.i2
import kotlinx.android.synthetic.main.activity_teck.i3
import kotlinx.android.synthetic.main.activity_teck.i4
import kotlinx.android.synthetic.main.activity_teck.i5
import kotlinx.android.synthetic.main.activity_teck.i6
import kotlinx.android.synthetic.main.activity_teck.i7
import kotlinx.android.synthetic.main.activity_teck.i8
import kotlinx.android.synthetic.main.activity_teck.i9
import kotlinx.android.synthetic.main.activity_teck.linearama
import kotlinx.android.synthetic.main.activity_teck.linearsp
import kotlinx.android.synthetic.main.activity_teck.text3o
import kotlinx.android.synthetic.main.activity_teck.textad
import kotlinx.android.synthetic.main.activity_teck.textama
import kotlinx.android.synthetic.main.activity_teck.textcha
import kotlinx.android.synthetic.main.activity_teck.texteng
import kotlinx.android.synthetic.main.activity_teck.textfrc
import kotlinx.android.synthetic.main.activity_teck.textgio
import kotlinx.android.synthetic.main.activity_teck.textma
import kotlinx.android.synthetic.main.activity_teck.textmo
import kotlinx.android.synthetic.main.activity_teck.textphi
import kotlinx.android.synthetic.main.activity_teck.textphila
import kotlinx.android.synthetic.main.activity_teck.textsp
import kotlinx.android.synthetic.main.activity_teck.texttot
import kotlinx.android.synthetic.main.activity_teck.tot1
import kotlinx.android.synthetic.main.activity_teck.tot10
import kotlinx.android.synthetic.main.activity_teck.tot11
import kotlinx.android.synthetic.main.activity_teck.tot2
import kotlinx.android.synthetic.main.activity_teck.tot3
import kotlinx.android.synthetic.main.activity_teck.tot4
import kotlinx.android.synthetic.main.activity_teck.tot5
import kotlinx.android.synthetic.main.activity_teck.tot6
import kotlinx.android.synthetic.main.activity_teck.tot7
import kotlinx.android.synthetic.main.activity_teck.tot8
import kotlinx.android.synthetic.main.activity_teck.tot9

public var bf1 :Float= 0F
public var bf2 :Float= 0F
public var bf3 :Float= 0F
public var bf4 :Float= 0F
public var bf5 :Float= 0F
public var bf6 :Float= 0F
public var bf7 :Float= 0F
public var bf8 :Float= 0F
public var bf9 :Float= 0F
public var bf10 :Float= 0F
public var bf11 :Float= 0F
public var totalf1 :Float=0F
public var totalf2 :Float=0F
public var totalf3 :Float=0F
public var totalf4 :Float=0F
class since : AppCompatActivity() ,TextWatcher{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_since)


        val bb = getSharedPreferences("transelat", Context.MODE_PRIVATE)
        val m = bb.getString("permetion", "nothing")
        if (m=="yes"){
            bbbb1.setBackgroundResource(R.color.balck_main)

            a3.setBackgroundResource(R.color.black)
            majm033.setBackgroundResource(R.drawable.strok_night)
            bar3.setBackgroundResource(R.color.black)
            moa3.setBackgroundResource(R.drawable.button_background_darktheme)

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

            ccon1.setTextColor(getResources().getColor(R.color.color_write2))
            ccon2.setTextColor(getResources().getColor(R.color.color_write2))
            ccon3.setTextColor(getResources().getColor(R.color.color_write2))
            ccon4.setTextColor(getResources().getColor(R.color.color_write2))
            ccon5.setTextColor(getResources().getColor(R.color.color_write2))
            ccon6.setTextColor(getResources().getColor(R.color.color_write2))
            ccon7.setTextColor(getResources().getColor(R.color.color_write2))
            ccon8.setTextColor(getResources().getColor(R.color.color_write2))
            ccon9.setTextColor(getResources().getColor(R.color.color_write2))
            ccon10.setTextColor(getResources().getColor(R.color.color_write2))
            ccon11.setTextColor(getResources().getColor(R.color.color_write2))

            factor.setTextColor(getResources().getColor(R.color.color_write2))
            avfactor.setTextColor(getResources().getColor(R.color.color_write2))
            texttot.setTextColor(getResources().getColor(R.color.color_write2))
            avtot.setTextColor(getResources().getColor(R.color.color_write2))

            ll1.setTextColor(getResources().getColor(R.color.color_write2))
            ll2.setTextColor(getResources().getColor(R.color.color_write2))
            ll3.setTextColor(getResources().getColor(R.color.color_write2))
            ll4.setTextColor(getResources().getColor(R.color.color_write2))
            ll5.setTextColor(getResources().getColor(R.color.color_write2))
            ll6.setTextColor(getResources().getColor(R.color.color_write2))
            ll7.setTextColor(getResources().getColor(R.color.color_write2))
            ll8.setTextColor(getResources().getColor(R.color.color_write2))
            ll9.setTextColor(getResources().getColor(R.color.color_write2))
            ll10.setTextColor(getResources().getColor(R.color.color_write2))
            ll11.setTextColor(getResources().getColor(R.color.color_write2))

            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.black)
        }



        back.setOnClickListener {
            val gotoo = Intent()
            setResult(Activity.RESULT_OK, gotoo)
            finish()
        }


        clear.setOnClickListener {
            totalf1 = 0F
            totalf2 = 0F
            totalf3 = 0F
            totalf4 = 0F
            bf1 = 0F
            bf2 = 0F
            bf3 = 0F
            bf4 = 0F
            bf5 = 0F
            bf6 = 0F
            bf7 = 0F
            bf8 = 0F
            bf9 = 0F
            bf10 = 0F
            bf11 = 0F

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
            factor.setText("31")
        }
        if (amazigh == f2) {
            linearama.visibility = View.GONE
            factor.setText("30")
        }
        if (sport == f1 && amazigh == f2) {
            factor.setText("29")
        }



        textma.addTextChangedListener {
            val a = textma.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textma.setTextColor(getResources().getColor(R.color.black_write))
                    val a = textma.text.toString().toFloat()
                    bf1 = a * 5
                    tot1.setText(bf1.toString())
                    textma.setTextColor(Color.parseColor("#5BB318"))
                } else {
                    tot1.setText("00.00")
                    textma.setHint("20.00")
                    textma.setTextColor(Color.parseColor("#D61C4E"))
                    bf1 = 0F
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
                    bf2 = a * 5
                    tot2.setText(bf2.toString())
                    textphi.setTextColor(Color.parseColor("#5BB318"))
                } else {
                    tot2.setText("00.00")
                    textphi.setHint("20.00")
                    textphi.setTextColor(Color.parseColor("#D61C4E"))
                    bf2 = 0F
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
                    bf3 = a * 3
                    tot3.setText(bf3.toString())
                    textad.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot3.setText("00.00")
                    textad.setHint("20.00")
                    textad.setTextColor(Color.parseColor("#D61C4E"))
                    bf3 = 0F
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
                    bf11 = a * 6
                    tot11.setText(bf11.toString())
                    text3o.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot11.setText("00.00")
                    text3o.setHint("20.00")
                    text3o.setTextColor(Color.parseColor("#D61C4E"))
                    bf11 = 0F
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
                    bf4 = a * 2
                    tot4.setText(bf4.toString())
                    textcha.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot4.setText("00.00")
                    textcha.setHint("20.00")
                    textcha.setTextColor(Color.parseColor("#D61C4E"))
                    bf4 = 0F
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
                    bf5 = a * 2
                    tot5.setText(bf5.toString())
                    textgio.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot5.setText("00.00")
                    textgio.setHint("20.00")
                    textgio.setTextColor(Color.parseColor("#D61C4E"))
                    bf5 = 0F
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
                    bf6 = a * 2
                    tot6.setText(bf6.toString())
                    texteng.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot6.setText("00.00")
                    texteng.setHint("20.00")
                    texteng.setTextColor(Color.parseColor("#D61C4E"))
                    bf6 = 0F
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
                    bf7 = a * 2
                    tot7.setText(bf7.toString())
                    textfrc.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot7.setText("00.00")
                    textfrc.setHint("20.00")
                    textfrc.setTextColor(Color.parseColor("#D61C4E"))
                    bf7 = 0F
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
                    bf8 = a * 2
                    tot8.setText(bf8.toString())
                    textphila.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot8.setText("00.00")
                    textphila.setHint("20.00")
                    textphila.setTextColor(Color.parseColor("#D61C4E"))
                    bf8 = 0F
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
                    bf9 = a * 2
                    tot9.setText(bf9.toString())
                    textama.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot9.setText("00.00")
                    textama.setHint("20.00")
                    textama.setTextColor(Color.parseColor("#D61C4E"))
                    bf9 = 0F
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
                    bf10 = a * 1
                    tot10.setText(bf10.toString())
                    textsp.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot10.setText("00.00")
                    textsp.setHint("20.00")
                    textsp.setTextColor(Color.parseColor("#D61C4E"))
                    bf10 = 0F
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
            totalf1 = bf1+bf2+bf3+bf4+bf5+bf6+bf7+bf8+bf9+bf10+bf11
            texttot.setText(totalf1.toString())
            val moy = totalf1 / 32
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1) {
            totalf2 = bf1+bf2+bf3+bf4+bf5+bf6+bf7+bf8+bf9+bf11
            texttot.setText(totalf2.toString())
            val moy = totalf2 / 31
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (amazigh == f2) {
            totalf3 = bf1+bf2+bf3+bf4+bf5+bf6+bf7+bf8+bf10+bf11
            texttot.setText(totalf3.toString())
            val moy = totalf3 / 30
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1 && amazigh == f2) {
            totalf4 = bf1+bf2+bf3+bf4+bf5+bf6+bf7+bf8+bf11
            texttot.setText(totalf4.toString())
            var moy = totalf4 / 29
            var moyy = String.format("%.2f",moy)
            textmo.setText(moyy)

        }

    }

    override fun afterTextChanged(p0: Editable?) {
    }


}