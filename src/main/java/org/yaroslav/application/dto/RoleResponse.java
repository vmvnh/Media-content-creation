package org.yaroslav.application.dto;

import org.yaroslav.domain.entities.User;

/**
 * Представление роли пользователя (ответ на запрос).
 */
public class RoleResponse {
	/**
	 * Идентификатор роли пользователя.
	 */
	public long id;

	/**
	 * Название роли пользователя.
	 */
	public String name;
	
	public RoleResponse(User.Role role) {
		this.id = role.getId();
		this.name = role.getName();
	}
}