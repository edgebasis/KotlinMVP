package com.edgebasis.kotlinmvp.View

/**
 * Created by mujtabamahmood on 6/18/18.
 */
interface ILoginView {
    fun onLoginSuccess(message:String)
    fun onLoginError(message: String)
}