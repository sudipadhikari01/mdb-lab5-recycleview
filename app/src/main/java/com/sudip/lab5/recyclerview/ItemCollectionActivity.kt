package com.sudip.lab5.recyclerview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sudip.lab5.recyclerview.handlers.PClickListner
import com.sudip.lab5.recyclerview.pojo.Product
import java.lang.reflect.Type


class ItemCollectionActivity : AppCompatActivity(), PClickListner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        val type: Type = object : TypeToken<List<Product?>?>() {}.type

        val productList: ArrayList<Product> = Gson().fromJson(
            intent.getStringExtra("productList"),
            type
        )

        val recyclerProductItem: RecyclerView = findViewById(R.id.recyclerCategoryItem)

        val adapter = ProductHandler(productList, this)
        recyclerProductItem.adapter = adapter

    }

    override fun onProductItemClicked(product: Product) {
        val intent = Intent(this, ProductDetailActivity::class.java)
        intent.putExtra("product", Gson().toJson(product))
        startActivity(intent)
    }

}