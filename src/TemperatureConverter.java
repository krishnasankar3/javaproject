import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TemperatureConverter {
    // Declare the GUI Elements
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JLabel lblKelvin;
    public static JTextField textKelvin;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;
    public static JButton btnCalculateKtoC;
    public static JButton btnCalculateKtoF;
    
    public static void main(String[] args) {
        // Set up the frame
        frmMain = new JFrame("Temperature Converter");
        frmMain.setSize(200, 250);
        frmMain.setLayout(new FlowLayout());
    
        // Create GUI Elements
        lblCelsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit:");
        textFahrenheit = new JTextField(10);
        lblKelvin = new JLabel("Kelvin:");
        textKelvin = new JTextField(10);
        btnCalculateCtoF = new JButton("Convert C to F");
        
        // Add ActionListener for Celsius to Fahrenheit conversion
        btnCalculateCtoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert C to F
                String cText = textCelsius.getText();
                double c = Double.parseDouble(cText);
                double f = (c * 9 / 5) + 32;
                textFahrenheit.setText(String.valueOf(f));
            }
        });
        
        btnCalculateFtoC = new JButton("Convert F to C");
        
        // Add ActionListener for Fahrenheit to Celsius conversion
        btnCalculateFtoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert F to C
                String fText = textFahrenheit.getText();
                double f = Double.parseDouble(fText);
                double c = (f - 32) * 5 / 9;
                textCelsius.setText(String.valueOf(c)); 
            }
        });

        btnCalculateKtoC = new JButton("Convert K to C");
        
        // Add ActionListener for Kelvin to Celsius conversion
        btnCalculateKtoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert K to C
                String kText = textKelvin.getText();
                double k = Double.parseDouble(kText);
                double c = k - 273.15;
                textCelsius.setText(String.valueOf(c)); 
            }
        });

        btnCalculateKtoF = new JButton("Convert K to F");
        
        // Add ActionListener for Kelvin to Fahrenheit conversion
        btnCalculateKtoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Convert K to F
                String kText = textKelvin.getText();
                double k = Double.parseDouble(kText);
                double f = (k - 273.15) * 9 / 5 + 32;
                textFahrenheit.setText(String.valueOf(f));
            }
        });
    
        // Add the GUI Elements to the frame
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(lblKelvin);
        frmMain.add(textKelvin);
        frmMain.add(btnCalculateCtoF);
        frmMain.add(btnCalculateFtoC);
        frmMain.add(btnCalculateKtoC);
        frmMain.add(btnCalculateKtoF);
        
        // Make the frame visible
        frmMain.setVisible(true);
    }
}
