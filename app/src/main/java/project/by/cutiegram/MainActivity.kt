package project.by.cutiegram

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.content.Intent
import android.widget.Button
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val btnNext: Button = findViewById(R.id.LoginButton)
        btnNext.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)

        }


    }
}
