import java.util.Scanner;

public class PrimeNumber {
	void accept()
	   {
		   System.out.print("Enter the number :");
		   Scanner n=new Scanner(System.in);
		   
		   int a=n.nextInt();
		   int i,m,flag;
		   m=a/2;
		   flag=0;
		   if(a==0||a==1)
		   {  
			   System.out.println(a+" is not a prime number");      
			  }
		   else	  
			  {  
			   for(i=2;i<=m;i++)
			   {      
			    if(a%i==0)
			    {      
			     System.out.println(a+" is not a prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  
			   { System.out.println(a+" is a prime number");
			   }  
			   }
			   }
	
	public static void main(String []args)
	{ PrimeNumber b=new PrimeNumber();
	b.accept();
}
}
