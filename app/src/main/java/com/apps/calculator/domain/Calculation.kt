package com.apps.calculator.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "calculations")
class Calculation(

    @PrimaryKey(autoGenerate = true)
    private val id: Long,

    @ColumnInfo(name = "operation")
    private val operation: String,

    @ColumnInfo(name = "result")
    private val result: String

)