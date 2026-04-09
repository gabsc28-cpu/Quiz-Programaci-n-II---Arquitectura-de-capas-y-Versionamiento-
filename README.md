# 📦 Sistema de Inventario en Java

Proyecto desarrollado para el curso de Programación II, enfocado en la implementación de un sistema de inventario aplicando arquitectura por capas, buenas prácticas de desarrollo y uso documentado de Inteligencia Artificial como herramienta de apoyo.

## 🎯 El sistema permite:

➕ Registrar productos
📋 Listar productos
🔍 Buscar producto por ID
✏️ Actualizar producto
❌ Eliminar producto
🧱 Arquitectura del Sistema

El proyecto implementa una arquitectura por capas, separando claramente cada responsabilidad:

Presentación → Lógica de Negocio → Acceso a Datos → Archivo (.txt)

##🔹 Capas:
Entidades (entidades)
Representan los datos del sistema
Ejemplo: 
      - Producto
      - Acceso a Datos (dao)
      - Manejo de persistencia en archivos
      - Uso de interfaz ProductoDAO y su implementación
      - Lógica de Negocio (negocio)
      - Validaciones y reglas del sistema
      - Intermediario entre presentación y datos
      - Presentación (presentacion)
Interacción con el usuario mediante consola

##💾 Persistencia de Datos

Se utiliza un archivo:

data/productos.txt

Formato de almacenamiento:

id,nombre,cantidad,precio

Ejemplo:

1,Arroz,10,1200.5

✔ Simula una base de datos simple
✔ Sin redundancia de datos

##🧪 Ejecución del Sistema
Requisitos:
Java JDK 8 o superior
NetBeans (recomendado) o cualquier IDE compatible
Pasos:

Clonar el repositorio:

git clone <URL_DEL_REPOSITORIO>
Abrir el proyecto en NetBeans

Ejecutar la clase:

Main.java

##🖥️ Uso del Sistema

Al ejecutar el programa, se muestra un menú interactivo:

1. Registrar producto
2. Listar productos
3. Buscar producto
4. Actualizar producto
5. Eliminar producto
0. Salir

Ejemplo de uso:
- Registrar un producto ingresando ID, nombre, cantidad y precio
- Listar todos los productos almacenados
- Buscar un producto específico por ID

##📚 Documentación Incluida

El repositorio contiene:

📄 Manual de Usuario
🛠️ Manual Técnico
📊 Diagrama UML de clases
🤖 Archivo prompts.txt (uso de IA documentado)
📝 CHANGELOG.md (historial de versiones)
🤖 Uso de Inteligencia Artificial

Se utilizó IA como herramienta de apoyo para:

Estructuración del proyecto
Generación de código base
Mejora progresiva de implementaciones

##📌 Importante:

No se copiaron soluciones sin comprensión
Se documentaron todos los prompts utilizados
Se realizaron iteraciones para mejorar resultados

##🔄 Control de Versiones
Repositorio gestionado con Git y GitHub.

##📌 Versiones:

v1.0
Estructura inicial del proyecto
v1.1
Implementación completa del CRUD
v1.2
Validaciones y mejoras
🧠 Decisiones Técnicas
Uso de interfaces (DAO) para desacoplar la lógica de acceso a datos
Persistencia en .txt para simular base de datos ligera
Separación estricta de capas para escalabilidad
Reutilización de métodos (listar() en búsquedas y actualizaciones)

##🚀 Autor

Gabriel Solano
Estudiante de Programación II
