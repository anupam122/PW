class Demo
{
   public static void main(String []args)
     {
       int age=18;
       if(age>=18 && age<60)
         {
            if(age>=20 && age<30)
              {
                System.out.println("you are in 20's");
               }
             else if(age>=31 && age<40)
               {
                 System.out.println("you are in 30's");
              else
                {
                  System.out.println("you are still teen");
                 }
           }
         else if(age>60)
           {
             System.out.println("you are an old");
            }
         else
           {
             System.out.println("you are still kid");
            }
        }
}