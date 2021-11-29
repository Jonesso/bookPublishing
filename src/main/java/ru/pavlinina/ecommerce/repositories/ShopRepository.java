package ru.pavlinina.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlinina.ecommerce.models.Shop;

/**
 * @author Sofia Pavlinina
 */
@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

}
