package android.contact.com.contacts

import androidx.room.*
import java.net.IDN

@Dao
interface ContatoDAO {

    @Insert
    fun inserirContato(contato: Contato)

    @Query("SELECT * FROM Contato")
    fun listarContatos(contato: Contato)

    @Update
    fun atualizarCadastro(contato: Contato)

    @Delete
    fun apagarContato(contato: Contato)

    @Query("SELECT * FROM Contato WHERE primeiro_nome = :primeiro_nome")
    fun buscarPorNome(primeiro_nome: String)

    @Query("SELECT * FROM Contato WHERE id = :id")
    fun buscarPorId(id: Int): List<Contato>
}