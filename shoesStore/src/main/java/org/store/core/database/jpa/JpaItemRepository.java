package org.store.core.database.jpa;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.store.core.domain.Item;

@Repository
public interface JpaItemRepository extends JpaRepository<Item, Long> {

    @Modifying
    @Query(value = "Update items set name = ?2 where id = ?1", nativeQuery = true)
    void updateItemName(Long id,String name);
    @Query(value = "Update items set model = ?2 where id = ?1", nativeQuery = true)
    void updateItemModel(Long id,String model);
    /*
    @Query(value = "Update items set model = ?2 where id = ?1", nativeQuery = true)
    void updateItemBrand(Long id,String model);
     */
    @Query(value = "Update items set price = ?2 where id = ?1", nativeQuery = true)
    void updateItemPrice(Long id,Integer price);
}