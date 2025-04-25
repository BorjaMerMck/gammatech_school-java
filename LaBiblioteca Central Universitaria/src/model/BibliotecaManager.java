package model;

import enums.EstadoRecurso;
import interfaces.Prestamista;

import java.util.HashMap;
import java.util.Map;

public class BibliotecaManager implements Prestamista {
    private Map<String, RecursoBiblioteca> recursos;
    private Map<String, Usuario> usuarios;

    public BibliotecaManager() {
        recursos = new HashMap<>();
        usuarios = new HashMap<>();
    }

    // Implementación del método prestar de Prestamista
    public boolean prestar(RecursoBiblioteca recurso, Usuario usuario) {
        if (recurso.getEstado() == EstadoRecurso.DISPONIBLE) {
            recurso.setEstado(EstadoRecurso.PRESTADO);
            System.out.println("Préstamo realizado: " + recurso.getTitulo() + " a " + usuario.getNombre());
            return true;
        } else {
            System.out.println("El recurso no está disponible para préstamo.");
            return false;
        }
    }

    // Implementación del método devolver de Prestamista
    public boolean devolver(RecursoBiblioteca recurso) {
        if (recurso.getEstado() == EstadoRecurso.PRESTADO) {
            recurso.setEstado(EstadoRecurso.DISPONIBLE);
            System.out.println("Devolución realizada: " + recurso.getTitulo());
            return true;
        } else {
            System.out.println("Este recurso no estaba prestado.");
            return false;
        }
    }

    // Métodos adicionales de ayuda
    public void agregarRecurso(RecursoBiblioteca recurso) {
        recursos.put(recurso.getId(), recurso);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public RecursoBiblioteca obtenerRecurso(String id) {
        return recursos.get(id);
    }

    public Usuario obtenerUsuario(String id) {
        return usuarios.get(id);
    }

    public void listarRecursos() {
        for (RecursoBiblioteca recurso : recursos.values()) {
            System.out.println(recurso.descripcion());
        }
    }
}
