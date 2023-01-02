package ucan.edu.pastoralucan.domain.entities.general;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "tb_sacraments")
public class Sacraments {
    @Id
    @Column(name = "pk_sacrament")
    private int pkSacrament;
    @Column(name = "sacrament", length = 50, nullable = false, unique = true)
    private String sacrament;
}
