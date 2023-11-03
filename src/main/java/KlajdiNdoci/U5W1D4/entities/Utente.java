package KlajdiNdoci.U5W1D4.entities;
import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.Locale;

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
    @Column(nullable = false)
    private long id;
    private String username;
    private String nome_completo;
    private String email;

    public static class UtenteBuilder{
        private Faker faker = new Faker(Locale.ITALY);
        private String username = faker.name().username();
        private String nome_completo = faker.name().fullName();
        private String email = faker.internet().emailAddress();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
