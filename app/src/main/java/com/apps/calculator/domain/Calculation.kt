package com.apps.calculator.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "calculations")
data class Calculation(

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,

    @ColumnInfo(name = "operation")
    var operation: String? = null,

    @ColumnInfo(name = "result")
    var result: String? = null

)