# 📄 Manual de Usuario
## Sistema de Inventario en Java

---

## 🧠 1. Descripción del Sistema

Este sistema permite gestionar un inventario de productos desde consola.

El usuario puede:
- Registrar productos  
- Listar productos  
- Buscar productos por ID  
- Actualizar productos  
- Eliminar productos  

---

## ▶️ 2. Cómo ejecutar el sistema

### Requisitos:
- Java JDK 8 o superior  
- NetBeans o cualquier IDE compatible  

### Pasos:
1. Abrir el proyecto en el IDE  
2. Ejecutar la clase: Main.java
3. Se mostrará el menú en consola  

---

## 🖥️ 3. Menú del sistema
Registrar producto
Listar productos
Buscar producto
Actualizar producto
Eliminar producto
Salir


Seleccione la opción deseada ingresando el número correspondiente.

---

## ⚙️ 4. Funcionalidades

### ➕ Registrar producto
Permite ingresar un nuevo producto.

Datos solicitados:
- ID  
- Nombre  
- Cantidad  
- Precio  

Nota: No se permiten IDs duplicados.

---

### 📋 Listar productos
Muestra todos los productos registrados.

---

### 🔍 Buscar producto
Permite buscar un producto por ID.

- Si existe → se muestra  
- Si no existe → se indica  

---

### ✏️ Actualizar producto
Permite modificar un producto existente.

Se solicita:
- ID  
- Nuevos datos  

Nota: El producto debe existir.

---

### ❌ Eliminar producto
Permite eliminar un producto por ID.

Nota: El producto debe existir.

---

## 🧪 5. Ejemplo de uso

Registrar producto:
ID: 1
Nombre: Arroz
Cantidad: 10
Precio: 1200

Luego listar: 1 - Arroz - Cantidad: 10 - Precio: 1200.0

---

## ⚠️ 6. Consideraciones

- Los datos se guardan en un archivo `.txt`  
- La información se mantiene aunque se cierre el programa  
- Evitar ingresar datos inválidos  

---

## ✅ 7. Estado del sistema

- Sistema funcional  
- Uso sencillo desde consola  

