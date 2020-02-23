package com.melyseev.coderswag.Controller

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.melyseev.coderswag.Adapters.ControllerAdapter
import com.melyseev.coderswag.R
import com.melyseev.coderswag.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val simpleAdapter= ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
        val adapter= ControllerAdapter(this, DataService.categories)
        listViewCategories.adapter= adapter
    }
}
