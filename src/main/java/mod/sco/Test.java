package mod.sco;

import java.util.Iterator;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Scolarite sco = new Scolarite();
        Vector<Note> lesNotes = sco.getNotes("HE1"); // Remplace "HE1" par un num d'inscription existant dans ta BD
        Iterator<Note> it = lesNotes.iterator();

        while (it.hasNext()) {
            Note n = it.next();
            System.out.println(n.getMatiere() + " -- " + n.getNote());
        }
    }
}
