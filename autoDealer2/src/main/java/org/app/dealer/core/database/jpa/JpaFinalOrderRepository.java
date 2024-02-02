package org.app.dealer.core.database.jpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.app.dealer.core.domain.FinalOrder;

@Repository
public interface JpaFinalOrderRepository extends JpaRepository<FinalOrder, Long> {


}