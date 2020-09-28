package jeonsoeun.myhomecontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val mainText = findViewById<TextView>(R.id.main_text)
       init()
    }
    fun MainActivity.init() {
        // 합성 프로퍼티 사용. 이게 findViewById를 대신해준다.
        main_text.text = "오 이렇게 한번에 되네."
        main_text.visibility = View.VISIBLE
    }
}