package com.teamsparta.spa_mini3_todolist.domain.todo.controller

import com.teamsparta.spa_mini3_todolist.domain.todo.dto.CreateTodoRequest
import com.teamsparta.spa_mini3_todolist.domain.todo.dto.TodoResponse
import com.teamsparta.spa_mini3_todolist.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.spa_mini3_todolist.domain.todo.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/todos")//todos 관련된거 TodoController가 담당하게 된다.
//애를 빈으로 등록해줘!, 데이터만 리턴하기 때문에 Controller 어노테이션도 쓸 수 있지만
@RestController // 이러면 controller 자체가 빈으로 등록된다. 이 컨트롤러가 어떤 URL을 서빙을 하느냐를 알려줘야함
class TodoController(// 이것을 알랴주는 것이 Handler Mapping 알려주는 것이다.
    //controller 상위에 RequestMapping이 붙어있으면 하위에 있는 메소드 같은 경우에는 @RequestMapping("/todos 뒤로 온다
    private val todoService: TodoService
) {

    @GetMapping()
    fun getTodoList(): ResponseEntity<List<TodoResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getAllTodoList())
    }

    @GetMapping("/{todoId}")
    fun getTodo(@PathVariable todoId: Long): ResponseEntity<TodoResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getTodoById(todoId))
    }

    @PostMapping
    fun createTodo(@RequestBody createTodoRequest: CreateTodoRequest): ResponseEntity<TodoResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(todoService.createTodo(createTodoRequest))
    }

    @PutMapping("/{todoId}")
    fun updateTodo(
        @PathVariable todoId: Long,
        @RequestBody updateTodoRequest: UpdateTodoRequest
    ): ResponseEntity<TodoResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.updateTodo(todoId, updateTodoRequest))
    }

    @DeleteMapping("/{todoId}")
    fun deleteTodo(@PathVariable todoId: Long): ResponseEntity<Unit> {
        todoService.deleteTodo(todoId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }
}

// TodoController.kt