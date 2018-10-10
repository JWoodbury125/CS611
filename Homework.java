

public class Homework{

    public static void main(String[]args){
        int x;
        x = recPow(5);
        System.out.println(x);
    }
    public static int recPow(int n){
        int y = 1; 
        if (n<0)
            throw new IllegalArgumentException("n must be greater than or equal to 0");
        else{
                for(int i=1; i<=n; i++)
                y = 2*y;
            } 
            

            return y;
        }            
    
}