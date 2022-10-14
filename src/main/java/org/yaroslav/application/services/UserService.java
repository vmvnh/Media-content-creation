package org.yaroslav.application.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yaroslav.application.dto.UserRequest;
import org.yaroslav.application.dto.UserResponse;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.usecase.*;

/**
* Фасад для сценариев работы с пользователями.
*/
@Service
@AllArgsConstructor
public final class UserService {
	private CreateUser createUser;
	private GetAllUsers getAll;
	private GetUserById getUserById;
	private UpdateUserById updateUserById;
	private DeleteUserById deleteUserById;
	private GetUserByEmail getUserByEmail;

	/**
	 * Получает список пользователей.
	 *
	 * @return Список пользователей.
	 */
	public Collection<UserResponse> getAll() {
	Collection<User> users= getAll.getAllUsers();
	List<UserResponse> userResponseCollection = new ArrayList<>();
	for (User user : users) {
		userResponseCollection.add(new UserResponse(user));
	}
	return userResponseCollection;
}

/**
* Создает пользователя.
*
* @param userRequest Параметры создания пользователя.
*/
	public void create(UserRequest userRequest) {
		createUser.createUser(
			userRequest.name,
			userRequest.email,
			userRequest.password,
			userRequest.image,
			userRequest.role);
	}

	/**
	 * Получает пользователя по идентификатору.
	 *
	 * @param id Идентификатор пользователя.
	 * @return Пользователь.
	 */
	public UserResponse getUserById(long id) {
		User user = getUserById.getUserById(id);
		return new UserResponse(user);
	}

	public void deleteUserById(long id) {
		deleteUserById.deleteUserById(id);
	}

	public void updateUserById(long id, UserRequest userRequest) {
		updateUserById.updateUser(
				id,
				userRequest.name,
				userRequest.email,
				userRequest.password,
				userRequest.image,
				userRequest.role
		);
	}
}
