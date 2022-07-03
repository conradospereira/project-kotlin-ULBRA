package android.contact.com.contacts

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.room.Room

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
    var salvarBotao: TextView? = null
    var excluirBotao: TextView? = null
    var fecharBotao: TextView? = null
    private var contatoDAO: ContatoDAO? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

        inicializarBanco()

        primeiro_nome = findViewById<EditText>(R.id.primeiro_nome)
        sobrenome = findViewById<EditText>(R.id.sobrenome)
        empresa = findViewById<EditText>(R.id.nome_empresa)
        logradouro = findViewById<EditText>(R.id.logradouro)
        numero = findViewById<EditText>(R.id.numero)
        complemento = findViewById<EditText>(R.id.complemento)
        bairro = findViewById<EditText>(R.id.bairro)
        cep = findViewById<EditText>(R.id.cep)
        uf = findViewById<EditText>(R.id.uf)
        telefone_profissional = findViewById<EditText>(R.id.telefone_profissional)
        telefone_pessoal = findViewById(R.id.telefone_pessoal)
        email_profissional = findViewById(R.id.email_profissional)
        email_pessoal = findViewById(R.id.email_pessoal)
        observacoes = findViewById(R.id.observacoes)
        salvarBotao = findViewById(R.id.botao_salvar)
        excluirBotao = findViewById(R.id.botao_excluir)
        exibir_campo = findViewById(R.id.fechar_abrir)
        mudar_texto = findViewById(R.id.Show)
        exibir_campo?.setOnClickListener{
            if (container_endereco?.visibility == View.VISIBLE) {
                container_endereco?.visibility = View.GONE

            } else {
                container_endereco?.visibility = View.VISIBLE
            }

        }
        salvarBotao?.setOnClickListener {
            inserirContato()
        }
        excluirBotao?.setOnClickListener {
            apagarContato()
        }
        fecharBotao?.setOnClickListener {
            finish()
        }
    }
    private fun inicializarBanco() {
         contatoDAO = Room.databaseBuilder(
            this,
            ContatosBanco::class.java,
            "contato-banco"
        ).allowMainThreadQueries().build().contatoDao()

    }
    private fun inserirContato() {
        val contato = Contato()
        contato.primeiro_nome = primeiro_nome?.text.toString()
        contato.sobrenome = sobrenome?.text.toString()
        contato.empresa = empresa?.text.toString()
        contato.logradouro = logradouro?.text.toString()
        contato.numero = numero?.text.toString().toInt()
        contato.complemento = complemento?.text.toString()
        contato.bairro = complemento?.text.toString()
        contato.cep = cep?.text.toString().toInt()
        contato.uf = uf?.text.toString()
        contato.telefone_profissional = telefone_profissional?.text.toString().toInt()
        contato.telefone_pessoal = telefone_pessoal?.text.toString().toInt()
        contato.email_profissional = email_profissional?.text.toString()
        contato.email_pessoal = email_pessoal?.text.toString()
        contato.observacoes = observacoes?.text.toString()
        try {
            contatoDAO?.inserirContato(contato)
            Toast.makeText(this, "Contato salvo com sucesso!", Toast.LENGTH_LONG).show()
        } catch (ex: Exception) {
            Toast.makeText(this, "Erro ao salvar contato", Toast.LENGTH_LONG).show()
        }
    }

    private fun apagarContato() {
        val contato = Contato()


    }
}
