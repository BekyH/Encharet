package com.example.encharet.data

import java.util.*

data class Item (

    private val id: Long,
    private val item_name: String,
    private val item_description: String,
    private val starting_price: Long,
    private val post_date: Date,
    private val expiry_date: Date

    )