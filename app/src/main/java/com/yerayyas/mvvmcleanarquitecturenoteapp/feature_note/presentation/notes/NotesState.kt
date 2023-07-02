package com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.presentation.notes

import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.model.NoteEntity
import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.util.NoteOrder
import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes:List<NoteEntity> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean = false
)
