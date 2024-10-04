# HeroesApp
HeroesApp es una aplicación móvil diseñada para aficionados de los cómics, que permite a los usuarios explorar y descubrir héroes de los universos de Marvel y DC. Tras iniciar sesión, los usuarios pueden navegar por una lista de publishers y seleccionar su favorito para ver una lista de héroes correspondientes. Al elegir un héroe, se muestra una página de detalle con información exhaustiva, incluyendo nombre, descripción e imagen. La aplicación mantiene el estado de sesión del usuario para una experiencia fluida y también ofrece la posibilidad de cerrar sesión.

## Requerimientos
##### MainActivity
- Implementar una actividad de login.
- Crear una clase User con parámetros email y password.
- Tener una lista estática de usuarios válidos para la autenticación.
- Validar el email introducido por el usuario.
- Si la autenticación es exitosa, navegar al PublisherActivity y guardar una bandera isLogged en SharedPreferences.
- Si la aplicacion se cierra y se vuelve a abrir debe respetar el isLogged del usuario.
<img src="\app\src\main\res\drawable\homeActivity.png" alt="Home Activity" />

##### PublisherActivity
- Mostrar una lista de los publisher Marvel y DC utilizando un RecyclerView y su adaptador correspondiente.
- Crear una clase Publisher con propiedades id, name, e image (URL como String para cargar con Picasso).
- Al seleccionar Marvel o DC, navegar a HeroesActivity pasando el id del publisher seleccionado.
- Boton para cerrar sesion.
<img src="\app\src\main\res\drawable\publisherActivity.png" alt="Publisher Activity" />

##### HeroesActivity
- Mostrar una lista de héroes del publisher seleccionado (Marvel o DC), utilizando un RecyclerView.
- Diseño y Funcionalidad
- Todos los componentes deben utilizar ConstraintLayout.
- Se evaluará el diseño y la creatividad del alumno en la interfaz de usuario.
- La funcionalidad de la aplicación debe ser completa y sin errores.

Mundo MARVEL :
<img src="\app\src\main\res\drawable\heroeMarvel.png" alt="Heroe Activity - MARVEL" />

Mundo DC:
<img src="\app\src\main\res\drawable\heroeDC.png" alt="Heroe Activity - DC" />
