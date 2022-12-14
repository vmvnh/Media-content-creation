package org.yaroslav.infrastructure.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.yaroslav.domain.entities.User;

/**
 * Модель пользователя для СУБД.
 */
@Entity
@Table(name = "users")
@AllArgsConstructor
public class UserModel extends User {
	/**
	 * Идентификатор пользователя.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private @Getter long id;

	/**
	 * Имя пользователя.
	 */
	@Column(nullable = false)
	private @Getter String name;

	/**
	 * Электронная почта пользователя.
	 */
	@Column(unique = true, nullable = false)
	private @Getter String email;

	/**
	 * Пароль пользователя.
	 */
	@Column(nullable = false)
	private @Getter String password;

	/**
	 * Изображение пользователя.
	 */
	@Column(nullable = false)
	private @Getter String image;

	/**
	 * Роль пользователя, см. {@link User.Role}.
	 */
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private @Getter User.Role role;

	public static User toEntity(UserModel user) {
		return new User(
				user.id,
				user.name,
				user.email,
				user.password,
				user.image,
				user.role
		);
	}

	public UserModel() {}

	/**
	 * Создаёт экземпляр класса {@link UserModel}.
	 *
	 * @param name Имя пользователя.
	 * @param email Электронная почта пользователя.
	 * @param password Пароль пользователя.
	 * @param image Изображение пользователя.
	 * @param role Роль пользователя.
	 */
	public UserModel(
			String name,
			String email,
			String password,
			String image,
			User.Role role
	) {
		this(0L, name, email, password, image, role);
	}
}
