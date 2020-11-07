/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;

/**
 * FXML Controller class
 *
 * @author Hifazz
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ColumnConstraints display;
    @FXML
    private Button Btn0;
    @FXML
    private TextArea TxtArea;
    @FXML
    private Button Btn3;
    @FXML
    private Button BtnBagi;
    @FXML
    private Button Btn6;
    @FXML
    private Button Btn7;
    @FXML
    private Button Btn8;
    @FXML
    private Button Btn9;
    @FXML
    private Button Btn4;
    @FXML
    private Button Btn5;
    @FXML
    private Button Btn1;
    @FXML
    private Button Btn2;
    @FXML
    private Button BtnEnter;
    @FXML
    private Button BtnClear;
    @FXML
    private Button BtnBintang;
    @FXML
    private Button BtnMin;
    @FXML
    private Button BtnPlus;
    
    private int angka1=0;
    private String operasi="netral"; 
    private int angka2=0;
    private int hasil;
    private String operator;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
        if(event.getSource() == Btn0){
           if(!TxtArea.getText().isBlank()){
               TxtArea.setText(TxtArea.getText() + "0");
           }
       }
        if(event.getSource() == Btn1){
            TxtArea.setText(TxtArea.getText() + "1");
        }else if(event.getSource() == Btn2){
            TxtArea.setText(TxtArea.getText() + "2");
        }else if(event.getSource() == Btn3){
            TxtArea.setText(TxtArea.getText() + "3");
        }else if(event.getSource() == Btn4){
            TxtArea.setText(TxtArea.getText() + "4");
        }else if(event.getSource() == Btn5){
            TxtArea.setText(TxtArea.getText() + "5");
        }else if(event.getSource() == Btn6){
            TxtArea.setText(TxtArea.getText() + "6");
        }else if(event.getSource() == Btn7){
            TxtArea.setText(TxtArea.getText() + "7");
        }else if(event.getSource() == Btn8){
            TxtArea.setText(TxtArea.getText() + "8");
        }else if(event.getSource() == Btn9){
            TxtArea.setText(TxtArea.getText() + "9");
        }
        else if(event.getSource() == BtnClear){
            TxtArea.setText("");
        }else if(event.getSource() == BtnPlus){
            angka1 = Integer.parseInt(TxtArea.getText());
            operasi="plus";
            TxtArea.setText("");
        }else if (event.getSource() == BtnMin) {
            angka1 = Integer.parseInt(TxtArea.getText());
            operasi = "minus";
            TxtArea.setText("");
        }else if (event.getSource() == BtnBintang) {
            angka1 = Integer.parseInt(TxtArea.getText());
            operasi = "kali";
            TxtArea.setText("");
        }else if (event.getSource() == BtnBagi) {
            angka1 = Integer.parseInt(TxtArea.getText());
            operasi = "bagi";
            TxtArea.setText("");
        }else if (event.getSource() == BtnEnter) {
            angka2 = Integer.parseInt(TxtArea.getText());
            if (operasi.equals("plus")) {
            hasil = angka1 + angka2;
            operator ="+";
            }
            if (operasi.equals("minus")) {
            hasil = angka1 - angka2;
            operator ="-";
            }
            if (operasi.equals("kali")) {
            hasil = angka1 * angka2;
            operator ="*";
            }
            if (operasi.equals("bagi")) {
            hasil = angka1 / angka2;
            operator ="/";
            }
            //TxtArea.setText(String.valueOf(angka1+" "+operator+" "+angka2+" = "+hasil));
            TxtArea.setText(String.valueOf(hasil));
            operasi = "netral";
            }
    }
}
