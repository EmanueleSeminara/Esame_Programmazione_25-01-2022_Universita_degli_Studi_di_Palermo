public class Telefono implements Comparable<Telefono>{
// Attributi della classe
    private static int count = 0;   // Per l'ID autoincrementante
    private final int ID;
    private double costo;
    private String modello;
    private int annoUscita;

// Costruttore parametrizzato
    public Telefono(double costo, String modello, int annoUscita){
        this.ID = count++;
        setCosto(costo);
        setModello(modello);
        setAnnoUscita(annoUscita);
    }

// Metodi set e get
    public void setCosto(double costo){
        if(costo < 0){
            throw new IllegalArgumentException();
        }
        this.costo = costo;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setAnnoUscita(int annoUscita){
        this.annoUscita = annoUscita;
    }

    public double getCosto(){
        return this.costo;
    }

    public String getModello(){
        return this.modello;
    }

    public int getAnnoUscita(){
        return this.annoUscita;
    }

    public int getID(){
        return this.ID;
    }

// Metodo toString
    @Override
    public String toString(){
        return "ID: " + this.ID + " Costo: " + this.costo + " Modello: " + this.modello + " Anno Uscita: " + this.annoUscita;
    }

// Metodo equals
    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof Telefono))
            return false;
        Telefono tel = (Telefono)o;
        return this.modello.equals(tel.modello) && this.annoUscita == tel.annoUscita;
    }

// Metodo hashCode
    @Override
    public final int hashCode() {
        int result = 17;
        if (this.modello != null) {
            result = 31 * result + this.modello.hashCode();
        }
        if (this.annoUscita > 0) {
            result = 31 * result + this.annoUscita;
        }
        return result;
    }

// Metodo compareTo
    @Override
    public int compareTo(Telefono other){
        if(this.costo<other.costo)
            return -1;
        else if(other.costo<this.costo)
            return 1;
        return 0;
    }
}