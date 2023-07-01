package com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.repository

import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.model.NoteEntity
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<NoteEntity>>

    suspend fun getNoteById(id: Int): NoteEntity?

    suspend fun insertNote(note: NoteEntity)

    suspend fun deleteNote(note: NoteEntity)
}