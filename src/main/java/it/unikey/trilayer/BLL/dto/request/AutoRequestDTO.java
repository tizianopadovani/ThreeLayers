package it.unikey.trilayer.BLL.dto.request;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AutoRequestDTO {

    @ApiModelProperty(notes = "Questa è una relazione ManyToOne", example = "Sara Gaudiosi")
    private PersonaRequestDTO personaRequestDTO;


}
