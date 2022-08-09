import java.util.*;
import java.util.Random;
public class Prob10_game{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<WELCOME TO MY STONE PAPER SCISSORS GAME>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	Random random = new Random();

    int a=random.nextInt(3);
	int number,rock,paper,scissors;
	System.out.println("ENTER A NUMBER\n1for rock\n2forpaper\n3forscissors");
    number =sc.nextInt();
    switch(number)
    {
    	case 1: 
    	    System.out.println("you choosed rock");
    	    break;
    	case 2:
    	    System.out.println("you chossed paper");
    	    break;
    	case 3:
    	    System.out.println("you chossed scissors");
    	    break;
    	default :
    		System.out.println("wrong input");
    		break;
	}
	if(a==0)
	{
        System.out.println("COMPUTER HAS GONE MADE HE CHOOSED 0 PLEASE RESTART.HE HAD GIVEN");     
    }
	else if(a==1&&number==1|| a==2 &&number==2 || a==3 && number==3){
		System.out.println("Tie");
	}	
	else if(a==1&&number==2){
    	System.out.println("you are a winner ");	
    }
	else if(a==1&&number==3){
	    System.out.println("you are a winner ");
	}
	else if(a==2&&number==1){
		System.out.println("you are a loser ");	
	}
	else if(a==2&&number==3){
		System.out.println("you are aWinner ");	
	}
	else if(a==3&&number==1){
		System.out.println("you are aWinner ");	
	}
	else if(a==3&&number==2){
		System.out.println("you are a loser ");	
	}
	else{
	    System.out.println("WRONG INPUT");			
	}
	System.out.println("computer choosed "+a);	
    switch(a)
    {
    	case 1:
    	    System.out.println("Computer choosed rock");
    	    break;
    	case 2:
    	    System.out.println("Computer chossed paper");
    	    break;
    	case 3:
    	    System.out.println("Computer chossed scissors");
    	    break;
    	default:
    		System.out.println("wrong input");
    		break;
        }
	}
}