import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.Label;


public class logincontroller {


 @FXML

 TextField mytextfield;

 @FXML

 PasswordField mypasswordfield;


 @FXML

 Button mybutton;
    Label mywarninglabel; 

 public void login(ActionEvent event) throws IOException{

    String username = mytextfield.getText();
    String password = mypasswordfield.getText();

 System.out.println(username);
 System.out.println(password);

        if (username.equals("thea") && password.equals("password")  ){
            Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } else {
            mywarninglabel.setVisible(true);
        }
}

}