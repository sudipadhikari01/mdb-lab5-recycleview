package com.sudip.lab5.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.gson.Gson
import com.sudip.lab5.recyclerview.pojo.Product

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun goToProductListActivity(productList: ArrayList<Product>) {
        val intent = Intent(this, ItemCollectionActivity::class.java)
        intent.putExtra("productList", Gson().toJson(productList))
        startActivity(intent)
    }

    fun onElectronicClicked(view: View) {
        val electronicItemList = ArrayList<Product>()
        val product1 = Product(
            "Printer",
            400.00,
            "Black",
            "" + R.drawable.printer,
            "PNT1",
            "double ink jet printer"
        )

        val product2 = Product(
            "Asus Laptop",
            1500.00,
            "Blue",
            ""+R.drawable.asus ,
            "asus",
            "Asus Laptop S17"
        )

        val product3 = Product(
            "Mac Laptop",
            2600.00,
            "Red",
            ""+R.drawable.macjpg,
            "Mac",
            "Best for the developers"
        )
        val product4 = Product(
            "Samsung",
            1800.00,
            "Black",
            ""+R.drawable.samsung,
            "SMG",
            "Best mobile with the performance"
        )

        val product5 = Product(
            "Airpod",
            300.00,
            "white",
            ""+R.drawable.airpod,
            "Ap",
            "Best Airpod"
        )

        electronicItemList.add(product1)
        electronicItemList.add(product2)
        electronicItemList.add(product3)
        electronicItemList.add(product4)
        electronicItemList.add(product5)

        goToProductListActivity(electronicItemList)

    }

    fun onClothingClicked(view: View) {
        val clothingItemList = ArrayList<Product>()
    }

    fun onBeautyClicked(view: View) {
        val beautyItemList = ArrayList<Product>()
    }

    fun onFoodClicked(view: View) {
        val foodItemList = ArrayList<Product>()
    }
}
