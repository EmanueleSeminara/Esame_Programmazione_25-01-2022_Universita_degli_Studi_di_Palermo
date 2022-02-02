import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Elettrodomestico> elettrodomestici = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.print("ID: ");
            int ID = sc.nextInt();
            System.out.print("Descrizione: ");
            String descrizione = sc.next();
            System.out.print("Costo: ");
            double costo = sc.nextDouble();
            System.out.print("Modello:");
            String modello = sc.next();
            System.out.print("Tipologia:");
            String tipologia = sc.next();
            elettrodomestici.add(new MacchinaCaffe(ID, descrizione, costo, modello, tipologia));
        }

        for(int i = 0; i < 5; i++){
            System.out.print("ID: ");
            int ID = sc.nextInt();
            System.out.print("Descrizione: ");
            String descrizione = sc.next();
            System.out.print("Costo: ");
            double costo = sc.nextDouble();
            elettrodomestici.add(new Elettrodomestico(ID, descrizione, costo));
        }

        Iterator<Elettrodomestico> iter = elettrodomestici.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}