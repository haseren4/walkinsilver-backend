package walk.in.silver.backend.Services;

import org.springframework.stereotype.Service;
import walk.in.silver.backend.Controllers.AddContactResponse;
import walk.in.silver.backend.Entities.Contact;
import walk.in.silver.backend.Repositories.ContactRepository;

import java.util.Set;

@Service
public class ContactServiceImpl implements  ContactService{
    private ContactRepository contactRepository;
    public ContactServiceImpl(ContactRepository contactRepository){this.contactRepository = contactRepository;}
    @Override
    public AddContactResponse save(Contact contact) {
        Contact newContact = contactRepository.save(contact);
        return new AddContactResponse("Save Successful",newContact );
    }

    public Set<Contact> findAll(){
        return (Set<Contact>) contactRepository.findAll();
    }
}
