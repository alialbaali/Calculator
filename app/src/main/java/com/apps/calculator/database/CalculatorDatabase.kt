package com.apps.calculator.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.apps.calculator.domain.Calculation

// App Database
@Database(entities = [Calculation::class], version = 1, exportSchema = false)
abstract class CalculatorDatabase : RoomDatabase() {

    // Dao instance
    abstract val calculatorDao: CalculatorDao

    // getting the database instance
    companion object {
        @Volatile
        private var INSTANCE: CalculatorDatabase? = null

        fun getInstance(context: Context): CalculatorDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        CalculatorDatabase::class.java,
                        "Calculator Database"
                    )
                        .fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance
            }

        }
    }
}