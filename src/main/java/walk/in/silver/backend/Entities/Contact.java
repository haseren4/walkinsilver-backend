package walk.in.silver.backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter@Table(name = "Contacts")
@Entity
public class Contact {
    @Id
    @Setter@Getter
    @Column(name = "contacts")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
}
