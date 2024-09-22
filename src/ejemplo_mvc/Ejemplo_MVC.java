package ejemplo_mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Ejemplo_MVC {

    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
        
        controlador.iniciar();
        vista.setVisible(true);
    }
}

/*
MVC, que significa Modelo-Vista-Controlador, es un patrón de diseño de software utilizado 
para estructurar aplicaciones, separando la lógica de negocio de la interfaz de usuario. 
Este patrón se compone de tres componentes principales:
Modelo: Maneja los datos y la lógica de negocio.
Vista: Se encarga de la presentación y la interfaz gráfica.
Controlador: Actúa como intermediario entre el modelo y la vista, gestionando las entradas
del usuario y actualizando el modelo y la vista en consecuencia.
La separación proporcionada por MVC facilita el mantenimiento y 
la escalabilidad de las aplicaciones, permitiendo que los cambios en una 
parte del sistema no afecten directamente a las otras.
*/

/*
Explicación de los cambios, este ejercicio es la version mejorada de https://github.com/techniciandev/Ejemplo_MVC 
Vista creada desde cero: Ahora se utiliza GridBagLayout para organizar los componentes y asegurar una disposición flexible.
Validación de entrada: Se implementa un KeyListener en las cajas de texto para aceptar solo números.
Controlador: Se captura el evento del botón "Sumar" y se realiza la operación de forma segura, mostrando mensajes de error si hay una entrada no válida.
Tamaño fijo de la ventana: La ventana no es redimensionable y tiene un tamaño predeterminado.
*/