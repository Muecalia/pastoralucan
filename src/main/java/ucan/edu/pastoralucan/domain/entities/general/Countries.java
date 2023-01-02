package ucan.edu.pastoralucan.domain.entities.general;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "tb_countries")
public class Countries {
    @Id
    @Column(name = "pk_country")
    private long pkCountry;
    @Column(name = "country", nullable = false, unique = true, length = 50)
    private String country;
    @Column(name = "nacionality", nullable = false, unique = true, length = 50)
    private String nacionality;
    @Column(name = "abbreviation", nullable = false, unique = true, length = 5)
    private String abbreviation;
    @OneToMany(mappedBy = "fkCountry", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Provinces> provinces;
}
