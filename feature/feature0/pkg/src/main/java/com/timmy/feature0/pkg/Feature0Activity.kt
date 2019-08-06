package com.timmy.feature0.pkg

import android.os.Bundle
import android.view.View
import com.blankj.utilcode.util.BusUtils
import com.timmy.common.CommonTitleActivity
import kotlinx.android.synthetic.main.feature0_activity.*

/**
 * @author : timmy
 * @date : 2019-08-06
 */
class Feature0Activity : CommonTitleActivity() {
    override fun bindTitle(): CharSequence {
        return getString(R.string.feature0_title)
    }

    override fun bindLayout(): Int {
        return R.layout.feature0_activity
    }

    override fun initView(savedInstanceState: Bundle?, contentView: View?) {

        startFeature1Btn.setOnClickListener {
        }

    }

    override fun doBusiness() {
    }


    override fun onDestroy() {
        super.onDestroy()
        BusUtils.unregister(this)
    }
}