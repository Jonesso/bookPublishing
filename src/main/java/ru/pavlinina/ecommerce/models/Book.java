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
@Table(name = "book")
@Getter
@Setter
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "book_url", length = 70)
  private String bookURL;

  @Column(name = "title", nullable = false, length = 100)
  private String title;

  @Column(name = "author", nullable = false, length = 40)
  private String author;

  @ManyToOne
  @JoinColumn(name = "archive_id")
  private Archive archiveID;

  @ManyToOne
  @JoinColumn(name = "book_layout_id")
  private BookLayout bookLayoutID;

  @ManyToOne(optional = false)
  @JoinColumn(name = "book_text_id", nullable = false)
  private EditedText bookTextID;

  @Column(name = "age_limit", nullable = false)
  private Integer ageLimit;

}
