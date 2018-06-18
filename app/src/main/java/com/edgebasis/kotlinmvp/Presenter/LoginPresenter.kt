package com.edgebasis.kotlinmvp.Presenter

import com.edgebasis.kotlinmvp.Model.User
import com.edgebasis.kotlinmvp.View.ILoginView

/**
 * Created by mujtabamahmood on 6/18/18.
 */
class LoginPresenter (internal var iLoginView: ILoginView) :ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val loginCode = user.isDataValid()
        if(loginCode == 0)
            iLoginView.onLoginError("Email must not be empty")
        else if(loginCode == 1)
            iLoginView.onLoginError("Wrong email address")
        else if(loginCode == 2)
            iLoginView.onLoginError("Password must be greater that 6")
        else
            iLoginView.onLoginSuccess("Login success")

    }
}