package com.teamsparta.todoregistration.domain.todoapplication.dto

import com.teamsparta.spa_mini3_todolist.domain.todo.dto.TodoResponse
import com.teamsparta.spa_mini3_todolist.domain.user.dto.UserResponse

data class TodoApplicationResponse (
    val id: Long,
    val todo: TodoResponse,
    val user: UserResponse,
    val status: String
)
