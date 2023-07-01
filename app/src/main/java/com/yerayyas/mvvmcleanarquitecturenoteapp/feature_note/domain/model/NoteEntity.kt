package com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yerayyas.mvvmcleanarquitecturenoteapp.ui.theme.BabyBlue
import com.yerayyas.mvvmcleanarquitecturenoteapp.ui.theme.LightGreen
import com.yerayyas.mvvmcleanarquitecturenoteapp.ui.theme.RedOrange
import com.yerayyas.mvvmcleanarquitecturenoteapp.ui.theme.RedPink
import com.yerayyas.mvvmcleanarquitecturenoteapp.ui.theme.Violet

@Entity(tableName = "note_table")
data class NoteEntity(
    val title:String,
    val content:String,
    val timestamp:Long,
    val color:Int,
    @PrimaryKey val id: Int? = null

){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message:String): Exception(message)
