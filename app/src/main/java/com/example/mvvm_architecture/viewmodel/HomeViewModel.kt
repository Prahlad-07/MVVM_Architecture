package com.example.mvvm_architecture.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_architecture.model.UserRepository
import com.example.mvvm_architecture.model.UserData // Ensure correct import
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val userRepository: UserRepository = UserRepository()

    private val _userData = MutableLiveData<UserData>()  // Fixed type
    val userData: LiveData<UserData> = _userData  // Fixed type

    fun getUserData() {
        viewModelScope.launch {
            val userRes = userRepository.fetchData() // Ensure fetchData() returns UserData
            _userData.postValue(userRes)
        }
    }
}
