package KlajdiNdoci.U5W1D4.dao;

import KlajdiNdoci.U5W1D4.entities.Postazione;
import KlajdiNdoci.U5W1D4.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class PostazioneService implements IPostazioneDAO{
    @Autowired
    private PostazioneRepository postazioneRepository;
    @Override
    public void save(Postazione postazione) {
        postazioneRepository.save(postazione);
        log.info("Postazione salvata correttamente");
    }

    @Override
    public void findByIdAndUpdate(long id, Postazione user) throws ItemNotFoundException {
        Postazione found = this.findById(id);

        found.setEdificio(user.getEdificio());
        found.setDescrizione(user.getDescrizione());
        found.setPrenotazioni(user.getPrenotazioni());
        found.setTipo_postazione(user.getTipo_postazione());

        postazioneRepository.save(found);
        log.info("Postazione con id " + id + " aggiornato con successo!");
    }

    @Override
    public void findByIdAndDelete(long id) throws ItemNotFoundException {
        Postazione found = this.findById(id);
        postazioneRepository.delete(found);
        log.info("Postazione con id " + id + " eliminato con successo!");
    }

    @Override
    public Postazione findById(long id) {
        return postazioneRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Postazione> findAll() {
        return postazioneRepository.findAll();
    }

    @Override
    public long count() {
        return postazioneRepository.count();
    }
}
