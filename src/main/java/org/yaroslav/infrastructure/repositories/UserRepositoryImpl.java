package org.yaroslav.infrastructure.repositories;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaroslav.infrastructure.models.UserModel;

@Repository
@AllArgsConstructor
public class UserRepositoryImpl {
	private User users;

	public interface User extends JpaRepository<UserModel, Integer> {

	}
}
