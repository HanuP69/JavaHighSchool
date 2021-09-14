import java.util.*;
class Patterns{
    void main(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter choice");
       int n = sc.nextInt();
       switch(n){
           case 1:
           for(int i = 1; i<=5; i++){
               for(int j = 1; j<=i; j++){
                   System.out.print(j);}
                   System.out.println();}
                   break;
           case 2:
           for(int i = 1; i<=5; i++){
               
               for(int j = 5;j>=(6-i); j--){
                   System.out.print(j);}
                   System.out.println();}
                   break;
           case 3:
           for(int i = 5; i>= 1; i--){
               for(int j = 1; j<=i; j++){
                   System.out.print(j);}
                   System.out.println();}
                   break;
           case 4:
           for(int i = 1; i<=5; i++){
               for(int j = 5; j>=i; j--){
                   System.out.print(j);}
                   System.out.println();
                }
                break;
                case 5:
                for(int i = 1; i<=5; i++){
                    for(int j = 5; j>=i; j--){
                        System.out.print("*");}
                        System.out.println();}
                        break;
                        case 6:
                        for(int i = 1; i<=5; i++){
                            for(int j = 1; j<=i; j++){
                                System.out.print("*");}
                                System.out.println();}
                                break;
                        case 7:
                        for(int i = 1; i<=4; i++){
                            for(int j = i; j<=4; j++){
                                System.out.print(2*i);}
                                System.out.println();}
                                break;
                case 8:
                        for(int i = 1; i<=4; i++){
                            for(int j = 1; j<=i; j++){
                                System.out.print(2*i);}
                                System.out.println();}
break;
                case 9:
                System.out.print("print till which no. till 10?");
                System.out.println();
                int x = sc.nextInt();
                for(int i = 1; i<=(n+1); i++){
                    for(int j = 1; j<= i; j++){
                        System.out.print(j + " ");}
                        System.out.println();}
                        break;
                   default:
                   return;}
           return;}}