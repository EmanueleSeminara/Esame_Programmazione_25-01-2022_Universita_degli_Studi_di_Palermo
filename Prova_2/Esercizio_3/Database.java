import java.util.*;

public class Database{
//Mappa che contiene gli oggetti Televisore e associa un intero (l'ID) all'oggetto stesso
    private Map<Integer, Televisore> map = new HashMap<Integer, Televisore>();

//Metodo add che aggiunge un nuovo oggetto alla mappa e lo restituisce
    public Televisore add(Televisore tv){
        return map.put(tv.getID(), tv);
    }

//Metodo remove che rimuove oggetti dalla mappa per ID e restituisce l'oggetto rimosso
    public Televisore remove(int ID){
        return map.remove(ID);
    }

// Metodo print che ordina gli oggetti e successivamente li stampa
    public void print(){
        List<Televisore> televisori = new ArrayList<>(map.values());
        Collections.sort(televisori);

        for(Object tv : televisori){
            System.out.println(tv);
        }
    }

// Breve main per testare tutte le funzionalità implementate
    public static void main(String[] args){
        Database db = new Database();
        db.add(new Televisore(12.9, "Samso", "400x400"));
        db.add(new Televisore(110.9, "Samso", "400x400"));
        db.add(new Televisore(10.9, "Samso", "400x400"));
        db.print();
        db.remove(0);
        db.print();
    }
}