package com.zl.mvp.utils

import android.content.Context
import android.view.Gravity
import android.widget.Toast

class ToastUtils
/**
 * 私有的构造函数
 */
private constructor() {
    private var mToast: Toast? = null

    /**
     * 内部类实现单例模式
     * 延迟加载，减少内存开销
     */
    private object ToastUtilsHolder {
        val instance = ToastUtils()
    }

    fun showToast(mContext: Context, msg: CharSequence?, duration: Int, isCustom: Boolean) {
        if (msg == null || msg == "") {
            LogUtils.i(TAG, "Toast的提示信息不能为空，弹出Toast失败")
        }

        if (this.mToast == null) {
            this.mToast = Toast.makeText(mContext, msg, duration)
        } else {
            this.mToast!!.setText(msg)
        }
        if (isCustom) {
            this.mToast!!.setGravity(Gravity.CENTER, 0, 0)
        } else {
            this.mToast!!.setGravity(Gravity.BOTTOM, 0, mContext.resources.getDimensionPixelSize(R.dimen.toast_y_offset))
        }
        this.mToast!!.show()
    }

    fun showToast(context: Context, msg: CharSequence, isCustom: Boolean) {
        this.showToast(context, msg, 0, isCustom)
    }

    fun showToast(context: Context, msg: CharSequence) {
        this.showToast(context, msg, 0, false)
    }

    fun showToast(context: Context, msg: String?) {
        this.showToast(context, msg, 0, false)
    }

    fun showToast(context: Context, stringResID: Int, isCustom: Boolean) {
        this.showToast(context, context.getString(stringResID), 0, isCustom)
    }

    fun showToast(context: Context, stringResID: Int) {
        this.showToast(context, context.getString(stringResID), 0, false)
    }

    fun showToast(context: Context, stringResID: Int, duration: Int, isCustom: Boolean) {
        this.showToast(context, context.getString(stringResID), duration, isCustom)
    }

    fun showToast(context: Context, stringResID: Int, duration: Int) {
        this.showToast(context, context.getString(stringResID), duration, false)
    }

    fun dismiss() {
        if (this.mToast != null) {
            this.mToast!!.cancel()
        }

    }

    companion object {
        private val TAG = ToastUtils::class.java.simpleName

        /**
         * 获取实例
         */
        val intance: ToastUtils
            get() = ToastUtilsHolder.instance
    }
}
