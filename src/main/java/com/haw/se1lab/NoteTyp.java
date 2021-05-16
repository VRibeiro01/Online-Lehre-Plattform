package com.haw.se1lab;

public class NoteTyp {
    public int Note;

    public NoteTyp(int nNote) {
        if (Note < 0 || Note > 15) {
            throw new ArithmeticException("Die Note ist ungültig");
        }
        Note = nNote;
    }

    public int getNote() {
        return Note;
    }
}
