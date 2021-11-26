package com.example.homemade.controller;

import com.example.homemade.model.Chat;
import com.example.homemade.resource.ChatResource;
import com.example.homemade.resource.SaveChatResource;
import com.example.homemade.service.ChatService;
import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatUserController {
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private ChatService chatService;

    @Operation(summary = "Assign Tag to Post", description = "Establishes association between chat and user", tags = {"Chats"})
    @PostMapping("/users/{userId}/chats/{chatId}")
    public ChatResource assignChatUser(
            @PathVariable(name = "userId") Long userId,
            @PathVariable(name = "chatId") Long chatId) {
        return convertToResource(chatService.assignChatUser(chatId, userId));
    }

    @Operation(summary = "Remove assignment between Tag to Post", description = "Ends association between chat and user", tags = {"Chats"})
    @DeleteMapping("/users/{userId}/chats/{chatId}")
    public ChatResource unassignChatUser(
            @PathVariable(name = "userId") Long userId,
            @PathVariable(name = "chatId") Long chatId) {
        return convertToResource(chatService.unassignChatUser(chatId, userId));
    }

    private Chat convertToEntity(SaveChatResource resource) {
        return mapper.map(resource, Chat.class);
    }


    private ChatResource convertToResource(Chat entity) {
        return mapper.map(entity, ChatResource.class);
    }
}
