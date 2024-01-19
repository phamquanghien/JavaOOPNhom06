import java.util.Scanner;

/**
 * PhuongTrinhBacNhat
 */
public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        //1 khai bao bien so
        // - Du lieu dau vao
        // - Du lieu dau ra
        double heSoA, heSoB, heSoC, nghiemX1, nghiemX2, delta;
        //2 Nhap du lieu cho bien so
        //- Sanner
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        heSoA = sc.nextDouble();
        System.out.print("B = ");
        heSoB = sc.nextDouble();
        System.out.print("C = ");
        heSoC = sc.nextDouble();
        //3 Tinh toan
        if (heSoA == 0) {
            System.out.println("Khong phai phuong trinh bac hai");
        } else {
            delta = Math.pow(heSoB, 2) - 4 * heSoA * heSoC;
            if (delta < 0) {
                //in ra thong bao phuong trinh vo nghiem
            } else if (delta == 0) {
                nghiemX1 = nghiemX2 = -heSoB / (2 * heSoA);
                //in ra thong bao nghiem kep = ?
            } else {
                nghiemX1 = (-heSoB + Math.sqrt(delta)) / ( 2 * heSoA);
            }
        }
    }
}