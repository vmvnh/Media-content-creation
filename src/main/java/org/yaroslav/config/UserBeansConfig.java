package org.yaroslav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yaroslav.domain.repositories.UserRepository;
import org.yaroslav.domain.usecase.CreateUser;
import org.yaroslav.domain.usecase.GetAllUsers;
import org.yaroslav.domain.usecase.GetUserById;

/**
 * Конфигуратор сценариев использования пользователей.
 */
@Configuration
public class UserBeansConfig {
	@Bean
	public CreateUser create(UserRepository repository) {
		return new CreateUser(repository);
	}

	@Bean
	public GetAllUsers getAllUsers(UserRepository repository) {
		return new GetAllUsers(repository);
	}

	@Bean
	public GetUserById getUserById(UserRepository repository) {
		return new GetUserById(repository);
	}
}
