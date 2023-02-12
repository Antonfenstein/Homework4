public class Figure {
    int height, width, length ;

    public Figure() {
    }


    public Figure(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
}

public int Volume() {

    int volume = height*width*length;
    return volume;
    }
    public void Surface() {
        int s;
         s = 2*(height*width+height*length+width*length);
        System.out.println("The surface square is " +s);
    }
}