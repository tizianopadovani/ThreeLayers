package it.unikey.trilayer.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name="auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
    public void setId(Long id) {
        this.id = id;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
