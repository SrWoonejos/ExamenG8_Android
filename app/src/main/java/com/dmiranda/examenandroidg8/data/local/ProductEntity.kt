package com.dmiranda.examenandroidg8.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

class ProductEntity {
    @Entity(tableName = "productTable",)
    data class ProductEntity (
        @PrimaryKey
        val id: Int,
        val title: String,
        val description: String,
        val price: Int,
        val creationAt: String,
        val rating: Int,
        val comment: String
    ) : Serializable
}