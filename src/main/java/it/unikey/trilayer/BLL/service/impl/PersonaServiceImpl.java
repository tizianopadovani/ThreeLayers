package it.unikey.trilayer.BLL.service.impl;

import it.unikey.trilayer.BLL.dto.request.PersonaRequestDTO;
import it.unikey.trilayer.BLL.dto.response.PersonaResponseDTO;
import it.unikey.trilayer.BLL.mapper.implementation.AutoRequestMapper;
import it.unikey.trilayer.BLL.mapper.implementation.AutoResponseMapper;
import it.unikey.trilayer.BLL.mapper.implementation.PersonaRequestMapper;
import it.unikey.trilayer.BLL.mapper.implementation.PersonaResponseMapper;
import it.unikey.trilayer.BLL.service.abstraction.PersonaService;
import it.unikey.trilayer.DAL.Entity.Auto;
import it.unikey.trilayer.DAL.Entity.Persona;
import it.unikey.trilayer.DAL.Repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    private final AutoRequestMapper autoRequestMapper;

    private final AutoResponseMapper autoResponseMapper;

    private final PersonaRequestMapper personaRequestMapper;

    private final PersonaResponseMapper personaResponseMapper;


    @Override
    public void savePersona(PersonaRequestDTO personaRequestDTO) {
        Persona p = personaRequestMapper.asEntity(personaRequestDTO);
        List<Auto> list = autoRequestMapper.asEntityList(personaRequestDTO.getAutoRequestDTOList());
        p.setAuto(list);
        personaRepository.save(p);
    }

    @Override
    public PersonaResponseDTO findById(Long id) {
        Persona p = personaRepository.getById(id);
        if(p != null)
            return personaResponseMapper.asDTO(p);
        else
            throw new NullPointerException();
    }

    @Override
    public void deletePersonaById(Long id) {
        if(personaRepository.existsById(id))
            personaRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<PersonaResponseDTO> findAllPersona() {
        List<Persona> list = personaRepository.findAll();
        return personaResponseMapper.asDTOList(list);
    }

    @Override
    public Integer numberPersonaWithCognomeLength5() {
        return personaRepository.numberPersonaWithCognomeLength5();
    }

    @Override
    public Integer numberPersonaWithCognomeLength5JPQL() {
        return personaRepository.numberPeronaWithCognomeLength5JPQL();
    }
}
