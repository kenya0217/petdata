package jp.ac.asojuku.st.petapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_end.*

class end : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
// データ待ち       text.setText("ばいばい"+name)
//        pic.setOnClickListener{ending(1,name)}
    }



    /*keynomberによってエンディングを変化させる*/
    fun ending(key: Int ?/*,name: String*/){
        when{
            key == 1->{/*keynomber1:洋服*/
//   データ待ち             pic.setImageResource(R.drawable.yakan1)
//                text.setText("やった！"+name+"は洋服になった！")
            }
                /*key1終了*/
            else ->{
//   データ待ち             pic.setImageResource(R.drawable.machie_white)
//                text.setText("残念…"+name+'燃えないゴミになってしまった…。")
            }



                /*key2終了*/
        }
        endbtn.setVisibility(View.VISIBLE)
        endbtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
