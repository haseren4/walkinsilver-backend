package walk.in.silver.backend.Services;

import walk.in.silver.backend.Controllers.AddContactResponse;
import walk.in.silver.backend.Entities.Contact;
import walk.in.silver.backend.Repositories.ContactRepository;

import java.util.Set;

public interface ContactService {
    ContactRepository contactRepository = null;
    AddContactResponse save(Contact contact);
    Set<Contact> findAll();

}
