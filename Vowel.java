import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter charater to check vowel or Consonant:");
     String s=sc.next();
     sc.close();
     char ch=s.charAt(0);
     if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
     {
    	 System.out.println(ch+"  is Vowel.");
    	 
     }
     else
     {
    	 System.out.println("Consonant");
     }
     
	}

}
