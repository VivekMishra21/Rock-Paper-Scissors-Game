import java.util.Random;
import java.util.Scanner;

public class Game {

    public void gameStart(){

        Scanner s=new Scanner(System.in);
        Random r=new Random();


        int i=0;
        while(i<5){

        System.out.println(" Lets Begin a Game :");
        System.out.println(" Press 1 : Rock , Press 2 : Paper , Press 3 : Scissors");
        System.out.println(" Select one choice : ");

        int playerchoice =s.nextInt();
        System.out.println(" Your choice is : " + " " + playerchoice);


        int computerChoice =r.nextInt(3)+1;


        System.out.println(" Press 1 : Rock , Press 2 : Paper ,Press 3 : Scissors");
        System.out.println(" Select one choice :");
        System.out.println(" Computer Choice is  :"+ " " + computerChoice);

        if(playerchoice==computerChoice) {
            System.out.println( "Game tie ");
        }else if((playerchoice==1 && computerChoice ==3) || (playerchoice==2 && computerChoice ==1) || (playerchoice==3 && computerChoice ==2)
       ){
            System.out.println( "You Win ");
        }else{
            System.out.println("Computer Win");
        }
           i++;
    }


}}
