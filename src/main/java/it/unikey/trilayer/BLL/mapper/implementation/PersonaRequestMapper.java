package it.unikey.trilayer.BLL.mapper.implementation;

import it.unikey.trilayer.BLL.dto.request.PersonaRequestDTO;
import it.unikey.trilayer.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.trilayer.DAL.Entity.Persona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaRequestMapper extends GenericRequestMapper<Persona, PersonaRequestDTO> {
}
