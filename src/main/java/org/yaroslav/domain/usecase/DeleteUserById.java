package org.yaroslav.domain.usecase;

import lombok.AllArgsConstructor;
import org.yaroslav.domain.repositories.UserRepository;

/**
 * Сценарий удаления пользователя по идентификатору.
 */
@AllArgsConstructor
public class DeleteUserById {
  private UserRepository repository;
  
  public void deleteUserById(long id) {
    repository.delete(id);
  }
}
