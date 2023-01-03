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

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_spiritual_accompaniment")
public class SpiritualAccompaniment {
    @Id
    @Column(name = "pk_spiritual_accompaniment")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pkSpiritualAccompaniment;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_celebrant", referencedColumnName = "pk_celebrant", nullable = false)
    private Celebrants fkCelebrant;
    @Column(name = "status", nullable = true, unique = false)
    private boolean status;
    @Column(name = "create_date", nullable = true, unique = false)
    private Date createDate;
    @Column(name = "update_date", nullable = true, unique = false)
    private Date updateDate;
    @Column(name = "first_date", nullable = true, unique = false)
    private Date firstDate;
    @Column(name = "end_date", nullable = true, unique = false)
    private Date endDate;
    @Column(name = "observation", nullable = true, unique = false)
    private String observation;
    @Column(name = "day_of_week", nullable = true, unique = false)
    private String dayOfWeek;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_pastoral_member", referencedColumnName = "pk_pastoral_member", nullable = false)
    private PastoralMembers fkPastoralMember;
}
