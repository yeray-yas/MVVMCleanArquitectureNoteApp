package com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.use_case

import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.model.NoteEntity
import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id:Int): NoteEntity? {
        return repository.getNoteById(id)
    }
}