public class Main {
    public static void main(String[] args) {

        Figure figure = new Figure(2, 3, 5);
        int result = figure.Volume();
        System.out.println("The volume is " + result);

        figure.CalculateSurface();


        Client client1 = new Client("Vasya", 150.49, 8851);
        Client client2 = new Client("Vova", 8555.5, 8471);
        Client client3 = new Client("Masha", 9952.0, 7847);

        String tere = client1.returnTere();
        int dif = client2.difference(64, 11);


    }
}

