package product;

public class CarManual {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "content='" + content + '\'' +
                '}';
    }
}