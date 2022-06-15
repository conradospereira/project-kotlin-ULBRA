package android.contact.com.contacts

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    var exibir_campo: TextView? = null
    var container_endereco: LinearLayout? = null
    var mudar_texto: LinearLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exibir_campo = findViewById(R.id.fechar_abrir)
        mudar_texto = findViewById(R.id.Show)



        exibir_campo?.setOnClickListener{
            if (container_endereco?.visibility == View.VISIBLE) {
                container_endereco?.visibility = View.GONE
                mudar_texto?.text.

            } else {
                container_endereco?.visibility = View.VISIBLE
            }

        }


    }
}
