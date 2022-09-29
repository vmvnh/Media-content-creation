package org.yaroslav.infrastructure.repositories;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;
import org.yaroslav.infrastructure.models.UserModel;
import java.util.Collection;

/**
 * Реализация репозитория пользователей.
 */
@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
	private Users users;

	@Override
	public User create(
			String name,
			String email,
			String password,
			String image,
			User.Role role) {
		var user = new UserModel(name, email, password, image, role);
		this.users.save(user);
		return null;
	}

	@Override
	public User update(long id, String name, String email, String password, String image, User.Role role) {
		return null;
	}

	@Override
	public void delete(long id) {

	}

	@Override
	public User get(long id) {
		return null;
	}

	@Override
	public User get(String email) {
		return null;
	}

	@Override
	public Collection<User> getAll() {
		return null;
	}

	@Override
	public boolean exists(long id) {
		return false;
	}

	@Override
	public boolean exists(String email) {
		return false;
	}

	public interface Users extends JpaRepository<UserModel, Long> {

	}
}
