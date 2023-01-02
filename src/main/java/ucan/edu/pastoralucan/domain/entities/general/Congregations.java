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
@Table(name = "tb_congregations")
public class Congregations {
    @Id
    @Column(name = "pk_congregation")
    private int pkCongregation;
    @Column(name = "congregation", length = 50, nullable = false, unique = true)
    private String congregation;
}
