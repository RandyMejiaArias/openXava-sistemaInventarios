package model;

import javax.persistence.*;

@Entity
public class Maquinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String fechaAdquisicion;
    private String ubicacion;
    private String estado;

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos adicionales

    public void registrarMaquinaria() {
        // Lógica para registrar maquinaria
    }

    public void actualizarMaquinaria() {
        // Lógica para actualizar maquinaria
    }

    public void registrarUso() {
        // Lógica para registrar uso
    }

    public void realizarMantenimiento() {
        // Lógica para realizar mantenimiento
    }
}
