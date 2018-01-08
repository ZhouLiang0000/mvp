package com.zl.mvp.utils.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zl.mvp.utils.ToastUtils

/**
 * 作者：zhouliang
 * 时间：2018/1/8:23:09
 * 邮箱：18510971680@163.com
 * 说明：
 */
abstract class BaseMvpActivity<in V : BaseMvpView, T : BaseMvpPresenter<V>> : AppCompatActivity(), BaseMvpView {

    protected abstract var mPresenter: T

    override fun getContext(): Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.attacchView(this as V)
    }

    override fun showError(error: String?) {
        ToastUtils.intance.showToast(this,error)
    }

    override fun showError(stringResId: Int) {
        ToastUtils.intance.showToast(this,stringResId)
    }

    override fun showMessage(srtResId: Int) {
        ToastUtils.intance.showToast(this,srtResId)
    }

    override fun showMessage(message: String?) {
        ToastUtils.intance.showToast(this,message)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}