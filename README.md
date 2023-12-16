 - Proyecto Maven para conexion a BD MySQL con Java.

----------

 - Consignas de trabajo

Aplicar los conceptos y habilidades adquiridos en la materia 1, 2 y 3.
 
Los estudiantes deben crear una aplicación en Java con siguientes requisitos:

Requisitos funcionales:

Creación: Se debe poder crear un nuevo registro.
Listar (Read): Se debe poder listar los registros existentes.
Actualizar: Se deben poder actualizar los registros existentes.
Borrar: Se deben poder borrar los registros existentes.
 
Requisitos técnicos:

Si no se ha escrito nada, el usuario no debe poder crear un nuevo registro.
Se debe crear un aviso cuando se creen, listen, actualicen y eliminen.
Entregables:

Los estudiantes deben entregar los siguientes elementos:

El código fuente de la aplicación Java.
Un documento de texto o Read.me donde expliquen la lógica utilizada para validar los datos y cómo se implementan las diferentes funcionalidades.
Un informe detallado de cualquier problema que hayan enfrentado durante el desarrollo de la aplicación y cómo los resolvieron.
 
Criterios de evaluación:

Los proyectos de los estudiantes serán evaluados de acuerdo a los siguientes criterios:

Funcionalidad: ¿La aplicación cumple con todos los requisitos funcionales especificados?
Validación de datos: ¿La aplicación valida correctamente los datos ingresados por el usuario?
Estructura del código: ¿El código está organizado de manera clara y utiliza las estructuras de control adecuadas?
Documentación: ¿Los estudiantes proporcionan documentación clara sobre su código y cualquier problema resuelto?
Creatividad: ¿Los estudiantes implementan funcionalidades adicionales o mejoras en la aplicación más allá de los requisitos mínimos?
Esta actividad permitirá a los estudiantes aplicar los conocimientos adquiridos en los módulos del curso relacionados con el entorno de desarrollo, variables, estructuras de control y almacenamiento de datos en Java. Además, les proporcionará experiencia práctica en la creación de aplicaciones Java funcionales.

----------

 - Comentarios:
El proyecto consiste en un CRUD (create, read, update, delete) sencillo que le permite al usuario realizar las acciones solicitadas interactuando con una interfaz la cual se conecta a una base de datos relacional. Se diseñó utilizando java-maven como gestor de proyectos para facilitar las dependencias requeridas gestionadas en el archivo pom.xml (version de java, conector mysql a java, apache-maven).
La aplicación se basa en el patrón de diseño MVC. Utiliza una interfaz sencilla desde donde se observa toda la interfaz para interactuar con la base de datos.
Para lograr esto, primero se debe realizar con éxito la conexión a la BD, en este caso usando la base de datos relacional MySQL, esta conexión se logra con las clases Connector donde se encuentra la lógica necesaria para acceder a la BD y a su vez inicializar el formulario, y la clase Principal, donde se ejecuta el proyecto.
En el paquete logica nos encontramos con una única clase para facilitar las inserciones necesarias para cumplir con los objetivos del proyecto.
La aplicación logra ofrecer al usuario uso dinámico y una visualización actualizable en tiempo real de la base de datos.

 - Atención: se puedn registrar payasos con los mismos atributos ya que se crea un ID diferente automáticamente para cada uno.
 la BD parametriza los argumentos solicitados limitando los nombres a un maximo de 25 caracteres y los circos a un maximo de 5 caracteres, ninguno de estos datos puede estar vacio.
 la BD no permite registrar payasos con alguno de estos campos vacios.
 para "agregar" solo se necesita rellenar los datos dentro de los parámetros aceptados, el ID es generado automáticamente.
 para "modificar" y/o "eliminar", se debe seleccionar un elemento dentro de la tabla que representa visualmente los registros de la base de datos, de lo contrario no será posible acción alguna.

 