import java.util.Random;
import java.util.Scanner;
public class MathGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Math Challenge!");
        int score=0;
        int level=1;
        while(true){
            int num1=r.nextInt(10) + 1;
            int num2=r.nextInt(10) + 1;
            int operation=r.nextInt(3);
            int answer;
            String symbol;
            switch(operation){
                case 0:
                    answer=num1+num2;
                    symbol="+";
                    break;
                case 1:
                    answer=num1-num2;
                    symbol="-";
                    break;
                case 2:
                    answer=num1*num2;
                    symbol="*";
                    break;
                default:
                    answer=0;
                    symbol="";
                    break;
            }
            System.out.println("Level " + level + ": " + num1 + " " + symbol + " " + num2 + " =?");
            int userAnswer=sc.nextInt();
            if(userAnswer==answer){
                System.out.println("Correct!");
                score++;
                level++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answer + ".");
                System.out.println("Your final score is " + score + ".");
                break;
            }
        }
    }
}
