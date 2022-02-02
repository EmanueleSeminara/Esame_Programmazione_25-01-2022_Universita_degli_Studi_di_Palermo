public class Televisore implements Comparable<Televisore>{
// Attributi della classe
    private static int count = 0;   // Per l'ID autoincrementante
    private final int ID;
    private double costo;
    private String modello;
    private String dimensione;

// Costruttore parametrizzato
    public Televisore(double costo, String modello, String dimensione){
        this.ID = count++;
        setCosto(costo);
        setModello(modello);
        setDimensione(dimensione);
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

    public void setDimensione(String dimensione){
        this.dimensione = dimensione;
    }

    public double getCosto(){
        return this.costo;
    }

    public String getModello(){
        return this.modello;
    }

    public String getDimensione(){
        return this.dimensione;
    }

    public int getID(){
        return this.ID;
    }

// Metodo toString
    @Override
    public String toString(){
        return "ID: " + this.ID + " Costo: " + this.costo + " Modello: " + this.modello + " Dimensione: " + this.dimensione;
    }

// Metodo equals
    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof Televisore))
            return false;
        Televisore tel = (Televisore)o;
        return this.modello.equals(tel.modello) && this.dimensione.equals(tel.dimensione);
    }

// Metodo hashCode
    @Override
    public final int hashCode() {
        int result = 17;
        if (this.modello != null) {
            result = 31 * result + this.modello.hashCode();
        }
        if (this.dimensione != null) {
            result = 31 * result + this.dimensione.hashCode();
        }
        return result;
    }

// Metodo compareTO
    @Override
    public int compareTo(Televisore other){
        if(this.costo<other.costo)
            return -1;
        else if(other.costo<this.costo)
            return 1;
        return 0;
    }
}