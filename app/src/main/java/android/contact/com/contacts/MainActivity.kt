package android.contact.com.contacts

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    var exibir_campo: TextView? = null
    var container_endereco: LinearLayout? = null
    var mudar_texto: LinearLayout? = null
    var primeiro_nome: EditText? = null
    var sobrenome: EditText? = null
    var empresa: EditText? = null
    var logradouro: EditText? = null
    var numero: EditText? = null
    var complemento: EditText? = null
    var bairro: EditText? = null
    var cidade: EditText? = null
    var cep: EditText? = null
    var uf: EditText? = null
    var telefone_profissional: EditText? = null
    var telefone_pessoal: EditText? = null
    var email_profissional: EditText? = null
    var email_pessoal: EditText? = null
    var observacoes: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exibir_campo = findViewById(R.id.fechar_abrir)
        mudar_texto = findViewById(R.id.Show)

        exibir_campo?.setOnClickListener{
            if (container_endereco?.visibility == View.VISIBLE) {
                container_endereco?.visibility = View.GONE

            } else {
                container_endereco?.visibility = View.VISIBLE
            }

        }


    }
}
