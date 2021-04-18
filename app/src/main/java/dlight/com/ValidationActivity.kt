package dlight.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_validation.*

class ValidationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validation)

        userValidation()

    }

    private fun userValidation() {

        dlightlogo.setOnClickListener {
            Toast.makeText(this, " Brighter Future ", Toast.LENGTH_SHORT).show()
        }

        btnLogin.setOnClickListener {

            when {
                (Phone.text.toString() == "+254745623611") && (Pin.text.toString() == "1234") -> {
                    val homeActivityIntent = Intent(this, HomeActivity::class.java)
                    startActivity(homeActivityIntent)

                }
                (Phone.text.toString() == "+254716965216") && (Pin.text.toString() != "1234") -> {
                    Toast.makeText(this, " Wrong PIN ", Toast.LENGTH_SHORT).show()

                }
                Phone.text.toString().isEmpty() || Pin.text.toString().isEmpty() -> {

                    Toast.makeText(this, " Both Phone Number and PIN are required! ", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this, " Wrong details ", Toast.LENGTH_SHORT).show()
                }
            }

            }

            Forgot.setOnClickListener {
                Toast.makeText(this, " Action not ready ", Toast.LENGTH_SHORT).show()

            }
            Report.setOnClickListener {
                Toast.makeText(this, " Report issue ", Toast.LENGTH_SHORT).show()
            }
        }


}
