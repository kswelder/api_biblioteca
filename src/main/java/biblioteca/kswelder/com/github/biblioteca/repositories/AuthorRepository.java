package biblioteca.kswelder.com.github.biblioteca.repositories;

import biblioteca.kswelder.com.github.biblioteca.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
