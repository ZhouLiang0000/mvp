package com.zl.mvp.utils.base

/**
 * 作者：zhouliang
 * 时间：2018/1/8:23:07
 * 邮箱：18510971680@163.com
 * 说明：
 */
open class BaseMvpPresenterImpl<V : BaseMvpView> : BaseMvpPresenter<V> {
    protected var mView: V? = null
    override fun attacchView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }
}