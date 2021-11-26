package com.example.homemade.service;


import com.example.homemade.model.Chat;
import org.springframework.http.ResponseEntity;

public interface ChatService {

    Chat getChatId (Long chatId);

    Chat createChat ( Chat chat);

    ResponseEntity<?> deleteChat (Long chatId);

    Chat assignChatUser (Long ChatId, Long userId);

    Chat unassignChatUser (Long ChatId, Long userId);

}
