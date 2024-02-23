
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, k;

        Scanner input=new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        n= input.nextInt();

        System.out.print("k değerini giriniz: ");
        k= input.nextInt();

        int nFaktoriyel=1;
        int kFaktoriyel=1;
        int farkFaktoriyel=1;


        for(int i=1; i<=n ; i++){
            nFaktoriyel= nFaktoriyel*i;
        }
        for(int i=1; i<=k ; i++){
            kFaktoriyel= kFaktoriyel*i;
        }
        for(int i=1; i<=(n-k) ; i++){
            farkFaktoriyel= farkFaktoriyel*i;
        }
        System.out.println(nFaktoriyel/(kFaktoriyel*farkFaktoriyel));
    }
}