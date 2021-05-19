package com.haw.se1lab;



public class Test extends Aufgabenblatt{

    private NoteTyp note;


    public Test(String name, String themenbereich, Kurs kurs, Lehrer ersteller, Schueler bearbeiter){
        super(name, themenbereich,kurs,ersteller, bearbeiter);
        this.note = null; // Test erstmal nicht benotet!

    }

    public NoteTyp getNote() {
        return note;
    }

    public void setNote(NoteTyp note) {
        this.note = note;
    }


}
