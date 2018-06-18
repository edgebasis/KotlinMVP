package com.edgebasis.kotlinmvp.Model

/**
 * Created by mujtabamahmood on 6/18/18.
 */
interface IUser {
    val email:String
    val password:String
    fun isDataValid():Int
}