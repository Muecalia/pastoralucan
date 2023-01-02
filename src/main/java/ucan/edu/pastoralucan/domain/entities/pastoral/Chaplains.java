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

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_chaplains")
public class Chaplains {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_chaplain")
    private Long pkChaplain;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_pastoral_member", referencedColumnName = "pk_pastoral_member", nullable = false)
    private PastoralMembers fkPastoralMember;
    @Column(name = "first_date", nullable = true, unique = false)
    private Date firstDate;
    @Column(name = "end_date", nullable = true, unique = false)
    private Date endDate;
}
