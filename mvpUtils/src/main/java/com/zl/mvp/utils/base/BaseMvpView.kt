package com.zl.mvp.utils.base

import android.content.Context
import android.support.annotation.StringRes

/**
 * 作者：zhouliang
 * 时间：2018/1/8:22:26
 * 邮箱：18510971680@163.com
 * 说明：
 */
interface BaseMvpView {
    fun getContext(): Context
    fun showError(error: String?)
    fun showError(@StringRes stringResId: Int)
    fun showMessage(@StringRes stringResId: Int)
    fun showMessage(message: String?)
}