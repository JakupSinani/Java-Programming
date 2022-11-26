package oop;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestUniversity {
    public static void main(String[] args) {
        University SEEU=new University("South East Europian University");
        Professor besnik=new Professor("Besnik",Rank.PROF);
        Professor artan=new Professor("Artan",Rank.PROF);
        Professor lejla=new Professor("Lejla",Rank.ASSOC);
        Set<Professor> professorSet=new HashSet<Professor>();
        Collections.addAll(professorSet,besnik,artan,lejla);
        SEEU.addDepartament("Computer Science",professorSet);

    }
}
