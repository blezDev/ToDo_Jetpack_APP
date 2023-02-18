package com.blez.chatapp_jetpack.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.blez.chatapp_jetpack.navigation.destination.listComposable
import com.blez.chatapp_jetpack.util.Constants

@Composable
fun setUpNavigation(navController: NavHostController){

    val screens = remember(navController){
        Screens(navController = navController)
    }
    NavHost(navController = navController, startDestination =  Constants.LIST_SCREEN){
    listComposable (navigateToTaskScreen = screens.task)
    }
}