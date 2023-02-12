package com.blez.chatapp_jetpack.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blez.chatapp_jetpack.data.models.ToDoTask
import com.blez.chatapp_jetpack.repository.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(private val toDoRepository: ToDoRepository) : ViewModel() {
    private val _AllTasks = MutableStateFlow<List<ToDoTask>>(emptyList())
val allTask : StateFlow<List<ToDoTask>>
get() = _AllTasks


    fun getAllTask() {
        viewModelScope.launch {
            toDoRepository.getAllItems.collectLatest {
                _AllTasks.value = it
            }
        }
    }


    
}