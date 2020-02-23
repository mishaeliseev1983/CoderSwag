package com.melyseev.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.melyseev.coderswag.Model.Category
import com.melyseev.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

class ControllerAdapter(val context:Context, val categories: List<Category>): BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view= LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        val categoryItem = categories[position]
        view.tvCategory.text = categoryItem.title
        val imageResource= context.resources.getIdentifier(categoryItem.image, "drawable", context.packageName)
        view.imgCategory.setImageResource(imageResource)

        return  view
    }

    override fun getItem(position: Int): Any = categories[position]
    override fun getItemId(position: Int): Long = 0
    override fun getCount(): Int = categories.count()
}