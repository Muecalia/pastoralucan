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
@Table(name = "tb_genres")
public class Genres {
    @Id
    @Column(name = "pk_gender")
    private int pkGender;
    @Column(name = "gender", length = 50, nullable = false, unique = true)
    private String gender;
    @Column(name = "cod_gender", length = 5, unique = true, nullable = false)
    private String codGender;
}
