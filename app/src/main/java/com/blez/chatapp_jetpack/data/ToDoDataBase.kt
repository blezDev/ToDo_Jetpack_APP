package com.blez.chatapp_jetpack.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.blez.chatapp_jetpack.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDataBase : RoomDatabase() {
    abstract fun toDoDao() : ToDoDAO
}