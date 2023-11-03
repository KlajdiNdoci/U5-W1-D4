package KlajdiNdoci.U5W1D4.dao;

import KlajdiNdoci.U5W1D4.entities.Utente;

import java.util.List;

public interface IUtenteDAO {
    public void save(Utente utente);

    public void findByIdAndUpdate(long id, Utente utente);

    public void findByIdAndDelete(long id);

    public Utente findById(long id);

    public List<Utente> findAll();

    public long count();
}
