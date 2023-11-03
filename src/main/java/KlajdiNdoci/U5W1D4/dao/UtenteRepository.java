package KlajdiNdoci.U5W1D4.dao;

import KlajdiNdoci.U5W1D4.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
