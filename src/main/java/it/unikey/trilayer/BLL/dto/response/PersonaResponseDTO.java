package it.unikey.trilayer.BLL.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class PersonaResponseDTO {

    private  Long id;
    private String nome;
    private String cognome;
    private List<AutoResponseDTO> autoResponseDTOList;

}
