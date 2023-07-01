package com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.use_case

import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.model.NoteEntity
import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.repository.NoteRepository
import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.util.NoteOrder
import com.yerayyas.mvvmcleanarquitecturenoteapp.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(
    private val repository: NoteRepository
) {

    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<NoteEntity>> {
        return repository.getNotes().map { notes ->
            when (noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedByDescending{ it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }

                is OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
            }
        }
    }
}