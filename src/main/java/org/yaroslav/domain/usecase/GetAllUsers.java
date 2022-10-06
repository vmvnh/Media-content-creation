package org.yaroslav.domain.usecase;

import java.util.Collection;
import lombok.AllArgsConstructor;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;

/**
 * Сценарий получения списка всех пользователей.
 */
@AllArgsConstructor
public class GetAllUsers {
	private UserRepository repository;

	public Collection<User> getAllUsers() {
		return repository.getAll();
	}
}
