package inheritance.book;

public class MyBook extends Book {
    String title;

    @Override
    void setTitle(String s) {
        this.title = s;
    }

    @Override
    String getTitle() {
        return title;
    }
}
