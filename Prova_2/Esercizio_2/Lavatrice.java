public class Lavatrice extends Elettrodomestico{
    private String modello;
    private double capacitaCarico;

    public Lavatrice(int ID, String descrizione, double costo, String modello, double capacitaCarico){
        super(ID, descrizione, costo);
        setModello(modello);
        setCapacitaCarico(capacitaCarico);
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setCapacitaCarico(double capacitaCarico){
        this.capacitaCarico = capacitaCarico;
    }

    public String getModello(){
        return this.modello;
    }

    public double getCapacitaCarico(){
        return this.capacitaCarico;
    }

    @Override
    public String toString(){
        return super.toString() + " Modello: " + this.modello + " Capacità carico: " + this.capacitaCarico;
    }
}