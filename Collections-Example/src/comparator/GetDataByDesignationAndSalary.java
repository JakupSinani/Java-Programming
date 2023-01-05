package comparator;

import java.util.Comparator;

public class GetDataByDesignationAndSalary implements Comparator<Recruitment> {
    @Override
    public int compare(Recruitment o1, Recruitment o2) {
        int designationComparision = o1.getDesignation().compareTo(o2.getDesignation());
        int salaryComparision = (int) (o1.getSalary() - o2.getSalary());
        return (salaryComparision == 0) ? designationComparision : salaryComparision;
    }
}
