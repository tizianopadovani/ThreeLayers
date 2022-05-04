package it.unikey.trilayer.BLL.service.abstraction;

import it.unikey.trilayer.BLL.dto.request.PersonaRequestDTO;
import it.unikey.trilayer.BLL.dto.response.PersonaResponseDTO;

import java.util.List;

public interface PersonaService {

    void savePersona(PersonaRequestDTO personaRequestDTO);

    PersonaResponseDTO findById(Long id);

    void deletePersonaById(Long id);

    List<PersonaResponseDTO> findAllPersona();

    Integer numberPersonaWithCognomeLength5();

    Integer numberPersonaWithCognomeLength5JPQL();
}
