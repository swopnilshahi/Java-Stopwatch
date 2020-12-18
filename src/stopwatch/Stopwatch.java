/*Stopwatch

*/
package stopwatch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Stopwatch extends JFrame {
    
    
    //declearing controls used
    JButton startButton=new JButton();
    JButton stopButton=new JButton();
    JButton exitButton=new JButton();
    JLabel startLabel= new JLabel();
    JLabel stopLabel= new JLabel();
    JLabel elapsedLabel=new JLabel();
    JTextField startTextField=new JTextField();
    JTextField stopTextField=new JTextField();
    JTextField elapsedTextField= new JTextField();
    
    //declearing class level variables
    long startTime;
    long stopTime;
    double elapsedTime;
    
    
    public static void main(String args[]){
        
//        Construct the frame
            new Stopwatch().show();
            
    }
    public Stopwatch()
        {
                //frame constructor 
            setTitle("Stopwatch Application");
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {exitForm(e);
                }
            });

            
            getContentPane().setLayout(new GridBagLayout());//add controls
            GridBagConstraints gridConstraints=new GridBagConstraints();
            startButton.setText("Start timing");
            gridConstraints.gridx=0; 
            gridConstraints.gridy=0;
            getContentPane().add(startButton, gridConstraints);
            startButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    startButtonActionPerformed(e);
                    
                }
            });
            
            stopButton.setText("Stop Timing");
            gridConstraints.gridx=0;
            gridConstraints.gridy=1;
            getContentPane().add(stopButton, gridConstraints);
            stopButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    stopButtonActionPerformed(e);
                                        }
                                });

            exitButton.setText("Exit");
            gridConstraints.gridx=0;
            gridConstraints.gridy=2;
            getContentPane().add(exitButton, gridConstraints);
            exitButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                  exitButtonActionPerformed(e);
                  
                }
            });
            startLabel.setText("Start Time");
            gridConstraints.gridx = 1;
            gridConstraints.gridy = 0;
            getContentPane().add(startLabel, gridConstraints);
            stopLabel.setText("Stop Time");
            gridConstraints.gridx = 1;
            gridConstraints.gridy = 1;
            getContentPane().add(stopLabel, gridConstraints);
            elapsedLabel.setText("Elapsed Time (sec)");
            gridConstraints.gridx =1;
            gridConstraints.gridy = 2;
            getContentPane().add(elapsedLabel, gridConstraints);
            startTextField.setText("");
            startTextField.setColumns(15);
            gridConstraints.gridx = 2;
            gridConstraints.gridy = 0;
            getContentPane().add(startTextField, gridConstraints);
            stopTextField.setText("");
            stopTextField.setColumns(15);
            gridConstraints.gridx = 2;
            gridConstraints.gridy = 1;
            getContentPane().add(stopTextField, gridConstraints);
            elapsedTextField.setText("");
            elapsedTextField.setColumns(15);
            gridConstraints.gridx = 2;
            gridConstraints.gridy = 2;
           getContentPane().add(elapsedTextField, gridConstraints); pack();
           

            
         }
     private void startButtonActionPerformed(ActionEvent e) {
        // click of start timing button
        startTime = System.currentTimeMillis();
        startTextField.setText(String.valueOf(startTime));
        stopTextField.setText("");
        elapsedTextField.setText("");
        }

   private void stopButtonActionPerformed(ActionEvent e) {
// click of stop timing button
        stopTime = System.currentTimeMillis();
        stopTextField.setText(String.valueOf(stopTime)); elapsedTime =
        (stopTime - startTime) / 1000.0;
        elapsedTextField.setText(String.valueOf(elapsedTime)); 
        }
   private void exitButtonActionPerformed(ActionEvent e){
   System.exit(0);
   }
    private void exitForm(WindowEvent e)
    {
        System.exit(0);
    }

            
}


