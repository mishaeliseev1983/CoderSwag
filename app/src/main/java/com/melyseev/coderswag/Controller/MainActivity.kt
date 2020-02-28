package com.melyseev.coderswag.Controller


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.melyseev.coderswag.Adapters.CategoryAdapter
import com.melyseev.coderswag.R
import com.melyseev.coderswag.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*


const val CATEGORY_TITLE:String="CATEGORY_TITLE"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //val simpleAdapter= ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
        //val adapter= OldControllerAdapter(this, DataService.categories)

        val adapter= CategoryAdapter(this, DataService.categories){

            val intent= Intent(this, ProductsActivity::class.java)
            intent.putExtra(CATEGORY_TITLE, it.title)
            startActivity(intent)
        }

        rvCategory.adapter = adapter
        rvCategory.layoutManager= LinearLayoutManager(this)
    }


}
