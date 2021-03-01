package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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
@FXML RadioButton CxC;
@FXML Button btnStart;
boolean turno =false;
List<Button> llista_buttons;
int n = 9;

    public void clickButton(javafx.event.ActionEvent actionEvent) {


                            Button b = (Button) actionEvent.getSource();
                            System.out.println(b.getId());
                            if (!turno){
                            b.setText("X");
                            turno = true;
                            }else{
                                b.setText("O");
                                turno = false;
                            }
                            WinCondition();

    }


public void cleanGame(){
        btn01.setText(" ");
    btn02.setText(" ");
    btn03.setText(" ");
    btn04.setText(" ");
    btn05.setText(" ");
    btn06.setText(" ");
    btn07.setText(" ");
    btn08.setText(" ");
    btn09.setText(" ");
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
    public void ComputervsComputer(){
        llista_buttons = Arrays.asList(btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09);
        Random random = new Random();

        int i = random.nextInt(n--);
        for(int o =0; o<9;o++) {
            if (!turno) {
                llista_buttons.get(i).setText("X");
                turno = true;
                llista_buttons.remove(i);

            } else {
                llista_buttons.get(i).setText("O");
                turno = false;
                //llista_buttons.remove(i);
            }
            WinCondition();
        }

}
    public void pressStart(ActionEvent actionEvent) {
        cleanGame();
        if(CxC.isSelected()){

           ComputervsComputer();
        }
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

        if ((btn01.getText().equals("X") && btn02.getText().equals("X") && btn03.getText().equals("X")) ||
                (btn01.getText().equals("X") && btn04.getText().equals("X") && btn07.getText().equals("X")) ||
                (btn01.getText().equals("X") && btn05.getText().equals("X") && btn09.getText().equals("X")) ||
                (btn02.getText().equals("X") && btn05.getText().equals("X") && btn08.getText().equals("X")) ||
                (btn03.getText().equals("X") && btn06.getText().equals("X") && btn09.getText().equals("X")) ||
                (btn03.getText().equals("X") && btn05.getText().equals("X") && btn07.getText().equals("X")) ||
                (btn04.getText().equals("X") && btn05.getText().equals("X") && btn06.getText().equals("X")) ||
                (btn07.getText().equals("X") && btn08.getText().equals("X") && btn09.getText().equals("X"))) {

            System.out.println("Victoria de les X("+nj1.getText()+")");
            btn01.setDisable(true);
            btn02.setDisable(true);
            btn03.setDisable(true);
            btn04.setDisable(true);
            btn05.setDisable(true);
            btn06.setDisable(true);
            btn07.setDisable(true);
            btn08.setDisable(true);
            btn09.setDisable(true);
        } else {
            if ((btn01.getText().equals("O") && btn02.getText().equals("O") && btn03.getText().equals("O")) ||
                    (btn01.getText().equals("O") && btn04.getText().equals("O") && btn07.getText().equals("O")) ||
                    (btn01.getText().equals("O") && btn05.getText().equals("O") && btn09.getText().equals("O")) ||
                    (btn02.getText().equals("O") && btn05.getText().equals("O") && btn08.getText().equals("O")) ||
                    (btn03.getText().equals("O") && btn06.getText().equals("O") && btn09.getText().equals("O")) ||
                    (btn03.getText().equals("O") && btn05.getText().equals("O") && btn07.getText().equals("O")) ||
                    (btn04.getText().equals("O") && btn05.getText().equals("O") && btn06.getText().equals("O")) ||
                    (btn07.getText().equals("O") && btn08.getText().equals("O") && btn09.getText().equals("O"))) {
                System.out.println("Victoria de les O("+nj2.getText()+")");
                btn01.setDisable(true);
                btn02.setDisable(true);
                btn03.setDisable(true);
                btn04.setDisable(true);
                btn05.setDisable(true);
                btn06.setDisable(true);
                btn07.setDisable(true);
                btn08.setDisable(true);
                btn09.setDisable(true);
            }

        }
    }
}


