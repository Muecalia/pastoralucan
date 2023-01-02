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
@Table(name = "tb_types_activities")
public class TypesActivities {
    @Id
    @Column(name = "pk_type_activity")
    private int pktypeActivity;
    @Column(name = "type_Activity", length = 50, nullable = false, unique = true)
    private String typeActivity;
}
