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



