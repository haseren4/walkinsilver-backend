package walk.in.silver.backend.Controllers;

import lombok.Getter;
import lombok.Setter;
import walk.in.silver.backend.Entities.Contact;

@Getter@Setter
public class AddContactResponse {
    @Getter@Setter
    String response;
    @Getter@Setter
    Contact contact;

    public AddContactResponse(String response, Contact contact){
        this.response = response;
        this.contact = contact;
    }
}
