package com.teamsparta.todoregistration.domain.todoapplication.controller


import com.teamsparta.todoregistration.domain.todoapplication.dto.ApplyTodoRequest
import com.teamsparta.todoregistration.domain.todoapplication.dto.TodoApplicationResponse
import com.teamsparta.spa_mini3_todolist.domain.todoapplication.dto.UpdateApplicationStatusRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RequestMapping("/todos/{todoId}/applications")
@RestController
class TodoApplicationController {

    @GetMapping()
    fun getApplicationList(@PathVariable todoId: Long): ResponseEntity<List<TodoApplicationResponse>> {
        TODO()
    }

    @GetMapping("/{applicationId}")
    fun getApplication(
        @PathVariable todoId: Long,
        @PathVariable applicationId: Long
    ): ResponseEntity<TodoApplicationResponse> {
        TODO()
    }

    @PostMapping
    fun applyTodo(
        @PathVariable todoId: Long,
        applyTodoRequest: ApplyTodoRequest
    ): ResponseEntity<TodoApplicationResponse> {
        TODO()
    }

    @PatchMapping("/{applicationId}")
    fun updateApplicationStatus(
        @PathVariable todoId: Long,
        @PathVariable applicationId: Long,
        @RequestBody updateApplicationStatusRequest: UpdateApplicationStatusRequest
    ): ResponseEntity<TodoApplicationResponse> {
        TODO()
    }

}

