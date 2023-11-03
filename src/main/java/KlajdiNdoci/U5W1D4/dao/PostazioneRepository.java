package KlajdiNdoci.U5W1D4.dao;

import KlajdiNdoci.U5W1D4.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
}
