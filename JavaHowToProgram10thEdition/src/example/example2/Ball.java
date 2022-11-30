package example.example2;

public class Ball implements Bounceable {
    @Override
    public void bounce() {
        Bounceable.super.bounce();
    }

    @Override
    public void setBounceFactor(int bf) {
        Bounceable.super.setBounceFactor(bf);
    }
}
