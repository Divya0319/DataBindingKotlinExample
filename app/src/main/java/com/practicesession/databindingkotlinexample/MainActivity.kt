package com.practicesession.databindingkotlinexample

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practicesession.databindingkotlinexample.databinding.ActivityMainBinding
import com.practicesession.databindingkotlinexample.usermodel.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user = User("John", "Reed")
        activityBinding.setVariable(BR.userModel,user)

        activityBinding.executePendingBindings()

    }
}
