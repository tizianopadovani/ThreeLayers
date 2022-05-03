package it.unikey.trilayer.BLL.mapper.implementation;

import it.unikey.trilayer.BLL.dto.request.AutoRequestDTO;
import it.unikey.trilayer.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.trilayer.DAL.Entity.Auto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AutoRequestMapper extends GenericRequestMapper<Auto, AutoRequestDTO> {
}
