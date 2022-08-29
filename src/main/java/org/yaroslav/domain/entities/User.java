package org.yaroslav.domain.entities;

import lombok.Getter;

/**
 * Пользователь.
 *
 * @param id Идентификатор пользователя.
 * @param name Имя пользователя.
 * @param email Email пользователя.
 * @param password Пароль пользователя.
 * @param image Аватар пользователя.
 * @param role Роль пользователя.
 */
public record User(
		long id,
		String name,
		String email,
		String password,
		String image,
		Role role
) {

	/**
	 * Роль пользователя.
	 */
	public enum Role {
		/**
		 * Администратор.
		 */
		ADMIN(1, "Администратор"),
		/**
		 * Менеджер.
		 */
		MANAGER(2, "Менеджер"),
		/**
		 * Контент-мейкер.
		 */
		CONTENT_MAKER(3, "Контент-мейкер");

		/**
		 * Идентификатор роли.
		 *
		 * @return id Идентификатор роли.
		 */
		private final @Getter long id;

		/**
		 * Название роли.
		 *
		 * @return name Название роли.
		 */
		private final @Getter String name;

		Role(long id, String name) {
			this.id = id;
			this.name = name;
		}
	}
}
