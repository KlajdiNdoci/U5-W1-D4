package KlajdiNdoci.U5W1D4.dao;

import KlajdiNdoci.U5W1D4.entities.Utente;
import KlajdiNdoci.U5W1D4.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UtenteService implements IUtenteDAO {
    @Autowired
    private UtenteRepository utenteRepository;
    @Override
    public void save(Utente utente) {
        utenteRepository.save(utente);
        log.info("Utente con username " + utente.getUsername() + " salvato correttamente");
    }

    @Override
    public void findByIdAndUpdate(long id, Utente user) throws ItemNotFoundException{
        Utente found = this.findById(id);

        found.setUsername(user.getUsername());
        found.setNome_completo(user.getNome_completo());
        found.setEmail(user.getEmail());

        utenteRepository.save(found);
        log.info("Utente con id " + id + " aggiornato con successo!");
    }

    @Override
    public void findByIdAndDelete(long id) throws ItemNotFoundException {
        Utente found = this.findById(id);
        utenteRepository.delete(found);
        log.info("Utente con id " + id + " eliminato con successo!");
    }

    @Override
    public Utente findById(long id) {
        return utenteRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Utente> findAll() {
        return utenteRepository.findAll();
    }

    @Override
    public long count() {
        return utenteRepository.count();
    }
}
