package walk.in.silver.backend.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import walk.in.silver.backend.Entities.Contact;
import walk.in.silver.backend.Services.ContactService;
import walk.in.silver.backend.Services.ContactServiceImpl;

@RestController
public class ContactController {

    ContactService contactService;
    public ContactController(ContactServiceImpl contactService){
        this.contactService = contactService;
    }
    @CrossOrigin(origins = "http://localhost:4200/",
    methods = {RequestMethod.POST})
    @PostMapping(path = "/addContact")
    public AddContactResponse saveFromJSON(@RequestBody Contact contact) throws Exception{
        if(contact != null) {
            System.out.println(contact);
            System.out.println(contact.getId());
            System.out.println(contact.getEMail());
            System.out.println(contact.getTitle());
            System.out.println(contact.getMessage());
            AddContactResponse save = contactService.save(contact);
            return save;

        }
        else {
            return new AddContactResponse("Cannot Save", contact);
        }
    }
}
