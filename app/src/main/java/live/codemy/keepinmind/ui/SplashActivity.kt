package live.codemy.keepinmind.ui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import live.codemy.keepinmind.R
import live.codemy.keepinmind.util.extChangeStatusColor
import live.codemy.keepinmind.util.extStartActivity


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        this extChangeStatusColor android.R.color.holo_green_dark

        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                this@SplashActivity extStartActivity DashboardActivity::class.java
            }

            override fun onTick(millisUntilFinished: Long) {

            }
        }.start()
    }
}
