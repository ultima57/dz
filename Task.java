package dz2;

/* buf*10+cow*5+tel*0.5=100
 * buf+cow+tel=100
 * buf-var
 * 
 * 
 * 
 */
public class Task {
    public static void main(String[] args) {
        Kramer kramer = new Kramer();
        for (int i = 0; i < 10; i++) {

            kramer.calculation(i);
        }
        System.out.println("на самом деле");
        kramer.printcalc();
    }

}
