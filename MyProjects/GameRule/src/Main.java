import javax.swing.text.MutableAttributeSet;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static String[] chess = new String[54];
    public static String[] colors = {"Grey","Red","Blue","Gold"};
    public static String winColor = "";

    public static int cash = 500;


    public static void main(String[] args) {
        create();

        System.out.println("ВВедите вашу ставку, " +
                "\n1 - х2 \n2 - x3 \n3 - x5 \n4 - x50" +
                "\nСТОП 0");
        int uprav = in.nextInt();

        while (uprav != 0){

            int num = (int) Math.round(Math.random()*55);


            for (int i = 0; i < 4; i++){
                if(chess[num].equals(colors[i])) winColor = colors[i];
            }
            System.out.println("Выпало: " + num + " " + winColor );

            if(isWin(num,uprav)) System.out.println("ТЫ ПОБЕДИЛ");

            else System.out.println("Проигрыш");




            System.out.println("ВВедите вашу ставку, " +
                    "\n1 - х2 \n2 - x3 \n3 - x5 \n4 - x50" +
                    "\nСТОП 0");
            uprav = in.nextInt();
        }


    }

    public static boolean isWin(int num, int chois)
    {

        return chess[num].equals(colors[chois-1]);
    }

    public static void logic(){
        int num = (int) Math.round(Math.random()*55);
        System.out.println(num);
    }
    public static void printChess(){


        for(String arg : chess)
        {
            System.out.println(arg);
        }
    }
    public static void create(){
        int[] num =  {1,9,11,19,21,33,35,43,45,53};
        Arrays.fill(chess,"Red");
        chess[0] = "Gold";
        for (int i = 1; i < chess.length; i++)
        {
            for (int arg : num){
                if(i == arg){ chess[i] = "Blue";break;}
            }
            if( i % 2 == 0) chess[i] = "Grey";
        }

    }

}

