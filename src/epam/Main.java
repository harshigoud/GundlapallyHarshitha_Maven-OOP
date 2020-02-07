package epam;
import java.util.ArrayList;
import java.util.*;
class Candies{
    int count(Integer n[],int x,int y){
    int count=0;
    for (int i=x+1;i<=y-1;i++){
        if(n[i]==3){
            count=count+1;
        }
    }
    
    System.out.println("Candies in the given range:\t"+count);
    return count;
}
}
class Kitkat{
    int count(Integer n[],int r){
    int count=0;
    for (int i=0;i<r;i++){
        if(n[i]==2){
            count=count+1;
        }
    }
    System.out.println("Kitkat:\t"+count);
    return count;
}
}
class MilkyBar{
int count(Integer n[],int r){
    int count=0;
    for (int i=0;i<r;i++){
        if(n[i]==1){
            count++;
        }
    }
    System.out.println("MilkyBar:\t"+count);
    return count;
}
 
}  

class Munch{
    int count(Integer n[],int r){
    int count=0;
    for (int i=0;i<r;i++){
        if(n[i]==4){
            count=count+1;
        }
    }
    System.out.println("Munch:\t"+count);
    return count;
}
}  

class Sweets{
    int count=0;
}

class Main{
public static void main(String []args){
    Kitkat k1=new Kitkat();
    MilkyBar d1=new MilkyBar();
    Munch m1=new Munch();
    Candies c1=new Candies();
    Sweets s1=new Sweets();
    System.out.println("1.MilkyBar\n2.Kitkat\n3.Candy\n4.Munch\n5.Gulabjamun\n6.Exit(Gift selection is completed)\nEnter choice:");
    ArrayList<Integer> a =new ArrayList<>();
    
    for(int i=0;i<100;i++){
    	Scanner input=new Scanner(System.in);
    	int choice=input.nextInt();
    	 a.add(choice);
         if(choice>6 || choice<1)
         {
             System.out.printf("wrong option\n");
             break;
         }
         if(choice==6)
         {
        	 break;
         }
    }
    
    int size1=a.size();
    int size=size1-1;
    System.out.println("Total weight is:" +size);
    Integer[] arr=a.toArray(new Integer[a.size()]);
    int d2=d1.count(arr,size);
    int k2=k1.count(arr,size);
    int m2=m1.count(arr,size);
    System.out.println("Sorting Chocolates in descending Order based on number of Chocolates of same type");
    
    
    if (k2>=d2 && k2>=m2)  {
        
        k1.count(arr,size);
        if(m2>=d2){
            m1.count(arr,size);
            
            d1.count(arr,size);
        }
        else if(d2>=m2){
            d1.count(arr,size);
            
            m1.count(arr,size);
        }
        
    }
        
    else if(d2>=k2 && d2>=m2){
        d1.count(arr,size);
        if(k2>=m2)
        {
            k1.count(arr,size);
            
            m1.count(arr,size);
        }
        else if(m2>=k2)
        {
            m1.count(arr,size);
            k1.count(arr,size);
        }
    }
    else{
        m1.count(arr,size);
        if(k2>=d2){
            k1.count(arr,size);
            d1.count(arr,size);
        }
        else if(d2>=k2){
            d1.count(arr,size);
            k1.count(arr,size);
        }
        
        
    }
    System.out.println("Enter the lower limit of range of candies:");
    Scanner obj1=new Scanner(System.in);
    int n1=obj1.nextInt();

    System.out.println("Enter the upper limit of range of candies(should not exceed total weight+1):");
    Scanner obj2=new Scanner(System.in);
    int n2=obj2.nextInt();
    
    int c2=c1.count(arr,n1,n2);
    
}
    
}

