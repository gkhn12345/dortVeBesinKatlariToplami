import java.util.Scanner;

public class dortVeBesinKatlariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        int k;
        System.out.print("Bir sayı giriniz :");
        k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println("4ve5'in katları:" + i);

            }
        }

    }


}

