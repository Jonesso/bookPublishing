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
@Table(name = "publication_requirement")
@Getter
@Setter
public class PublicationRequirement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "requirements_text_url", nullable = false, length = 70)
  private String requirementsTextUrl;

}
