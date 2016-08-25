/**
 * 
 */
import javax.swing.JFrame;
/**
 * @author ֻ־׃כחס
 * @version 1.0
 */
public class VoteCounter {
    // -----------------------------------------
    // Creates the main program frame.
    // -----------------------------------------
    /**
     * Drive my program
     * @param args args command line arguments.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
