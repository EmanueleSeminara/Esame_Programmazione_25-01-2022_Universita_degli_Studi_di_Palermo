import java.util.Scanner;

public class Telefono{
    private String marca, modello;
    private int annoUscita;
    private final String[] marche = {"Apple", "Samsung", "Realme", "Xiaomi"};
    private final String[] modelli = {"iPhone", "Galaxy", "GT"};

    public Telefono(){
        setMarca("Default");
        setModello("Default");
        setAnnoUscita(1996);
    }

    public void setMarca(String marca){
        for(int i = 0; i < marche.length; i++){
            if(marca.equals(marche[i])){
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

    public void setAnnoUscita(int anno){
        if(anno > 0 && anno < 2022){
            this.annoUscita = anno;
        }
        throw new IllegalArgumentException();
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModello(){
        return this.modello;
    }

    public int getAnnoUscita(){
        return this.annoUscita;
    }

    public void setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        setMarca(sc.nextLine());
        System.out.println("Modello: ");
        setModello(sc.nextLine());
        System.out.println("Anno di uscita: ");
        setAnnoUscita(sc.nextInt());
    }

    @Override
    public String toString(){
        return "Marca: " + this.marca + " Modello: " + this.modello + "Anno: " + this.annoUscita;
    }
}