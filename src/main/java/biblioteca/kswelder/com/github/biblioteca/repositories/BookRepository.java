package biblioteca.kswelder.com.github.biblioteca.repositories;

import biblioteca.kswelder.com.github.biblioteca.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
