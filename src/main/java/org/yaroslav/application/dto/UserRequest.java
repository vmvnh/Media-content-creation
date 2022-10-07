package org.yaroslav.application.dto;

import org.yaroslav.domain.entities.User;

/**
 * Представление сущности пользователя (запрос).
 */
public class UserRequest {

	/**
	 * Имя пользователя.
	 */
	public String name;

	/**
	 * Электронная почта пользователя.
	 */
	public String email;

	/**
	 * Пароль пользователя.
	 */
	public String password;

	/**
	 * Изображение пользователя.
	 */
	public String image;

	/**
	 * Роль пользователя, см. {@link User.Role}.
	 */
	public User.Role role;

	private UserRequest() {}

	/**
	 * Создаёт экземпляр класса {@link UserRequest}.
	 *
	 * @param user Сущность пользователя.
	 */
	public UserRequest(User user) {
		this.name = user.getName();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.image = user.getImage();
		this.role = user.getRole();
	}
}
