package insertion_deletion;

import java.util.Scanner;
/**
 *
 * @author Micael Selunanis
 */
public class Insertion_deletion {
    int n = 5;
    int top = 4;
    int m=8;
   int V[]={78,79,80,81,82,0,0,0};
   
    public  void display(){
        for(int a=0;a<5;a++){
            System.out.println("Old elements are: "+V[a]);
        }
   }
   public void display_push(){
       System.out.println("pushed element is: "+V[top]);
    for(int a=0;a<top+1;a++){
            System.out.println("new elements are: "+V[a]);
        }
   }
   public void display_pop(){
       
    for(int a=0;a<top;a++){
            System.out.println("new elements are: "+V[a]);
        }
   }
   
   
    public void insert(){
    
    int i=0,x=0,j=n;
//    i is position to insert,j=variable,n is number of elements,V=array
//output the original elements
    //increase the number of elements
    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter the position to insert");
    i=scan.nextInt();
    if(i>=n){
        System.out.println("Error! no such item");
        }
    System.out.println("Please enter the element to insert");
    x= scan.nextInt();
n=n+1;
   for(j=n;j>=i;j--){
        V[j+1]=V[j];//shift elements in pos 4 to 5
             
    }
        V[i]=x;//set x in to the empty position
        }
    public void push_stack(){
Scanner input =  new Scanner(System.in);
System.out.println("Enter element");
int x = input.nextInt();

if(top == m){
    System.out.println("Error");
}
else{
    top = top +1;
    V[top] = x;
}

    }
    public void pop_stack(){
      Scanner input =  new Scanner(System.in);


if(top <= 0){
    System.out.println("Error");
}  
else{
  int y = V[top];
   top = top-1;
System.out.println("poped element is: "+y);

    }}
    public void delete(){
       
        int i,j,n=5;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the position to delete");
        i=scan.nextInt();
        
        if(i>=n){
        System.out.println("Error! no such item");
        }
        
        else {
        j=i;
        while(j<=n-1){
            V[j]=V[j+1];
            j=j+1;
        }
        }
        n=n-1;
             
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Insertion_deletion method = new Insertion_deletion();
//        method.display();
//        method.insert();
//        method.display();
//        method.delete();
        method.display();
        method.push_stack();
        method.display_push();
        method.pop_stack();
        method.display_pop();
    }
    
}
