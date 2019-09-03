package com.apps.calculator.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "calculations")
class Calculation(

    @PrimaryKey(autoGenerate = true)
    val id: Long,

    @ColumnInfo(name = "operation")
    val operation: String,

    @ColumnInfo(name = "result")
    val result: String
)