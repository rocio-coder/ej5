import  java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {


        int primero, segundo, tercero, valormayor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese valor");
        primero = scanner.nextInt();
        segundo = scanner.nextInt();
        tercero = scanner.nextInt();

        {
            if (primero > tercero) {
                valormayor = primero;
            } else {
                valormayor = tercero;
            }
        }
        {
            if (segundo > tercero) {
                valormayor = segundo;
            } else {
                valormayor = tercero;
            }
        }
        System.out.print("el mayor es " + valormayor);

    }
}