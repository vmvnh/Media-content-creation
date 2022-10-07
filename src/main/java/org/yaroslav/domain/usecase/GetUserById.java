package org.yaroslav.domain.usecase;

import lombok.AllArgsConstructor;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;

/**
 * Сценарий получения пользователя по идентификатору.
 */
@AllArgsConstructor
public class GetUserById {
  private UserRepository repository;
  public User getUserById(long id) {
    var user = repository.get(id);
    return user;
  }
}
