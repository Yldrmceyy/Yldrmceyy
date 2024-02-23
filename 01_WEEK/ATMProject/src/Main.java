import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("""
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz seçim!");
                            break;
                    }
                } while (select != 4); // Bu kısmı do-while döngüsüne alınması gerekiyor
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }
    }
}
