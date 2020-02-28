# prueba_individual_28_02_2020
Prueba individual 28/02/2020. @Autores Daniel Diaz Leiva

Evaluacion individual n°2 de las clases de programación Java Full Stack de Talento Digital. 
El desafío consiste en crear un programa que sea capaz de almacenar Electrodomesticos con sus respectivos astributos (caracteristicas generales como: color, peso y caracteriscas propias como: carga, resoluciomn etc)estos atributos generan variacion en el precio de cada articulo. Luego con estos elementos poder calcular el precio final de venta de ellos.

Para esto se crean 3 clases.
+Electrodomesticos (superclase)
+Lavadora (subclase)
+Television(subclase)
y una clase ejecutable. Cada una con sus respectivos constructores y atributos.

Con respecto a sus metodos:

+Electrodomesticos (superclase):
se crean 3 metodos
comprobarColor(). comprueba que el color ingresado sea uno de los colores existentes en Stock
comprobarConsumo(). Comprueba que el consumo energetico es uno de los utilizados por los productos
precio final().agrega los cargos respectivos (segun atributos del articulo) al precio base

+Lavadora (subclase)
se crea un metodo
precio final(). llama al metodo de la clase padre y agrega los cargos respectivos (segun atributos del articulo) al precio base
los cargos se generan si tiene una capacidad de carga mayor a 30 kg.

+Television(subclase)
precio final(). llama al metodo de la clase padre y agrega los cargos respectivos (segun atributos del articulo) al precio base
los cargos se generan cuando el televisor tiene una resolusion mayor a 40 pulgadas y si posee sintonizador TDT. 

En la clase ejecutable se crea un arreglo de 10 articulos con sus respectivos atributos.
Se ejecutan los metodos respectivos y se muestra la informacion por consola de lo pedido.

Dentro del proceso de creacion del programa se aplico lo visto en clases usando herencia, polimosrfismo entre otras herramientas.
