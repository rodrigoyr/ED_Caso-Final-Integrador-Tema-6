# ED_Caso-Final-Integrador-Tema-6

## Explicacion modulos
A partir de aquí voy a explicar como he hecho uso del codigo de los modulos principales del programa y cuales son sus funciones, cabe destacar que hay bastantes más clases o modulos, aunque son con el fin de mejorar el programa. Aqui explico las funciones de los principales
*Módulo IndexacionRecursiva:* ste modulo se encarga de indexar los archivos en un directorio el cual da el usuario. Utiliza la recursividad para indexar también los archivos en otros directorios. Los archivos indexados se almacenan en una lista creada  
*Módulo OrdenacionListado:* Este módulo se encarga de ordenar la lista de archivos. Da dos métodos para ordenar los archivos, por nombre y otro por tamaño. Utiliza "sort" y los métodos getname y length para ordenar  
*Módulo InterfazUsuario:* este se encarga de la interaccion con el usuario. Proporciona una interfaz de usuario que permite al usuario introducir un directorio para indexar, seleccionar cómo ordenar los archivos (por nombre o tamaño) y luego indexar y ordenar los archivos cuando lo seleccionas. Los nombres de los archivos ordenados se muestran en un area especifica para ello. Como explico en el apartado de soluciones, la interfaz la he visto necesario más tarde, ya que mi primera opcion era que el suaurio interactuara a traves de la consola
*Módulo Main*: Este es el modulo principal de la aplicación. Crea una nueva instancia de la interfaz de usuario y la hace visible, se didivide en el main donde se proprociona el codigo principal y en a parte grafica donde se instancia la interfaz para el usuario

## Problemas y soluciones
El objetivo que tenía en mente para este proyecto era que el usuario hiciera uso del programa a traves de la consola, ya que lo veia mas intuitivo y pensaba que me iba a ser de mas ayuda a la hora de encontrar errores y solucionarlos. Al ver la gran facilidad que he tenido para crear los modulos y hacer que funcionen entre ellos, he decidido finalmente crear una interfaz de usuario sencilla para que el usuario haga uso de ella con JFrame y no desde la consola. Al finalizar el proyecto, he hecho algunas mejoras irrelevantes, ya que en general estoy bastante contento con el proyecto realizado. Espero también sea de su agrado y le guste.
