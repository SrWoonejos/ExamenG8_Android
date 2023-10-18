package com.dmiranda.examenandroidg8.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ProductEntity::class], version = 1)
abstract class ProductDataBase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}