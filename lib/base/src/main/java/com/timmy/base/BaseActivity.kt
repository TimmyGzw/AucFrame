package com.timmy.base

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.LayoutRes
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity


/**
 * @author : timmy
 * @date : 2019-08-06
 */
abstract class BaseActivity : AppCompatActivity() {

    protected var mContentView: View? = null
    protected var mActivity: Activity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        mActivity = this
        super.onCreate(savedInstanceState)

        setRootLayout(bindLayout())
        initView(savedInstanceState, mContentView)
        doBusiness()
    }

    @SuppressLint("ResourceType")
    open fun setRootLayout(@LayoutRes layoutId: Int) {
        if (layoutId <= 0) return
        mContentView = LayoutInflater.from(this).inflate(layoutId, null)
        setContentView(mContentView)
    }

    abstract fun bindLayout(): Int

    abstract fun initView(@Nullable savedInstanceState: Bundle?, @Nullable contentView: View?)

    abstract fun doBusiness()


}