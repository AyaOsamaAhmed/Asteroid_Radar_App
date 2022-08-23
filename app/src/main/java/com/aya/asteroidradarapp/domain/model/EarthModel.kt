package com.aya.asteroidradarapp.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "earth_table")
data class EarthModel(
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0 ,


    @ColumnInfo(name = "image")
    val img : String
)