public class MacchinaCaffe extends Elettrodomestico{
    private String modello;
    private String tipologia;
    private final String[] tipologie = {"cialde", "capsule", "polvere"};

    public MacchinaCaffe(int ID, String descrizione, double costo, String modello, String tipologia){
        super(ID, descrizione, costo);
        setModello(modello);
        setTipologia(tipologia);
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setTipologia(String tipologia){
        for(int i = 0; i < tipologie.length; i++){
            if(tipologia.equals(tipologie[i])){
                this.tipologia = tipologia;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public String getModello(){
        return this.modello;
    }

    public String getTipologia(){
        return this.tipologia;
    }

    @Override
    public String toString(){
        return super.toString() + " Modello: " + this.modello + " Capacità carico: " + this.tipologia;
    }
}