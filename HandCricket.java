import java.util.*;
 public class HandCricket
{
    int temp=0,temp1=0;
    Scanner ob=new Scanner(System.in);
    int Run()
    {
        double randBot=(Math.random());
        int run;        
        if(randBot>0 && randBot<=0.16667)
        run=1;
        else
        if(randBot>1.6667 && randBot<=0.3333)
        run=2;
        else
        if(randBot>0.3333 && randBot<=0.5)
        run=3;
        else
        if(randBot>0.5 && randBot<=0.6667)
        run=4;
        else
        if(randBot>0.6667 && randBot<=0.8333)
        run=5;
        else
        run=6;
        temp1=run;
        
        return run;
    }
    
        int User()
        {
            System.out.println("Enter a number between 1-6");
            int num=ob.nextInt();
            temp=num;
            return num;
            //condition for not bw 1 and 6
        }
           
            
            
        
    void f()
    {
        
        System.out.println("Press 1 for batting");
        System.out.println("Press 2 for bowling");
        int sw=ob.nextInt();
        int count=0,countBot=0;      
        switch(sw)
        {
            case 1:
            {
                while(User()!=Run())
                {
                    count=count+temp;
                    System.out.println("User score is :"+count);
                }
                System.out.println("User OUT!Bot's turn");
                while(User()!=Run())
                {
                    countBot=countBot+temp1;
                    System.out.println("Bot score is :"+countBot);
                    if(countBot>count)
                    break;
                }
                System.out.println("Bot OUT!RESULTS ARE BELOW");
            }
            break;
            case 2:
            {
                while(User()!=Run())
                {
                    countBot=countBot+temp1;
                    System.out.println("Bot score is :"+countBot);
                }
                System.out.println("Bot OUT!User's turn");
                 while(User()!=Run())
                {
                    count=count+temp;
                    System.out.println("User score is :"+count);
                    if(countBot<count)
                    break;
                }
                System.out.println("User OUT!RESULTS ARE BELOW");
            }
            break;
            default:
            System.out.println("-----------------------");
        }
        
        if(count>countBot)
        System.out.println("User is winner");
        else if(count==countBot)
        System.out.println("DRAW");
        else
        System.out.println("Bot is winner");
        System.out.println("-------------------------------");
        
    }
}
                    
       
        
        
        