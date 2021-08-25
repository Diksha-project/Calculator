import java.util.*;

public class Calculator{
public static void main (String args[]){
System.out.println("Enter your first no");
Scanner sc = new Scanner(System.in);
Float a=sc.nextFloat();
Float b;

System.out.println("Enter your operator");
char ch = sc.next().charAt(0);

while(ch!='='){
switch(ch){
  case '+':
    
    System.out.println("Enter your next no");
    b = sc.nextFloat(); 
    a=a+b;
    break;

    case '-':
      
    System.out.println("Enter your next no");
     b = sc.nextFloat(); 
    a=a-b;
    break;

    case '*':
    System.out.println("Enter your next no");
    b = sc.nextFloat(); 
    a=a*b;
    break;

    case '/':
    System.out.println("Enter your next no");
    b = sc.nextFloat(); 
    a= a/b;
    break;
}

System.out.println("Enter your operator");
 ch = sc.next().charAt(0);
 if (ch=='=')
 break;

 }

System.out.println(a);
}
}