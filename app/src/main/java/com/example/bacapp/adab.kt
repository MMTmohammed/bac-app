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
import kotlinx.android.synthetic.main.activity_adab.back
import kotlinx.android.synthetic.main.activity_adab.clear
import kotlinx.android.synthetic.main.activity_adab.factor
import kotlinx.android.synthetic.main.activity_adab.linearama
import kotlinx.android.synthetic.main.activity_adab.linearsp
import kotlinx.android.synthetic.main.activity_adab.textad
import kotlinx.android.synthetic.main.activity_adab.textama
import kotlinx.android.synthetic.main.activity_adab.textcha
import kotlinx.android.synthetic.main.activity_adab.texteng
import kotlinx.android.synthetic.main.activity_adab.textfrc
import kotlinx.android.synthetic.main.activity_adab.textgio
import kotlinx.android.synthetic.main.activity_adab.textma
import kotlinx.android.synthetic.main.activity_adab.textmo
import kotlinx.android.synthetic.main.activity_adab.textphila
import kotlinx.android.synthetic.main.activity_adab.textsp
import kotlinx.android.synthetic.main.activity_adab.texttot
import kotlinx.android.synthetic.main.activity_adab.tot1
import kotlinx.android.synthetic.main.activity_adab.tot10
import kotlinx.android.synthetic.main.activity_adab.tot3
import kotlinx.android.synthetic.main.activity_adab.tot4
import kotlinx.android.synthetic.main.activity_adab.tot5
import kotlinx.android.synthetic.main.activity_adab.tot6
import kotlinx.android.synthetic.main.activity_adab.tot7
import kotlinx.android.synthetic.main.activity_adab.tot8
import kotlinx.android.synthetic.main.activity_adab.tot9
import kotlinx.android.synthetic.main.activity_gastion.*
import kotlinx.android.synthetic.main.activity_math.*
import kotlinx.android.synthetic.main.activity_math.avfactor
import kotlinx.android.synthetic.main.activity_math.avtot
import kotlinx.android.synthetic.main.activity_math.i1
import kotlinx.android.synthetic.main.activity_math.i2
import kotlinx.android.synthetic.main.activity_math.i3
import kotlinx.android.synthetic.main.activity_math.i4
import kotlinx.android.synthetic.main.activity_math.i5
import kotlinx.android.synthetic.main.activity_math.i6
import kotlinx.android.synthetic.main.activity_math.i7
import kotlinx.android.synthetic.main.activity_math.i8
import kotlinx.android.synthetic.main.activity_math.i9
import kotlinx.android.synthetic.main.activity_math.tot11
import kotlinx.android.synthetic.main.activity_math.tot2

public var bv1 :Float= 0F

public var bv3 :Float= 0F
public var bv4 :Float= 0F
public var bv5 :Float= 0F
public var bv6 :Float= 0F
public var bv7 :Float= 0F
public var bv8 :Float= 0F
public var bv9 :Float= 0F
public var bv10 :Float= 0F

public var totalv1 :Float=0F
public var totalv2 :Float=0F
public var totalv3 :Float=0F
public var totalv4 :Float=0F
class adab : AppCompatActivity() ,TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adab)


        val bb = getSharedPreferences("transelat", Context.MODE_PRIVATE)
        val m = bb.getString("permetion", "nothing")
        if (m=="yes"){
            bbbbbb1.setBackgroundResource(R.color.balck_main)

            a5.setBackgroundResource(R.color.black)
            majm035.setBackgroundResource(R.drawable.strok_night)
            bar5.setBackgroundResource(R.color.black)
            moa5.setBackgroundResource(R.drawable.button_background_darktheme)

            i1.setBackgroundResource(R.drawable.strok_night)
            i2.setBackgroundResource(R.drawable.strok_night)
            i3.setBackgroundResource(R.drawable.strok_night)
            i4.setBackgroundResource(R.drawable.strok_night)
            i5.setBackgroundResource(R.drawable.strok_night)
            i6.setBackgroundResource(R.drawable.strok_night)
            i7.setBackgroundResource(R.drawable.strok_night)
            linearsp.setBackgroundResource(R.drawable.strok_night)
            linearama.setBackgroundResource(R.drawable.strok_night)

            tot1.setTextColor(getResources().getColor(R.color.color_write2))
            tot10.setTextColor(getResources().getColor(R.color.color_write2))
            tot3.setTextColor(getResources().getColor(R.color.color_write2))
            tot4.setTextColor(getResources().getColor(R.color.color_write2))
            tot5.setTextColor(getResources().getColor(R.color.color_write2))
            tot6.setTextColor(getResources().getColor(R.color.color_write2))
            tot7.setTextColor(getResources().getColor(R.color.color_write2))
            tot8.setTextColor(getResources().getColor(R.color.color_write2))
            tot9.setTextColor(getResources().getColor(R.color.color_write2))


            c1.setTextColor(getResources().getColor(R.color.color_write2))
            c2.setTextColor(getResources().getColor(R.color.color_write2))
            c3.setTextColor(getResources().getColor(R.color.color_write2))
            c4.setTextColor(getResources().getColor(R.color.color_write2))
            c5.setTextColor(getResources().getColor(R.color.color_write2))
            c6.setTextColor(getResources().getColor(R.color.color_write2))
            c7.setTextColor(getResources().getColor(R.color.color_write2))
            c8.setTextColor(getResources().getColor(R.color.color_write2))
            c9.setTextColor(getResources().getColor(R.color.color_write2))


            factor.setTextColor(getResources().getColor(R.color.color_write2))
            avfactor.setTextColor(getResources().getColor(R.color.color_write2))
            texttot.setTextColor(getResources().getColor(R.color.color_write2))
            avtot.setTextColor(getResources().getColor(R.color.color_write2))

            y1.setTextColor(getResources().getColor(R.color.color_write2))
            y2.setTextColor(getResources().getColor(R.color.color_write2))
            y3.setTextColor(getResources().getColor(R.color.color_write2))
            y4.setTextColor(getResources().getColor(R.color.color_write2))
            y5.setTextColor(getResources().getColor(R.color.color_write2))
            y6.setTextColor(getResources().getColor(R.color.color_write2))
            y7.setTextColor(getResources().getColor(R.color.color_write2))
            y8.setTextColor(getResources().getColor(R.color.color_write2))
            y9.setTextColor(getResources().getColor(R.color.color_write2))


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
            totalv1 = 0F
            totalv2 = 0F
            totalv3 = 0F
            totalv4 = 0F
            bv1 = 0F
            bv3 = 0F
            bv4 = 0F
            bv5 = 0F
            bv6 = 0F
            bv7 = 0F
            bv8 = 0F
            bv9 = 0F
            bv10 = 0F

            textma.setText("")
            textma.setHint("20.00")
            textmo.setText("")
            textmo.setHint("20.00")
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
            factor.setText("28")
        }
        if (amazigh == f2) {
            linearama.visibility = View.GONE
            factor.setText("27")
        }
        if (sport == f1 && amazigh == f2) {
            factor.setText("26")
        }



        textma.addTextChangedListener {
            val a = textma.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textma.setTextColor(getResources().getColor(R.color.black_write))
                    val a = textma.text.toString().toFloat()
                    bv1 = a * 2
                    tot1.setText(bv1.toString())
                    textma.setTextColor(Color.parseColor("#5BB318"))
                } else {
                    tot1.setText("00.00")
                    textma.setHint("20.00")
                    textma.setTextColor(Color.parseColor("#D61C4E"))
                    bv1=0F
                }
            } else {
                tot1.setText("00.00")
                textma.setHint("20.00")
                textma.setTextColor(Color.parseColor("#D61C4E"))
            }


        }
        textad.addTextChangedListener {
            val a = textad.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textad.setTextColor(getResources().getColor(R.color.black_write))
                    val a = textad.text.toString().toFloat()
                    bv3 = a * 6
                    tot3.setText(bv3.toString())
                    textad.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot3.setText("00.00")
                    textad.setHint("20.00")
                    textad.setTextColor(Color.parseColor("#D61C4E"))
                    bv3=0F
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
                    bv4 = a * 2
                    tot4.setText(bv4.toString())
                    textcha.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot4.setText("00.00")
                    textcha.setHint("20.00")
                    textcha.setTextColor(Color.parseColor("#D61C4E"))
                    bv4=0F
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
                    bv5 = a * 4
                    tot5.setText(bv5.toString())
                    textgio.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot5.setText("00.00")
                    textgio.setHint("20.00")
                    textgio.setTextColor(Color.parseColor("#D61C4E"))
                    bv5=0F
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
                    bv6 = a * 3
                    tot6.setText(bv6.toString())
                    texteng.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot6.setText("00.00")
                    texteng.setHint("20.00")
                    texteng.setTextColor(Color.parseColor("#D61C4E"))
                    bv6=0F
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
                    bv7 = a * 3
                    tot7.setText(bv7.toString())
                    textfrc.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot7.setText("00.00")
                    textfrc.setHint("20.00")
                    textfrc.setTextColor(Color.parseColor("#D61C4E"))
                    bv7=0F
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
                    bv8 = a * 6
                    tot8.setText(bv8.toString())
                    textphila.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot8.setText("00.00")
                    textphila.setHint("20.00")
                    textphila.setTextColor(Color.parseColor("#D61C4E"))
                    bv8=0F
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
                    bv9 = a * 2
                    tot9.setText(bv9.toString())
                    textama.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot9.setText("00.00")
                    textama.setHint("20.00")
                    textama.setTextColor(Color.parseColor("#D61C4E"))
                    bv9=0F
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
                    bv10 = a * 1
                    tot10.setText(bv10.toString())
                    textsp.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot10.setText("00.00")
                    textsp.setHint("20.00")
                    textsp.setTextColor(Color.parseColor("#D61C4E"))
                    bv10=0F
                }
            }else {
                tot10.setText("00.00")
                textsp.setHint("20.00")
                textsp.setTextColor(Color.parseColor("#D61C4E"))

            }

        }
        tot1.addTextChangedListener(this)
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
            totalv1 = bv1+bv3+bv4+bv5+bv6+bv7+bv8+bv9+bv10
            texttot.setText(totalv1.toString())
            val moy = totalv1 / 29
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1) {
            totalv2 = bv1+bv3+bv4+bv5+bv6+bv7+bv8+bv9
            texttot.setText(totalv2.toString())
            val moy = totalv2 / 28
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (amazigh == f2) {
            totalv3 = bv1+bv3+bv4+bv5+bv6+bv7+bv8+bv10
            texttot.setText(totalv3.toString())
            val moy = totalv3 / 27
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1 && amazigh == f2) {
            totalv4 = bv1+bv3+bv4+bv5+bv6+bv7+bv8
            texttot.setText(totalv4.toString())
            var moy = totalv4 / 26
            var moyy = String.format("%.2f",moy)
            textmo.setText(moyy)

        }

    }

    override fun afterTextChanged(p0: Editable?) {
    }


}
