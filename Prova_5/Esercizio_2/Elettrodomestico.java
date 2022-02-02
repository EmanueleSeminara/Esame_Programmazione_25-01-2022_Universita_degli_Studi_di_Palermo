public class Elettrodomestico{
    private int ID;
    private String descrizione;
    private double costo;

    public Elettrodomestico(int ID, String descrizione, double costo){
        this.ID = ID;
        this.descrizione = descrizione;
        setCosto(costo);
    }

    public void setCosto(double costo){
        if(costo > 0){
            this.costo = costo;
        }
    }

    public double getCosto(){
        return this.costo;
    }

    @Override
    public String toString(){
        return "ID: " + this.ID + " Descrizione: " + this.descrizione + " Costo: " + this.costo;
    }
}