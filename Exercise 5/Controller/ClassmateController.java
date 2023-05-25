package Controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {

    @FXML
    ImageView img1, img2;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    cal cal = new cal();
    celine celine = new celine();
    darrel darrel = new darrel();
    jas jas = new jas();
    jiu jiu = new jiu();

    public void initialize() {

        cal.setmbti("INFJ");
        cal.setzodiacSign("Pisces");
        cal.setAge("19");
        cal.sethobbies("Playing roblox");
        
        celine.setmbti("ISTJ");
        celine.setzodiacSign("Sagittarius");
        celine.setAge("19");
        celine.sethobbies("Designing, sketching, Watch Tiktok");

        darrel.setmbti("ESFP");
        darrel.setzodiacSign("Gemini");
        darrel.setAge("19");
        darrel.sethobbies("mag alaga ng elephant, playing instrument while sleeping");

        jas.setmbti("INFP");
        jas.setzodiacSign("Aries");
        jas.setAge("20");
        jas.sethobbies("watching films, drawing, reading, gaming");

        jiu.setmbti("INFJ");
        jiu.setzodiacSign("Capricorn");
        jiu.setAge("19");
        jiu.sethobbies("anything related to the arts");
    }


        public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Cal is " + cal.getAge() + "years old" + cal.getmbti() + "and a "+ cal.getzodiacSign()+ " who has a hobby of " + cal.gethobbies() );
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Celine is " + celine.getAge() + "years old" + celine.getmbti() + "and a "+ celine.getzodiacSign()+ " who has a hobby of " + celine.gethobbies() );
        }
        
        if (sourceButton.equals(btn2)) {
            alert.setContentText("Darrel is " + darrel.getAge() + "years old" + darrel.getmbti() + "and a "+ darrel.getzodiacSign()+ " who has a hobby of " + darrel.gethobbies() );
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Jas is " + jas.getAge() + "years old" + jas.getmbti() + "and a "+ jas.getzodiacSign()+ " who has a hobby of " + jas.gethobbies() );
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Jiu is " + jiu.getAge() + "years old" + jiu.getmbti() + "and a "+ jiu.getzodiacSign()+ " who has a hobby of " + jiu.gethobbies() );
        }

        alert.showAndWait();
    }
}
    



