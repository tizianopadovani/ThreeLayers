package it.unikey.trilayer.BLL.mapper.abstraction;

import java.util.List;

public interface GenericResponseMapper <E, D>{

    D asDTO(E entity);

    List<D> asDTOList(List<E> entities);
}
