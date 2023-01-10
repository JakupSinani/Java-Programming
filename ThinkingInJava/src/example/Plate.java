package example;

public class Plate {
    public Plate(int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate {
    public DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil {
    public Utensil(int i) {
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil {
    public Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil {
    public Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil {
    public Knife(int i) {
        super(i);
        System.out.println("Knfie constructor");
    }
}

class Custom {
    public Custom(int i) {
        System.out.println("Custom constructor");
    }
}

class PLaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate dpl;

    public PLaceSetting(int i) {
        super(i + 1);
        this.sp = new Spoon(i + 2);
        this.frk = new Fork(i + 3);
        this.kn = new Knife(i + 4);
        this.dpl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PLaceSetting x = new PLaceSetting(9);
    }
}