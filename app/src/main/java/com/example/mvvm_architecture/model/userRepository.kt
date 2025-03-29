package com.example.mvvm_architecture.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun fetchData():UserData{
        delay(2000)
        return UserData("Prahlad",18)

    }
}