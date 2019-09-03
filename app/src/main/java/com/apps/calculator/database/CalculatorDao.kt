package com.apps.calculator.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.apps.calculator.domain.Calculation

// Data access object for database
@Dao
interface CalculatorDao {

    // insert value suspend function
    @Insert
    suspend fun insert(calculation: Calculation)

    // delete value suspend function
    @Delete
    suspend fun delete(calculation: Calculation)

    // get all values suspend function
    @Query("SELECT * FROM calculations")
    suspend fun get()

}