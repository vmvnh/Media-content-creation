package org.yaroslav.domain.usecase;

import lombok.AllArgsConstructor;
import org.yaroslav.domain.entities.User;
import org.yaroslav.domain.repositories.UserRepository;

import java.util.Optional;

/**
 * Сценарий получения пользователя по email.
 */
@AllArgsConstructor
public class GetUserByEmail {
  private UserRepository repository;

  public Optional<User> getUserByEmail(String email) {
    return repository.get(email);
  }
}
