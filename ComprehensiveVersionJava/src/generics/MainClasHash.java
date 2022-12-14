package generics;
//http://www.java2s.com/Tutorial/Java/0140__Collections/Getallkeysandelementsfromahashtable.htm

import java.lang.ref.ReferenceQueue;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

public class MainClasHash {
    public static void main(String[] args) {
        String data;
        String msg;
        Hashtable h = new Hashtable<>(20);
        System.out.println(h.put("one", new Integer(1)));
        System.out.println(h.put("name", "A"));
        
        Enumeration e = h.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        e = h.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
