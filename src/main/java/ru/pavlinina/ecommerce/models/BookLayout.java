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
@Table(name = "book_layout")
@Getter
@Setter
public class BookLayout {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "book_name", nullable = false, length = 100)
  private String bookName;

  @Column(name = "layout_url", nullable = false, length = 70)
  private String layoutURL;

  @ManyToOne(optional = false)
  @JoinColumn(name = "publication_requirements_id", nullable = false)
  private PublicationRequirement publicationRequirementsID;
}
