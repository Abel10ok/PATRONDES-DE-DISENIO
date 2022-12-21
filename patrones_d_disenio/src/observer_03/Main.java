package observer_03;

public class Main {
    public static void main(String[] args) {

        Auction auction = new Auction( "Rolex", 1000.00,"alto reloj");

        auction.addObserver(new Offerer("Nacho", "Gibbs", 12345678, 2000));
        auction.addObserver(new Offerer("Juan Manuel", "Figueroa", 12345678, 5000));
        auction.addObserver(new Offerer("Roxi", "Ocaña", 12345678, 10000));

        auction.addBid();
    }
}