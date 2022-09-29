package org.yaroslav.application.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yaroslav.application.dto.UserRequest;
import org.yaroslav.domain.usecase.UserCreate;

/**
 * Фасад для сценариев работы с пользователями.
 */
@Service
@AllArgsConstructor
public final class UserService {
	private UserCreate create;

	/**
	 * Создает пользователя.
	 *
	 * @param userRequest Параметры создания пользователя.
	 */
	public void create(UserRequest userRequest) {
		create.createUser(
				userRequest.name,
				userRequest.email,
				userRequest.password,
				userRequest.image,
				userRequest.role
		);
	}
}
