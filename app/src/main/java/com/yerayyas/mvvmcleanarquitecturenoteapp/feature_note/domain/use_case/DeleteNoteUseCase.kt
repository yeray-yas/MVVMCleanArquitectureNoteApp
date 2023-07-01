package com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.use_case

import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.model.NoteEntity
import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: NoteEntity){
        repository.deleteNote(note)
    }

}