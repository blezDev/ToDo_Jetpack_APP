package com.blez.chatapp_jetpack.data.models

import androidx.compose.ui.graphics.Color
import com.blez.chatapp_jetpack.ui.theme.HighPriorityColor
import com.blez.chatapp_jetpack.ui.theme.LowPriorityColor
import com.blez.chatapp_jetpack.ui.theme.MediumPriorityColor
import com.blez.chatapp_jetpack.ui.theme.NonePriorityColor


enum class Priority(val color : Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)


}