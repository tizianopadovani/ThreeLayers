package it.unikey.trilayer.BLL.mapper.implementation;

import it.unikey.trilayer.BLL.dto.response.AutoResponseDTO;
import it.unikey.trilayer.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.trilayer.DAL.Entity.Auto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AutoResponseMapper extends GenericResponseMapper<Auto, AutoResponseDTO> {

}
