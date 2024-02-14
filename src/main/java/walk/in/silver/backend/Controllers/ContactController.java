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
    @CrossOrigin(origins = "http://localhost:4200",
                methods = {RequestMethod.GET, RequestMethod.POST},
                maxAge = 3600
                )
    @GetMapping(path = "/addContact")
    public AddContactResponse saveFromJSON(@ModelAttribute Contact contact) throws Exception{
        if(contact != null) {
            return contactService.save(contact);

        }
        else {
            return new AddContactResponse("Cannot Save", contact);
        }
    }
}
