package it.unikey.trilayer.BLL.service.impl;

import it.unikey.trilayer.BLL.dto.request.AutoRequestDTO;
import it.unikey.trilayer.BLL.dto.response.AutoResponseDTO;
import it.unikey.trilayer.BLL.mapper.implementation.AutoRequestMapper;
import it.unikey.trilayer.BLL.mapper.implementation.AutoResponseMapper;
import it.unikey.trilayer.BLL.mapper.implementation.PersonaRequestMapper;
import it.unikey.trilayer.BLL.service.abstraction.AutoService;
import it.unikey.trilayer.DAL.Entity.Auto;
import it.unikey.trilayer.DAL.Entity.Persona;
import it.unikey.trilayer.DAL.Repository.AutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AutoServiceImpl implements AutoService {

    private final AutoRepository autoRepository;
    private final AutoRequestMapper autoRequestMapper;
    private final AutoResponseMapper autoResponseMapper;
    private final PersonaRequestMapper personaRequestMapper;

    @Override
    public void saveAuto(AutoRequestDTO autoRequestDTO) {
        Auto a = autoRequestMapper.asEntity(autoRequestDTO);
        Persona p = personaRequestMapper.asEntity(autoRequestDTO.getPersonaRequestDTO());
        a.setPersona(p);
        autoRepository.save(a);
    }

    @Override
    public AutoResponseDTO findById(Long id) {
        Auto a = autoRepository.getById(id);
        if(a != null)
            return autoResponseMapper.asDTO(a);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteAutoById(Long id) {
        if(autoRepository.existsById(id)){
            autoRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<AutoResponseDTO> findAllAuto() {
        List<Auto> list = autoRepository.findAll();
        return autoResponseMapper.asDTOList(list);
    }
}
