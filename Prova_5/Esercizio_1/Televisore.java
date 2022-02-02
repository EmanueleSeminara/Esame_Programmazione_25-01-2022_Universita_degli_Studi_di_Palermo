import java.util.Scanner;

public class Televisore{
    private String marca, modello;
    private int dimensione;
    private final String[] marche = {"LG", "Samsung", "AKAI", "Sony"};
    private final String[] modelli = {"Az12312", "4K", "Pippo"};

    public Televisore(){
        setMarca("Default");
        setModello("Default");
        setDimensione(32);
    }

    public void setMarca(String marca){
        for(int i = 0; i < marche.length; i++){
            if(marche.equals(marche[i])){
                this.marca = marca;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public void setModello(String modello){
        for(int i = 0; i < modelli.length; i++){
            if(modello.equals(modelli[i])){
                this.modello = modello;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public void setDimensione(int dimensione){
        if(dimensione > 0){
            this.dimensione = dimensione;
        }
        throw new IllegalArgumentException();
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModello(){
        return this.modello;
    }

    public int getDimensione(){
        return this.dimensione;
    }

    public void setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        setMarca(sc.nextLine());
        System.out.println("Modello: ");
        setModello(sc.nextLine());
        System.out.println("Dimensione: ");
        setDimensione(sc.nextInt());
    }

    @Override
    public String toString(){
        return "Marca: " + this.marca + " Modello: " + this.modello + "Dimensione: " + this.dimensione;
    }
}