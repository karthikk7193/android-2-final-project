package com.ucsdextandroid2.android2final

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * Created by rjaylward on 2019-07-05
 */

@Dao
interface WeatherLocationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWeather(databaseLocation: DatabaseLocation)

    @Delete
    fun deleteWeather(databaseLocation: DatabaseLocation)

    @Query("SELECT * FROM DatabaseLocations")
    fun getAllWeather(): List<DatabaseLocation>

    @Query("SELECT * FROM DatabaseLocations ORDER BY timestamp DESC")
    fun getAllWeatherLiveData(): LiveData<List<DatabaseLocation>>

}