package ir.ac.kntu;

public class DigitalPen {
    private String brand;
    private Color color;
    private int fontsize;

    public DigitalPen(String brand, Color color, int fontsize) {
        this.brand = brand;
        this.color = color;
        this.fontsize = fontsize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getFontsize() {
        return fontsize;
    }

    public void setFontsize(int fontsize) {
        this.fontsize = fontsize;
    }

    public String getMoodMessage(){
        return "It's " + getColor();
    }

    public String getDigitalPenValue() {
        if (brand == null) return "Unknown";
        switch (brand.toLowerCase()) {
            case "huion":
                return "Fantastic";
            case "xp pen":
                return "Good";
            case "ugee":
                return "Normal";
            default:
                return "Bad";
        }
    }
}
