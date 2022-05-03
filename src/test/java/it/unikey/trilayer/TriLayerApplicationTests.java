package it.unikey.trilayer;

import it.unikey.trilayer.BLL.dto.request.PersonaRequestDTO;
import it.unikey.trilayer.BLL.mapper.implementation.PersonaRequestMapper;
import it.unikey.trilayer.DAL.Entity.Persona;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TriLayerApplicationTests {
private PersonaRequestMapper mapper = Mappers.getMapper(PersonaRequestMapper.class);
    @Test
    void contextLoads() {
    }

    @Test
    public void DTOtoEntity(){
        PersonaRequestDTO personaRequestDTO = new PersonaRequestDTO();

        personaRequestDTO.setNome("Sara");
        personaRequestDTO.setCognome("Gaudiosi");

        Persona p = mapper.asEntity(personaRequestDTO);

        assertEquals(p.getNome(), personaRequestDTO.getNome());
        assertEquals(p.getCognome(), personaRequestDTO.getCognome());
        assertEquals(p.getAuto(), personaRequestDTO.getAutoRequestDTOList());

    }
}
