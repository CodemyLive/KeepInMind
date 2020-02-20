package live.codemy.keepinmind.ui

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game.*
import live.codemy.keepinmind.R

class GameActivity : AppCompatActivity(R.layout.activity_game), View.OnClickListener {

    private var tempTag = ""
    private var counter = 0
    private var tempId = 0
    private var flag = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        card1.setOnClickListener(this)
        card2.setOnClickListener(this)

        card3.setOnClickListener(this)
        card4.setOnClickListener(this)
        card5.setOnClickListener(this)
        card6.setOnClickListener(this)
        card7.setOnClickListener(this)
        card8.setOnClickListener(this)
        card9.setOnClickListener(this)
        card10.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == tempId) {
            view.setBackgroundResource(R.mipmap.ic_launcher)
            clear()
            return
        }

        if (flag) {
            return
        }

        checkCard(view!!)
        openCard(view)
    }

    private fun openCard(view: View) {
        when (view.tag.toString()) {
            "flag_fr" -> {
                view.setBackgroundResource(R.drawable.flag_fr)
            }
            "flag_sh" -> {
                view.setBackgroundResource(R.drawable.flag_sh)
            }
            "flag_tr" -> {
                view.setBackgroundResource(R.drawable.flag_tr)
            }
            "flag_yt" -> {
                view.setBackgroundResource(R.drawable.flag_yt)
            }
            "flag_zm" -> {
                view.setBackgroundResource(R.drawable.flag_zm)
            }
        }
    }

    private fun checkCard(view: View) {
        if (counter == 1) {
            flag = true
            object : CountDownTimer(1000, 1000) {
                override fun onFinish() {
                    checkCard2(view)
                }

                override fun onTick(millisUntilFinished: Long) {}
            }.start()
        } else {
            checkCard2(view)
        }
    }

    private fun checkCard2(view: View) {
        if (view.tag.toString() == tempTag) {
            view.visibility = View.INVISIBLE
            findViewById<ImageButton>(tempId).visibility = View.INVISIBLE
        } else {
            if (counter == 1) {
                view.setBackgroundResource(R.mipmap.ic_launcher)
                findViewById<ImageButton>(tempId).setBackgroundResource(R.mipmap.ic_launcher)
            }
        }

        tempTag = view.tag.toString()
        tempId = view.id
        counter++

        if (counter == 2) {
            clear()
        }
    }

    private fun clear() {
        counter = 0
        tempId = 0
        flag = false
        tempTag = ""
    }
}
