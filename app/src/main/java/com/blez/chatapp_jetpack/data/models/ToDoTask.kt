package com.blez.chatapp_jetpack.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.blez.chatapp_jetpack.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val title : String,
    val description :String,
    val priority : Priority
)
