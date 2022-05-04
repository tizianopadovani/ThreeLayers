package it.unikey.trilayer.DAL.Repository;

import it.unikey.trilayer.DAL.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    @Query(value = "SELECT count(*) FROM persona WHERE LEN(cognome)= 5", nativeQuery = true)
    Integer numberPersonaWithCognomeLength5();

    @Query("SELECT count(p) FROM Persona p WHERE LENGTH(p.cognome) =5")
    Integer numberPeronaWithCognomeLength5JPQL();
}
