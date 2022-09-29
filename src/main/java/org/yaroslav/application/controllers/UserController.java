package org.yaroslav.application.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yaroslav.application.dto.UserRequest;
import org.yaroslav.application.services.UserService;

/**
 * Контроллер для работы с пользователями.
 */
@RestController
@RequestMapping(path = "api/users")
@AllArgsConstructor
@Tags(@Tag(name = "Пользователи"))
public class UserController {
	UserService service;
	/**
	 * Создаёт нового пользователя.
	 */
	@PostMapping
	@Operation(summary = "Создать нового пользователя")
	public String create(@RequestBody UserRequest userRequest) {
		service.create(userRequest);
		return "Пользователь создан!";
	}
}
