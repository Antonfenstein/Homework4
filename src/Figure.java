public class Figure {
    int height, width, length;

    public Figure() {
    }

    public Figure(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int Volume() {
        int volume = this.height * this.width * this.length;
        return volume;
    }

    public void CalculateSurface() {
        int s;
        s = 2 * (this.height * this.width + this.height * this.length + this.width * this.length);
        System.out.println("The surface square is " + s);
    }
}