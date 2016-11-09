
import java.io.*;
import java.util.*;

public class thekartik
{
  int amt=0,choice=0; double finalamt,amount=0.0d;long fw; String vlad;
Scanner s=new Scanner(System.in);
public  void reservation(int ee)
{
        double price=0.0d;
        double number=0.0d;int k=0;
        switch(ee)
        {
            case 1:
            System.out.println("You have selected the premier rooms");
            System.out.println("1.Single bed rooms");
            System.out.println("2.Double bed rooms");
            System.out.println("3.Queen bed rooms");
            System.out.println("4.King bed rooms");
            System.out.println("enter 1,2,3,4 as your choice input");
            System.out.println("Select the type of room you prefer");
            int f=s.nextInt();
                switch(f)
            {
                case 1:
                System.out.println("You have selected Single bed rooms");
                System.out.println("Enter number of guests including you");
                k=s.nextInt();
                vlad="premier Single bed rooms";
                if(k==1)
                number=1;
                else if(k>1)
                number=k;
                System.out.println("Price for each room(per night) :Rs.1200");
                price=number*1200;
                break;
                
                case 2:
                System.out.println("You have selected Double bed rooms");
                System.out.println("Enter number of guests including you");
                k=s.nextInt();
                vlad="premier Double Bed Rooms";
                if(k<=3)
                number=1;
                if(k>3)
                number=k;
                System.out.println("Price for each room(per night) :Rs.2000");
                price=number*2000;
                break;
                
                case 3:
                System.out.println("You have selected Queen bed rooms");
                System.out.println("Enter number of guests including you");
                k=s.nextInt();
                vlad="premier Queen Bed Rooms";
                if(k<=3)
                number=1;
                if(k>3)
                number =Math.round(k/2);
                System.out.println("Price for each room(per night) :Rs.3000");
                price=number*3000;
                break;
                
                case 4:
                System.out.println("You have selected King bed rooms");
                System.out.println("Enter number of guests including you");
                k=s.nextInt();
                vlad="premier king bed rooms";
                if(k<=3)
                number=1;
                if(k>3)
                number=k;
                
                System.out.println("Price for each room(per night) :Rs.4000");
                price=number*4000;
                break;
            }
            System.out.print(price);
               break; 
               
               case 2:
               System.out.println("You have selected Premium suits");
               System.out.println("1.Club suits");
               System.out.println("2.Turret suits");
               System.out.println("enter 1,2 as your choice input");
               System.out.println("Select your room preference");
               int g=s.nextInt();
               
               switch(g)
               {
                   case 1:
                   System.out.println("You have selected Club suits");
                   System.out.println("Enter number of guests including you");
                   k=s.nextInt();
                   vlad="Premium Club suits";
                   if(k<=3)
                   number=1;
                   if(k>3)
                   number=k;
                   System.out.println("Price for each room(per night) :Rs.9000");
                   price=number*9000;
                   break;
                   
                   case 2:
                   System.out.println("You have selected Turret suits");
                   System.out.println("Enter number of guests including you");
                   k=s.nextInt();
                   vlad="Premium Turret suits";
                   if(k<=3)
                   number=1;
                   if(k>3)
                   number=k;
                   System.out.println("Price for each room(per night) :Rs.11000");
                   price=number*11000;
                   break;
                }
               System.out.println(price);
               break;
               
               case 3:
               System.out.println("You have selected Royal suits");
               System.out.println("1.Pristine suit");
               System.out.println("2.Penthouse suit");
               System.out.println("enter 1,2 as your choice input");
               System.out.println("Select your room preference");
               int h=s.nextInt();
               
               switch(h)
               {
                   case 1:
                   System.out.println("You have selected Pristine suits");
                   System.out.println("Enter number of guests including you");
                   k=s.nextInt();
                   vlad="Royal Pristine suits";
                   if(k<=3)
                   number=1;
                   if(k>3)
                   number=k;
                   System.out.println("Price for each room(per night) :Rs.15000");
                   price=number*15000;
                   break;
                   
                   case 2:
                   System.out.println("You have selected Penthouse suits");
                   System.out.println("Enter number of guests including you");
                   k=s.nextInt();
                   vlad="Royal penthouse suits";
                   if(k<=3)
                   number=1;
                   if(k>3)
                   number=k;
                   System.out.println("Price for each room(per night) :Rs.17500");
                   price=number*17500;
                   break;
                }
                System.out.println(price);
                break;
                
                case 4:
                System.out.println("You have selected King suits");
                System.out.println("1.Ministeral suits");
                System.out.println("2.Emperical suits");
                System.out.println("enter 1,2 as your choice input");
                System.out.println("Select your room preference");
                int i=s.nextInt();
                
                switch(i)
                {
                    case 1:
                    System.out.println("You have selected Ministeral suits");
                    System.out.println("Enter number of guests including you");
                   k=s.nextInt();
                   vlad="king minsteral suits";
                   if(k<3)
                   number=1;
                   else if(k>3)
                   number=k;
                    System.out.println("Price for each room(per night) :Rs.25000");
                    price=number*25000;
                    break;
                    
                    case 2:
                    System.out.println("You have selected Emperical suits");
                    System.out.println("Enter number of guests including you");
                   k=s.nextInt();
                   vlad="king Emperical suits";
                   if(k<3)
                   number=1;
                   else if(k>3)
                   number=k;
                   
                    System.out.println("Price for each room(per night) :Rs.35000");
                    price=number*35000;
                    break;
                }
                System.out.println("Amount for each day="+price);
                break;
                
            }
            amount=price;
            
        }
    
       
    
   public void availability(int ju)
{
 
int bed4[]={1401,1402,1403,1404,1405,1406,1407};
int bed3[]={1301,1302,1303,1304,1306,1307,1309};
int bed2[]={1201,1202,1203,1204,1208,1209,1211};
int bed1[]={1101,1102,1103,1104,1111,1116,1118};
int yu,de=0;
long aa=0,ab=0,ac=0,ad=0;
int rb,yut=0;
if(ju==4)
    {
        
        for(yu=0;yu<=6;yu++)
        {
            de=bed4[yu];
            System.out.println("Rooms available");
            System.out.println(de);
            System.out.println();
        }
        System.out.println("Do you require multiple rooms? enter 1 for yes and 2 for no");
         amt=s.nextInt();
        if(amt==1)
        {
            System.out.println("please enter 1 2 3 4 5 6 as your choice input");
         System.out.println("if you prefer only one room enter same number continuously");
         yut=4;
        int yr=s.nextInt();
        int ys=s.nextInt();
        int yt=s.nextInt();
        int yq=s.nextInt();
        switch(yr)
        {
            case 1:fw=bed4[0];
            aa=fw;
            break;
            case 2:fw=bed4[1];
            aa=fw;
            break;
            case 3:fw=bed4[2];
            aa=fw;
            break;
            case 4:fw=bed4[3];
            aa=fw;
            break;
            case 5:fw=bed4[4];
            aa=fw;
            break;
            case 6:fw=bed4[5];
            aa=fw;
            break;
            case 7:fw=bed4[6];
            aa=fw;
            break;
    }
    switch(ys)
    {
            case 1:fw=bed4[0];
            ab=fw;
            break;
            case 2:fw=bed4[1];
            ab=fw;
            break;
            case 3:fw=bed4[2];
            ab=fw;
            break;
            case 4:fw=bed4[3];
            ab=fw;
            break;
            case 5:fw=bed4[4];
            ab=fw;
            break;
            case 6:fw=bed4[5];
            ab=fw;
            break;
            case 7:fw=bed4[6];
            ab=fw;
            break;
        }
        switch(yt)
        {
            case 1:fw=bed4[0];
            ac=fw;
            break;
            case 2:fw=bed4[1];
            ac=fw;
            break;
            case 3:fw=bed4[2];
            ac=fw;
            break;
            case 4:fw=bed4[3];
            ac=fw;
            break;
            case 5:fw=bed4[4];
            ac=fw;
            break;
            case 6:fw=bed4[5];
            ac=fw;
            break;
            case 7:fw=bed4[6];
            ac=fw;
            break;
        }
        switch(yq)
        {
            case 1:fw=bed4[0];
            ad=fw;
            break;
            case 2:fw=bed4[1];
            ad=fw;
            break;
            case 3:fw=bed4[2];
            ad=fw;
            break;
            case 4:fw=bed4[3];
            ad=fw;
            break;
            case 5:fw=bed4[4];
            ad=fw;
            break;
            case 6:fw=bed4[5];
            ad=fw;
            break;
            case 7:fw=bed4[6];
            ad=fw;
            break;
        }
        System.out.println("Rooms booked :"+aa+" "+ab+" "+ac+" "+ad);
        
    }
    else if(amt==2)
    {
       System.out.println("please enter 1 2 3 4 5 6 as your choice input");
       yut=1;
       int yr=s.nextInt();
       switch(yr)
        {
            case 1:fw=bed4[0];
            aa=fw;
            break;
            case 2:fw=bed4[1];
            aa=fw;
            break;
            case 3:fw=bed4[2];
            aa=fw;
            break;
            case 4:fw=bed4[3];
            aa=fw;
            break;
            case 5:fw=bed4[4];
            aa=fw;
            break;
            case 6:fw=bed4[5];
            aa=fw;
            break;
            case 7:fw=bed4[6];
            aa=fw;
            break;
    }
    System.out.println("ROOM BOOKED="+aa);
}

}   
    else if(ju==3)
    {
        
        for(yu=0;yu<=6;yu++)
        {
             de=bed3[yu];
            System.out.println("Rooms available");
            System.out.println(de);
            System.out.println();
        }
        System.out.println("Do you require multiple rooms? enter 1 for yes and 2 for no");
         amt=s.nextInt();
        if(amt==1)
        {
        System.out.println("please enter 1 2 3 4 as your choice input");
         System.out.println("if you prefer only one room enter same number continuously");
         yut=3;
        int yr=s.nextInt();
        int ys=s.nextInt();
        int yt=s.nextInt();
        switch(yr)
        {
            case 1:fw=bed3[0];
            aa=fw;
            break;
            case 2:fw=bed3[1];
            aa=fw;
            break;
            case 3:fw=bed3[2];
            aa=fw;
            break;
            case 4:fw=bed3[3];
            aa=fw;
            break;
            case 5:fw=bed3[4];
            aa=fw;
            break;
            case 6:fw=bed3[5];
            aa=fw;
            break;
            case 7:fw=bed3[6];
            aa=fw;
            break;
    }
    switch(ys)
    {
            case 1:fw=bed3[0];
            ab=fw;
            break;
            case 2:fw=bed3[1];
            ab=fw;
            break;
            case 3:fw=bed3[2];
            ab=fw;
            break;
            case 4:fw=bed3[3];
            ab=fw;
            break;
            case 5:fw=bed3[4];
            ab=fw;
            break;
            case 6:fw=bed3[5];
            ab=fw;
            break;
            case 7:fw=bed3[6];
            ab=fw;
            break;
        }
        switch(yt)
        {
            case 1:fw=bed3[0];
            ac=fw;
            break;
            case 2:fw=bed3[1];
            ac=fw;
            break;
            case 3:fw=bed3[2];
            ac=fw;
            break;
            case 4:fw=bed3[3];
            ac=fw;
            break;
            case 5:fw=bed3[4];
            ac=fw;
            break;
            case 6:fw=bed3[5];
            ac=fw;
            break;
            case 7:fw=bed3[6];
            ac=fw;
            break;
        }
        System.out.println("Rooms booked :"+aa+" "+ab+" "+ac);
        
        }
    else if(amt==2)
    {
       System.out.println("please enter 1 2 3 4 5 6 as your choice input");
       yut=1;
       int yr=s.nextInt();
       switch(yr)
        {
            case 1:fw=bed3[0];
            aa=fw;
            break;
            case 2:fw=bed3[1];
            aa=fw;
            break;
            case 3:fw=bed3[2];
            aa=fw;
            break;
            case 4:fw=bed3[3];
            aa=fw;
            break;
            case 5:fw=bed3[4];
            aa=fw;
            break;
            case 6:fw=bed3[5];
            aa=fw;
            break;
            case 7:fw=bed3[6];
            aa=fw;
            break;
    }
    System.out.println("ROOM BOOKED="+aa);
}

    }
    else
        if(ju==2)
    {
        
        for(yu=0;yu<=6;yu++)
        {
             de=bed2[yu];
            System.out.println("Rooms available");
            System.out.println(de);
            System.out.println();
        }
        System.out.println("Do you require multiple rooms? enter for 1 yes and 2 for no");
         amt=s.nextInt();
        if(amt==1)
        {
        System.out.println("please enter 1 2 3 4 as your choice input");
         System.out.println("if you prefer only one room enter same number continuously");
         yut=2;
        int yr=s.nextInt();
        int ys=s.nextInt();
        switch(yr)
        {
            case 1:fw=bed2[0];
            aa=fw;
            break;
            case 2:fw=bed2[1];
            aa=fw;
            break;
            case 3:fw=bed2[2];
            aa=fw;
            break;
            case 4:fw=bed2[3];
            aa=fw;
            break;
            case 5:fw=bed2[4];
            aa=fw;
            break;
            case 6:fw=bed2[5];
            aa=fw;
            break;
            case 7:fw=bed2[6];
            aa=fw;
            break;
            
    }
    switch(ys)
    {
            case 1:fw=bed2[0];
            ab=fw;
            break;
            case 2:fw=bed2[1];
            ab=fw;
            break;
            case 3:fw=bed2[2];
            ab=fw;
            break;
            case 4:fw=bed2[3];
            ab=fw;
            break;
            case 5:fw=bed2[4];
            ab=fw;
            break;
            case 6:fw=bed2[5];
            ab=fw;
            break;
            case 7:fw=bed2[6];
            ab=fw;
            break;
        }
        System.out.println("Rooms booked :"+aa+" "+ab);
      
        }
    else if(amt==2)
    {
       System.out.println("please enter 1 2 3 4 5 6 as your choice input");
       yut=1;
       int yr=s.nextInt();
       switch(yr)
        {
            case 1:fw=bed2[0];
            aa=fw;
            break;
            case 2:fw=bed2[1];
            aa=fw;
            break;
            case 3:fw=bed2[2];
            aa=fw;
            break;
            case 4:fw=bed2[3];
            aa=fw;
            break;
            case 5:fw=bed2[4];
            aa=fw;
            break;
            case 6:fw=bed2[5];
            aa=fw;
            break;
            case 7:fw=bed2[6];
            aa=fw;
            break;
    }
    System.out.println("ROOM BOOKED="+aa);
}
    
}
    else
        if(ju==1)
    {
       
        for(yu=0;yu<=6;yu++)
        {
             de=bed1[yu];
            System.out.println("Rooms available");
            System.out.println(de);
            System.out.println();
        }
         System.out.println("please enter 1 2 3 4 as your choice input");
         yut=1;
        int yr=s.nextInt();
        switch(yr)
        {
            case 1:fw=bed1[0];
            aa=fw;
            break;
            case 2:fw=bed1[1];
            aa=fw;
            break;
            case 3:fw=bed1[2];
            aa=fw;
            break;
            case 4:fw=bed1[3];
            aa=fw;
            break;
            case 5:fw=bed1[4];
            aa=fw;
            break;
            case 6:fw=bed1[5];
            aa=fw;
            break;
            case 7:fw=bed1[6];
            aa=fw;
            break;
    }
    choice=de;
     System.out.println("Rooms booked"+aa);
     
    }
    finalamt=amount*yut;
}

public void main()
    {
        try
        {
        System.out.println("welcome to online reservations for The Commodum Hotel");
        System.out.println("please enter your name ");
        String a=s.nextLine();
        System.out.println("please enter your age");
        int b=s.nextInt();
        System.out.println("Enter date of check-in(DDMMYY format)");
        String v=s.next();
        String vextract=v.substring(0,2);
        long vconvert=Integer.parseInt(vextract);
        String monthextract=v.substring(2,4);
        long month=Integer.parseInt(monthextract);
        String year=v.substring(4,6);
        long yeary=Integer.parseInt(year);
        System.out.println("enter date of check-out(extensions are accepted later)");
        String h=s.next();
        String hextract=h.substring(0,2);
        long hconvert=Integer.parseInt(hextract);
        String monthrwe=h.substring(2,4);
        int hyt=Integer.parseInt(monthrwe);
        String year2=v.substring(4,6);
        long c=0;
        if(month==hyt)
        c=hconvert-vconvert;
        else
        if(month==12 || month==3 || month==1 || month==5 || month==7 || month==8 || month==10)
         c=(31-vconvert)+hconvert;
        else if(month==1 || month==4 || month==6 || month==9 || month==11)
        c=(30-vconvert)+hconvert;
        else if(month==2 && yeary%4==0)
        c=(29-vconvert)+hconvert;
        else if(month==2 && yeary%4!=0)
         c=(28-vconvert)+hconvert;
        System.out.println("no. of days you'll being staying with us="+c);
        
        System.out.println("Select the room preference");
        System.out.println("1.PREMIER ROOMS");
        System.out.println("2.PREMIUM SUITS");
        System.out.println("3.ROYAL SUITS");
        System.out.println("4.KING SUITS");
        int e=s.nextInt();
        reservation(e);
        System.out.println("please select no. of rooms as per guest requirement");
        System.out.println("enter 1 for 1 bedroom");
        System.out.println("enter 2 for 2 bedroom");
        System.out.println("enter 3 for 3 bedroom");
        System.out.println("enter 4 for 4 bedroom");
        int fg=s.nextInt();
        availability(fg);
        System.out.println("Name="+a);
        System.out.println("age="+b);
        System.out.println("room type reserved="+vlad);
         System.out.println("no. of days Mr/Mrs."+a+" will be staying at the hotel="+c);
        System.out.println("date of check-in="+vextract+"-"+monthextract+"-"+year);
        System.out.println("date of check-out="+hextract+"-"+monthrwe+"-"+year2);
        System.out.println("Everthing costs you="+(finalamt*c));
        System.out.println("See you soon");
        System.out.println("Designed by Aditya Prathipna and Kartik.G");
    }
    catch(InputMismatchException swe)
    {
        System.out.println("Please enter the proper type of number or string associated with the statement");
}

}
}
