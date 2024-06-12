// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj liczbę: ");
    int l = sc.nextInt();
    int suma_cyfr = 0;
    while(l>0)
      {
        suma_cyfr = suma_cyfr + l % 10;
        l = l/10;
      }
    System.out.println("Suma cyfr liczby całkowitej wynosi: "+suma_cyfr);
    
    
  }

}