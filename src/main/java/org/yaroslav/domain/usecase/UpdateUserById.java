package org.yaroslav.domain.usecase;

import lombok.AllArgsConstructor;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;

/**
 * Сценарий обновления пользователя.
 */
@AllArgsConstructor
public class UpdateUserById {
  private UserRepository repository;
  public void updateUser(
      long id,
      String name,
      String email,
      String password,
      String image,
      User.Role role
  ) {
    var userExists = repository.get(id);
    if (userExists.isPresent()) {
      repository.update(id, name, email, password, image, role);
    }
  }
}
