package org.app.dealer.core.database.jpa;

import org.app.dealer.core.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCarRepository extends JpaRepository<Car, Long> {
}
