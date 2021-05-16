package com.haw.se1lab;

import org.springframework.ui.context.Theme;

public class Test extends Aufgabenblatt{

    private NoteTyp Note;

    public Test(String name, Themenbereich themenbereich,Aufgabe aufgabe, Kurs kurs){
        super(name, themenbereich,aufgabe,kurs);
        this.Note = null; // Test erstmal nicht benotet!
    }

    public NoteTyp getNote() {
        return Note;
    }

    public void setNote(NoteTyp note) {
        Note = note;
    }

}
