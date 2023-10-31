package org.app.dealer.core.database.jpa;

import org.app.dealer.core.domain.ModificationsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaModificationsInfoRepository extends JpaRepository<ModificationsInfo, Long> {
}
