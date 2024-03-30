import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: "); // Nhập 1 năm
        year = scanner.nextInt();
        if ( year  % 4 == 0){
            if ( year % 100 == 0){
                if ( year % 400 == 0){// chia  hết 4,100,400 là  năm nhuận
                    System.out.printf("%d is a leap year", year);// là năm nhuận
                } else {// chia hết 4,100 nhưng không chia hết 400=> k nhuận
                    System.out.printf("%d is NOT a leap year", year);// là năm không nhuận
                }
            } else {// chia hết cho 4
                System.out.printf("%d  is a leap year", year);// là năm nhuận
            }
        } else  {
            System.out.printf("%d is NOT a leap year", year);// là năm không nhuận
        }
    }
    /* code rút gọn
    boolean nam = false;
    if(year % 4 == 0){
        if ( year % 100 == 0) {
            if (year % 400 == 0) {
                nam = true;
            }
        } else {
            nam = true;
        }
    }
    if(nam){
        System.out.printf("%d  is a leap year", year);
    } else {
        System.out.printf("%d is NOT a leap year", year);
    }*/

}