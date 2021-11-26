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

/**
 * @author Sofia Pavlinina
 */
@Entity
@Table(name = "Book")
@Getter
@Setter
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "BookURL", length = 70)
  private String bookURL;

  @Column(name = "Title", nullable = false, length = 100)
  private String title;

  @Column(name = "Author", nullable = false, length = 40)
  private String author;

  @ManyToOne
  @JoinColumn(name = "ArchiveID")
  private Archive archiveID;

  @ManyToOne
  @JoinColumn(name = "BookLayoutID")
  private BookLayout bookLayoutID;

  @ManyToOne(optional = false)
  @JoinColumn(name = "BookTextID", nullable = false)
  private EditedText bookTextID;

  @Column(name = "AgeLimit", nullable = false)
  private Integer ageLimit;

}
