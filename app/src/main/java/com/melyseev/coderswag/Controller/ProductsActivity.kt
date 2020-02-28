package com.melyseev.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.melyseev.coderswag.Adapters.ProductsAdapter
import com.melyseev.coderswag.Model.Product
import com.melyseev.coderswag.R
import com.melyseev.coderswag.Service.DataService
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryTitle= intent.getStringExtra(CATEGORY_TITLE)
        tvProducts.text= categoryTitle


        val products= DataService.getProductsByCategoryTitle(categoryTitle)

        val adapter= ProductsAdapter(this, products)
        rcProducts.adapter= adapter
        rcProducts.layoutManager= GridLayoutManager(this,2)
    }
}
