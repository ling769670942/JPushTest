package com.example.yumi.jpushtest.ui.time

import android.os.Bundle
import com.example.yumi.jpushtest.R
import com.example.yumi.jpushtest.base.BaseUI
import com.example.yumi.jpushtest.base.IPresenter
import com.virtualightning.library.simple2develop.ui.ActionBarUICreater
import kotlinx.android.synthetic.main.actionbar_title_back.*

/**
 * Created by CimZzz(王彦雄) on 2017/11/29.<br>
 * Since : 项目名称_版本 <br>
 * Description : <br>
 * 描述
 */
class TimeUI : BaseUI<IPresenter<*, *>>() {
    override fun onBaseUICreate(creater: ActionBarUICreater) {
        creater.setLayoutID(R.layout.ui_time)
        creater.setActionBarID(R.layout.actionbar_title_back)
    }

    override fun onViewInit(savedInstanceState: Bundle?) {
        actionbarTitle.text = "时间选择"
        actionbarBack.setOnClickListener {
            finish()
        }
    }

}