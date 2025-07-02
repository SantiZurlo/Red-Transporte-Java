# 🚌 Sistema Red de Transporte - Simulación en Java

Este proyecto es una **simulación de una red de transporte** donde se gestionan usuarios, tarjetas, cargas y viajes. Fue desarrollado en Java con un enfoque orientado a objetos, y permite registrar cargas en tarjetas, realizar viajes y calcular gastos, entre otras funcionalidades.

---

## 📦 Estructura del sistema

- **Usuario**: Representa a una persona con DNI, nombre y apellido.
- **Tarjeta**: Asociada a un usuario. Permite realizar cargas y registrar viajes.
- **Carga**: Registro de dinero ingresado en una tarjeta en una fecha determinada.
- **Viaje**: Registro de un viaje en colectivo con fecha, costo y línea.
- **Sistema**: Clase central que administra usuarios, tarjetas y la lógica de negocio.

---

## 🧪 Pruebas (Tests incluidos)

La clase `TestSistemaRedTransporte` contiene una serie de pruebas que verifican el correcto funcionamiento del sistema:

### ✅ Test 1: Alta de usuarios
Se agregan dos usuarios y se muestra la lista de usuarios.

### ✅ Test 2: Alta de tarjetas
Se asocian tarjetas a los usuarios previamente agregados.

### ✅ Test 3: Carga de saldo
Se registran dos cargas en una tarjeta y se imprime el saldo actual.

### ✅ Test 4: Registro de viajes
Se simulan varios viajes en diferentes colectivos, afectando el saldo de la tarjeta.

### ✅ Test 5: Viaje con saldo insuficiente
Se intenta registrar un viaje cuyo costo supera el saldo disponible.

### ✅ Test 6: Gasto en una fecha determinada
Se calcula el gasto total de una tarjeta en una fecha específica.

### ✅ Test 7: Usuarios sin saldo
Se listan los usuarios cuyas tarjetas tienen saldo cero.

### ✅ Test 8: Alta duplicada de usuario
Se prueba la validación de duplicados al intentar agregar un usuario con un DNI ya registrado.

### ✅ Test 9: Alta de tarjeta duplicada
Se prueba la validación al intentar agregar una tarjeta con un ID ya registrado.

---

## 🔍 Requisitos

- Java 21 o superior
- IDE recomendado: IntelliJ IDEA o Eclipse
- Sistema modularizado en paquetes (ej: `modelo`, `test`)

---

## ▶️ Cómo ejecutar

1. Asegurate de que tu entorno esté configurado para Java.
2. Ejecutá la clase `TestSistemaRedTransporte` ubicada en el paquete `test`.
3. Observá los resultados en la consola para verificar el correcto funcionamiento del sistema.

---

## 👤 Autor
Santiago Zurlo

