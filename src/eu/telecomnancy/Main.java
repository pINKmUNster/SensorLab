package eu.telecomnancy;

/**
 *
 * @author charoy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ISensor s=new RandomSensor();
        Client c=new Client(s);
        c.menu();
    }
}
