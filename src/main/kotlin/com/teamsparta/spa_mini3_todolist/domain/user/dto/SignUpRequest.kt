package com.teamsparta.spa_mini3_todolist.domain.user.dto

data class SignUpRequest (
    val email: String,
    val password: String,
    val nickname: String,
    val role: String
)