package com.minerva.learningkotlin.service

import com.minerva.learningkotlin.domain.Message
import com.minerva.learningkotlin.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService (val db: MessageRepository) {

    fun post(message: Message) {
        db.save(message)
    }

    fun findMessages() : List<Message> = db.findMessages()
}