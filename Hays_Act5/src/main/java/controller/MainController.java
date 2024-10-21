package controller;

import com.perlas.perlas.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainController {

    @FXML
    private TextField firstName;

    @FXML TextField middleName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField  email;

    @FXML
    private TextField address;

    @FXML
    private RadioButton radiobtn_male;

    @FXML
    private RadioButton radiobtn_female;

    private DatabaseConnection connection;

    public void initialize(){
        connection = new DatabaseConnection();
    }

    @FXML
    private void save() throws SQLException {
        String sql = "INSERT INTO students(first_name, middle_name, last_name, phone_number, email, address, gender) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = connection.connection.prepareStatement(sql);
        stmt.setString(1, firstName.getText());
        stmt.setString(2, middleName.getText());
        stmt.setString(3, lastName.getText());
        stmt.setString(4, phoneNumber.getText());
        stmt.setString(5, email.getText());
        stmt.setString(6, address.getText());



        String gender = "";
        if (radiobtn_male.isSelected()) {
            gender = "Male";
        } else if (radiobtn_female.isSelected()) {
            gender = "Female";
        }
        stmt.setString(7, gender);
        stmt.execute();
    }



}

