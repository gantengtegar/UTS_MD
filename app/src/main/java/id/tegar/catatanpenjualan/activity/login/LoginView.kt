package id.tegar.catatanpenjualan.activity.login

import id.tegar.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}