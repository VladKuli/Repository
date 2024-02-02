package org.app.dealer.core.database.jpa;

import org.app.dealer.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {

}