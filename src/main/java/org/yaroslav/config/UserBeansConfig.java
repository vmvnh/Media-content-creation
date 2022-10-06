package org.yaroslav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yaroslav.domain.repositories.UserRepository;
import org.yaroslav.domain.usecase.GetAllUsers;
import org.yaroslav.domain.usecase.UserCreate;

/**
 * Конфигуратор сценариев использования пользователей.
 */
@Configuration
public class UserBeansConfig {
	@Bean
	public UserCreate create(UserRepository repository) {
		return new UserCreate(repository);
	}

	@Bean
	public GetAllUsers getAllUsers(UserRepository repository) {
		return new GetAllUsers(repository);
	}
}
