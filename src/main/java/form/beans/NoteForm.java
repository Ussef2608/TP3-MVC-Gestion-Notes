package form.beans;

import java.util.Vector;
import mod.sco.Note;

public class NoteForm {
    private String numIns = "";
    private Vector<Note> lesNotes = new Vector<>();

    public String getNumIns() {
        return numIns;
    }

    public void setNumIns(String numIns) {
        this.numIns = numIns;
    }

    public Vector<Note> getLesNotes() {
        return lesNotes;
    }

    public void setLesNotes(Vector<Note> lesNotes) {
        this.lesNotes = lesNotes;
    }
}
