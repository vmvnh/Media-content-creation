package org.yaroslav.infrastructure.repositories;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;
import org.yaroslav.infrastructure.models.UserModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Реализация репозитория пользователей.
 */
@Repository
@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {
	private Users users;

	@Override
	public void create(
			String name,
			String email,
			String password,
			String image,
			User.Role role) {
		var user = new UserModel(name, email, password, image, role);
		users.save(user);
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
		var userModel = users.getById(id);
		return new User(
				userModel.getId(),
				userModel.getName(),
				userModel.getEmail(),
				userModel.getPassword(),
				userModel.getImage(),
				userModel.getRole()
		);
	}

	@Override
	public User get(String email) {
		var userModel = users.findOneByEmail(email);
		return new User(
				userModel.getId(),
				userModel.getName(),
				userModel.getEmail(),
				userModel.getPassword(),
				userModel.getImage(),
				userModel.getRole()
		);
	}

	@Override
	public Collection<User> getAll() {
		var userModel = users.findAll();
		List<User> userList = new ArrayList<>();
		for (UserModel user : userModel) {
			userList.add(UserModel.toEntity(user));
		}
		return userList;
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
		User findOneByEmail(String email);
	}
}
