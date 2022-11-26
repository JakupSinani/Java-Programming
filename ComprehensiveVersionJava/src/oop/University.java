package oop;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class University {
    private final String name;
    private Map<String,Departament> departaments;


    public University(String name) {
        this.name = name;
        this.departaments=new TreeMap<String,Departament>();
    }
    public String getName(){
        return new String(name);
    }
    public void addDepartament(String name, Set<Professor> members){
        Departament dept=new Departament(name);
        departaments.put(name,dept);
        for (Professor prof: members){
            dept.add(prof);
        }
    }
    public void add(Professor prof,String deptName){
        Departament dept=departaments.get(deptName);
        if (dept==null){
            throw new RuntimeException(deptName+" does not exist.");
        }else {
            dept.add(prof);
        }
    }
    public Set<String>departament(){
        return departaments.keySet();
    }
}
