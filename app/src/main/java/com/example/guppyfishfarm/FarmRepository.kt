package com.example.guppyfishfarm

import com.example.guppyfishfarm.dao.FarmDao
import com.example.guppyfishfarm.model.farm
import kotlinx.coroutines.flow.Flow

class FarmRepository(private val farmDao: FarmDao) {
    val allFarms: Flow<List<farm>> = farmDao.getAllFarm()

    suspend fun insertTire(farm: farm) {
        farmDao.insertFarm(farm)
    }
    suspend fun deleteTire(farm: farm) {
        farmDao.deleteFarm(farm)
    }
    suspend fun updateTire(farm: farm) {
        farmDao.updateFarm(farm)
    }
}