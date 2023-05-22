package com.cruz.producttask.repositories

import com.cruz.producttask.data.Product

class MoviesRepository(private val products: MutableList<Product>) {
    fun getProduct() = products

    fun addProduct(product: Product) {
        products.add(product)
    }
}