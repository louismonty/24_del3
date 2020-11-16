package Controller;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class GUIController {

    private static GUI gui = new GUI();

    public static void showMessege(String message){
        gui.showMessage(message);
    }
    public static void showDice(int dice){
        gui.setDie(dice);
    }
    public static String twoButtons(String text,String button1,String button2){
        return gui.getUserButtonPressed(text,button1,button2);
    }
    public static String fourButtons(String text, String button1,String button2,String button3,String button4){
        return gui.getUserButtonPressed(text,button1,button2,button3,button4);
    }
    public static int intigerInput(String text,int min, int max){
        int input;
        while(true){
        input = gui.getUserInteger(text,min,max);
            if(min<input&& input>max){
               break;
            }
        }
        return input;
        }
    public static void placePlayer(int position, GUI_Player player){
        GUI_Field field[] = gui.getFields();
        field[position].setCar(player,true);
    }
    public static void movePlayer(int currentPlayerPosition,int move,GUI_Player player) {
        GUI_Field field[] = gui.getFields();
        field[currentPlayerPosition].setCar(player, false);
        field[(currentPlayerPosition + move) % 24].setCar(player, true);
    }

}
