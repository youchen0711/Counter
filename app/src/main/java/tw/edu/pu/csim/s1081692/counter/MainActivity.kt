package tw.edu.pu.csim.s1081692.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var counter:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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


}