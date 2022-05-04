package it.unikey.trilayer.BLL.service.abstraction;

import it.unikey.trilayer.BLL.dto.request.AutoRequestDTO;
import it.unikey.trilayer.BLL.dto.response.AutoResponseDTO;

import java.util.List;

public interface AutoService {

    void saveAuto(AutoRequestDTO autoRequestDTO);

    AutoResponseDTO findById(Long id);

    void deleteAutoById(Long id);

    List<AutoResponseDTO> findAllAuto();

}
