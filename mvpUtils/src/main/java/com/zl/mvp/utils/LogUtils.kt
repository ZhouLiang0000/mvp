package com.zl.mvp.utils

import android.util.Log

/**
 * Created by zhouliang on 2017/8/3.
 */

class LogUtils {
    companion object {
        var debugFlag = true

        fun d(tag: String, msg: String) {
            if (debugFlag) {
                Log.d(tag, msg)
            }

        }

        fun e(tag: String, msg: String) {
            if (debugFlag) {
                Log.e(tag, msg)
            }

        }

        fun e(tag: String, msg: String, e: Exception) {
            if (debugFlag) {
                Log.e(tag, msg, e)
            }

        }

        fun i(tag: String, msg: String) {
            if (debugFlag) {
                Log.i(tag, msg)
            }

        }

        fun w(tag: String, msg: String) {
            if (debugFlag) {
                Log.w(tag, msg)
            }

        }

        fun w(tag: String, msg: String, e: Exception) {
            if (debugFlag) {
                Log.w(tag, msg, e)
            }

        }

        fun w(tag: String, msg: String, tr: Throwable) {
            if (debugFlag) {
                Log.w(tag, msg, tr)
            }

        }

        fun w(tag: String, e: Exception) {
            if (debugFlag) {
                Log.w(tag, e)
            }

        }

        fun v(tag: String, msg: String) {
            if (debugFlag) {
                Log.v(tag, msg)
            }

        }
    }
}
