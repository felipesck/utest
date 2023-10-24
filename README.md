# Utest

# Precondiciones
***
Para la ejecución de cada script es necesario actualizar la versión del archivo 
ChromeDriver que se encuentra en cada uno de los proyectos entregados, para lo cual 
se debe ir a la siguiente página https://chromedriver.chromium.org/downloads para 
descargar la versión de Chrome acorde a la del equipo en el cual se está ejecutando la
automatización. Dicho archivo debe ser reemplazado por el que ya está en la carpeta del 
proyecto.

Se debe tener instalado Java JDK (jdk-8u341-windows-x64) y Gradle (gradle-6.2-all) en 
el equipo, así como también sus respectivas variables de entorno en el sistema.

# Ejecución
***
Se debe ingresar la data requerida para la ejecución como lo son los datos de nombre, 
apellido, correo, etc  dicha información debe ser ingresada en un Excel el cual se 
encuentra dentro del proyecto en la ruta \Nombre Del Proyecto\src\test\resources\Data, 
allí se encontrara el archivo de data correspondiente.

Para la ejecución de cada Script, en la raíz de la carpeta del proyecto se encontrará 
un archivo con extensión .bat dicho archivo tendrá el mismo nombre que el proyecto el 
cual será el encargado de abrir la interface para ejecutar, desde la misma se podrán elegir 
qué caso ejecutar o existirá una opción para ejecutar todos los casos encaso de haber mas 
de un caso.

Ubicación de evidencias generadas, una vez sea ejecutado el caso el automáticamente 
abrirá la evidencia, pero también podrá ser consultada en la siguiente ruta es la misma 
para todos los proyectos. (Nombre del proyecto\target\site\serenity\index) buscar el 
archivo Index.html el cual se puede abrir en cualquier navegador y en el se encuentra el 
reporte de ejecución
