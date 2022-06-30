package android.contact.com.contacts

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Contato {
    @PrimaryKey
    var id: Int? = null
    var primeiro_nome: String = ""
    var sobrenome: String = ""
    var empresa: String = ""
    var logradouro: String = ""
    var numero: Int? = null
    var complemento: String = ""
    var bairro: String = ""
    var cep: Int? = null
    var uf: String? = ""
    var telefone_profissional: Int? = null
    var telefone_pessoal: Int? = null
    var email_profissional: String = ""
    var email_pessoal: String = ""
    var observacoes: String = ""
}