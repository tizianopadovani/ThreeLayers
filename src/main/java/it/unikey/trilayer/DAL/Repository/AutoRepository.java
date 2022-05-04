package it.unikey.trilayer.DAL.Repository;

import it.unikey.trilayer.DAL.Entity.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto,Long> {

}
