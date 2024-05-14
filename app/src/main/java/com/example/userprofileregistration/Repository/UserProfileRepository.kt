package com.example.userprofileregistration.Repository

import androidx.lifecycle.LiveData
import com.example.userprofileregistration.Database.UserProfile
import com.example.userprofileregistration.Database.UserProfileDao

class UserProfileRepository(private val userProfileDao: UserProfileDao) {
    fun getUserProfiles(): LiveData<List<UserProfile>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfile: UserProfile) {
        userProfileDao.insert(userProfile)
    }

    suspend fun update(userProfile: UserProfile) {
        userProfileDao.update(userProfile)
    }

    suspend fun delete(userProfile: UserProfile) {
        userProfileDao.delete(userProfile)
    }
}