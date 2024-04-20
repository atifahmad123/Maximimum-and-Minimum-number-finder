import javax.swing.JOptionPane;

public class Process {

    public static void main(String[] args) {
        int Number1, Number2;
        int maxLogic, minLogic;

        // Input dialog for the first number
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        // Convert the input to an integer
        Number1 = Integer.parseInt(input1);

        // Input dialog for the second number
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        // Convert the input to an integer
        Number2 = Integer.parseInt(input2);

        maxLogic = Math.max(Number1, Number2);
        minLogic = Math.min(Number1, Number2);

        // Display the results using message dialog boxes
        JOptionPane.showMessageDialog(null, "The maximum value between the two numbers is: " + maxLogic + "\nThe minimum value between the two numbers is: " + minLogic);
        
    }
}