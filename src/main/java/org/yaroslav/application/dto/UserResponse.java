package org.yaroslav.application.dto;

import org.yaroslav.domain.entities.User;

/**
 * Представление сущности пользователя (ответ на запрос).
 */
public class UserResponse {
	/**
	 * Идентификатор пользователя.
	 */
	public long id;

	/**
	 * Имя пользователя.
	 */
	public String name;

	/**
	 * Email пользователя.
	 */
	public String email;

	/**
	 * Изображение пользователя.
	 */
	public String image;

	public RoleResponse role;

	public UserResponse(User user) {
				this.id = user.getId();
				this.name = user.getName();
				this.email = user.getEmail();
				this.image = user.getImage();
				this.role = new RoleResponse(user.getRole());
	}
}
