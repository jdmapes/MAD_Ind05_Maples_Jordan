package com.example.ind_05_maples_jordan

import android.media.Image
import android.widget.ImageView
import java.io.Serializable

data class State_Info(
    val stateName: String,
    val nickName: String,
    val stateArea: Int,
    val outline: Int,
    val stateFlag: Int
    ) : Serializable