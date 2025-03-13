public class All{
    public static void main(String[] args){
        System.out.println("Hello World!");
        
        int myNum = 5;
        System.out.println(myNum);
        
        char myLetter = 'A';
        System.out.println(myLetter);
        
        float myFloat = 5.578f;
        System.out.println(myFloat);
        
        double myDouble = 5.678d;
        System.out.println(myDouble);
        
        String name = "ishu";
        System.out.println(name);
        
        System.out.println(5>1);
        
        
        String firstName = "ishu";
        String lastName =  "grey";
        String fullName = firstName + lastName ;
        System.out.println( fullName);
        
        int x = 5;
        x += 6;
        System.out.println(x);
         
        int y = 10%3;
        System.out.println(y);
        
        byte myByte  = 100;
        System.out.println(myByte);
        
        long t1 = 1234567890987l;
        System.out.println(t1);
        
         boolean isjavaFun = false;
         System.out.println(isjavaFun);
         
         char var1 = 108,var2 = 87,var3 = 86;
         System.out.println(var1);
         System.out.println(var2);
         System.out.println(var3);
         
          //creating different type of data
         int Items = 50;
         float priceperItem = 20.25f;
         float totalCost = Items * priceperItem;
         String Currency = "ksh";
         System.out.println("Total cost ="+ totalCost + Currency);
         
         int myInt = 9;
         double myDouble1 = myInt;
         System.out.println(myInt);
         System.out.println(myDouble1);
         
         double myDouble2 =4.5778;
         int myNum2 = (int)myDouble2;
         System.out.println(myNum2);
         System.out.println(myDouble2);
         
      //real life examples
         int maxScore = 500;
         int userScore = 428;
         float percentage = (float)userScore/maxScore*100.0f;
         System.out.println("user's percent is " + percentage);
         
         int sum1 = 100+50;
         int sum2 = sum1 + 50;
         int sum3 = sum2 + 50;
         System.out.println(sum3);
         
         int s =5;
         ++s;
         System.out.println(s);
         
         int s2= 8;
         --s2;
         System.out.println(s2);
         
         int x2 = 5;
         x2*=3;
         System.out.println(x2);
         
         int x3=15;
         x3/=3;
         System.out.println(x3);
         
         int x4=36;
         x4%=5;
         System.out.println(x4);
         
         int x5 =30;
         x5&= 3;
         System.out.println(x5);
         
         int x6 = 10;
         x6|= 2;System.out.println(x6);
         
         int x7= 30;
          x7^=3;
          System.out.println(x7);
          
          int x8 = 52;
          x8 >>=5;
          System.out.println(x8);
          
          int x9 = 10;
          x9<<= 5;
          System.out.println(x9);
          
          
           final int x10 = 10;      
           if (x10>10) {
        	   System.out.println("failed");
        	   }
        	   else{
        		   System.out.println("success");
        	   }

         int d =10;
         d++;
         System.out.println(d);
         int d2 =10;
         System.out.println((++d2));
         
      boolean f=true;
      boolean z = false;
         System.out.println(f&&z);
        
       int r1 = 10;
        System.out.println(r1 < 15 && r1 <31); 



        //converting string to  integers
         String n1 = "20";
         String n2 = "15";
         
         int g1 =Integer.parseInt(n1);
         int g2= Integer.parseInt(n2);
 
        System.out.println(g1+g2);
        System.out.println(n2);
        
        
        int a4= 15;
        int b4= 20;
        int e4= 25;
        
        System.out.println(a4>b4 );
        System.out.println(e4==b4);
        System.out.println(a4!= e4);
        
        int l = 67;
        System.out.println(l > 77 || l > 43 );
        int q =  80;
        System.out.println (!(q > 3 && q < 100));

        //java string
   String txt1 = "qwertyuiopasdfghjkl";
   System.out.println(txt1.length());
   
 String txt2 = "hello  ishu";
 System.out.println(txt2.toUpperCase());
 System.out.println(txt2.toLowerCase());



    }
}
