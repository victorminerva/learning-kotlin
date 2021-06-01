package com.minerva.learningkotlin.repository

import com.minerva.learningkotlin.domain.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {

    @Query("select * from messages")
    fun findMessages(): List<Message>
}