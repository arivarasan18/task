

package com.branching;

public class Qn1 { // to print 10 to 50

	public static void main(String[] args) {
		

		for (int i=10;i<51;i++) { //condition
			System.out.println( i); // 
			}
	}

}


package com.branching;

public class Task1 {//to find the given num is positive or negative

	public static void main(String[] args) {
		// 
		int num=165;
		//
		if (num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}

	}

}



package com.util.scanner;

public class Qn3 {
          // java main method
	public static void main(String[] args) {
		

		int i=876;          // initialization
	 for (i=876;i>875;i=i-198); // condition
	 
	 System.out.println(i);  //
	}


package com.branching;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("1");
        a = sc.nextInt();
        System.out.println("105");
        b = sc.nextInt();
        System.out.println("100");
        c = sc.nextInt();
        if(a < b && a < c)
        {
            System.out.println("The smallest number is:"+a);
        }
        else if(b < c)
        {
            System.out.println("The smallest number is:"+b);
        }
        else
        {
            System.out.println(" The smallest number is:"+c);
        }
	}

}


package com.branching;
 
import java.util.Scanner;

public class Discount
{
   public static void main(String[] args)
   {
      float totalCost, costToPaid, discount;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("450");
      totalCost = sc.nextFloat();
      
      if(totalCost<=500)
      {
         costToPaid = totalCost;
         System.out.println("there is no discount to apply.");
      }
      else if(totalCost>500 && totalCost<=1000)
      {
         discount = (totalCost*10)/100;
         costToPaid = totalCost - discount;
         
         System.out.println(costToPaid);
      }
      else if(totalCost>1500)
      {
         discount = (totalCost*20)/100;
         costToPaid = totalCost - discount;
         
         System.out.println("the cost to be paid is:"+costToPaid);
      }
     
   } 
}


package com.branching;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=55555;
		int y=11111;
		
		for (int z=1;z<=5;z++);{
			System.out.println(x);
			x=x-y;
			y=y/10;
		}

	}

}


