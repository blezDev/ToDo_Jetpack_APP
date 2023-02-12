package com.blez.chatapp_jetpack.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.blez.chatapp_jetpack.data.ToDoDataBase
import com.blez.chatapp_jetpack.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun providesDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(context,ToDoDataBase::class.java,DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideDao(dataBase: ToDoDataBase) = dataBase.toDoDao()

}