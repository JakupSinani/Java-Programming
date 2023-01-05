package comparator;

import java.util.Comparator;

public class GetDataByDesignation implements Comparator<Recruitment> {
    @Override
    public int compare(Recruitment o1, Recruitment o2) {
        return o1.getDesignation().compareTo(o2.getDesignation());
    }
}
