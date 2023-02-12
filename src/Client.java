public class Client {
    String name;
    double balance;
    int id;

    public Client(String name, double balance, int id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public String returnTere() {
        return ("Tere");
    }

    public int difference(int one, int two) {
        int three = one - two;
        return three;


    }
}