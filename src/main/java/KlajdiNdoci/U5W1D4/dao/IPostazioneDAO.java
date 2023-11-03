package KlajdiNdoci.U5W1D4.dao;

import KlajdiNdoci.U5W1D4.entities.Postazione;

import java.util.List;

public interface IPostazioneDAO {
    public void save(Postazione postazione);

    public void findByIdAndUpdate(long id, Postazione postazione);

    public void findByIdAndDelete(long id);

    public Postazione findById(long id);

    public List<Postazione> findAll();

    public long count();
}
