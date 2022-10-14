package org.yaroslav.domain.usecase;

import lombok.AllArgsConstructor;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;

import java.util.Optional;

/**
 * Сценарий получения пользователя по идентификатору.
 */
@AllArgsConstructor
public class GetUserById {
  private UserRepository repository;
  public Optional<User> getUserById(long id) {
    return repository.get(id);
  }
}
