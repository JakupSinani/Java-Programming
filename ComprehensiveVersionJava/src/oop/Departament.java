package oop;

import java.util.HashSet;
import java.util.Set;

public class Departament {
    final String name;
    Set<Professor> members;

    public Departament(String name) {
        this.name = name;
        this.members = new HashSet<Professor>();
    }
    public void add(Professor professor){
        members.add(professor);
    }
}
