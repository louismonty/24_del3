package Controller;

import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class GUIController {



    public void showMessege(String message){
        //gui.showMessage(message);
    }
    public void showDice(int dice){
        //gui.setDie(dice);
    }
    public static void main(String[] args){
        GUI_Field[] fields = new GUI_Field[5];
        fields[0] = new GUI_Start("Start", "Modtag: 2", "Modtag  2 m,-\nnÃ¥r de passerer start", Color.RED, Color.BLACK);
        fields[1] = new GUI_Street("Gatekjøkkenet Burgerbaren", "Pris:  1", "Gatekjøkkenet Burgerbaren", "Leje:  1", new Color(156, 143, 56), Color.BLACK);
        fields[2] = new GUI_Street("Pizzahuset pizzeriaet", "Pris:  1", "Pizzahuset pizzeriaet", "Leje:  1", new Color(156, 143, 56), Color.BLACK);
        fields[3] = new GUI_Chance("?", "chance", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[4] =  new GUI_Street("Pizzahuset pizzeriaet", "Pris:  1", "Pizzahuset pizzeriaet", "Leje:  1", new Color(156, 143, 56), Color.BLACK);

        GUI gui = new GUI(fields);
    }


}
