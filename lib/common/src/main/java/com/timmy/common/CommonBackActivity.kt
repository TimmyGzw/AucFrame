package com.timmy.common

import android.os.Bundle
import com.blankj.swipepanel.SwipePanel
import com.blankj.utilcode.util.SizeUtils
import com.timmy.base.BaseActivity


/**
 * @author : timmy
 * @date : 2019-08-06
 */
abstract class CommonBackActivity : BaseActivity() {

    abstract fun isSwipeBack(): Boolean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initSwipeBack()
    }

    fun initSwipeBack() {
        if (isSwipeBack()) {
            val swipeLayout = SwipePanel(this)
            swipeLayout.setLeftDrawable(R.drawable.base_back)
            swipeLayout.setLeftEdgeSize(SizeUtils.dp2px(100f))
            swipeLayout.wrapView(findViewById(android.R.id.content))
            swipeLayout.setOnFullSwipeListener { direction ->
                swipeLayout.close(direction)
                finish()
            }
        }
    }
}