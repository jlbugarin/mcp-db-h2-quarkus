package org.consultorjava;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Persona extends PanacheEntity {

    public String primerNombre;
    public String segundoNombre;
    public String apellidoPaterno;
    public String apellidoMaterno;

    public String correoElectronico;
    public String numeroCelular;

    public Integer departamentoNumero;
    public Integer estacionamientoNumero;
}
