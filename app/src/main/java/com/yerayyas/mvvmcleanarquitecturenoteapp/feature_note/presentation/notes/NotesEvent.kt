package com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.presentation.notes

import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.model.NoteEntity
import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: NoteEntity): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
