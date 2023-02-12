package com.blez.chatapp_jetpack.repository

import com.blez.chatapp_jetpack.data.ToDoDAO
import com.blez.chatapp_jetpack.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDAO: ToDoDAO) {
    val getAllItems : Flow<List<ToDoTask>> = toDoDAO.getAllTask()
    val sortByLowPriority : Flow<List<ToDoTask>> = toDoDAO.sortByLowPriority()
    val sortByHighPriority : Flow<List<ToDoTask>> = toDoDAO.sortByHighPriority()

    fun getSelectedTask(taskId : Int) : Flow<ToDoTask> {
       return toDoDAO.getSelectedTask(taskId)
    }

    suspend fun addTask(toDoTask: ToDoTask) {
        toDoDAO.insertTask(toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask){
        toDoDAO.updateTask(toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask){
        toDoDAO.deletaTask(toDoTask)
    }

    suspend fun deleteAllTask() {
        toDoDAO.deleteAllTask()
    }

    fun searchDatabase(searchQuery : String) : Flow<List<ToDoTask>> {
        return toDoDAO.searchTodo(searchQuery)
    }




}