package com.teamsparta.spa_mini3_todolist.domain.todo.dto

data class TodoResponse(
    val id: Long,
    val title: String,
    val description: String?,
    val status: String,
    val maxApplicants: Int,
    val numApplicants: Int,
)

fun main(args: Array<String>) {
    val todoResponse1 = TodoResponse(
        id = 1L,
        title = "abc",
        description = null,
        status = "CLOSED",
        maxApplicants = 30,
        numApplicants = 30,
    )

    val todoResponse2 = TodoResponse(
        id = 1L,
        title = "abcde",
        description = null,
        status = "CLOSED",
        maxApplicants = 30,
        numApplicants = 30,
    )


}