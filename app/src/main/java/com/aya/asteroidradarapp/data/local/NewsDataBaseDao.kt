package com.aya.asteroidradarapp.data.local

import androidx.room.*
import com.aya.asteroidradarapp.domain.model.DetectedModel


@Dao
interface NewsDataBaseDao  {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     suspend fun insertDetected(news: DetectedModel)

    @Delete
     suspend fun deleteDetected(news: DetectedModel)

    @Query("SELECT * from detected_table ")
    suspend fun getAllDetected(): List<DetectedModel>?

}