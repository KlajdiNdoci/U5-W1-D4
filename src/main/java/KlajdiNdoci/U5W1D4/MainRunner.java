package KlajdiNdoci.U5W1D4;

import KlajdiNdoci.U5W1D4.dao.IEdificioDAO;
import KlajdiNdoci.U5W1D4.dao.IPostazioneDAO;
import KlajdiNdoci.U5W1D4.dao.IUtenteDAO;
import KlajdiNdoci.U5W1D4.entities.Edificio;
import KlajdiNdoci.U5W1D4.entities.Postazione;
import KlajdiNdoci.U5W1D4.entities.Utente;
import KlajdiNdoci.U5W1D4.enums.TipoPostazione;
import KlajdiNdoci.U5W1D4.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MainRunner implements CommandLineRunner {
    @Autowired
    private IUtenteDAO utenteDAO;
    @Autowired
    private IEdificioDAO edificioDAO;
    @Autowired
    private IPostazioneDAO postazioneDAO;
    @Override
    public void run(String... args) throws Exception {
        Utente utenteRndm = Utente.builder().build();
//        utenteDAO.save(utenteRndm);
        try {
            log.info(utenteDAO.findById(1).toString());
        } catch (ItemNotFoundException ex) {
            log.error(ex.getMessage());
        }

        Edificio ed1 = Edificio.builder().cittá("Milano").nome("Edificio1").indirizzo("Via 1 Maggio").build();
        Edificio ed2 = Edificio.builder().cittá("Torino").nome("Edificio2").indirizzo("Via 2 Maggio").build();
        Edificio ed3 = Edificio.builder().cittá("Roma").nome("Edificio3").indirizzo("Via 3 Maggio").build();
//        edificioDAO.save(ed1);
//        edificioDAO.save(ed2);
//        edificioDAO.save(ed3);

        Postazione p1 = Postazione.builder().tipo_postazione(TipoPostazione.OPENSPACE).descrizione("ciao").edificio(edificioDAO.findById(1)).build();
        postazioneDAO.save(p1);
    }
}
