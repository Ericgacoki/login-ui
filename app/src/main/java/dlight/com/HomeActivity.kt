package dlight.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        WhenClicked()
    }

    private fun WhenClicked() {
        future.setOnClickListener {
            Toast.makeText(this, " Indeed the future is bright ", Toast.LENGTH_SHORT).show()
        }
    }

}
