http://www.oracle.com/technetwork/java/javase/downloads/index.html?ssSourceSiteId=otnes

#TIPOS DE DATOS
En Java existen ocho tipos de datos, también conocidos como tipos primitivos : byte, short, int, long, char, float, double y boolean. A partir de estos tipos de datos nosotros podemos clasificarlos en cuatro grupos:

#ENTEROS
Este grupo incluye byte, short, int y long. Estos tipos de datos nos permiten trabajar con números enteros ya sean positivos o negativos.

Nombre	bytes	Rango
long	8	–9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
int	4	–2,147,483,648 a 2,147,483,647
short	2	–32,768 to 32,767
byte	1	–128 to 127
En la mayoria de los casos usaremos el tipo de dato int para rabajar con números positivos.

Ejemplos

byte diasMes = 31; //Aproximadamente
short diasLustro = (12 * 31) * 5;
int velocidadLuz = 299792458;
long añoLuz = velocidadLuz * 365;
#FLOTANTES/DECIMALES
Este grupo incluye float y double. Estos tipos de datos nos permiten trabajar con números los cuales posean punto decimal ya sean positivos o negativos.

Nombre	bytes	Rango Apróximado
double	8	4.9e–324 to 1.8e+308
float	4	1.4e–045 to 3.4e+038
Ejemplos

float pi = 3.1415926535f;
double e = 2.718281828459045235360;
#CARACTERES
En el grupo de caracteres únicamente encontraremos el tipo de dato char. Este tipo de datos nos permitirá trabajar con caracteres.

Ejemplos

char letraA = 'a';
char letraANumerico = 61;
Caracteres estándares

#BOLEANOS
Al igual que el grupo de caracteres, en el grupo de booleanos únicamente encontraremos un tipo de dato, el boolean. Este tipo de datos nos permitirá trabajar con valores lógicos, verdadero o falso.

Ejemplos

boolean verdadero = true;
boolean falso = false;

#PALABRAS RESERVADAS

Las palabras reservadas, como su nombre lo indican, son palabras las cuales el lenguaje de programación ya ha reservado para realizar ciertas tareas. En Java actualmente existen 50 palabras reservadas.

abstract	continue	for	new	switch
assert	default	goto	package	synchronized
boolean	do	if	private	this
break	double	implements	protected	throw
byte	else	import	public	thows
case	enum	instanceof	return	transient
catch	extends	int	short	try
char	final	interface	static	void
class	finally	long	strictfp	volatile
const	float	native	super	while
Algo importante a tener en cuenta es que las palabras reservadas no pueden ser utilizadas como nombres de variables, clases o métodos.

Aunque const y goto son palabras reservadas, estas no son utilizadas en la actualidad.

En adición a este listados podemos agregar true, false y null.

#Métodos print y println

Para que nosotros podamos mostrar un mensaje en consola debemos hacer uso de los métodos print, println o printf. Para este post nos concentramos en print y println, de printf ya estaremos hablando más adelante.

Con el método println el mensaje se imprimirá en consola con un salto de línea.

System.out.println("Hola Mundo");
System.out.println("Mi nombre es Codi");
Salida

Hola Mundo
Mi nombre es Codi
Por otro lado, el método print imprimirá el mensaje en la misma línea.

System.out.print("Hola Mundo");
System.out.print("Mi nombre es Codi");
Salida

Hola MundoMi nombre es Codi
SECUENCIAS DE ESCAPES
Java nos provee de una secuencia de escapes que nos permiten dar formato a las cadenas de texto con las que nos encontramos trabajando.

\n. Salto de línea.
\t. Tabulador.
\\. Diagonal inversa.
\". Comillas dobles.
\'. Comillas simples.
Estas secuencias pueden ser utilizadas junto con los métodos previamente mencionados.

Ejemplos

System.out.print("Hola,\nagregamos un salto");
System.out.print("\tagregamos un tab");
System.out.println("");

System.out.println("Mensaje con \\ diagonal inversa");
System.out.println("Mensaje con \" comillas dobles");
System.out.println("Mensaje con \` comillas simples");
salida

Hola,
agregamos un salto  agregamos un tab
Mensaje con \ diagonal inversa
Mensaje con " comillas dobles
Mensaje con ' comillas simples

#format String Java

Listado de ejemplos sobre el método format de la clase String.

Recordemos que el método format retornar un nuevo String. Si nosotros únicamente mostraremos en consola el nuevo String podemos optar por usar el método printf

System.out.printf(formato, valores);
STRING
String nombre = "Codi";
String apellido = "Facilito";

String nombreCompleto = String.format("%s %s", nombre, apellido);
System.out.println(nombreCompleto);
ENTEROS
String resultado = String.format("%d - %d - %d", 10, 20, 30);
System.out.println(resultado);
FLOAT
float pi = 3.14159265359f;

String resultado = String.format("%f - Decimales: %.2f", pi, pi);
System.out.println(resultado);
BOOLEAN
int cantidad = 10;
boolean mayor = cantidad > 5;

String resultado = String.format("La cantidad es mayor a %d : %b", 
                                                cantidad, mayor);
System.out.println(resultado);
ORDEN
El reemplazo de los valores es lineal, sin embargo, habrá ocasiones en las cuales nosotros necesitemos especificar el orden, en esos casos seguiremos la siguiente estructura %, posición, $, tipo

String uno = "Uno";
String dos = "Dos";
String tres = "Tres";

String resultado = String.format("%3$s - %2$s - %1$s", 
                             uno, dos, tres);
System.out.println(resultado);
float pi = 3.14159265359f;

String resultado = String.format("%1f - Decimales: %1$.2f", pi, pi);
System.out.println(resultado);


#Ejemplos switch en Java

Aquí un listado de ejemplos los cuales nos pueden ayudar a comprender de una mejor manera el switch en Java.

Estructura básica.

switch (expression) { 
    case value1:
     // secuencia de sentencias.
     break;
    case value2:
     // secuencia de sentencias.
     break;
    .
    .
    . 
    case valueN :
     // secuencia de sentencias.
     break;
    default:
     // Default secuencia de sentencias.
  }
Ejemplos con tipos de datos enteros.

int i = 2;

switch(i) {
  case 0:
    System.out.println("i es cero.");
    break;
  case 1:
    System.out.println("i es uno.");
    break;
  case 2:
    System.out.println("i es dos.");
    break;
  case 3:
    System.out.println("i es tres.");
    break;
  default:
    System.out.println("i es mayor a tres.");
}
int i = 2;

switch(i) {
  case 0:
  case 1:
  case 2:
  case 3:
  case 4:
    System.out.println("i es menor que cinco");
    break;
  case 5:
    System.out.println("i es cinco");
    break;
  case 6:
  case 7:
  case 8:
  case 9:
    System.out.println("i es menor que diez y mayor a cinco");
    break;
  default:
    System.out.println("i es diez o mayor a diez");
}
int numeroMes = 4;
String estacion = "", mes = "";

switch (numeroMes) {
  case 12:
    mes = "Diciembre";
  case 1:
    mes = "Enero";
  case 2:
    mes = "Febrero";
    estacion = "Invierno";
    break;
  case 3:
    mes = "Marzo";
  case 4:
    mes = "Abril";
  case 5:
    mes = "Mayo";
    estacion = "Primavera";
    break;
  case 6:
    mes = "Junio";
  case 7:
    mes = "Julio";
  case 8:
    mes = "Agosto";
    estacion = "Verano";
    break;
  case 9:
    mes = "Septiembre";
  case 10:
    mes = "Octubre";
  case 11:
    mes = "Noviembre";
    estacion = "Otoño";
    break;
}

System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
Ejemplos con Strings.

Aun que el switch nos permite comparar la expresión con un caso, nosotros debemos de asegurarnos que ambos valores sean iguales; Para ello una buena forma es estandarizar la expresión, ya sea convirtiendo todas sus letras en mayusculas o minúsculas.

String tipoDia = "";
String diaSemana = "Lunes";

switch (diaSemana.toLowerCase()) {
     case "lunes":
         tipoDia = "Inicio de semana";
         break;
     case "martes":
     case "míercoles":
     case "jueves":
       tipoDia = "Mediados de semana";
         break;
     case "viernes":
       tipoDia = "Inicio de fin se semana";
         break;
     case "sábado":
     case "domingo":
       tipoDia = "Fin de seman";
         break;
 }

System.out.println(diaSemana + " es " + tipoDia);

#Strings como Cadenas Java

Como mencionamos anteriormente un Strings no es más que una cadena de caracteres, caracteres que se encuentran en una posición en especifica, es decir, poseen un índice.

Al igual que los arreglos los String comenzarán en el índice 0.

Si nosotros queremos conocer la cantidad de caracteres que posee un String haremos uso del método length().

String mensaje = "Hola Mundo";
System.out.println(mensaje.length());
Podemos obtener un carácter con respecto a su índice utilizando el método charAt(). Este método nos retorna una variable de tipo char.

String mensaje = "Hola Mundo";
char lentraH = mensaje.charAt(0);
System.out.println(lentraH);
Si no conocemos en que índice se encuentra un caracter, haremos uso de los métodos indexOf o lastIndexOf.

String mensaje = "Hola Mundo";
int indice = mensaje.indexOf("M");

System.out.println(indice);  
Ambos métodos nos retornarán el índice de la primera aparición del caracter a buscar, la única diferencia es que indexOf hará la búsqueda de izquierda a derecha, caso contrario con lastIndexOf, que será de derecha a izquierda.

En dado caso el caracter a buscar no exista dentro del String, ambos métodos nos retornarán -1.

Si queremos que la búsqueda comience a partir de un índice, colocaremos un segundo argumento, el índice a partir del cual se iniciará la búsqueda.

String mensaje = "Este mensaje posee muchas letras a";
int indicePrimeraA = mensaje.indexOf("a");
int indiceSegundaA = mensaje.indexOf("a" indicePrimeraA + 1 );
En este caso buscamos el índice de la segunda letra a.

Si queremos obtener un sub String nos apoyaremos del método substring.

String.substring(indiceInicial) retorna un sub String a partir del índice indicado hasta el último carácter del String.
String mensaje = "Hola Mundo";
int indiceLetraM = mensaje.indexOf("M");


String subString = mensaje.substring(indiceLetraM);
System.out.println(subString);
String.substring(indiceInicial, indiceFinal) retornar un sub String a partir del índice indicado hasta el índice final.
String mensaje = "Hola Mundo";
int indiceLetraM = mensaje.indexOf("M"); 

String subString = mensaje.substring(indiceLetraM, indiceLetraM + 2);
System.out.println(subString);

#Arreglos como parametros

En Java nosotros podemos trabajar con métodos los cuales reciban como parámetros arreglos.

public static void showElements(String[] array) {
 for(String sentencia : arreglos)
  System.out.println(sentencia);
}
En este caso tenemos un método estático (método de clase) el cual recibe como parámetros un arreglo de Strings.

El arreglo como parámetros seguirá la siguiente estructura.

Tipo dato [] nombre parámetros
ejemplo

String[] array
Para hacer uso de este método, únicamente debemos de hacer uso de la clase y colocar como argumento un arreglo.

String elements[] = { "a", "e", "i", "o", "u"};
Class.showElements(elements);
Algo interesante a mencionar es que nuestra clase principal en su método estático main, recibe como parámetros un arreglo de Strings, arreglo que no será más que los argumentos que nosotros coloquemos al ejecutar nuestro programa.

#Documentacion API JAVA

https://docs.oracle.com/javase/9/docs/api/index.html?overview-summary.html

#Clase System

Una de las clases con las que más nos encontraremos trabajando en nuestro día a día es la clase System.

Clase se encuentra en el paquete Java.Lang así que no es necesario que nosotros la importemos para poder hacer uso de ella.

Esta clase nos permite trabajar con los diferentes canales de datos de nuestro programa. La clase posee tres atributos staticos, uno por cada canal.

in. Standard Input stream.
out. Standard Output stream.
err. Standard Error stream.
Si no te encuentras familiarizado con los conceptos (standard input, standard error, etc...) te recomiendo que le eches un vistazo ha este artículo Artículo ?

Si nosotros queremos dar una salida en consola de nuestro programa, debemos de hacer uso del método print, printf o println. Estos métodos se encuentran tanto en el atributo out como en el atributo error. Es importante mencionar que estos tres métodos, son métodos sobrecargados, así que podemos hacer uso de ellos con una variedad de argumentos.

Haremos uso del atributo out siempre y cuando necesitemos que el usuario visualice un mensaje en consola y este mensaje no sea un error o advertencia. Por otro lado haremos uso del atributo err siempre y cuando el mensajes que queremos que el usuario visualice sea un error o advertencia.

Ejemplos

System.out.println("Bienvenido de nuevo "+ username);
if(error){
 System.out.println("Lo sentimo, algo inesperado acaba de ocurrir");
}
Siempre que nosotros necesitemos trabajar con los datos de entrada de nuestro programa, usaremos el atributo in.

Ejemplo

Scanner sc = new Scanner(System.in);

