package com.haw.se1lab;

public class NoteTyp {
    private int note;

    public NoteTyp(int nNote) {
        if (note < 0 || note > 15) {
            throw new ArithmeticException("Die Note ist ungültig");
        }
        note = nNote;
    }

    public int getNote() {
        return note;
    }
}
