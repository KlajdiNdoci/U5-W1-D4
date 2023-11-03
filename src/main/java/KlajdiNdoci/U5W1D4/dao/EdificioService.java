package KlajdiNdoci.U5W1D4.dao;

import KlajdiNdoci.U5W1D4.entities.Edificio;
import KlajdiNdoci.U5W1D4.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class EdificioService implements IEdificioDAO{
    @Autowired
    private EdificioRepository edificioRepository;
    @Override
    public void save(Edificio edificio) {
        edificioRepository.save(edificio);
        log.info("Edificio con nome " + edificio.getNome() + " salvato correttamente");
    }

    @Override
    public void findByIdAndUpdate(long id, Edificio user) throws ItemNotFoundException {
        Edificio found = this.findById(id);

        found.setCittá(user.getCittá());
        found.setIndirizzo(user.getIndirizzo());
        found.setNome(user.getNome());

        edificioRepository.save(found);
        log.info("Edificio con id " + id + " aggiornato con successo!");
    }

    @Override
    public void findByIdAndDelete(long id) throws ItemNotFoundException {
        Edificio found = this.findById(id);
        edificioRepository.delete(found);
        log.info("Edificio con id " + id + " eliminato con successo!");
    }

    @Override
    public Edificio findById(long id) {
        return edificioRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Edificio> findAll() {
        return edificioRepository.findAll();
    }

    @Override
    public long count() {
        return edificioRepository.count();
    }
}
