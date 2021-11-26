package ru.pavlinina.ecommerce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EditedText")
@Getter
@Setter
public class EditedText {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "TextURL", nullable = false, length = 70)
  private String textURL;

  @Column(name = "Author", nullable = false, length = 40)
  private String author;

  @ManyToOne(optional = false)
  @JoinColumn(name = "PublicationRequirementsID", nullable = false)
  private PublicationRequirement publicationRequirementsID;

}
