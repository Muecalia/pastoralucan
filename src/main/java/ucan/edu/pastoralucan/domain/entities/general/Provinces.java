package ucan.edu.pastoralucan.domain.entities.general;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "tb_provinces")
public class Provinces {
    @Id
    @Column(name = "pk_province")
    private int pkProvince;
    @Column(name = "province", nullable = false, unique = true, length = 50)
    private String province;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_country", referencedColumnName = "pk_country", nullable = false)
    private Countries fkCountry;
    @OneToMany(mappedBy = "fkProvince", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Counties> counties;
}
