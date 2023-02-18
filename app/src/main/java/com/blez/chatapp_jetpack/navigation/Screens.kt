package com.blez.chatapp_jetpack.navigation

import androidx.navigation.NavHostController
import com.blez.chatapp_jetpack.util.Action
import com.blez.chatapp_jetpack.util.Constants

class Screens(navController : NavHostController) {
    val list  :((Action) -> Unit) = {
        navController.navigate("list/${it.name}"){
            popUpTo(Constants.LIST_SCREEN) { inclusive = true}
        }
    }
    val task : ((Int)->Unit) = {
        navController.navigate("task/{taskId}")
    }
}