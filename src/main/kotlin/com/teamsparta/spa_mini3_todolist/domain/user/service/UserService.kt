package com.teamsparta.spa_mini3_todolist.domain.user.service

import com.teamsparta.spa_mini3_todolist.domain.user.dto.SignUpRequest
import com.teamsparta.spa_mini3_todolist.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.spa_mini3_todolist.domain.user.dto.UserResponse

interface UserService {

    fun signUp(signUpRequest: SignUpRequest): UserResponse

    fun updateUserProfile(userId: Long, updateUserProfileRequest: UpdateUserProfileRequest): UserResponse
}

