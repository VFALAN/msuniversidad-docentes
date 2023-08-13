package com.vf.dev.msuniversidaddocentes.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="MATERIAS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MateriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MATERIA", nullable = false)
    private Integer idMateria;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CLAVE")
    private String clave;
    @Column(name = "SEMESTRE")
    private Integer semestre;
    @JoinColumn(name = "ID_CARRERA")
    private Integer idCarrera;
}
