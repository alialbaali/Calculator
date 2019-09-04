package com.apps.calculator.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.apps.calculator.domain.Calculation

@Database(entities = [Calculation::class], version = 1, exportSchema = false)
abstract class CalculatorDatabase : RoomDatabase() {
    abstract val calculatorDao: CalculatorDao

    companion object {
        @Volatile
        private lateinit var INSTANCE: CalculatorDatabase

        fun getInstance(context: Context): CalculatorDatabase {
            synchronized(this) {
                if (!::INSTANCE.isInitialized) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        CalculatorDatabase::class.java,
                        "calculator-database"
                    ).build()
                }
            }
            return INSTANCE
        }
    }
}