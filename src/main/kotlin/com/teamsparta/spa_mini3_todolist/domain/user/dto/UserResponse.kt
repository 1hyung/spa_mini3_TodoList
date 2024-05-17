package com.teamsparta.spa_mini3_todolist.domain.user.dto

data class UserResponse (
    val id: Long,
    val email: String,
    val nickname: String,
    val role: String,
)