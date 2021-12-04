package ru.pavlinina.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "shop")
@Getter
@Setter
public class Shop {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "shop_url", length = 70)
  private String shopUrl;

  @Column(name = "name", nullable = false, length = 100)
  private String name;

}
