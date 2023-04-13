<h3 align="center">
	<img src="https://user-images.githubusercontent.com/104341274/231867253-0b123b76-3a61-4f2c-b654-b01b8f193d05.png" width="100" alt="Logo"/><br/>
	<img src="https://user-images.githubusercontent.com/104341274/231867253-0b123b76-3a61-4f2c-b654-b01b8f193d05.png" height="30" width="0px"/>
	Sex Toys
	<img src="https://user-images.githubusercontent.com/104341274/231867253-0b123b76-3a61-4f2c-b654-b01b8f193d05.png" height="30" width="0px"/>
</h3>
<p align="center">
  <img src="https://user-images.githubusercontent.com/104341274/210186277-0d434bb0-80c0-43a9-b6b0-2e42e18c31a9.png" width="400" />
</p>

<p align="Center">
La aplicación es una plataforma de delivery de juguetes sexuales desarrollada con Java, XML y Android Studio. El prototipo actual cuenta con una interfaz de bienvenida y un menú principal donde se pueden explorar diferentes categorías y productos populares. Los usuarios pueden seleccionar productos y agregarlos a su carrito de compras para su posterior reserva. Se espera agregar más características en el futuro.
<p>

&nbsp;


## 📽️ Demostración

https://user-images.githubusercontent.com/104341274/231872961-8bddc1e0-2d4f-4bf5-82d3-31a789802a70.mp4

## 💡 Tecnologías usadas

La aplicación se creó utilizando Java y XML en Android Studio. Se utilizó Java para la lógica del negocio y la funcionalidad de la aplicación, mientras que XML se utilizó para diseñar la interfaz de usuario. También se utilizó Android Studio para integrar todas las funciones y asegurar que la aplicación funcionara sin problemas.

## 📌 Lenguajes utilizados

- [`Java`](https://es.wikipedia.org/wiki/Java_(lenguaje_de_programaci%C3%B3n))
- [`XML`](https://es.wikipedia.org/wiki/Extensible_Markup_Language)


## 🧠 Parte Lógica

<img align="left" height="520" src="https://user-images.githubusercontent.com/104341274/231881725-1f07a58c-d040-4501-a754-f4276df56a8e.png" alt="Estructura de Carpetas" style="margin-right: 2rem;" />

1. `src/main/java:` es la carpeta principal donde se ubican los archivos Java del proyecto.
- `Activity:` esta carpeta contiene las clases de actividades o pantallas de la aplicación. Los archivos Java dentro de esta carpeta controlan el comportamiento y la lógica de cada pantalla.
- `Adaptor:` esta carpeta contiene las clases de adaptadores que se utilizan para llenar y mostrar datos en vistas como ListView o RecyclerView. Los archivos Java dentro de esta carpeta controlan la forma en que se muestran los datos en las pantallas de la aplicación.
- `Domain:` esta carpeta contiene las clases que representan los modelos de dominio de la aplicación, es decir, las clases que representan los objetos que se manejan en la aplicación.
- `Helper:` esta carpeta contiene clases de ayuda o utilidades, como TinyDB que es una biblioteca para guardar y recuperar datos en el almacenamiento interno de la aplicación.
- `Interface:` esta carpeta contiene las interfaces que se utilizan para establecer comunicación entre diferentes componentes de la aplicación, como entre un adaptador y una actividad.

2. Los archivos `.java` en cada carpeta:
- `CartListActivity.java:` controla el comportamiento y la lógica de la pantalla que muestra una lista de elementos en el carrito de compras.
- `IntroActivity.java:` controla el comportamiento y la lógica de la pantalla de introducción o bienvenida a la aplicación.
- `loginActivity.java:` controla el comportamiento y la lógica de la pantalla de inicio de sesión.
- `MainActivity.java:` controla el comportamiento y la lógica de la pantalla principal o de inicio de la aplicación.
- `ShowDetailActivity.java:` controla el comportamiento y la lógica de la pantalla que muestra los detalles de un elemento seleccionado en una lista.
- `CartListAdapter.java:` controla la forma en que se muestran los elementos de la lista de elementos del carrito de compras.
- `CatregoryAdaptor.java:` controla la forma en que se muestran los elementos de una lista de categorías de productos.
- `PopluarAdaptor.java:` controla la forma en que se muestran los elementos de una lista de productos populares.
- `CategoryDomain.java:` representa el modelo de dominio de una categoría de productos.
- `FoodDomain.java:` representa el modelo de dominio de un producto en la aplicación.
- `ManagementCart.java:` contiene métodos para agregar, actualizar y eliminar elementos del carrito de compras.
- `TinyDB.java:` biblioteca para guardar y recuperar datos en el almacenamiento interno de la aplicación.
- `ChangeNumberItemsListener.java:` interfaz que se utiliza para establecer comunicación entre diferentes componentes de la aplicación, como entre un adaptador y una actividad, para actualizar el número de elementos seleccionados.

## 👾 Parte Gráfica

<img align="left" height="520" src="https://user-images.githubusercontent.com/104341274/231890067-d322e819-4f7a-4c3d-8e40-a1ab604daa90.png" alt="Estructura de Carpetas" style="margin-right: 2rem;" />

- `Res:` Esta carpeta contiene todos los recursos necesarios para que la aplicación funcione correctamente. Aquí encontrarás imágenes, iconos, archivos XML de diseño, archivos de strings, estilos, entre otros.
- `drawable:` Aquí se almacenan los recursos gráficos de la aplicación, como imágenes o iconos.
- `layout:` En esta carpeta se encuentran los archivos XML de diseño que definen cómo se mostrarán las diferentes pantallas de tu aplicación. Por ejemplo, los archivos `activity_cart_list.xml`, `activity_intro.xml`, `activity_main_xml` y `activity_show_detail.xml` son archivos de diseño que definen las diferentes pantallas de la aplicación.
También como los archivos `viewholder_cart.xml`, `viewholder_category.xml` y `viewholder_popular.xml`, que son diseños de vistas personalizadas que se utilizan en un RecyclerView para mostrar información en un formato específico.

- `mipmap:` Aquí encontrarás los iconos de la aplicación en diferentes resoluciones, que se utilizarán según el dispositivo en el que se ejecute la aplicación.
- `values:` En esta carpeta se encuentran los archivos XML que contienen valores para recursos de la aplicación, como cadenas de texto, colores y estilos. Los valores definidos aquí se pueden utilizar en los archivos de diseño para mantener una coherencia visual en toda la aplicación.
- `xml:` Esta carpeta contiene archivos XML que definen recursos de la aplicación, como diseños de menús o configuraciones. Por ejemplo, un archivo XML puede definir los elementos de un menú de opciones o las preferencias de la aplicación.

### Otros archivos importantes

- `AndroidManifest.xml:` Este archivo define los permisos, actividades, servicios y otros componentes de la aplicación. También contiene información como el nombre y el icono de la aplicación.
- `build.gradle:` Este archivo es el script de construcción de tu aplicación. Aquí se definen las dependencias y la configuración de construcción de la aplicación.

- `gradle.properties:` Este archivo contiene la configuración de Gradle, el sistema de construcción que utiliza Android Studio para construir tu aplicación.

## 💰 Requisitos del sistema

Para utilizar esta aplicación, se requiere un dispositivo Android con al menos la versión 5.0 (Lollipop) del sistema operativo. Además, se recomienda tener una conexión a Internet estable para una experiencia de compra sin interrupciones.

## 🟢 Instalación

Descargue o clone el repositorio en su ordenador.

```
git clone https://github.com/gherrada22/SexToys.git
```

## 👐 Contribuciones

1. Dar estrella y hacer un fork del repositorio.
2. Crea una rama para tu contribución.
3. Haz un pull request con tu contribución.









&nbsp;

<p align="center">
  <img src="https://user-images.githubusercontent.com/104341274/210186277-0d434bb0-80c0-43a9-b6b0-2e42e18c31a9.png" width="400" />
</p>
<p align="center">Copyright &copy; 2023-present <a href="https://github.com/gherrada22" target="_blank">George Herrada Farfán</a></p>
