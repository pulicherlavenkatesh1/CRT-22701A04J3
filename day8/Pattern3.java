import java.util.Scanner;
class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        for(int i=0;i<=n;i++){
            for(int j=0;j<2*n-1;j++){
                if(i+j>=n-1 && j-i<=n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}