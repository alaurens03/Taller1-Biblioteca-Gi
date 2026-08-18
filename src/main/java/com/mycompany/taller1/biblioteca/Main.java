/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
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
    
    public static void main(String[] args) {
        // Aquí irá el menú (Fase 8)
    }
}
