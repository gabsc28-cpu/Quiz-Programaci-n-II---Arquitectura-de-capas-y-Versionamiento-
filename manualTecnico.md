# 📄 Manual Técnico
## Sistema de Inventario en Java

---

## 🧠 1. Descripción General

Este sistema es una aplicación en Java que permite gestionar un inventario de productos mediante operaciones CRUD (Crear, Leer, Actualizar, Eliminar).

Se implementa una arquitectura por capas para mantener el código organizado y facilitar su mantenimiento.

---

## 🧱 2. Arquitectura del Sistema

El sistema sigue una arquitectura por capas:

Presentación → Lógica de Negocio → Acceso a Datos → Archivo (.txt)

---

## 📦 3. Descripción de Capas

### 🔹 Entidades (`inventario.entidades`)
- Contiene las clases que representan los datos.
- Clase principal: `Producto`

Responsabilidad:
- Modelar los datos del sistema (id, nombre, cantidad, precio)

---

### 🔹 Acceso a Datos (`inventario.dao`)
- Maneja la persistencia en archivo `.txt`

Componentes:
- `ProductoDAO` (interfaz)
- `ProductoDAOImpl` (implementación)

Responsabilidad:
- Registrar, listar, buscar, actualizar y eliminar datos

---

### 🔹 Lógica de Negocio (`inventario.negocio`)
- Intermediario entre presentación y datos

Clase:
- `ProductoService`

Responsabilidad:
- Validaciones básicas
- Control del flujo del sistema

---

### 🔹 Presentación (`inventario.presentacion`)
- Interacción con el usuario por consola

Clase:
- `Main`

Responsabilidad:
- Mostrar menú
- Leer datos del usuario
- Llamar al Service

---

## 🔄 4. Flujo del Sistema

Ejemplo (registrar producto):

Usuario → Main → ProductoService → ProductoDAO → Archivo .txt

---

## 💾 5. Persistencia de Datos

Archivo utilizado: productos.txt

---

## ⚙️ 6. Funcionalidades

- Registrar producto  
- Listar productos  
- Buscar producto por ID  
- Actualizar producto  
- Eliminar producto  

---

## 🧠 7. Decisiones Técnicas

- Uso de interfaces (DAO) para desacoplar capas  
- Separación clara de responsabilidades  
- Persistencia simple con archivos `.txt`  
- Reutilización de métodos para evitar duplicación  

---

## ⚠️ 8. Restricciones Aplicadas

- No acceso directo desde presentación a DAO  
- No mezcla de capas  
- Cada clase cumple una única responsabilidad  

---

## ✅ 9. Estado del Sistema

- CRUD completo funcional  
- Persistencia operativa  
- Arquitectura por capas implementada correctamente  
