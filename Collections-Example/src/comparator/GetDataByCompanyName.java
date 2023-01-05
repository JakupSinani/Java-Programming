package comparator;

import java.util.Comparator;

public class GetDataByCompanyName implements Comparator<Recruitment> {
    @Override
    public int compare(Recruitment o1, Recruitment o2) {
        return o1.getCompanyName().compareTo(o2.getCompanyName());
    }
}
