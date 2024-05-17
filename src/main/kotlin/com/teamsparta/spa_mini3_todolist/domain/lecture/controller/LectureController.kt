package com.teamsparta.spa_mini3_todolist.domain.lecture.controller

import com.teamsparta.todoregistration.domain.lecture.dto.AddLectureRequest
import com.teamsparta.todoregistration.domain.lecture.dto.LectureResponse
import com.teamsparta.todoregistration.domain.lecture.dto.UpdateLectureRequest
import com.teamsparta.todoregistration.domain.todo.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RequestMapping("/todos/{todoId}/lectures")
@RestController
class LectureController(
    private val todoService: TodoService
) {

    @GetMapping
    fun getLectureList(@PathVariable todoId: Long): ResponseEntity<List<LectureResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getLectureList(todoId))
    }

    @GetMapping("/{lectureId}")
    fun getLecture(@PathVariable todoId: Long, @PathVariable lectureId: Long): ResponseEntity<LectureResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getLecture(todoId, lectureId))
    }

    @PostMapping()
    fun addLecture(
        @PathVariable todoId: Long,
        @RequestBody addLectureRequest: AddLectureRequest
    ): ResponseEntity<LectureResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(todoService.addLecture(todoId, addLectureRequest))
    }

    @PutMapping("/{lectureId}")
    fun updateLecture(
        @PathVariable todoId: Long,
        @PathVariable lectureId: Long,
        @RequestBody updateLectureRequest: UpdateLectureRequest
    ): ResponseEntity<LectureResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.updateLecture(todoId, lectureId, updateLectureRequest))
    }

    @DeleteMapping("/{lectureId}")
    fun removeLecture(@PathVariable todoId: Long, @PathVariable lectureId: Long): ResponseEntity<Unit> {
        todoService.removeLecture(todoId, lectureId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }

}