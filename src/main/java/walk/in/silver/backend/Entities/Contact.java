package walk.in.silver.backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter@Table(name = "contacts")
@Entity
public class Contact {
    @Id
    @Setter@Getter
    @Column(name = "contacts_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Getter@Setter
    @Column(name = "contacts_add")
    public String eMail;
    @Getter@Setter
    @Column(name = "contacts_title")
    public String title;
    @Getter@Setter
    @Column(name = "contacts_message")
    public String message;

    public Contact(int id, String address, String title, String message){
        this.id = id;
        this.eMail = address;
        this.title = title;
        this.message = message;
    }


    public Contact() {

    }
}
