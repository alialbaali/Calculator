package com.apps.calculator.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.apps.calculator.domain.Calculation

@Dao
interface CalculatorDao {

    @Insert
    suspend fun insert(calculation: Calculation)

    @Delete
    suspend fun delete(calculation: Calculation)

    @Query("SELECT * from ")
    suspend fun get(): LiveData<List<Calculation>>
}