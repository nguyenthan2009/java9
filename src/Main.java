import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so USD");
        USD = sc.nextDouble();
        double quidoi = USD*VND;
        System.out.println("so tien sau khi chuyen doi" + quidoi);
    }
}
