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
@Table(name = "rough_draft")
@Getter
@Setter
public class RoughDraft {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "draft_text_url", nullable = false, length = 70)
  private String draftTextURL;

  @Column(name = "author", nullable = false, length = 40)
  private String author;

  @Column(name = "title", nullable = false, length = 100)
  private String title;

  @Column(name = "status", nullable = false, length = 30)
  private String status;
}
