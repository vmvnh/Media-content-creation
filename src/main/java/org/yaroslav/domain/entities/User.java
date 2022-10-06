package org.yaroslav.domain.entities;

import lombok.Getter;

/**
 * Пользователь.
 */
public class User {
	/**
	 * Идентификатор пользователя.
	 */
  @Getter long id;

	/**
	 * Имя пользователя.
	 */
  @Getter String name;

	/**
	 * Email пользователя.
	 */
  @Getter String email;

	/**
	 * Пароль пользователя.
	 */
  @Getter String password;

	/**
	 * Изображение пользователя.
	 */
  @Getter String image;

	/**
	 * Роль пользователя.
	 */
  @Getter User.Role role;

	public User(
			long id,
			String name,
			String email,
			String password,
			String image,
			User.Role role
	) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.image = image;
		this.role = role;
	}
	
	public User() {}

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
