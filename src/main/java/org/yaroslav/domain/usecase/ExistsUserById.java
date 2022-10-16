package org.yaroslav.domain.usecase;

import org.yaroslav.domain.repositories.UserRepository;

/**
 * Сценарий проверки существования пользователя по идентификатору.
 */
public class ExistsUserById {
  private UserRepository repository;
  public boolean existsUserById(long id) {
    return repository.exists(id);
  }
}
