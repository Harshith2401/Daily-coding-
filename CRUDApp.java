package App_GUI;
	
import User_DAOHandler.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDApp extends JFrame {

    private JTextField txtId, txtName, txtEmail, txtPhoneno;
    private JButton btnAdd, btnUpdate, btnDelete, btnClear;
    private UserDAO userDAO;

    public CRUDApp() {
        userDAO = new UserDAO();
        setTitle("JDBC CRUD Application");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 5, 5));

        // Labels and text fields
        add(new JLabel("ID:"));
        txtId = new JTextField();
        add(txtId);

        add(new JLabel("Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Email:"));
        txtEmail = new JTextField();
        add(txtEmail);

        add(new JLabel("Phoneno:"));
        txtPhoneno = new JTextField();
        add(txtPhoneno);

        // Buttons
        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClear = new JButton("Clear");

        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
        add(btnClear);

        // Button actions
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String email = txtEmail.getText();
                String phonenoStr = txtPhoneno.getText();

                if (name.isEmpty() || email.isEmpty() || phonenoStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all fields.");
                    return;
                }

                try {
                    long phoneno = Long.parseLong(phonenoStr);

                    if (userDAO.insertUser(name, email, phoneno) > 0) {
                        JOptionPane.showMessageDialog(null, "User added successfully!");
                        clearFields();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error adding user.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid phoneno.");
                }
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(txtId.getText());
                    String name = txtName.getText();
                    String email = txtEmail.getText();
                    String phonenoStr = txtPhoneno.getText();

                    if (name.isEmpty() || email.isEmpty() || phonenoStr.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all fields.");
                        return;
                    }

                    long phoneno = Long.parseLong(phonenoStr);

                    if (userDAO.updateUser(id, name, email, phoneno) > 0) {
                        JOptionPane.showMessageDialog(null, "User updated successfully!");
                        clearFields();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error updating user.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid values for ID and phoneno.");
                }
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(txtId.getText());

                    if (userDAO.deleteUser(id) > 0) {
                        JOptionPane.showMessageDialog(null, "User deleted successfully!");
                        clearFields();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error deleting user.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid ID.");
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private void clearFields() {
        txtId.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtPhoneno.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CRUDApp().setVisible(true);
        });
    }
}
