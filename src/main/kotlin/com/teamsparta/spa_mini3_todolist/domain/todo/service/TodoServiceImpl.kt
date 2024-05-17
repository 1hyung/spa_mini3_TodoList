package com.teamsparta.todoregistration.domain.todo.service

import com.teamsparta.spa_mini3_todolist.domain.todo.dto.CreateTodoRequest
import com.teamsparta.spa_mini3_todolist.domain.todo.dto.TodoResponse
import com.teamsparta.spa_mini3_todolist.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.todoregistration.domain.exception.ModelNotFoundException
import com.teamsparta.todoregistration.domain.lecture.dto.AddLectureRequest
import com.teamsparta.todoregistration.domain.lecture.dto.LectureResponse
import com.teamsparta.todoregistration.domain.lecture.dto.UpdateLectureRequest
import com.teamsparta.todoregistration.domain.todoapplication.dto.ApplyTodoRequest
import com.teamsparta.todoregistration.domain.todoapplication.dto.TodoApplicationResponse
import com.teamsparta.spa_mini3_todolist.domain.todoapplication.dto.UpdateApplicationStatusRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TodoServiceImpl : TodoService {

    override fun getAllTodoList(): List<TodoResponse> {
        // TODO: DB에서 모든 Todo 목록을 조회하여 TodoResponse 목록으로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getTodoById(todoId: Long): TodoResponse {
        // TODO: 만약 todoId에 해당하는 Todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 ID기반으로 Todo 가져와서 TodoResponse로 변환 후 반환
        // TODO("Not yet implemented")
        throw ModelNotFoundException(modelName = "Todo", id = 1L)
    }

    @Transactional
    override fun createTodo(request: CreateTodoRequest): TodoResponse {
        // TODO: request를 Todo로 변환 후 DB에 저장
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateTodo(todoId: Long, request: UpdateTodoRequest): TodoResponse {
        // TODO: 만약 todoId에 해당하는 Todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 todoId에 해당하는 Todo를 가져와서 request기반으로 업데이트 후 DB에 저장, 결과를 TodoResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    @Transactional
    override fun deleteTodo(todoId: Long) {
        // TODO: 만약 todoId에 해당하는 Todo가 없다면 throw ModelNotFoundException
        // TODO :DB에서 todoId에 해당하는 Todo를 삭제, 연관된 TodoApplication과 Lecture도 모두 삭제
        TODO("Not yet implemented")
    }

    override fun getLectureList(todoId: Long): List<LectureResponse> {
        // TODO: 만약 todoId에 해당하는 Todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 todoId에 해당하는 Todo목록을 가져오고, 하위 lecture들을 가져온 다음, LectureResopnse로 변환해서 반환
        TODO("Not yet implemented")
    }

    override fun getLecture(todoId: Long, lectureId: Long): LectureResponse {
        // TODO: 만약 todoId, lectureId에 해당하는 Lecture가 없다면 throw ModelNotFoundException
        // TODO: DB에서 todoId, lectureId에 해당하는 Lecture를 가져와서 LectureResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    @Transactional
    override fun addLecture(todoId: Long, request: AddLectureRequest): LectureResponse {
        // TODO: 만약 todoId에 해당하는 Todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 todoId에 해당하는 Todo를 가져와서 Lecture를 추가 후 DB에 저장, 결과를을 LectureResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateLecture(todoId: Long, lectureId: Long, request: UpdateLectureRequest): LectureResponse {
        // TODO: 만약 todoId, lectureId에 해당하는 Lecture가 없다면 throw ModelNotFoundException
        /* TODO: DB에서 todoId, lectureId에 해당하는 Lecture를 가져와서
            request로 업데이트 후 DB에 저장, 결과를을 LectureResponse로 변환 후 반환 */
        TODO("Not yet implemented")
    }

    @Transactional
    override fun removeLecture(todoId: Long, lectureId: Long) {
        // TODO: 만약 todoId에 해당하는 Todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 todoId, lectureId에 해당하는 Lecture를 가져오고, 삭제
        TODO("Not yet implemented")
    }

    @Transactional
    override fun applyTodo(todoId: Long, request: ApplyTodoRequest): TodoApplicationResponse {
        // TODO: 만약 todoId에 해당하는 Todo가 없다면 throw ModelNotFoundException
        // TODO: 만약 todo가 이미 마감됐다면, throw IllegalStateException
        // TODO: 이미 신청했다면, throw IllegalStateException

        TODO("Not yet implemented")
    }

    override fun getTodoApplication(todoId: Long, applicationId: Long): TodoApplicationResponse {
        // TODO: 만약 todoId, applicationId에 해당하는 TodoApplication이 없다면 throw ModelNotFoundException
        // TODO: DB에서 todoId, applicationId에 해당하는 TodoApplication을 가져와서 TodoApplicationResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getTodoApplicationList(todoId: Long): List<TodoApplicationResponse> {
        // TODO: 만약 todoId에 해당하는 Todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 todoId에 해당하는 Todo를 가져오고, 하위 todoApplication들을 TodoApplicationResponse로 변환 후 반환
        TODO("Not yet implemented")

    }

    @Transactional
    override fun updateTodoApplicationStatus(
        todoId: Long,
        applicationId: Long,
        request: UpdateApplicationStatusRequest
    ): TodoApplicationResponse {
        // TODO: 만약 todoId, applicationId에 해당하는 TodoApplication이 없다면 throw ModelNotFoundException
        // TODO: 만약 status가 이미 변경된 상태면 throw IllegalStateException
        // TODO: Todo의 status가 CLOSED상태 일시 throw IllegalStateException
        // TODO: 승인을 하는 케이스일 경우, todo의 numApplicants와 maxApplicants가 동일하면, todo의 상태를 CLOSED로 변경
        // TODO: DB에서 todoApplication을 가져오고, status를 request로 업데이트 후 DB에 저장, 결과를 TodoApplicationResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

}

