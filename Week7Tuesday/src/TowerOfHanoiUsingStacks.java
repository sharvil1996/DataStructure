import java.util.*;

 public class TowerOfHanoiUsingStacks
 {
     public static int N;
     public static Stack[] tower = new Stack[3];
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         tower[0] = new Stack();
         tower[1] = new Stack();
         tower[2] = new Stack();
         System.out.println("Enter number of disks");
         int num = scan.nextInt();
         N = num;
         tower(num);
     }
     public static void tower(int n)
     {
         for (int i = n; i > 0; i--)
             tower[0].pushInteger(i);
         display();
         move(n, 0, 1, 2);
     }
     public static void move(int n, int a, int b, int c)
     {
         if (n > 0)
         {
             move(n-1, a, c, b);
             int d = tower[a].popInteger();
             tower[c].pushInteger(d);
             display();
             move(n-1, b, a, c);
         }
     }
     public static void display()
     {
         System.out.println("  A  |  B  |  C");
         System.out.println("---------------");
         for(int i = N - 1; i >= 0; i--)
         {
             String d1 = " ", d2 = " ", d3 = " ";
             try{
                 d1 = tower[0].get(i)+"";
             }catch (Exception e){}
             try{
                 d2 = tower[1].get(i)+"";
             }catch(Exception e){System.out.println("");}
             try{
                 d3 = tower[2].get(i)+"";
             }catch (Exception e){}
             System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
         }
         System.out.println("\n");
     }
 }
