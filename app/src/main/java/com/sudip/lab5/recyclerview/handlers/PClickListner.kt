package com.sudip.lab5.recyclerview.handlers

import com.sudip.lab5.recyclerview.pojo.Product

interface PClickListner {
    fun onProductItemClicked(product: Product)
}