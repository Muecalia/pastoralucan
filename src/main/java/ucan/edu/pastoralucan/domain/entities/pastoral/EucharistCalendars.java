package ucan.edu.pastoralucan.domain.entities.pastoral;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "tb_eucharist_calendars")
public class EucharistCalendars {
    @Id
    @Column(name = "pk_eucharist_calendars")
    public long pkEucharistCalendars;
    @Column(name = "hour", nullable = true, unique = false)
    public String hour;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_celebrant", referencedColumnName = "pk_celebrant", nullable = false, unique = false)
    public Celebrants fkCelebrant;
    @Column(name = "day_of_week", nullable = true, unique = false)
    public int dayOfWeek;
    @Column(name = "status", nullable = true, unique = false)
    private boolean status;
    @Column(name = "create_date", nullable = true, unique = false)
    private Date createDate;
    @Column(name = "start_date", nullable = true, unique = false)
    private Date startDate;
    @Column(name = "end_date", nullable = true, unique = false)
    private Date endDate;
    @Column(name = "update_date", nullable = true, unique = false)
    private Date updateDate;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_pastoral_member", referencedColumnName = "pk_pastoral_member", nullable = false)
    private PastoralMembers fkPastoralMember;
}
