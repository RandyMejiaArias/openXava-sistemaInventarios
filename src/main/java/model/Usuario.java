package model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String email;
    private String password;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Métodos adicionales

    public void registrarUsuario() {
        // Lógica para registrar usuario
    }

    public void actualizarUsuario() {
        // Lógica para actualizar usuario
    }

    public void actualizarPassword() {
        // Lógica para actualizar contraseña
    }

    public void auditarActividades() {
        // Lógica para auditar actividades
    }
    
    @OneToMany(mappedBy = "usuario")
    private List<Pedido> pedidos;

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
