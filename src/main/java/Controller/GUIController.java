package Controller;

import Game.Player;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;



public class GUIController {
    private GUI_Field[] createFields() {
        GUI_Field[] fields = new GUI_Field[24];
        fields[0] = new GUI_Start("Start", "Modtag: 2 M", "Modtag kr. 2M,-\nnår de passerer start", Color.RED, Color.BLACK);
        fields[1] = new GUI_Street("Burgerbaren", "Pris:  1M", "Burgerbaren servere nogle mums burgere" , "Leje:  1M", new Color(255,165,0), Color.BLACK);
        fields[2] = new GUI_Street("Pizzahuset", "Pris:  1M", "Pizzahuset" , "Leje:  1M", new Color(255,165,0), Color.BLACK);
        fields[3] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[4] = new GUI_Street("Slikbutikken", "Pris:  1M", "Slikbutikken" , "Leje:  1M", new Color(75, 155, 225), Color.BLACK);
        fields[5] = new GUI_Street("Iskiosken", "Pris:  1M", "Iskiosken" , "Leje:  1M", new Color(75, 155, 225), Color.BLACK);
        fields[6] = new GUI_Jail("default", "Fængsel", "Fængsel", "På besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
        fields[7] = new GUI_Street("Museet", "Pris:  2M", "Museet" , "Leje:  2M", new Color(255,192,203), Color.BLACK);
        fields[8] = new GUI_Street("Biblioteket", "Pris:  2M", "Biblioteket" , "Leje:  2M", new Color(255,192,203), Color.BLACK);
        fields[9]= new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[10] = new GUI_Street("Skateparken", "Pris:  2M", "Skateparken" , "Leje:  2M", new Color(218,165,32), Color.BLACK);
        fields[11] = new GUI_Street("Swimmingpoolen", "Pris:  2M", "Swimmingpoolen" , "Leje:  2M", new Color(218,165,32), Color.BLACK);
        fields[12] = new GUI_Refuge("default", "Helle", "Helle", "Ta' en pause", Color.WHITE, Color.BLACK);
        fields[13] = new GUI_Street("Spillehallen", "Pris:  3M", "Spillehallen" , "Leje:  3M", new Color(255, 0, 0), Color.BLACK);
        fields[14] = new GUI_Street("Biografen", "Pris:  3M", "Biografen" , "Leje:  3M", new Color(255, 0, 0), Color.BLACK);
        fields[15] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[16] = new GUI_Street("Legetøjsbutikken", "Pris:  3M", "Legetøjsbuttikken" , "Leje:  3M", new Color(255, 255, 0), Color.BLACK);
        fields[17] = new GUI_Street("Dyrehandleren", "Pris:  3M", "Dyrehandleren" , "Leje:  3M", new Color(255, 255, 0), Color.BLACK);
        fields[18] = new GUI_Jail("default", "Gå i fængsel", "Gå i fængsel", "De fængsles", new Color(125, 125, 125), Color.BLACK);
        fields[19] = new GUI_Street("Bowlinghallen", "Pris:  4M", "Bowlinghallen" , "Leje:  4M", new Color(0,128,0), Color.BLACK);
        fields[20] = new GUI_Street("Zoo", "Pris:  4M", "Zoo" , "Leje:  4M", new Color(0,128,0), Color.BLACK);
        fields[21]= new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[22] = new GUI_Street("Vandland", "Pris:  5M", "Vandland" , "Leje:  5M", new Color(0, 0, 255), Color.BLACK);
        fields[23] = new GUI_Street("Strandpromenaden", "Pris:  5M", "Strandpromenaden" , "Leje:  5M", new Color(0, 0, 255), Color.BLACK);
        return fields;
    }

    public GUI_Player[] createplayer(Player[] currentplayer){
        GUI_Player[] players = new GUI_Player[currentplayer.length];
        GUI_Car[] cars =new GUI_Car[4];
        String[] types = {"CAR","RACECAR","UFO","TRACTOR"};
        for(int i = 0;i<currentplayer.length;i++ ) {
            cars[i] = new GUI_Car(currentplayer[i].getPlayerColor(), Color.BLACK, GUI_Car.Type.getTypeFromString(types[i]), GUI_Car.Pattern.HORIZONTAL_GRADIANT);
            players[i] = new GUI_Player(currentplayer[i].getPlayerName(),currentplayer[i].getPlayerAccount().getBalance(),cars[i]);
        }

        for(int i = 0;i<players.length;i++) {
            gui.addPlayer(players[i]);
        }
        return players;
    }
    //create gameboard
    GUI gui = new GUI(createFields());

    public GUI_Field field[] = gui.getFields();

    public void showMessege(String message){
        gui.showMessage(message);
    }
    public void showDice(int dice){
        gui.setDie(dice);
    }
    public void oneButton(String text,String button1){
        gui.getUserButtonPressed(text,button1);
    }
    public String twoButtons(String text,String button1,String button2){
        return gui.getUserButtonPressed(text,button1,button2);
    }
    public String fourButtons(String text, String button1,String button2,String button3,String button4){
        return gui.getUserButtonPressed(text,button1,button2,button3,button4);
    }
    public String fiveButtons(String text, String button1,String button2,String button3,String button4,String button5){
        return gui.getUserButtonPressed(text,button1,button2,button3,button4,button5);
    }
    public int intigerInput(String text,int min, int max){
        int input;
        while(true){
            input = gui.getUserInteger(text,min,max);
            if(min <= input&& input<=max){
                break;
            }
        }
        return input;
    }

    public String stringInput(String text){
        return gui.getUserString(text);
    }

    public void placePlayer(int position, GUI_Player player){
        field[position].setCar(player,true);
    }
    public void removePlayer(int position,GUI_Player player){
        field[position].setCar(player , false);
    }
    public void movePlayer(int currentPlayerPosition,int move,GUI_Player player) {
        field[currentPlayerPosition%24].setCar(player, false);
        field[(currentPlayerPosition + move) % 24].setCar(player, true);
    }
    public void makeOwner(int currentField,Color playerColor){// Color from player
        GUI_Ownable t = (GUI_Ownable)field[currentField];
        t.setBorder(playerColor);
    }
    public Boolean isFieldOwnebel(int playerPosition){
        if(field[playerPosition] instanceof GUI_Ownable){
            return true;
        }
        else{return false;}
    }
    public void showChanceCard(String text){
        gui.displayChanceCard(text);
    }
    public void updatePlayerBal(int bal, GUI_Player player){
        player.setBalance(bal);
    }
    public void removeCar(){

    }
    public boolean isInstanceOfField(int currentposition){
        return (field[currentposition] instanceof GUI_Street);
    }
    public void changeBalce(int bal ,GUI_Player player){
        player.setBalance(bal);
    }

}
