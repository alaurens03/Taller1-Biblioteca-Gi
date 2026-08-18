/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    // CREATE
    static void crearCliente() {
        System.out.println("\n-- Crear cliente --");
        System.out.print("Id: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(id, nombre, telefono, email);
        clientes.add(cliente);
        System.out.println("Cliente creado correctamente.");
    }
    
        // READ - listar
    static void listarClientes() {
        System.out.println("\n-- Listado de clientes --");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
    
        // READ - buscar
    static Cliente buscarClientePorId(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equalsIgnoreCase(id)) {
                return c;
            }
        }
        return null;
    }

    static void buscarCliente() {
        System.out.println("\n-- Buscar cliente por id --");
        System.out.print("Id del cliente: ");
        String id = sc.nextLine();
        Cliente c = buscarClientePorId(id);
        if (c == null) {
            System.out.println("Cliente no encontrado.");
        } else {
            System.out.println(c);
        }
    }
    
    static void actualizarCliente() {
    System.out.println("\n-- Actualizar Cliente --");
    System.out.print("Id del cliente a actualizar: ");
    String id = sc.nextLine();

    Cliente c = buscarClientePorId(id);

    if (c == null) {
        System.out.println("Cliente no encontrado.");
    } else {
        System.out.print("Nuevo nombre (" + c.getNombre() + "): ");
        String nombre = sc.nextLine();
        if (!nombre.isBlank()) {
            c.setNombre(nombre);
        }

        System.out.print("Nuevo telefono (" + c.getTelefono() + "): ");
        String telefono = sc.nextLine();
        if (!telefono.isBlank()) {
            c.setTelefono(telefono);
        }

        System.out.print("Nuevo email (" + c.getEmail() + "): ");
        String email = sc.nextLine();
        if (!email.isBlank()) {
            c.setEmail(email);
        }

        System.out.println("Cliente actualizado correctamente.");
    }
}
    
    static void eliminarCliente() {
    System.out.println("\n-- Eliminar Cliente --");
    System.out.print("Id del cliente a eliminar: ");
    String id = sc.nextLine();

    Cliente c = buscarClientePorId(id);

    if (c == null) {
        System.out.println("Cliente no encontrado.");
    } else {
        clientes.remove(c);
        System.out.println("Cliente eliminado correctamente.");
    }
}
    
    static void crearLibro() {
    System.out.println("\n-- Crear Libro --");
    System.out.print("Codigo: ");
    String codigo = sc.nextLine();
    System.out.print("Titulo: ");
    String titulo = sc.nextLine();
    System.out.print("Anio de publicacion: ");
    String anioPublic = sc.nextLine();
    System.out.print("Autor: ");
    String autor = sc.nextLine();

    Libro l = new Libro(codigo, titulo, anioPublic, autor);
    libros.add(l);

    System.out.println("Libro creado correctamente.");
}
    static void listarLibros() {
    System.out.println("\n-- Listado de Libros --");
    if (libros.isEmpty()) {
        System.out.println("No hay libros registrados.");
    } else {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
}
    
    static Libro buscarLibroPorCodigo(String codigo) {
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigo)) {
            return l;
        }
    }
    return null;
}

static void buscarLibro() {
    System.out.println("\n-- Buscar Libro --");
    System.out.print("Codigo del libro: ");
    String codigo = sc.nextLine();

    Libro l = buscarLibroPorCodigo(codigo);

    if (l == null) {
        System.out.println("Libro no encontrado.");
    } else {
        System.out.println(l);
    }
}
    
static void actualizarLibro() {
    System.out.println("\n-- Actualizar Libro --");
    System.out.print("Codigo del libro a actualizar: ");
    String codigo = sc.nextLine();

    Libro l = buscarLibroPorCodigo(codigo);

    if (l == null) {
        System.out.println("Libro no encontrado.");
    } else {
        System.out.print("Nuevo titulo (" + l.getTitulo() + "): ");
        String titulo = sc.nextLine();
        if (!titulo.isBlank()) {
            l.setTitulo(titulo);
        }

        System.out.print("Nuevo autor (" + l.getAutor() + "): ");
        String autor = sc.nextLine();
        if (!autor.isBlank()) {
            l.setAutor(autor);
        }

        System.out.print("Nuevo anio de publicacion (" + l.getAnioPublic() + "): ");
        String anioPublic = sc.nextLine();
        if (!anioPublic.isBlank()) {
            l.setAnioPublic(anioPublic);
        }

        System.out.println("Libro actualizado correctamente.");
    }
}

static void eliminarLibro() {
    System.out.println("\n-- Eliminar Libro --");
    System.out.print("Codigo del libro a eliminar: ");
    String codigo = sc.nextLine();

    Libro l = buscarLibroPorCodigo(codigo);

    if (l == null) {
        System.out.println("Libro no encontrado.");
    } else {
        libros.remove(l);
        System.out.println("Libro eliminado correctamente.");
    }
}

static void crearPrestamo() {
    System.out.println("\n-- Registrar Prestamo --");
    System.out.print("Id del prestamo: ");
    String idPrestamo = sc.nextLine();

    System.out.print("Id del cliente: ");
    String idCliente = sc.nextLine();
    Cliente c = buscarClientePorId(idCliente);

    if (c == null) {
        System.out.println("Cliente no encontrado. No se puede registrar el prestamo.");
        return;
    }

    System.out.print("Codigo del libro: ");
    String codigoLibro = sc.nextLine();
    Libro l = buscarLibroPorCodigo(codigoLibro);

    if (l == null) {
        System.out.println("Libro no encontrado. No se puede registrar el prestamo.");
        return;
    }

    if (!l.isDisponible()) {
        System.out.println("El libro no esta disponible actualmente.");
        return;
    }

    Prestamo p = new Prestamo(idPrestamo, c, l, LocalDate.now(), "ACTIVO");
    prestamos.add(p);
    l.setDisponible(false);

    System.out.println("Prestamo registrado correctamente.");
}

static void devolucionPrestamo() {
    System.out.println("\n-- Registrar Devolucion --");
    System.out.print("Id del prestamo a devolver: ");
    String idPrestamo = sc.nextLine();

    Prestamo p = null;
    for (Prestamo pr : prestamos) {
        if (pr.getIdPrestamo().equals(idPrestamo)) {
            p = pr;
            break;
        }
    }

    if (p == null) {
        System.out.println("Prestamo no encontrado.");
    } else if (p.getEstado().equals("DEVUELTO")) {
        System.out.println("Este prestamo ya fue devuelto anteriormente.");
    } else {
        p.setEstado("DEVUELTO");
        p.getLibro().setDisponible(true);
        System.out.println("Devolucion registrada correctamente.");
    }
}

static void listarPrestamos() {
    System.out.println("\n-- Prestamos Activos --");
    boolean hayActivos = false;
    for (Prestamo p : prestamos) {
        if (p.getEstado().equals("ACTIVO")) {
            System.out.println(p);
            hayActivos = true;
        }
    }
    if (!hayActivos) {
        System.out.println("No hay prestamos activos.");
    }
}

    public static void main(String[] args) {
        // Aquí irá el menú (Fase 8)
    }
}
