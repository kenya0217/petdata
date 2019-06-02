package jp.ac.asojuku.st.petapplication

import android.content.Context
import android.content.Intent
import android.hardware.SensorManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.squareup.seismic.ShakeDetector
import kotlinx.android.synthetic.main.activity_shake.*

class shake : AppCompatActivity() , ShakeDetector.Listener{

    override fun hearShake() {
        image.setImageResource(R.drawable.yakan1)
        Mainback.setVisibility(View.VISIBLE)
        Mainback.setOnClickListener{
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shake)

//        when{
//            key == 3->{
//                pic.setImageResource(R.drawable.water13)
//            }
//            key == 2-> {
//                pic.setImageResource(R.drawable.water12)
//            }
//            key == 1->{
//                pic.setImageResource(R.drawable.water11)
//            }
//        }

        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val sd = ShakeDetector(this)
        sd.start(sensorManager)
    }
}
