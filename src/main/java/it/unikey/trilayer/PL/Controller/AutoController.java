package it.unikey.trilayer.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import it.unikey.trilayer.BLL.dto.request.AutoRequestDTO;
import it.unikey.trilayer.BLL.dto.response.AutoResponseDTO;
import it.unikey.trilayer.BLL.service.abstraction.AutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auto")
@CrossOrigin("http://localhost:8080")
public class AutoController {

    private final AutoService autoService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere una macchina", notes = "per aggiungere la risorsa serve un oggetto")
    @ApiResponses(value ={
            @ApiResponse(code = 201, message = "Ha creato la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizzazioni per aggiungere un auto")
    })

    public ResponseEntity<Void> save(@RequestBody AutoRequestDTO autoRequestDTO){
        autoService.saveAuto(autoRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<AutoResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(autoService.findById(id), HttpStatus.OK);
    }

    


}
