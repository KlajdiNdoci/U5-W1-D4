package KlajdiNdoci.U5W1D4;

import KlajdiNdoci.U5W1D4.dao.IUtenteDAO;
import KlajdiNdoci.U5W1D4.entities.Utente;
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
    @Override
    public void run(String... args) throws Exception {
        Utente utenteRndm = Utente.builder().build();
//        utenteDAO.save(utenteRndm);
        try {
            log.info(utenteDAO.findById(1).toString());
        } catch (ItemNotFoundException ex) {
            log.error(ex.getMessage());
        }

    }
}
