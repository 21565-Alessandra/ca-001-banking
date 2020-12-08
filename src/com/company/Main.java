import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String userType;

        userType = JOptionPane.showInputDialog("Are you? \n E - Employee \n C - Customer");

        if(userType == "E"){
            String pin;
            pin = JOptionPane.showInputDialog("PIN: ");
        }

        if(userType == "C"){
            String firstName, lastName, accountNumber, pin;
            firstName = JOptionPane.showInputDialog("First Name: ");
            lastName = JOptionPane.showInputDialog("Last Name: ");
            accountNumber = JOptionPane.showInputDialog("Account Number: ");
            pin = JOptionPane.showInputDialog("PIN: ");
        }
    }
}
