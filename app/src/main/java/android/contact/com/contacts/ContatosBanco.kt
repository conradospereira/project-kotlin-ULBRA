package android.contact.com.contacts

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Contato::class], version = 1)
abstract class ContatosBanco : RoomDatabase(){

    abstract fun contatoDao(): ContatoDAO
}