package com.timmy.common

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.annotation.LayoutRes
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.ColorUtils
import kotlinx.android.synthetic.main.common_activity_title.*


/**
 * @author : timmy
 * @date : 2019-08-06
 */
abstract class CommonTitleActivity : CommonBackActivity() {

    abstract fun bindTitle(): CharSequence

    override fun isSwipeBack(): Boolean {
        return true
    }

    @SuppressLint("ResourceType")
    override fun setRootLayout(@LayoutRes layoutId: Int) {
        super.setRootLayout(R.layout.common_activity_title)
        if (layoutId != 0) {
            LayoutInflater.from(this).inflate(layoutId, commonTitleContentView)
        }

        setTitleBar()
        BarUtils.setStatusBarColor(this, ColorUtils.getColor(R.color.colorPrimary))
        BarUtils.addMarginTopEqualStatusBarHeight(commonTitleRootLayout)
    }

    private fun setTitleBar() {
        setSupportActionBar(commonTitleToolbar)
        val titleBar = supportActionBar
        if (titleBar != null) {
            titleBar.setDisplayHomeAsUpEnabled(true)
            titleBar.title = bindTitle()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}