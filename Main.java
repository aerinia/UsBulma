import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i=1;i<=n;i*=4){
        System.out.println(i);
    }
    for (int j=1;j<=n;j*=5){
        System.out.println(j);
    }
    }
}
