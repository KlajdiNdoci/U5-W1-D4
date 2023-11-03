package KlajdiNdoci.U5W1D4.entities;

import KlajdiNdoci.U5W1D4.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "postazioni")
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "PostazioneBuilder")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descrizione;
    private TipoPostazione tipo_postazione;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

}
