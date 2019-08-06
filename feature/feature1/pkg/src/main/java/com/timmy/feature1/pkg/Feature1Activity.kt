package com.timmy.feature1.pkg

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.timmy.common.CommonTitleActivity

/**
 * @author : timmy
 * @date : 2019-08-06
 */
class Feature1Activity : CommonTitleActivity() {

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, Feature1Activity::class.java)
            context.startActivity(starter)
        }
    }

    override fun bindTitle(): CharSequence {
        return getString(R.string.feature1_title)
    }

    override fun bindLayout(): Int {
        return R.layout.feature1_activity
    }

    override fun initView(savedInstanceState: Bundle?, contentView: View?) {
    }

    override fun doBusiness() {
    }

    override fun isSwipeBack(): Boolean {
        return true
    }

}