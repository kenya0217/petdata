package jp.ac.asojuku.st.petapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var dec:Int = 0
    var border:Int = 0
    var png:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        choise_1.setOnClickListener { this.dec=1; this.border=50; this.png="here1"}
        choise_2.setOnClickListener { this.dec=2; this.border=100; this.png="here2"}
        choise_3.setOnClickListener { this.dec=3; this.border=200; this.png="here3"}
        choise_4.setOnClickListener { this.dec=4; this.border=300; this.png="here4"}
        choise_5.setOnClickListener { this.dec=4; this.border=300; this.png="here4"}
        choise_6.setOnClickListener { this.dec=4; this.border=300; this.png="here4"}


        choise_decide_button.setOnClickListener {
            var intent = Intent(this,menu::class.java)
            intent.putExtra("dec",this.dec)
            intent.putExtra("border",this.border)
            intent.putExtra("png",this.png)
            intent.putExtra("name",choise_name_text.text.toString())
            startActivity(intent)
        }
    }



}
