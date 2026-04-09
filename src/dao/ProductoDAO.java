/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Producto;
import java.util.List;

public interface ProductoDAO {

    void registrar(Producto producto);

    List<Producto> listar();

    Producto buscarPorId(int id);

    void actualizar(Producto producto);

    void eliminar(int id);
}
