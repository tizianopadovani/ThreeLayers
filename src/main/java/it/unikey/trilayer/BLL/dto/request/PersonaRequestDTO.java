package it.unikey.trilayer.BLL.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class PersonaRequestDTO {

    private String nome;
    private String cognome;
    private List<AutoRequestDTO> autoRequestDTOList;
}
