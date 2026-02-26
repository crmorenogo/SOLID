# SOLID

Cristian Felipe Moreno Gomez

## Resumen SOLID

El video explica los cinco principios SOLID que son recomendaciones para que el código sea más legible, limpio, mantenible y escalable. Estos principios son:

Principio de Responsabilidad Única (SRP - Single Responsibility Principle): Este principio indica que cada módulo, clase, función o componente debe tener una sola razón para cambiar. Si se detecta que una parte del código está haciendo varias cosas, como manejar lógica de negocio y también la interfaz de usuario, o si una clase gestiona múltiples responsabilidades (como enviar correos, validar formularios y conectarse a bases de datos), no está cumpliendo con este principio.

Principio de Abierto/Cerrado (OCP - Open/Closed Principle): El software debe estar abierto para extensión, pero cerrado para modificación. Esto significa que se puede añadir nuevo comportamiento sin tener que editar el código que ya funciona. Si cada vez que hay un nuevo requerimiento se necesita modificar un switch o un if anidado en el código existente, se está incumpliendo este principio.

Principio de Sustitución de Liskov (LSP - Liskov Substitution Principle): Las subclases o implementaciones deben poder sustituir a sus clases base o interfaces sin alterar el comportamiento esperado. En esencia, si una clase implementa un contrato (como una interfaz), no debe romperlo. Se incumple cuando hay errores de tipo al retornar algo inesperado, excepciones por falta de implementación de un contrato, o un comportamiento roto al sustituir una implementación.

Principio de Segregación de Interfaces (ISP - Interface Segregation Principle): Las piezas de código (clases, módulos) no deben obligarse a depender de interfaces o contratos que no estén usando. Es mejor tener varias interfaces pequeñas y específicas que una interfaz inmensa donde muchas propiedades son opcionales porque no todas se usan. Se detecta su incumplimiento cuando se tienen interfaces gigantes que no usan todas sus propiedades, componentes no usados o indefinidos, o funciones que reciben objetos cuyas propiedades no se utilizan.

Principio de Inversión de Dependencias (DIP - Dependency Inversion Principle): Las clases, componentes y funciones deben depender de abstracciones y no de implementaciones concretas o específicas. Esto significa evitar instanciar directamente una clase concreta dentro de otra. En su lugar, se debe inyectar la dependencia a través de una interfaz o una abstracción. Se incumple al hacer una instancia directa de una clase, cuando se necesita reconfigurar un módulo para probarlo, o cuando se importan y crean dependencias en lugar de inyectarlas o recibirlas.
