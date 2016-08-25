 /**
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing. *;

/**
 * @author ËÎÓëçñ
 *
 */
public class VoteCounterPanel extends JPanel {
    private int votesForJoe;
    private int votesForSam;
    private JButton joe;
    private JButton sam;
    private JLabel labelJoe;
    private JLabel labelSam;
    private JLabel determine;
    

    // -------------------------------------------------
    // Constructor: Sets up the GUI.
    // -------------------------------------------------
    /**
     * Constructor.
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new VoteButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        add(joe);
        add(labelJoe);
        setPreferredSize(new Dimension(300, 40));
        setBackground(Color.cyan);
        
        votesForSam = 0;
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new VoteButtonListener());
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(sam);
        add(labelSam);
        setPreferredSize(new Dimension(500, 80));
        
        determine = new JLabel("WINNER");
        add (determine);
    }

    // **************************************************
    // Represents a listener for button push (action) events
    // **************************************************
    /**
     * Listener. 
     * @author ËÎÓëçñ
     * @version 1.0
     */
    private class VoteButtonListener implements ActionListener {
        // ----------------------------------------------
        // Updates the appropriate vote counter when a
        // button is pushed for one of the candidates.
        // ----------------------------------------------
        /**
         * Action.
         */
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe); 
            } else {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }
            
            if (votesForJoe>votesForSam){
                determine.setText( "Joe wins!!");
            }
                else if (votesForJoe==votesForSam){
                    determine.setText ( "It is a tie.");
                }
                else 
                    determine.setText ("Sam wins!!");
                }
                    
        }
        
    }
