package KlajdiNdoci.U5W1D4.entities;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "utenti")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "UtenteBuilder")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String nome_completo;
    private String email;
}
