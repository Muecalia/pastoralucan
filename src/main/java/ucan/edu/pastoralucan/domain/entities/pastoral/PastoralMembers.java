package ucan.edu.pastoralucan.domain.entities.pastoral;

import java.sql.Date;

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
import ucan.edu.pastoralucan.domain.entities.general.AcademicLevels;
import ucan.edu.pastoralucan.domain.entities.general.CivilStates;
import ucan.edu.pastoralucan.domain.entities.general.Counties;
import ucan.edu.pastoralucan.domain.entities.general.Countries;
import ucan.edu.pastoralucan.domain.entities.general.Genres;
import ucan.edu.pastoralucan.domain.entities.general.Religions;
import ucan.edu.pastoralucan.domain.entities.general.Sacraments;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_pastoral_members")
public class PastoralMembers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_pastoral_member")
    private long pkPastoralMember;
    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "midle_name", length = 50, nullable = true)
    private String midleName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "birth_date", nullable = true)
    private Date birthDate;
    @Column(name = "create_date", nullable = true)
    private Date createDate;
    @Column(name = "update_date", nullable = true)
    private Date updateDate;
    @Column(name = "photo", length = 100, nullable = true)
    private String photo;
    @Column(name = "status", nullable = true)
    private boolean status;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_contact", referencedColumnName = "pk_contact", nullable = false, unique = true)
    private Contacts fkContact;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_nacionality", referencedColumnName = "pk_country", nullable = true)
    private Countries fkNacionality;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_religion", referencedColumnName = "pk_religion", nullable = true)
    private Religions fkReligion;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_sacrament", referencedColumnName = "pk_sacrament", nullable = true)
    private Sacraments fkSacrament;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_gender", referencedColumnName = "pk_gender", nullable = true)
    private Genres fkGender;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_academic_level", referencedColumnName = "pk_academic_level", nullable = true)
    private AcademicLevels fkAcademicLevel;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_civil_state", referencedColumnName = "pk_civil_state", nullable = true)
    private CivilStates fkCivilState;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_county", referencedColumnName = "pk_county", nullable = true)
    private Counties fkCounty;
}
