package model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private int cantidad;
    private String ubicacion;

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Métodos adicionales

    public void registrarMaterial() {
        // Lógica para registrar material
    }

    public void actualizarMaterial() {
        // Lógica para actualizar material
    }

    public void generarReporteInventario() {
        // Lógica para generar reporte de inventario
    }

    public void alertarStockMinimo() {
        // Lógica para alertar sobre stock mínimo
    }
    
    @OneToMany(mappedBy = "material")
    private List<Inventario> inventarios;

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

}
