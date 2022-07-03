package android.contact.com.contacts

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    var novoBotao: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    novoBotao?.setOnClickListener {

    }

        novoBotao?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
//    override fun onResume() {
//        super.onResume()
//    }
}
