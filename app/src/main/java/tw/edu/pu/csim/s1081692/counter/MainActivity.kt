package tw.edu.pu.csim.s1081692.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewOutlineProvider
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener , View.OnLongClickListener{

    var counter:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)

        button3.setOnClickListener(this)

        btnHappy.setOnClickListener(this)

        btnHappy.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                counter= (1..100).random()
                txv.text = counter.toString()
            }
        })

        txv.setOnLongClickListener(this)
        img.setOnLongClickListener(this)
        img.setOnClickListener(this)

    }


    fun Add(v: View){
        //if (v.id==R.id.button1){
        if (v==button1){
            counter++
        }
        else{
            counter += 2
        }
        txv.text = counter.toString()
    }



    override fun onClick(view: View) {
        if (view==button4 ||view==txv || view==img){
            counter++
        }
        else if(view==button5){
            counter+=2
        }
        else{
            counter = 0
        }
        txv.text = counter.toString()
    }

    override fun onLongClick(v: View?): Boolean {
        if(v==txv) {
            counter += 2
        }
        else{
            counter--
        }
        txv.text = counter.toString()
        return true
    }
}