package it.unikey.trilayer.BLL.mapper.implementation;

import it.unikey.trilayer.BLL.dto.response.PersonaResponseDTO;
import it.unikey.trilayer.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.trilayer.DAL.Entity.Persona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaResponseMapper extends GenericResponseMapper<Persona, PersonaResponseDTO> {
}
