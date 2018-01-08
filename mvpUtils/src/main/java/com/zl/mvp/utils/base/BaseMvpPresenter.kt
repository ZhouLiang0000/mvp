package com.zl.mvp.utils.base

/**
 * 作者：zhouliang
 * 时间：2018/1/8:23:04
 * 邮箱：18510971680@163.com
 * 说明：
 */
interface BaseMvpPresenter<in V : BaseMvpView> {
    fun attacchView(view: V)
    fun detachView()
}