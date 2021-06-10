import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random Ale = new Random();
        int Muestra;
        for (int i = 1; i < 20; i++) {
            Muestra = Ale.nextInt(50) + 1;
            if (Muestra >= 18) {
                System.out.println(Muestra + " Mayor de edad");
            } else {
                System.out.println(Muestra + " Menor de edad");
            }

        }
    }
}