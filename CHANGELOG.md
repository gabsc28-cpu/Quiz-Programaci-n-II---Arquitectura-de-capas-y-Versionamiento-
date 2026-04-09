# 📜 CHANGELOG

Todos los cambios importantes de este proyecto se documentan en este archivo.

---

## [v1.2] - Mejoras y validaciones

### Added
- Validaciones en la capa de negocio:
  - Verificación de ID duplicado al registrar
  - Validación de existencia al actualizar y eliminar

### Changed
- Mejora en la estructura del código siguiendo arquitectura por capas
- Separación clara entre presentación, lógica de negocio y acceso a datos

### Fixed
- Corrección en la actualización de productos en archivo `.txt`
- Manejo adecuado de sobrescritura del archivo para evitar duplicados

---

## [v1.1] - CRUD funcional

### Added
- Implementación completa del CRUD:
  - Registrar producto
  - Listar productos
  - Buscar producto por ID
  - Actualizar producto
  - Eliminar producto

- Persistencia de datos usando archivo `.txt`
- Conversión de datos entre texto y objetos (`Producto`)

### Changed
- Uso de `BufferedReader` y `BufferedWriter` para mejorar manejo de archivos

---

## [v1.0] - Estructura inicial

### Added
- Creación de la estructura del proyecto:
  - Paquetes: entidades, dao, negocio, presentacion, data

- Clase `Producto` con atributos básicos:
  - id, nombre, cantidad, precio

- Interfaz `ProductoDAO`
- Clase `ProductoDAOImpl` (estructura base)
- Clase `ProductoService`
- Clase `Main` con menú inicial

---
