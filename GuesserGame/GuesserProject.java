
import java.util.Scanner;

class Guesser{
    int gNum ;
    int numGuessing(){
        // Scanner sc=new Scanner(System.in);
        
        // System.out.print("Guesser! Kindly guess the number: ");
        // gNum=sc.nextInt();
        gNum=1+(int)(100*Math.random());
        return gNum;
    }
}

class Player{
    int pNum;
    int numGuessing(int i){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player"+i+"! Kindly guess the number in range 1 to 100: ");
        pNum=sc.nextInt();
        
        return pNum;

    }
}
class Umpire{
    int gNum;
    int p1Num;
    int p2Num;
    int p3Num;
    void numFromGuesser(){
        Guesser g=new Guesser();
        gNum=g.numGuessing();
        
    }
    void numFromPlayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        p1Num=p1.numGuessing(1);
        p2Num=p2.numGuessing(2);
        p3Num=p3.numGuessing(3);
    }
    void compare(){
        if(p1Num==gNum){
            if(p2Num==gNum&&p3Num==gNum){
                System.out.println("All players have won the game.");

            }else if(p2Num==gNum){
                System.out.println("Player1 and Player2 won the game.");
            }else if(p3Num==gNum){
                System.out.println("Player1 and Player3 ");
            }else{
                System.out.println("Player1 won the game.");
            }
        }else if(p2Num==gNum){
            if(p3Num==gNum){
                System.out.println("Player2 and Player3 won the game.");
            }else {
                System.out.println("Player2 won the game.");
            }
        }else if(p3Num==gNum){
            System.out.println("Player3 won the game.");
        }else{
            System.out.println("No one won the game.");
            System.out.println("Guesser number:"+gNum);
        }
    }
    
}
public class GuesserProject{
    public static void main(String[] args) {
        Umpire u=new Umpire();
        u.numFromGuesser();
        u.numFromPlayer();
        u.compare();
    }
}