# Curso MELI Grails

Material, ejemplos, diapositivas, ejercicios y demás temas relacionados con el curso para MELI dictado en Marzo de 2015

# URL Para Hangout
https://plus.google.com/hangouts/_/gwmvbpqjofvkwutghks77btkhma

# Enunciado
## Original

Una empresa con muchos empleados quiere una aplicación que le permita dar de alta todos sus usuarios, y asignarles un regalo de cumpleaños a cada uno de sus empleados para el año actual.

La persona encargada de asignar los regalos a cada empleado lo desea hacer buscando publicaciones en mercado libre. Y seleccionando de una lista.

Además quieren poder entrar a una página web y ver e la página web al lista de todos los cumpleañeros del día actual y el regalo que tienen asignado.

Finalmente, por motivos historicos, debe haber una forma de consultar que regalos se le hicieron a un empleado los años anteriores.

## Envio de emails

Como los gastos por regalo se dispararon, un gerente solicita que se le envíe un email una vez al mes el costo que tendran todos los regalos de ese mes.

Este proceso se disparará entrando a la pagina /reporte_regalos_del_mes la cual enviará un email a los integrantes del grupo donde figurará el costo total de los regalos.

## ABM Rest

Ya existe una aplicación que gestiona los usuarios de la empresa. Por lo tanto el ABM de usuarios es un poco incómodo. No se quiere borrar este ABM porque a veces resulta útil, peor se quiere exponer toda la funcionalidad de ABM de usuarios por medio de un servicio REST para que sea fácil modificar la otra aplicación para que actualice la información de los usuarios en esta.

## Precios variantes

En el futuro MercadoLibre decide que una publicación puede cambiar de precio. Entonces en el envio del mail con el costo de lo regalos de ese mes, si este precio se guardaba al momento de cargar el regalo, puede quedar desactualizado.

Por tal motivo, se solicita que el precio de los regalos se obtenga en el momento de generar el envio de emails. No antes.

## Integrantes y grupos

### Meteoro 
* **Integrantes:**  Renzo Avila, Juan Lopez, Barbara Allegretti, Diego Abdala
* **Repositorio:** https://github.com/renzoavil17/meteoro.git

### Blackhat 
* **Integrantes:**  Guido Arnone, Shai Bianchi
* **Repositorio:** https://github.com/ballcue/cumpleCompany

### iCro 
* **Integrantes:**  Uriel Mysler, Jorge Cabrera
* **Repositorio:** https://github.com/jorgecabrera/meli-regalos.git

### Team42 
* **Integrantes:**  Eric Brandwein, Diego Sebastian García
* **Repositorio:** https://github.com/garciadiegosebastian/organizadorDeRegalos
* Fork a blancoYdorado: https://github.com/ericbrandwein/cumples

### blancoYdorado 
* **Integrantes:**  Kenneth Weinberg Waks, Candelaria Campos
* **Repositorio:** https://github.com/candecp/cumples.git

### aplicacion-meli
* **Integrantes:**  Ayelen Tolay, Lucas Rossi, Francisco Curdi
* **Repositorio:** https://github.com/lucasr20/aplicacion-meli

### Grupo1
* **Integrantes:**  Nicolás De Giácomo, Pablo Gallazzi
* **Repositorio:** https://github.com/PabloGallazzi/proyecto-grails-meli
