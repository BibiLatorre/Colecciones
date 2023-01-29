import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> ListaNumeros = new ArrayList<Integer>();

        System.out.println("Digita cantidad de números a cargar");
        int Num = input.nextInt();

        for (int i = 0; i < Num; i++) {
            System.out.println("Digita un número");
            int numero = input.nextInt();
            ListaNumeros.add(numero);
        }
        System.out.println("Los números que ingresaste son: ");
        for (Integer elemento : ListaNumeros){
            System.out.println(elemento);
        }

    }
}