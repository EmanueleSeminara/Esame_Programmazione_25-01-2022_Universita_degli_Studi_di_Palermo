import java.util.*;

public class Database{
//Mappa che contiene gli oggetti Telefono e associa un intero (l'ID) all'oggetto stesso
    private Map<Integer, Telefono> map = new HashMap<Integer, Telefono>();

//Metodo add che aggiunge un nuovo oggetto alla mappa e lo restituisce
    public Telefono add(Telefono tel){
        return map.put(tel.getID(), tel);
    }

//Metodo remove che rimuove oggetti dalla mappa per ID e restituisce l'oggetto rimosso
    public Telefono remove(int ID){
        return map.remove(ID);
    }

// Metodo print che ordina gli oggetti e successivamente li stampa
    public void print(){
        List<Telefono> telefoni = new ArrayList<>(map.values());
        Collections.sort(telefoni);

        for(Object tel : telefoni){
            System.out.println(tel);
        }
    }

// Breve main per testare tutte le funzionalità implementate
    public static void main(String[] args){
        Database db = new Database();
        db.add(new Telefono(12.9, "Samso", 1990));
        db.add(new Telefono(110.9, "Samso", 1990));
        db.add(new Telefono(10.9, "Samso", 1990));
        db.print();
        db.remove(0);
        db.print();
    }
}