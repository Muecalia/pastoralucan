package ucan.edu.pastoralucan.domain.entities.general;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_counties")
public class Counties {
    @Id
    @Column(name = "pk_county")
    private int pkCounty;
    @Column(name = "county", nullable = false, length = 50, unique = true)
    private String county;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_province", referencedColumnName = "pk_province", nullable = false)
    private Provinces fkProvince;
}
