package KlajdiNdoci.U5W1D4;

import KlajdiNdoci.U5W1D4.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Utente utenteRndm = Utente.builder().build();
        log.info(utenteRndm.toString());

    }
}
