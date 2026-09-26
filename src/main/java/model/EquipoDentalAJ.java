package model;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_equipo_dental")
public class EquipoDentalAJ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    private int nroEquipo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "costo")
    private double costo;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_adquisicion")
    private LocalDate fechaAdquisicion;

    @ManyToOne
    @JoinColumn(name = "id_dentista")
    private DentistaAJ dentista;
}