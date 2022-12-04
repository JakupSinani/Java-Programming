package inner_abstract_interface.interFace;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        System.out.println();

        timsPhone = new MobilePhone(23451);
        timsPhone.powerOn();
        timsPhone.callPhone(23451);
        timsPhone.answer();
    }
}
