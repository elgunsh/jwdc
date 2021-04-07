import java.util.Scanner;

public class SmartCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        double result = 0;

        System.out.print("Birinci ededi daxil edin:");
        a = input.nextDouble();

        System.out.print("Ikinci ededi daxil edin:");
        b = input.nextDouble();

        String op = null;

        System.out.print("Operatoru daxil edin(+,-,/,*,%,$):");
        op = input.next();

        boolean print = true;

        switch (op) {
            case "+":result = a + b;break;
            case "-":result = a - b;break;
            case "/":result = a / b;break;
            case "*":result = a * b;break;
            case "%":result = residue((int) a,(int) b);break;
            case "$":result = power((long) a,(long) b);break;
            default:
                System.out.println("Secdiyiniz operator duzgun deyil!");
                print = false;break;
        }

        if (print = true){
            System.out.println(result);
        }



    }
    static int residue(int a, int b) {
        int result = 0;
        if (a>b){
            result = a - ((a/b)*b);
        }else if(b>a) {
            result = b - ((b/a)*a);
        }
        return result;
    }

    static long power(long a, long b) {
        int result = 1;
        for (int i=0;i<b;i++){
            result *= a;
        }
        return result;
    }
}
