package com.parkmobile.sample.module.integration

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.parkmobile.sample.module.foo.FooService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        module_foo_version_text.text = FooService.getBuildType()
        module_foo_message_text.text = FooService.getMessage()
    }

}