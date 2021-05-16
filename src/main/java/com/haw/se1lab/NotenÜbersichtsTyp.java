package com.haw.se1lab;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NotenÜbersichtsTyp<T> {

    public Map<T, NoteTyp> GradeOverview;

    public NotenÜbersichtsTyp(T kk) {
        this.GradeOverview = new HashMap<>();
    }

    public Map<T, NoteTyp> getGradeOverview() {
        return GradeOverview;
    }

}

