import java.util.*;

class mainFile {
    public static void main(String[] args) {
        
        double x, b, c, ans, eps, eps1;
            System.out.println("vvodite:");
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        eps = scan.nextDouble();
        if(x < 2 && x>0){
            x-=1;
            b = x;
            ans = x;
            eps++;
            eps1 = Math.pow(10,- eps);
            for (int i  = 2;; i++){
                b*=-x;
                c = b/i;
                ans += c;
                if(Math.abs(c) < eps1)
                    break;
            }
            System.out.println("Teylor:");
            System.out.println(ans);
            System.out.println("right answer:");
            System.out.println(Math.log(x+1));
            
        }else{
           System.out.println("vihod is ranga");
        }
    }
}