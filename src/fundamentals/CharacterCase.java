package fundamentals;
import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char ch=str.charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println(1);
        }else if(ch>=95 && ch<=122){
            System.out.println(0);
        }else{
            System.out.print(-1);
        }
        s.close();
    }
}
