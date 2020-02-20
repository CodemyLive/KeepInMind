package live.codemy.keepinmind.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import live.codemy.keepinmind.R
import live.codemy.keepinmind.enums.GameOption
import live.codemy.keepinmind.enums.ParamKey
import live.codemy.keepinmind.util.extChangeStatusColor
import live.codemy.keepinmind.util.extStartActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        this extChangeStatusColor android.R.color.transparent

        btnEasyGG.setOnClickListener {
            startGameActivity(GameOption.EASYGG)
        }

        btnMedium.setOnClickListener {
            startGameActivity(GameOption.MEDIUM)
        }

        btnHard.setOnClickListener {
            startGameActivity(GameOption.HARD)
        }

        btnEpic.setOnClickListener {
            startGameActivity(GameOption.EPIC)
        }
    }

    private fun startGameActivity(gameOption: GameOption) {
        val bundle = Bundle()
        bundle.putString(ParamKey.GAME_OPTION.name, gameOption.name)
        this.extStartActivity(GameActivity::class.java, bundle)
    }
}
