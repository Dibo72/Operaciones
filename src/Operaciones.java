import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Introduce el primero numero:");
        int num = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int seg = sc.nextInt();

        System.out.println("Suma: " + (num + seg));

        System.out.println("Resta: " + (num - seg));

        System.out.println("Multiplicacion: " + (num * seg));

        if (num != 0 && seg != 0) {
            System.out.println("Division: " + (num / seg));
        }else{
            System.out.println("No se puede dividir por cero");
        }
    }
}