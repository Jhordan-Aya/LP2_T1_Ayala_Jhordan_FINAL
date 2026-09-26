package model;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_dentista")
public class DentistaAJ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    private int idDentista;

    @Column(name = "cop")
    private String cop;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    @Column(name = "fecha_inicio_contrato")
    private LocalDate fechaInicioContrato;

    @Column(name = "turno")
    private String turno;

    @Column(name = "correo")
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private EspecialidadAJ especialidad;

    @Override
    public String toString() {
        return nombreCompleto;
    }
}