package KlajdiNdoci.U5W1D4.dao;

import KlajdiNdoci.U5W1D4.entities.Prenotazione;
import KlajdiNdoci.U5W1D4.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class PrenotazioneService implements IPrenotazioneDAO {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    @Override
    public void save(Prenotazione prenotazione) {
        prenotazioneRepository.save(prenotazione);
        log.info("Prenotazione salvata correttamente");
    }
    @Override
    public Prenotazione findById(long id) {
        return prenotazioneRepository.findById(id).orElseThrow(()-> new ItemNotFoundException(id));
    }

    @Override
    public void findByIdAndUpdate(long id, Prenotazione prenotazione) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public List<Prenotazione> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
