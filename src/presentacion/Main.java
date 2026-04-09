/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import negocio.ProductoService;
import entidades.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gabsc
 */


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductoService service = new ProductoService();

        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE INVENTARIO ---");
            System.out.println("1. Registrar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    registrar(sc, service);
                    break;

                case 2:
                    listar(service);
                    break;

                case 3:
                    buscar(sc, service);
                    break;

                case 4:
                    actualizar(sc, service);
                    break;

                case 5:
                    eliminar(sc, service);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
        
        }
    
    private static void registrar(Scanner sc, ProductoService service) {

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        Producto p = new Producto(id, nombre, cantidad, precio);
        service.registrarProducto(p);
    }
    
    private static void listar(ProductoService service) {

        List<Producto> lista = service.listarProductos();

        if (lista.isEmpty()) {
            System.out.println("No hay productos.");
            return;
        }

        for (Producto p : lista) {
            System.out.println(p);
        }
    }
    
    private static void buscar(Scanner sc, ProductoService service) {

        System.out.print("Ingrese ID: ");
        int id = sc.nextInt();

        Producto p = service.buscarProducto(id);

        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    
    private static void actualizar(Scanner sc, ProductoService service) {

        System.out.print("ID del producto a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Nueva cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Nuevo precio: ");
        double precio = sc.nextDouble();

        Producto p = new Producto(id, nombre, cantidad, precio);
        service.actualizarProducto(p);
    }
    
    private static void eliminar(Scanner sc, ProductoService service) {

        System.out.print("ID a eliminar: ");
        int id = sc.nextInt();

        service.eliminarProducto(id);
    }
    
}

    
