import java.util.*;

class mainFile {

    public static double lnTeylor(double x, double eps){
        double eps1, b, ans, c;
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
        return ans;
    }
    public static void main(String[] args) {
        
        double x, eps;
        System.out.println("vvodite:");
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        eps = scan.nextDouble();
        if(x < 2 && x>0){
            double ans = lnTeylor(x, eps);
            System.out.println("Taylor:");
            System.out.println(ans);
            System.out.println("right answer:");
            System.out.println(Math.log(x+1));
        }else{
            System.out.println("vihod is ranga");
        }  

        
        scan.close();
    }
}