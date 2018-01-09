package com.car.shangka.business.home

import android.os.Bundle
import com.zl.mvp.R
import com.zl.mvp.utils.base.BaseMvpActivity

/**
 * 作者：zhouliang
 * 时间：2018/1/9:10:10
 * 邮箱：18510971680@163.com
 * 说明：
 */
class homeActivity : BaseMvpActivity<homeContract.View,homePersenter>(),homeContract.View{

    override var mPresenter: homePersenter = homePersenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}