package Sales;

import javax.swing.*;
import java.awt.*;

public class SalesPOSUI {
    public SalesPOSUI() {
        JFrame frame = new JFrame("Sales POS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 450);
        frame.setLayout(null);

        // Header Panel (Blue)
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(0, 0, 150)); // Dark Blue
        headerPanel.setBounds(20, 20, 500, 120);
        headerPanel.setLayout(null);
        frame.add(headerPanel);

        JLabel lblSales = new JLabel("Sales");
        lblSales.setForeground(Color.WHITE);
        lblSales.setBounds(10, 5, 100, 20);
        headerPanel.add(lblSales);

        // Labels for inputs
        String[] labels = {"Product Code", "ProductName", "Qty", "Price", "Amount"};
        int x = 20;
        for (String label : labels) {
            JLabel lbl = new JLabel(label);
            lbl.setForeground(Color.WHITE);
            lbl.setBounds(x, 30, 100, 20);
            headerPanel.add(lbl);
            x += 100;
        }

        // Input fields
        JTextField txtProductCode = new JTextField();
        txtProductCode.setBounds(20, 60, 80, 25);
        headerPanel.add(txtProductCode);

        JTextField txtProductName = new JTextField();
        txtProductName.setBounds(120, 60, 80, 25);
        headerPanel.add(txtProductName);

        JSpinner spnQty = new JSpinner();
        spnQty.setBounds(220, 60, 50, 25);
        headerPanel.add(spnQty);

        JTextField txtPrice = new JTextField();
        txtPrice.setBounds(290, 60, 80, 25);
        headerPanel.add(txtPrice);

        JTextField txtAmount = new JTextField();
        txtAmount.setBounds(390, 60, 80, 25);
        headerPanel.add(txtAmount);

        // Add Button
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(390, 90, 80, 25);
        headerPanel.add(btnAdd);

        // Right Panel (Total, Pay, Balance)
        int startY = 20;
        String[] rightLabels = {"Total", "Pay", "Balance"};
        JTextField[] rightFields = new JTextField[3];

        for (int i = 0; i < rightLabels.length; i++) {
            JLabel lbl = new JLabel(rightLabels[i]);
            lbl.setBounds(600, startY, 100, 25);
            frame.add(lbl);

            rightFields[i] = new JTextField();
            rightFields[i].setBounds(660, startY, 100, 25);
            frame.add(rightFields[i]);

            startY += 50;
        }

        frame.setVisible(true);
    }
}