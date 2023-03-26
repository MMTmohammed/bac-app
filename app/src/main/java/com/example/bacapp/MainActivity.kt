package com.example.bacapp

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_math.*
import kotlinx.android.synthetic.main.alert_dialog.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        math_btn.setOnClickListener {
            if (cardsp.isSelected) {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "end1")
                b.apply()
            } else {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "start1")
                b.apply()
            }
            if (cardam.isSelected) {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "end2")
                b.apply()

            } else {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "start2")
                b.apply()
            }
            val goto = Intent(this, math::class.java)
            startActivityForResult(goto, 1)
        }
        mt_btn.setOnClickListener {
            if (cardsp.isSelected) {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "end1")
                b.apply()
            } else {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "start1")
                b.apply()
            }
            if (cardam.isSelected) {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "end2")
                b.apply()

            } else {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "start2")
                b.apply()
            }
            val goto = Intent(this, teck::class.java)
            startActivityForResult(goto, 1)
        }
        sc_btn.setOnClickListener {
            if (cardsp.isSelected) {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "end1")
                b.apply()
            } else {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "start1")
                b.apply()
            }
            if (cardam.isSelected) {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "end2")
                b.apply()

            } else {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "start2")
                b.apply()
            }
            val goto = Intent(this, since::class.java)
            startActivityForResult(goto, 1)
        }
        gs_btn.setOnClickListener {
            if (cardsp.isSelected) {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "end1")
                b.apply()
            } else {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "start1")
                b.apply()
            }
            if (cardam.isSelected) {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "end2")
                b.apply()

            } else {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "start2")
                b.apply()
            }
            val goto = Intent(this, gastion::class.java)
            startActivityForResult(goto, 1)
        }
        lng_btn.setOnClickListener {
            if (cardsp.isSelected) {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "end1")
                b.apply()
            } else {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "start1")
                b.apply()
            }
            if (cardam.isSelected) {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "end2")
                b.apply()

            } else {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "start2")
                b.apply()
            }
            val goto = Intent(this, lang::class.java)
            startActivityForResult(goto, 1)
        }
        lt_btn.setOnClickListener {
            if (cardsp.isSelected) {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "end1")
                b.apply()
            } else {
                val a = getSharedPreferences("file2", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly1", "start1")
                b.apply()
            }
            if (cardam.isSelected) {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "end2")
                b.apply()

            } else {
                val a = getSharedPreferences("file3", Context.MODE_PRIVATE)
                val b = a.edit()
                b.putString("kly2", "start2")
                b.apply()
            }
            val goto = Intent(this, adab::class.java)
            startActivityForResult(goto, 1)
        }


        info.setOnClickListener {
            val view = View.inflate(this, R.layout.alert_dialog, null)
            val dialog = AlertDialog.Builder(this)
            dialog.setView(view)
            val show = dialog.create()
            show.window!!.setBackgroundDrawableResource(R.drawable.background_alertdialog)
            show.show()
            view.btn.setOnClickListener {
                show.dismiss()
            }
        }


        cardsp.setOnClickListener {
            cardsp.isSelected = !cardsp.isSelected}
        cardam.setOnClickListener {
                cardam.isSelected = !cardam.isSelected
            }

        val b = getSharedPreferences("save", Context.MODE_PRIVATE)
        val c =b.edit()
        c.putString("value","check")
        val a = b.getString("value", "nothing")
        if (a=="check"){
            switch1.setChecked(true)
            back_ground.setBackgroundResource(R.drawable.backgrounst_night_mode)

            sp.setImageResource(R.drawable.run1)
            am.setImageResource(R.drawable.langue1)
            mat.setImageResource(R.drawable.pi1)
            mt.setImageResource(R.drawable.atom1)
            scn.setImageResource(R.drawable.vulume1)
            ad.setImageResource(R.drawable.book1)
            eng.setImageResource(R.drawable.langue1)
            gas.setImageResource(R.drawable.graphe1)

            info.setBackgroundColor(getResources().getColor(R.color.info_black))

            gs_btn.setBackgroundResource(R.drawable.darktheme)
            lng_btn.setBackgroundResource(R.drawable.darktheme)
            lt_btn.setBackgroundResource(R.drawable.darktheme)
            sc_btn.setBackgroundResource(R.drawable.darktheme)
            mt_btn.setBackgroundResource(R.drawable.darktheme)
            math_btn.setBackgroundResource(R.drawable.darktheme)
            cardam.setBackgroundResource(R.drawable.darktheme)
            cardsp.setBackgroundResource(R.drawable.darktheme)

            x1.setTextColor(getResources().getColor(R.color.color_write2))
            x2.setTextColor(getResources().getColor(R.color.color_write2))
            x3.setTextColor(getResources().getColor(R.color.color_write2))
            x4.setTextColor(getResources().getColor(R.color.color_write2))
            x5.setTextColor(getResources().getColor(R.color.color_write2))
            x6.setTextColor(getResources().getColor(R.color.color_write2))
            x7.setTextColor(getResources().getColor(R.color.color_write2))
            x8.setTextColor(getResources().getColor(R.color.color_write2))





            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.black)


            info.setOnClickListener {
                val view = View.inflate(this, R.layout.alert_dialog_darktheme, null)
                val dialog = AlertDialog.Builder(this)
                dialog.setView(view)
                val show = dialog.create()
                show.window!!.setBackgroundDrawableResource(R.drawable.background_alertdialog_darktheme)
                show.show()
                view.btn.setOnClickListener {
                    show.dismiss()
                }
            }
        }
        else{
            switch1.setChecked(false)

            back_ground.setBackgroundResource(R.drawable.backgrounst1)


            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.colorf)


            sp.setImageResource(R.drawable.run)
            am.setImageResource(R.drawable.langue)
            mat.setImageResource(R.drawable.pi)
            mt.setImageResource(R.drawable.atom)
            scn.setImageResource(R.drawable.vulume)
            ad.setImageResource(R.drawable.book)
            eng.setImageResource(R.drawable.langue)
            gas.setImageResource(R.drawable.graphe)

            info.setBackgroundColor(getResources().getColor(R.color.colorf))
            gs_btn.setBackgroundResource(R.drawable.daytheme)
            lng_btn.setBackgroundResource(R.drawable.daytheme)
            lt_btn.setBackgroundResource(R.drawable.daytheme)
            sc_btn.setBackgroundResource(R.drawable.daytheme)
            mt_btn.setBackgroundResource(R.drawable.daytheme)
            math_btn.setBackgroundResource(R.drawable.daytheme)
            cardam.setBackgroundResource(R.drawable.daytheme)
            cardsp.setBackgroundResource(R.drawable.daytheme)

            x1.setTextColor(getResources().getColor(R.color.colorf))
            x2.setTextColor(getResources().getColor(R.color.colorf))
            x3.setTextColor(getResources().getColor(R.color.colorf))
            x4.setTextColor(getResources().getColor(R.color.colorf))
            x5.setTextColor(getResources().getColor(R.color.colorf))
            x6.setTextColor(getResources().getColor(R.color.colorf))
            x7.setTextColor(getResources().getColor(R.color.colorf))
            x8.setTextColor(getResources().getColor(R.color.colorf))


            info.setOnClickListener {
                val view = View.inflate(this, R.layout.alert_dialog, null)
                val dialog = AlertDialog.Builder(this)
                dialog.setView(view)
                val show = dialog.create()
                show.window!!.setBackgroundDrawableResource(R.drawable.background_alertdialog)
                show.show()
                view.btn.setOnClickListener {
                    show.dismiss()
                }
            }
        }

            switch1.setOnCheckedChangeListener { _, isChecked ->

                if (switch1.isChecked) {
                    val a = getSharedPreferences("save", MODE_PRIVATE)
                    val b = a.edit()
                    b.putString("value", "check")
                    b.apply()


                    val aa = getSharedPreferences("transelat", MODE_PRIVATE)
                    val bb = aa.edit()
                    bb.putString("permetion", "yes")
                    bb.apply()


                    back_ground.setBackgroundResource(R.drawable.backgrounst_night_mode)

                    sp.setImageResource(R.drawable.run1)
                    am.setImageResource(R.drawable.langue1)
                    mat.setImageResource(R.drawable.pi1)
                    mt.setImageResource(R.drawable.atom1)
                    scn.setImageResource(R.drawable.vulume1)
                    ad.setImageResource(R.drawable.book1)
                    eng.setImageResource(R.drawable.langue1)
                    gas.setImageResource(R.drawable.graphe1)

                    info.setBackgroundColor(getResources().getColor(R.color.info_black))

                    gs_btn.setBackgroundResource(R.drawable.darktheme)
                    lng_btn.setBackgroundResource(R.drawable.darktheme)
                    lt_btn.setBackgroundResource(R.drawable.darktheme)
                    sc_btn.setBackgroundResource(R.drawable.darktheme)
                    mt_btn.setBackgroundResource(R.drawable.darktheme)
                    math_btn.setBackgroundResource(R.drawable.darktheme)
                    cardam.setBackgroundResource(R.drawable.darktheme)
                    cardsp.setBackgroundResource(R.drawable.darktheme)

                    x1.setTextColor(getResources().getColor(R.color.color_write2))
                    x2.setTextColor(getResources().getColor(R.color.color_write2))
                    x3.setTextColor(getResources().getColor(R.color.color_write2))
                    x4.setTextColor(getResources().getColor(R.color.color_write2))
                    x5.setTextColor(getResources().getColor(R.color.color_write2))
                    x6.setTextColor(getResources().getColor(R.color.color_write2))
                    x7.setTextColor(getResources().getColor(R.color.color_write2))
                    x8.setTextColor(getResources().getColor(R.color.color_write2))
                    //math



                    Toast.makeText(this, "وضع مظلم : تفعيل", Toast.LENGTH_SHORT).show()

                    val window = this.window
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                    window.statusBarColor = this.resources.getColor(R.color.black)


                    info.setOnClickListener {
                        val view = View.inflate(this, R.layout.alert_dialog_darktheme, null)
                        val dialog = AlertDialog.Builder(this)
                        dialog.setView(view)
                        val show = dialog.create()
                        show.window!!.setBackgroundDrawableResource(R.drawable.background_alertdialog_darktheme)
                        show.show()
                        view.btn.setOnClickListener {
                            show.dismiss()
                        }
                    }

                }
                else {
                    val a = getSharedPreferences("save", MODE_PRIVATE)
                    val b = a.edit()
                    b.putString("value", "not_check")
                    b.apply()


                    val aa = getSharedPreferences("transelat", MODE_PRIVATE)
                    val bb = aa.edit()
                    bb.putString("permetion", "no")
                    bb.apply()


                    Toast.makeText(this, "وضع مظلم : ايقاف", Toast.LENGTH_SHORT).show()

                    back_ground.setBackgroundResource(R.drawable.backgrounst1)


                    val window = this.window
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                    window.statusBarColor = this.resources.getColor(R.color.colorf)


                    sp.setImageResource(R.drawable.run)
                    am.setImageResource(R.drawable.langue)
                    mat.setImageResource(R.drawable.pi)
                    mt.setImageResource(R.drawable.atom)
                    scn.setImageResource(R.drawable.vulume)
                    ad.setImageResource(R.drawable.book)
                    eng.setImageResource(R.drawable.langue)
                    gas.setImageResource(R.drawable.graphe)

                    info.setBackgroundColor(getResources().getColor(R.color.colorf))
                    gs_btn.setBackgroundResource(R.drawable.daytheme)
                    lng_btn.setBackgroundResource(R.drawable.daytheme)
                    lt_btn.setBackgroundResource(R.drawable.daytheme)
                    sc_btn.setBackgroundResource(R.drawable.daytheme)
                    mt_btn.setBackgroundResource(R.drawable.daytheme)
                    math_btn.setBackgroundResource(R.drawable.daytheme)
                    cardam.setBackgroundResource(R.drawable.daytheme)
                    cardsp.setBackgroundResource(R.drawable.daytheme)

                    x1.setTextColor(getResources().getColor(R.color.colorf))
                    x2.setTextColor(getResources().getColor(R.color.colorf))
                    x3.setTextColor(getResources().getColor(R.color.colorf))
                    x4.setTextColor(getResources().getColor(R.color.colorf))
                    x5.setTextColor(getResources().getColor(R.color.colorf))
                    x6.setTextColor(getResources().getColor(R.color.colorf))
                    x7.setTextColor(getResources().getColor(R.color.colorf))
                    x8.setTextColor(getResources().getColor(R.color.colorf))




                    info.setOnClickListener {
                        val view = View.inflate(this, R.layout.alert_dialog, null)
                        val dialog = AlertDialog.Builder(this)
                        dialog.setView(view)
                        val show = dialog.create()
                        show.window!!.setBackgroundDrawableResource(R.drawable.background_alertdialog)
                        show.show()
                        view.btn.setOnClickListener {
                            show.dismiss()
                        }
                    }


                }
            }





        }
    }



