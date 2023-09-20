import java.util.Scanner;
public class Float_err {
    public static void main(String[] args) {
        float f;
        double d;
        float f_added;
        double d_added;

        Scanner ip = new Scanner(System.in);
        System.out.println("float. 값을 입력하십시오: ");
        f = ip.nextFloat();
        System.out.println("double. 값을 입력하십시오: ");
        d = ip.nextDouble();

        f_added = f + f + f + f + f + f + f + f + f + f;
        d_added = d + d + d + d + d + d + d + d + d + d;

        System.out.printf("float 데이터 타입. 열번 더한 값: %.64f\n", f_added);
        System.out.printf("double 데이터 타입. 열번 더한 값: %.64f", d_added);
    }
}
