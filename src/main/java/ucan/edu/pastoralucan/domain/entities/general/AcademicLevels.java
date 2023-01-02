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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_academic_levels")
public class AcademicLevels {
    @Id
    @Column(name = "pk_academic_level")
    private int pkAcademicLevel;
    @Column(name = "academic_level", length = 50, nullable = false, unique = true)
    private String academicLevel;
}
