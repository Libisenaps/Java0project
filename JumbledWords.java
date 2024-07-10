import java.util.*;
public class JumbledWords{
    public static void main(String[] args){
        String[] words={"pencil","grain","dream","sugarcane"        ,"angle","control","word","random","memory","female"};
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        while (true){
            String word=words[r.nextInt(words.length)];
            char[] JumbledWords=JumbledWords(word);
            System.out.println("JumbledWords the word: " + new String(JumbledWords));
            String answer=sc.next().toLowerCase();
            if (answer.equals(word))
            {
                System.out.println("Correct!");
            }
            else 
            {
                System.out.println("Incorrect. The correct answer is " + word);
            }
        }
    }
    public static char[] JumbledWords(String word){
        char[] chars=word.toCharArray();
        Random r=new Random();
        for(int i=0;i<chars.length;i++)
        {
            int j=r.nextInt(chars.length);
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
        return chars;
    }
}

