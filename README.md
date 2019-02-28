# Patron de diseño proxy
## ¿Qué es?
 El patrón de diseño proxy su principal función y propósito es proporcionar un intermediario para poder gestionar el creado de objetos en el momento necesario. Esto permite la seguridad y la    administración de los recursos, la mayoria de las veces cuando se usa este patrón de diseño es para objetos que son muy costosos para su creación(recursos y tiempo).

## ¿Cómo lo hace?
   Se crea una clase intermediaria entre la la interface y la clase que implementa los metodos cuando se necesita crea un metodo para petición pasa por el proxy para ver si es necesario crearlo oh ya había creado con anterioridad.

## Estructura
![alt text](http://www.danielcostas.com/wp-content/uploads/2010/10/Proxy.jpg)
## Ventajas: 
---- Es muy bueno la para la seguridad 
---- No se crea ningún objeto hasta que sea necesario
## Desventajas :
---- Se debe saber especificamente que objetos administrara el proxy  
---- Si existe una alta concurrecia hacia los objetos que administra el proxy esto haría lento el systema.