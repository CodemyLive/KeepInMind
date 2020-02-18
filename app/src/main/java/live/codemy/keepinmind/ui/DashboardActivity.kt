package live.codemy.keepinmind.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import live.codemy.keepinmind.R
import live.codemy.keepinmind.util.extChangeStatusColor

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        this extChangeStatusColor android.R.color.transparent
    }
}
