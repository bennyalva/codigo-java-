# Patron de diseño proxy
## ¿Qué es?
 El patrón de diseño proxy su principal función y propósito es proporcionar un intermediario para poder gestionar el creado de objetos en el momento necesario. Esto permite la seguridad y la    administración de los recursos, la mayoria de las veces cuando se usa este patrón de diseño es para objetos que son muy costosos para su creación(recursos y tiempo).

## ¿Cómo lo hace?
   Se crea una clase intermediaria entre la la interface y la clase que implementa los metodos cuando se necesita crea un metodo pa petición pasa por el proxy para ver si es necesario crearlo oh ya había creado con anterioridad.

## Estructura
![alt text](https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjI9qa77d7gAhUGPK0KHRuYCQYQjRx6BAgBEAU&url=http%3A%2F%2Fwww.danielcostas.com%2Fpatrones-de-diseno%2F&psig=AOvVaw1Q9yCUCYz9XY4WIW02McPw&ust=1551457928042162)
## Ventajas: 
---- Es muy bueno la para la seguridad 
---- No se crea ningún objeto hasta que sea necesario
## Desventajas :
---- Se debe saber especificamente que objetos administrara el proxy  
---- Si existe una alta concurrecia hacia los objetos que administra el proxy esto haría lento el systema.