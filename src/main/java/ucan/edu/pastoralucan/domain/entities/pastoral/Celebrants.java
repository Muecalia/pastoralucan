package ucan.edu.pastoralucan.domain.entities.pastoral;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ucan.edu.pastoralucan.domain.entities.general.Congregations;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_celebrants")
public class Celebrants {
    @Id
    @Column(name = "pk_celebrant")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pkCelebrant;
    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_congregation", referencedColumnName = "pk_congregation", nullable = false)
    private Congregations fkCongregation;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_contact", referencedColumnName = "pk_contact", nullable = false)
    private Contacts fkContact;
    @Column(name = "status", nullable = true)
    private boolean status;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_pastoral_member", referencedColumnName = "pk_pastoral_member", nullable = false, unique = false)
    private PastoralMembers fkPastoralMember;
}
