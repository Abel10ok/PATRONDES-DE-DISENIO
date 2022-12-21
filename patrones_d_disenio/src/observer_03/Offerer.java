package observer_03;

public class Offerer implements Observer {
    private String name;
    private String surname;
    private Integer DNI;
    private Integer capAmount;

    public Offerer(String name, String surname, Integer DNI, Integer capAmount) {
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.capAmount = capAmount;
    }

    @Override
    public void update(Auction auction, Object arg) {
        if ( auction.getAmount() < capAmount) {
            System.out.println("Offerer " + name + " " + surname + " has a cap amount of " + capAmount);
        }

    }

}
