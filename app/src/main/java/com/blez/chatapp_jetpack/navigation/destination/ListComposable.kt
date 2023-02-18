package com.blez.chatapp_jetpack.navigation.destination

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.blez.chatapp_jetpack.util.Action
import com.blez.chatapp_jetpack.util.Constants


fun NavGraphBuilder.listComposable(navigateToTaskScreen:((Int)->Unit)){
    composable(
        route = Constants.LIST_SCREEN,
        arguments = listOf(navArgument(Constants.LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){

    }


}

fun NavGraphBuilder.taskComposable(navigateToListScreen: (Action) -> Unit){
    composable(
        route = Constants.LIST_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ){

    }


}