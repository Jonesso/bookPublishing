package ru.pavlinina.ecommerce.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavlinina.ecommerce.models.Archive;
import ru.pavlinina.ecommerce.repositories.ArchiveRepository;

/**
 * @author Sofia Pavlinina
 */
@Service
public class ArchiveService {

  @Autowired
  private ArchiveRepository archiveRepository;

  public List<Archive> listArchives() {
    return archiveRepository.findAll();
  }

  public void addArchive(Archive archive) {
    archiveRepository.save(archive);
  }

}
