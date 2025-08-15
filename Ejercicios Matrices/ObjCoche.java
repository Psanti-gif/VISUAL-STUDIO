public class ObjCoche {
    private String Color;
    private String Marca;
    private int Cilindraje;

    
    public ObjCoche() {
    }

    public ObjCoche(String color, String marca, int cilindraje) {
        Color = color;
        Marca = marca;
        Cilindraje = cilindraje;
    }

    public String getColor() {
        return Color;
    }

    public String getMarca() {
        return Marca;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setCilindraje(int cilindraje) {
        this.Cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Color: " + Color + ", Marca: " + Marca + ", Cilindraje: " + Cilindraje;
    }
}
