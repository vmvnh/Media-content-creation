package org.yaroslav.domain.usecase;

import lombok.AllArgsConstructor;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;

/**
 * Сценарий создания пользователя.
 */
@AllArgsConstructor
public class CreateUser {
	private UserRepository repository;

	public void createUser(String name, String email, String password, String image, User.Role role) {
		var userExists = repository.get(email);
		if (userExists.isEmpty()) {
			repository.create(name, email, password, image, role);
		}
	}
}
