package fundamentals;
import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        double basic;
        char grade;
        double totalSalary;
        
        Scanner s=new Scanner(System.in);
        basic=s.nextDouble();
        String str=s.next();
        grade=str.charAt(0);


        double hra,da,allow,pf;

        hra=basic*0.2;
        da=basic*0.5;
        pf=basic*0.11;

        if(grade=='A'){
            allow=1700;
        }else if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }

        totalSalary=basic+hra+da+allow-pf; 
        System.out.println(Math.round(totalSalary));
        s.close();
    }

}
