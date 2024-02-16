package walk.in.silver.backend.Controllers;

import lombok.Getter;
import lombok.Setter;

@Getter
public class AddContactModel {
    @Setter
    int id;
    @Setter
    String eMail;
    @Setter
    String title;
    @Setter
    String message;

    public AddContactModel(int id, String eMail, String title, String message){
        this.eMail = eMail;
        this.id = id;
        this.title = title;
        this.message = message;
    }
    public AddContactModel(){}
}
