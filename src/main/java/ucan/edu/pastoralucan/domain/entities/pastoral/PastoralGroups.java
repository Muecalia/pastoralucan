package ucan.edu.pastoralucan.domain.entities.pastoral;

import java.util.Date;

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
@Table(name = "tb_pastoral_groups")
public class PastoralGroups {
    @Id
    @Column(name = "pk_pastoral_group")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pkPastoralGroup;
    @Column(name = "group_name", length = 50, nullable = false, unique = true)
    private String groupName;
    @Column(name = "history", length = 250, nullable = false, unique = false)
    private String history;
    @Column(name = "logo", length = 50, nullable = true, unique = true)
    private String logo;
    @Column(name = "url", length = 150, nullable = false, unique = true)
    private String url;
    @Column(name = "status", nullable = true, unique = false)
    private boolean status;
    @Column(name = "create_date", nullable = true, unique = false)
    private Date createDate;
    @Column(name = "foundation_date", nullable = true, unique = false)
    private Date foundationDate;
    @Column(name = "update_date", nullable = true, unique = false)
    private Date updateDate;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_pastoral_member", referencedColumnName = "pk_pastoral_member", nullable = false)
    private PastoralMembers fkPastoralMember;
}
