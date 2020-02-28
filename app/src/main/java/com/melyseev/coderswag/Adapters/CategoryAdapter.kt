package com.melyseev.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.melyseev.coderswag.Adapters.CategoryAdapter.*
import com.melyseev.coderswag.Model.Category
import com.melyseev.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryAdapter(val context: Context, val categories:List<Category>, val itemClick: (category:Category)->Unit):RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       val view= LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
       return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
            holder.bind(categories[position], context, itemClick)
    }


    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageCategory= itemView.imgCategory;
        val textCategory= itemView.tvCategory
        fun bind(category: Category, context: Context, itemClick: (category: Category) -> Unit){
            textCategory.text = category.title
            val resourceId= context.resources.getIdentifier(category.image, "drawable", context.packageName)
            imageCategory.setImageResource( resourceId )
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}