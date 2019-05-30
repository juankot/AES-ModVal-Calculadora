# AES-ModVal-Calculadora

Tarea de implementación para la clase de Modelado y Validación de Arquitectura de la especialización de Arquitectura Empresarial de Software de la Pontificia Universidad Javeriana, sede Bogotá, Colombia.

## Getting Started
Este ejercicio consiste en definir los contratos y los esquemas para el servicio de Calculadora (contract first). De igual manera, se utilizó la herramienta raml-for-jax-rs para generar el código a partir de estos recursos. A continuación se explica cómo debería ser el comportamiento.

##add
Representa la operación de suma y es  soportada a través del verbo GET. Debe recibir los elementos a sumar (num1 y num2) como query strings, e.g.: 

`curl -XGET http://localhost:port/calc/add?num1=1&num2=-1`

##sub
Representa la operación de resta y es soportada a través del verbo PATCH. Debe recibir sus elementos a restar (num1 y num2) como parte del cuerpo del mensaje, e.g.: 

`curl -XDELETE http://localhost:port/calc/sub -d '{ "num1": 1, "num2": 2 }'`

##mul
Representa la operación de multiplicación y es soportada a través del verbo POST. Debe recibir los elementos a multiplicar (num1 y num2) como parte del cuerpo del mensaje, e.g.:

`curl -XPOST http://localhost:port/calc/mul -d '{ "num1": 1, "num2": 2 }'`

##div
Representa la operación de división y es soportada a través del verbo PUT. Debe recibir los elementos a dividir (num1 y num2) como query strings, e.g.:

`curl -XPUT http://localhost:port/calc/div?num1=1&num2=-1`