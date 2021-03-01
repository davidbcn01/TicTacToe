package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {
@FXML Button btn01;
@FXML Button btn02;
@FXML Button btn03;
@FXML Button btn04;
@FXML Button btn05;
@FXML Button btn06;
@FXML Button btn07;
@FXML Button btn08;
@FXML Button btn09;
@FXML RadioButton HxH;
@FXML Text j1;
@FXML Text j2;
@FXML TextField nj1;
@FXML TextField nj2;
@FXML RadioButton CxH;
@FXML Button btnStart;


    public void clickButton(javafx.event.ActionEvent actionEvent) {

                            System.out.println("Click");
                            Button b = (Button) actionEvent.getSource();
                            b.setText("X");
                            WinCondition();

    }






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    //btn01.setText("BTN");
    }

    public void clickClose(ActionEvent actionEvent) {
        System.out.println("Hola");
    }

    public void clickHxH(ActionEvent actionEvent) {
        if (HxH.isSelected()){
            clean();
            j1.setVisible(true);
            nj1.setVisible(true);
            j2.setVisible(true);
            nj2.setVisible(true);
            btnStart.setVisible(true);
        }
    }

    public void clickCxH(ActionEvent actionEvent) {
        if(CxH.isSelected()){
            clean();
            j1.setVisible(true);
            nj1.setVisible(true);
            btnStart.setVisible(true);
        }
    }

    public void clickCxC(ActionEvent actionEvent) {
        clean();
        btnStart.setVisible(true);
    }
    public void clean(){
        j1.setVisible(false);
        nj1.setVisible(false);
        j2.setVisible(false);
        nj2.setVisible(false);
        btnStart.setVisible(false);
    }

    public void pressStart(ActionEvent actionEvent) {
        btn01.setDisable(false);
        btn02.setDisable(false);
        btn03.setDisable(false);
        btn04.setDisable(false);
        btn05.setDisable(false);
        btn06.setDisable(false);
        btn07.setDisable(false);
        btn08.setDisable(false);
        btn09.setDisable(false);

    }

    public void WinCondition () {

        if ((btn01.equals("X") && btn02.equals("X") && btn03.equals("X")) || (btn01.equals("X") && btn04.equals("X") && btn07.equals("X")) || (btn01.equals("X") && btn05.equals("X") && btn09.equals("X")) || (btn02.equals("X") && btn05.equals("X") && btn08.equals("X")) || (btn03.equals("X") && btn06.equals("X") && btn09.equals("X")) || (btn03.equals("X") && btn05.equals("X") && btn07.equals("X")) || (btn04.equals("X") && btn05.equals("X") && btn06.equals("X")) || (btn07.equals("X") && btn08.equals("X") && btn09.equals("X"))) {

            System.out.println("Victoria de les X");

        } else {
            if ((btn01.equals("O") && btn02.equals("O") && btn03.equals("O")) || (btn01.equals("O") && btn04.equals("O") && btn07.equals("O")) || (btn01.equals("O") && btn05.equals("O") && btn09.equals("O")) || (btn02.equals("O") && btn05.equals("O") && btn08.equals("O")) || (btn03.equals("O") && btn06.equals("O") && btn09.equals("O")) || (btn03.equals("O") && btn05.equals("O") && btn07.equals("O")) || (btn04.equals("O") && btn05.equals("O") && btn06.equals("O")) || (btn07.equals("O") && btn08.equals("O") && btn09.equals("O"))) {
                System.out.println("Victoria de les O");
            }

        }
    }
}
