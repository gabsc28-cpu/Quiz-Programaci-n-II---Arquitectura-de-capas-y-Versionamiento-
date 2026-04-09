/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Producto;
import java.io.BufferedReader;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProductoDAOImpl implements ProductoDAO {

    private String archivo = "productos.txt";

    @Override
    public void registrar(Producto producto) {
        try (FileWriter fw = new FileWriter(archivo, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            String linea = producto.getId() + "," +
                           producto.getNombre() + "," +
                           producto.getCantidad() + "," +
                           producto.getPrecio();

            bw.write(linea);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Producto> listar() {
        List<Producto> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int cantidad = Integer.parseInt(datos[2]);
                double precio = Double.parseDouble(datos[3]);

                Producto p = new Producto(id, nombre, cantidad, precio);
                lista.add(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }
    

    @Override
    public Producto buscarPorId(int id) {
        List<Producto> lista = listar();

        for (Producto p : lista) {
            if (p.getId() == id) {
                return p;
            }
       }

    return null; // si no lo encuentra
}

    
    @Override
    public void actualizar(Producto producto) {
        List<Producto> lista = listar();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {

            for (Producto p : lista) {

                if (p.getId() == producto.getId()) {
                    p = producto; // reemplazamos
                }

                String linea = p.getId() + "," +
                               p.getNombre() + "," +
                               p.getCantidad() + "," +
                               p.getPrecio();

                bw.write(linea);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        List<Producto> lista = listar();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {

            for (Producto p : lista) {

                if (p.getId() != id) { // solo escribimos los que NO queremos eliminar

                    String linea = p.getId() + "," +
                                   p.getNombre() + "," +
                                   p.getCantidad() + "," +
                                   p.getPrecio();

                    bw.write(linea);
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}