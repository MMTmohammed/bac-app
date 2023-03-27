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
import kotlinx.android.synthetic.main.activity_gastion.*
import kotlinx.android.synthetic.main.activity_math.*
import kotlinx.android.synthetic.main.activity_math.avfactor
import kotlinx.android.synthetic.main.activity_math.avtot
import kotlinx.android.synthetic.main.activity_math.back
import kotlinx.android.synthetic.main.activity_math.bbb1
import kotlinx.android.synthetic.main.activity_math.clear
import kotlinx.android.synthetic.main.activity_math.factor
import kotlinx.android.synthetic.main.activity_math.i1
import kotlinx.android.synthetic.main.activity_math.i2
import kotlinx.android.synthetic.main.activity_math.i3
import kotlinx.android.synthetic.main.activity_math.i4
import kotlinx.android.synthetic.main.activity_math.i5
import kotlinx.android.synthetic.main.activity_math.i6
import kotlinx.android.synthetic.main.activity_math.i7
import kotlinx.android.synthetic.main.activity_math.i8
import kotlinx.android.synthetic.main.activity_math.i9
import kotlinx.android.synthetic.main.activity_math.linearama
import kotlinx.android.synthetic.main.activity_math.linearsp
import kotlinx.android.synthetic.main.activity_math.text3o
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
import kotlinx.android.synthetic.main.activity_math.tot11
import kotlinx.android.synthetic.main.activity_math.tot2
import kotlinx.android.synthetic.main.activity_math.tot3
import kotlinx.android.synthetic.main.activity_math.tot4
import kotlinx.android.synthetic.main.activity_math.tot5
import kotlinx.android.synthetic.main.activity_math.tot6
import kotlinx.android.synthetic.main.activity_math.tot7
import kotlinx.android.synthetic.main.activity_math.tot8
import kotlinx.android.synthetic.main.activity_math.tot9
import kotlinx.android.synthetic.main.activity_teck.*

public var bq1 :Float= 0F
public var bq2 :Float= 0F
public var bq3 :Float= 0F
public var bq4 :Float= 0F
public var bq5 :Float= 0F
public var bq6 :Float= 0F
public var bq7 :Float= 0F
public var bq8 :Float= 0F
public var bq9 :Float= 0F
public var bq10 :Float= 0F
public var bq11 :Float= 0F
public var bq12 :Float= 0F
public var totalq1 :Float=0F
public var totalq2 :Float=0F
public var totalq3 :Float=0F
public var totalq4 :Float=0F
class gastion : AppCompatActivity() ,TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastion)


        val bb = getSharedPreferences("transelat", Context.MODE_PRIVATE)
        val m = bb.getString("permetion", "nothing")
        if (m=="yes"){
            bbbbb1.setBackgroundResource(R.color.balck_main)

            a4.setBackgroundResource(R.color.black)
            majm034.setBackgroundResource(R.drawable.strok_night)
            bar4.setBackgroundResource(R.color.black)
            moa4.setBackgroundResource(R.drawable.button_background_darktheme)

            i1.setBackgroundResource(R.drawable.strok_night)
            i2.setBackgroundResource(R.drawable.strok_night)
            i3.setBackgroundResource(R.drawable.strok_night)
            i4.setBackgroundResource(R.drawable.strok_night)
            i5.setBackgroundResource(R.drawable.strok_night)
            i6.setBackgroundResource(R.drawable.strok_night)
            i7.setBackgroundResource(R.drawable.strok_night)
            i8.setBackgroundResource(R.drawable.strok_night)
            i9.setBackgroundResource(R.drawable.strok_night)
            i10.setBackgroundResource(R.drawable.strok_night)
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
            tot12.setTextColor(getResources().getColor(R.color.color_write2))

            coon1.setTextColor(getResources().getColor(R.color.color_write2))
            coon2.setTextColor(getResources().getColor(R.color.color_write2))
            coon3.setTextColor(getResources().getColor(R.color.color_write2))
            coon4.setTextColor(getResources().getColor(R.color.color_write2))
            coon5.setTextColor(getResources().getColor(R.color.color_write2))
            coon6.setTextColor(getResources().getColor(R.color.color_write2))
            coon7.setTextColor(getResources().getColor(R.color.color_write2))
            coon8.setTextColor(getResources().getColor(R.color.color_write2))
            coon9.setTextColor(getResources().getColor(R.color.color_write2))
            coon10.setTextColor(getResources().getColor(R.color.color_write2))
            coon11.setTextColor(getResources().getColor(R.color.color_write2))
            coon12.setTextColor(getResources().getColor(R.color.color_write2))

            factor.setTextColor(getResources().getColor(R.color.color_write2))
            avfactor.setTextColor(getResources().getColor(R.color.color_write2))
            texttot.setTextColor(getResources().getColor(R.color.color_write2))
            avtot.setTextColor(getResources().getColor(R.color.color_write2))

            lll1.setTextColor(getResources().getColor(R.color.color_write2))
            lll2.setTextColor(getResources().getColor(R.color.color_write2))
            lll3.setTextColor(getResources().getColor(R.color.color_write2))
            lll4.setTextColor(getResources().getColor(R.color.color_write2))
            lll5.setTextColor(getResources().getColor(R.color.color_write2))
            lll6.setTextColor(getResources().getColor(R.color.color_write2))
            lll7.setTextColor(getResources().getColor(R.color.color_write2))
            lll8.setTextColor(getResources().getColor(R.color.color_write2))
            lll9.setTextColor(getResources().getColor(R.color.color_write2))
            lll10.setTextColor(getResources().getColor(R.color.color_write2))
            lll11.setTextColor(getResources().getColor(R.color.color_write2))
            lll12.setTextColor(getResources().getColor(R.color.color_write2))

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
            totalq1 = 0F
            totalq2 = 0F
            totalq3 = 0F
            totalq4 = 0F
            bq1 = 0F
            bq2 = 0F
            bq3 = 0F
            bq4 = 0F
            bq5 = 0F
            bq6 = 0F
            bq7 = 0F
            bq8 = 0F
            bq9 = 0F
            bq10 = 0F
            bq11 = 0F
            bq12 = 0F

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
            textlaw.setText("")
            textlaw.setHint("20.00")

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
            tot12.setText("00.00")
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
            factor.setText("35")
        }
        if (amazigh == f2) {
            linearama.visibility = View.GONE
            factor.setText("34")
        }
        if (sport == f1 && amazigh == f2) {
            factor.setText("33")
        }



        textma.addTextChangedListener {
            val a = textma.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textma.setTextColor(getResources().getColor(R.color.black_write))
                    val a = textma.text.toString().toFloat()
                    bq1 = a * 5
                    tot1.setText(bq1.toString())
                    textma.setTextColor(Color.parseColor("#5BB318"))
                } else {
                    tot1.setText("00.00")
                    textma.setHint("20.00")
                    textma.setTextColor(Color.parseColor("#D61C4E"))
                    bq1=0F
                }
            } else {
                tot1.setText("00.00")
                textma.setHint("20.00")
                textma.setTextColor(Color.parseColor("#D61C4E"))
            }


        }
         textlaw.addTextChangedListener {
            val a = textlaw.text.toString()
            if (a != ".") {
                if (a.isNotEmpty() && a.toFloat() < 21 && a.toFloat() >= 0) {
                    textma.setTextColor(getResources().getColor(R.color.black_write))
                    val a = textlaw.text.toString().toFloat()
                    bq12 = a * 2
                    tot12.setText(bq12.toString())
                    textlaw.setTextColor(Color.parseColor("#5BB318"))
                } else {
                    tot12.setText("00.00")
                    textlaw.setHint("20.00")
                    textlaw.setTextColor(Color.parseColor("#D61C4E"))
                    bq12=0F
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
                    bq2 = a * 6
                    tot2.setText(bq2.toString())
                    textphi.setTextColor(Color.parseColor("#5BB318"))
                } else {
                    tot2.setText("00.00")
                    textphi.setHint("20.00")
                    textphi.setTextColor(Color.parseColor("#D61C4E"))
                    bq2=0F
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
                    bq3 = a * 3
                    tot3.setText(bq3.toString())
                    textad.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot3.setText("00.00")
                    textad.setHint("20.00")
                    textad.setTextColor(Color.parseColor("#D61C4E"))
                    bq3=0F
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
                    bq11 = a * 5
                    tot11.setText(bq11.toString())
                    text3o.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot11.setText("00.00")
                    text3o.setHint("20.00")
                    text3o.setTextColor(Color.parseColor("#D61C4E"))
                    bq11=0F
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
                    bq4 = a * 2
                    tot4.setText(bq4.toString())
                    textcha.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot4.setText("00.00")
                    textcha.setHint("20.00")
                    textcha.setTextColor(Color.parseColor("#D61C4E"))
                    bq4=0F
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
                    bq5 = a * 4
                    tot5.setText(bq5.toString())
                    textgio.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot5.setText("00.00")
                    textgio.setHint("20.00")
                    textgio.setTextColor(Color.parseColor("#D61C4E"))
                    bq5=0F
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
                    bq6 = a * 2
                    tot6.setText(bq6.toString())
                    texteng.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot6.setText("00.00")
                    texteng.setHint("20.00")
                    texteng.setTextColor(Color.parseColor("#D61C4E"))
                    bq6=0F
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
                    bq7 = a * 2
                    tot7.setText(bq7.toString())
                    textfrc.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot7.setText("00.00")
                    textfrc.setHint("20.00")
                    textfrc.setTextColor(Color.parseColor("#D61C4E"))
                    bq7=0F
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
                    bq8 = a * 2
                    tot8.setText(bq8.toString())
                    textphila.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot8.setText("00.00")
                    textphila.setHint("20.00")
                    textphila.setTextColor(Color.parseColor("#D61C4E"))
                    bq8=0F
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
                    bq9 = a * 2
                    tot9.setText(bq9.toString())
                    textama.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot9.setText("00.00")
                    textama.setHint("20.00")
                    textama.setTextColor(Color.parseColor("#D61C4E"))
                    bq9=0F
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
                    bq10 = a * 1
                    tot10.setText(bq10.toString())
                    textsp.setTextColor(Color.parseColor("#5BB218"))
                } else {
                    tot10.setText("00.00")
                    textsp.setHint("20.00")
                    textsp.setTextColor(Color.parseColor("#D61C4E"))
                    bq10=0F
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
        tot12.addTextChangedListener(this)

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
            totalq1 = bq1+bq2+bq3+bq4+bq5+bq6+bq7+bq8+bq9+bq10+bq11+bq12
            texttot.setText(totalq1.toString())
            val moy = totalq1 / 36
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1) {
            totalq2 = bq1+bq2+bq3+bq4+bq5+bq6+bq7+bq8+bq9+bq11+bq12
            texttot.setText(totalq2.toString())
            val moy = totalq2 / 35
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (amazigh == f2) {
            totalq3 = bq1+bq2+bq3+bq4+bq5+bq6+bq7+bq8+bq10+bq11+bq12
            texttot.setText(totalq3.toString())
            val moy = totalq3 / 34
            val moyy = String.format("%.2f",moy)
            textmo.setText(moyy)
        }


        if (sport == f1 && amazigh == f2) {
            totalq4 = bq1+bq2+bq3+bq4+bq5+bq6+bq7+bq8+bq11+bq12
            texttot.setText(totalq4.toString())
            var moy = totalq4 / 33
            var moyy = String.format("%.2f",moy)
            textmo.setText(moyy)

        }

    }

    override fun afterTextChanged(p0: Editable?) {
    }


}