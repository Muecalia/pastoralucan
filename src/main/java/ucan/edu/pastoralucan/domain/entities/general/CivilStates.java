package ucan.edu.pastoralucan.domain.entities.general;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_civil_states")
public class CivilStates {
    @Id
    @Column(name = "pk_civil_state")
    private int pkCivilState;
    @Column(name = "civil_state", nullable = false, unique = true, length = 50)
    private String civilState;
    @Column(name = "cod_civil_state", nullable = false, unique = true, length = 5)
    private String codCivilState;
}
