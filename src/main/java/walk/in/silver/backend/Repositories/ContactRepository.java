package walk.in.silver.backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import walk.in.silver.backend.Entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
