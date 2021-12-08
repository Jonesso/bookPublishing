package ru.pavlinina.ecommerce.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavlinina.ecommerce.models.Shop;
import ru.pavlinina.ecommerce.repositories.ShopRepository;

/**
 * @author Sofia Pavlinina
 */
@Service
public class ShopService {

  @Autowired
  private ShopRepository shopRepository;

  public List<Shop> listShops() {
    return shopRepository.findAll();
  }

  public void addShop(Shop shop) {
    shopRepository.save(shop);
  }

}
