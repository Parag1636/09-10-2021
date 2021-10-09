import java.util.*;

public class Pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int spaceOut = n/2;
    int spaceInn = -1;

    for(int k=1; k<=n; k++){
        for(int i=0; i<spaceOut; i++){
            System.out.print("\t");
        }
        System.out.print("*\t");
        
        for(int j=0; j<spaceInn; j++){
            System.out.print("\t");
        }
        
        if(k > 1 && k < n){
            System.out.print("*\t");
        }
        
        if(k <= n/2){
            spaceOut--;
            spaceInn += 2;
        }else{
            spaceOut++;
            spaceInn -= 2;
        }
        
        System.out.println();
    }    
 }
}