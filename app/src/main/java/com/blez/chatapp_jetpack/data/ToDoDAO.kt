package com.blez.chatapp_jetpack.data

import androidx.room.*
import com.blez.chatapp_jetpack.data.models.ToDoTask
import com.blez.chatapp_jetpack.util.Constants.DATABASE_TABLE
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDAO {
    @Query("SELECT * FROM $DATABASE_TABLE ORDER BY id ASC")
    fun getAllTask() : Flow<List<ToDoTask>>

    @Query("SELECT * FROM $DATABASE_TABLE WHERE id =:taskId ")
    fun getSelectedTask(taskId : Int) : Flow<ToDoTask>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTask(toDoTask: ToDoTask)

    @Update
    suspend fun updateTask(toDoTask: ToDoTask)

    @Delete
    suspend fun deletaTask(toDoTask: ToDoTask)

    @Query("DELETE FROM $DATABASE_TABLE")
    suspend fun deleteAllTask()

    @Query("SELECT * FROM $DATABASE_TABLE WHERE title LIKE :searchQuery OR description :searchQuery")
    fun searchTodo(searchQuery : String) : Flow<List<ToDoTask>>

    @Query("SELECT * FROM $DATABASE_TABLE ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority(): Flow<List<ToDoTask>>

    @Query("SELECT * FROM $DATABASE_TABLE ORDER BY CASE WHEN priority LIKE 'H%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'L%' THEN 3 END")
    fun sortByHighPriority(): Flow<List<ToDoTask>>
}