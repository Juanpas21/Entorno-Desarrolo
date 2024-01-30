package controller;

import model.Usuario;

import java.util.ArrayList;

public class Controlador {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Controlador() {
    }

    public void agregarUsuarios(Usuario usuario) {
        listaUsuarios.add(usuario);
        System.out.println("Usuario registrado correctamente.\n");
    }

    public static void mostrarUsuarios () {
        if (listaUsuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.\n");
        } else {
            System.out.println("Lista de usuarios:");
            for (Usuario usuario : listaUsuarios) {
                System.out.println(usuario);
            }
            System.out.println();
        }
    }
    public Usuario obtenerUsuario(String nombreUsuario) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public static boolean existeUsuario(String nombre) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}

