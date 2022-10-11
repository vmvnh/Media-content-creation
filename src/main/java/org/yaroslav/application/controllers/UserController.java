package org.yaroslav.application.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.yaroslav.application.dto.UserRequest;
import org.yaroslav.application.dto.UserResponse;
import org.yaroslav.application.services.UserService;
import java.util.Collection;

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
	 * Получает список пользователей.
	 */
	@GetMapping
	@Operation(summary = "Получить список пользователей")
	public Collection<UserResponse> getAll() {
		return service.getAll();
	}

	/**
	 * Создаёт нового пользователя.
	 */
	@PostMapping
	@Operation(summary = "Создать нового пользователя")
	public void create(@RequestBody UserRequest userRequest) {
		service.create(userRequest);
	}

	/**
	 * Получает пользователя по идентификатору.
	 */
	@GetMapping(path = "/{id}")
	@Operation(summary = "Получить пользователя по идентификатору")
	public UserResponse getById(long id) {
		return service.getUserById(id);
	}

	/**
	 * Изменяет пользователя по идентификатору.
	 */
	@PutMapping(path = "/{id}")
	@Operation(summary = "Изменить пользователя по идентификатору")
	public void update(@PathVariable long id, @RequestBody UserRequest userRequest) {
		System.out.println("");
	}

	/**
	 * Удаляет пользователя по идентификатору.
	 */
	@DeleteMapping(path = "/{id}")
	@Operation(summary = "Удалить пользователя по идентификатору")
	public void delete(@PathVariable long id) {
		service.deleteUserById(id);
	}
}
