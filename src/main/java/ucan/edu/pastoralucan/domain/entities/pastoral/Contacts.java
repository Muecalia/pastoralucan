package ucan.edu.pastoralucan.domain.entities.pastoral;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_contacts")
public class Contacts {
    @Id
    @Column(name = "pk_contact")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pkContact;
    @Column(name = "phone", length = 15, unique = true)
    private String phone;
    @Column(name = "email", length = 50, unique = true, nullable = false)
    private String email;
}
