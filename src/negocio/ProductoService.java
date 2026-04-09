/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import dao.ProductoDAO;
import dao.ProductoDAOImpl;
import entidades.Producto;
import java.util.List;

/**
 *
 * @author gabsc
 */

public class ProductoService {

    private ProductoDAO dao = new ProductoDAOImpl();

    public void registrarProducto(Producto producto) {

    if (dao.buscarPorId(producto.getId()) != null) {
        System.out.println("Error: ya existe un producto con ese ID");
        return;
    }

    dao.registrar(producto);
    }
    
    public List<Producto> listarProductos() {
        return dao.listar();
    }
    
    public Producto buscarProducto(int id) {
        return dao.buscarPorId(id);
    }
    
    public void actualizarProducto(Producto producto) {

        if (dao.buscarPorId(producto.getId()) == null) {
            System.out.println("Error: el producto no existe");
            return;
        }

        dao.actualizar(producto);
    }
    
    public void eliminarProducto(int id) {

        if (dao.buscarPorId(id) == null) {
            System.out.println("Error: el producto no existe");
            return;
        }

        dao.eliminar(id);
    }
}
