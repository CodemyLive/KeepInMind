package live.codemy.keepinmind.util

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     18/02/2020 - 21:15     ║
╚════════════════════════════╝
 */

fun <ClassName> Context.extStartActivity(cls: Class<ClassName>, bundle: Bundle? = null) {
    val intent = Intent(this, cls)
    if (bundle != null) {
        intent.putExtras(bundle)
    }
    startActivity(intent)
    (this as AppCompatActivity).finish()
}

infix fun AppCompatActivity.extChangeStatusColor(@ColorRes id: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        window.statusBarColor = resources.getColor(id, this.theme)
    } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.statusBarColor = resources.getColor(id)
    }

}