/**
 * Importamos clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de tipo scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Arreglos para guardar las alturas y edades ingresadas
         */
        int alturaHombre[] = new int[1000];
        int alturaMujer[] = new int[1000];
        int edadIngresada[] = new int[1000];

        /**
         * Variables que nos ayudaran en el calculo de lo solicitado en el enunciado
         */
        int opcion=0, contadorAlturaHombre=0, contadorAlturaMujer=0, contadorEdad=0;
        int sumatoriaAlturaHombre=0, sumatoriaAlturaMujer=0, sumatoriaEdad=0;
        int promedioAlturaHombre=0, promedioAlturaMujer=0, promedioEdad=0;
        boolean salir = false;

        /**
         * Ciclo do while para repetir el ingreso de datos hasta que se ingrese un altura igual a cero
         */
        do{
            /**
             * Peticion de sexo al usuario para poder separar los datos ingresados
             */
            System.out.println("Ingresa tu sexo");
            System.out.println("1) Hombre");
            System.out.println("2) Mujer");
            opcion = scanner.nextInt();
            /**
             * Condicion switch para poder realizar una accion en base al sexo del usuario
             */
            switch(opcion){
                case 1:
                    /**
                     * Peticion de la edad y altura al usuario
                     */
                    System.out.println("Ingresa tu edad");
                    edadIngresada[contadorEdad] = scanner.nextInt();
                    contadorEdad += 1;
                    System.out.println("Ingresa tu altura");
                    alturaHombre[contadorAlturaHombre] = scanner.nextInt();

                    /**
                     * Si la altura es igual a cero, saldremos del bucle do while
                     */
                    if(alturaHombre[contadorAlturaHombre]==0){
                        salir = true;
                    }
                    contadorAlturaHombre += 1;
                    break;
                case 2:
                    /**
                     * Peticion de la edad y altura al usuario
                     */
                    System.out.println("Ingresa tu edad");
                    edadIngresada[contadorEdad] = scanner.nextInt();
                    contadorEdad += 1;
                    System.out.println("Ingresa tu altura");
                    alturaMujer[contadorAlturaMujer] = scanner.nextInt();

                     /**
                     * Si la altura es igual a cero, saldremos del bucle do while
                     */
                    if(alturaMujer[contadorAlturaMujer]==0){
                        salir = true;
                    }
                    contadorAlturaMujer += 1;
                    break;

                default:
                    /**
                     * Mensaje por defecto en caso que se ingrese un opcion invalida
                     */
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }while(salir == false);

        /**
         * Ciclo for para realizar las respectivas sumatorias de alturas y edades
         */
        for(int i=0; i<contadorAlturaHombre; i++){
            sumatoriaAlturaHombre += alturaHombre[i];
        }
        for(int i=0; i<contadorAlturaMujer; i++){
            sumatoriaAlturaMujer += alturaMujer[i];
        }
        for(int i=0; i<contadorEdad; i++){
            sumatoriaEdad += edadIngresada[i];
        }

        /**
         * Calculo de promedios de altura y edades y posterior impresion en pantalla
         */
        promedioAlturaHombre = sumatoriaAlturaHombre/contadorAlturaHombre;
        promedioAlturaMujer = sumatoriaAlturaMujer/contadorAlturaMujer;
        promedioEdad = sumatoriaEdad/contadorEdad;

        System.out.println("El promedio de altura para las mujeres es de: "+promedioAlturaMujer);
        System.out.println("El promedio de altura para los hombres es de: "+promedioAlturaHombre);
        System.out.println("El promedio de edades ingresadas es de: "+promedioEdad);
    }
}
