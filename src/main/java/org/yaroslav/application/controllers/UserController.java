package org.yaroslav.application.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для работы с пользователями.
 */
@RestController
@RequestMapping(path = "api/users")
@AllArgsConstructor
@Tags(@Tag(name = "Пользователи"))
public class UserController {
	/**
	 * Создаёт нового пользователя.
	 */
	@GetMapping
	@Operation(summary = "Создать нового пользователя")
	public String create() {
		return "";
	}
}
