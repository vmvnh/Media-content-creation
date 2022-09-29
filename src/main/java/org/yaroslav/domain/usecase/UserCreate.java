package org.yaroslav.domain.usecase;

import lombok.AllArgsConstructor;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;

/**
 * Сценарий создания пользователя.
 */
@AllArgsConstructor
public class UserCreate {
	private UserRepository repository;
	public void createUser(String name, String email, String password, String image, User.Role role) {
		repository.create(name, email, password, image, role);
	}
}
