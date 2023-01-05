package comparator;

import java.util.Comparator;

public class GetDataBySalary implements Comparator<Recruitment> {
    @Override
    public int compare(Recruitment o1, Recruitment o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
