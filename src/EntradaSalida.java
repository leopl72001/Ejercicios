import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto ="";
        int contador=0;

        //entrada de datos 3 veces
        while (contador <3) {
            System.out.println("escribe algo");
            texto += input.nextLine()+"\n";
            contador++;
        }
        //cerramos el scanner
        input.close();


        //salida de datos
        System.out.println("has escrito:\n"+ texto);

        //pongame 5 profe
    }
}
