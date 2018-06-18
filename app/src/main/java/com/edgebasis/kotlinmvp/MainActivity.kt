package com.edgebasis.kotlinmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.edgebasis.kotlinmvp.Presenter.ILoginPresenter
import com.edgebasis.kotlinmvp.Presenter.LoginPresenter
import com.edgebasis.kotlinmvp.View.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , ILoginView{
    override fun onLoginError(message: String) {
        Toasty.error(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginSuccess(message: String) {
        Toasty.success(this, message, Toast.LENGTH_SHORT).show()
    }

    internal lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        btnLogin.setOnClickListener {
            loginPresenter.onLogin(edtEmail.text.toString(), edtPassword.text.toString())
        }
    }
}
