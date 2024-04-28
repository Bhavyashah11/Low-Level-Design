package Factory;

public class Factory {

    public Shape getShape(String shape) {
        if (shape=="circle") return new Circle();
        else if (shape=="square") return new squre();
        return null;
    }
}
