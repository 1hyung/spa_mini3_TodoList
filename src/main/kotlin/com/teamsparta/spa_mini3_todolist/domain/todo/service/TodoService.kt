package com.teamsparta.todoregistration.domain.todo.service

import com.teamsparta.spa_mini3_todolist.domain.todo.dto.CreateTodoRequest
import com.teamsparta.spa_mini3_todolist.domain.todo.dto.TodoResponse
import com.teamsparta.spa_mini3_todolist.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.todoregistration.domain.lecture.dto.AddLectureRequest
import com.teamsparta.todoregistration.domain.lecture.dto.LectureResponse
import com.teamsparta.todoregistration.domain.lecture.dto.UpdateLectureRequest
import com.teamsparta.todoregistration.domain.todoapplication.dto.ApplyTodoRequest
import com.teamsparta.todoregistration.domain.todoapplication.dto.TodoApplicationResponse
import com.teamsparta.spa_mini3_todolist.domain.todoapplication.dto.UpdateApplicationStatusRequest


interface TodoService {

    fun getAllTodoList(): List<TodoResponse>

    fun getTodoById(todoId: Long): TodoResponse

    fun createTodo(request: CreateTodoRequest): TodoResponse

    fun updateTodo(todoId: Long, request: UpdateTodoRequest): TodoResponse

    fun deleteTodo(todoId: Long)

    fun getLectureList(todoId: Long): List<LectureResponse>

    fun getLecture(todoId: Long, lectureId: Long): LectureResponse

    fun addLecture(todoId: Long, request: AddLectureRequest): LectureResponse

    fun updateLecture(
        todoId: Long,
        lectureId: Long,
        request: UpdateLectureRequest
    ): LectureResponse

    fun removeLecture(todoId: Long, lectureId: Long)

    fun applyTodo(todoId: Long, request: ApplyTodoRequest): TodoApplicationResponse

    fun getTodoApplication(
        todoId: Long,
        applicationId: Long
    ): TodoApplicationResponse

    fun getTodoApplicationList(todoId: Long): List<TodoApplicationResponse>

    fun updateTodoApplicationStatus(
        todoId: Long,
        applicationId: Long,
        request: UpdateApplicationStatusRequest
    ): TodoApplicationResponse

}

