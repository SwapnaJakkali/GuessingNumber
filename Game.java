import java.util.*;
public class Game {
    public static int genarateRandNumber(){
        int min=1;
        int max=100;
        Random random = new Random();
        int randNumber;
        randNumber = random.nextInt((max-min)+1)+min;
        return randNumber;
    }

    public static void runGuess(){
        Scanner sc= new Scanner(System.in);
        int secreteNum = genarateRandNumber();

        while(true){
        System.out.print("Guess a number: ");
        int userNum=sc.nextInt();

        String hint=hintGive(userNum,secreteNum);
        if(hint.equals("Right")){
            System.out.println("you are guessed RIGHT!!!...");
            break;
        }else{
            System.out.println(hint);
        }
    }
        sc.close(); 
    }

    public static String hintGive(int guessNum,int secreteNum){
        if ((guessNum>=secreteNum+10)||(guessNum<=secreteNum-10)){
            return "Cold";
        }else if (guessNum==secreteNum){
            return "Right";
        }else{
            return "Hot";
        }
    }
    public static void main(String[] args){
        runGuess();
    }
}

