

package Learn;


import java.util.Scanner;

public class Operation {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Выберите операцию (+, -, * ,/): ");
        char operation = 0;
        if (!scanner.hasNext("[+, -, /, *]")) {
            System.out.println("Используйте +, -, / ,*!");
        }
        operation = scanner.next().charAt(0);


        if (operation == '+') {

            Calculator calculator1 = new Calculator(new OperationSum());
            calculator1.printResult();
        }
        if (operation == '-') {

            Calculator calculator1 = new Calculator(new OperationRazn());
            calculator1.printResult();
        }
        if (operation == '/') {

            Calculator calculator1 = new Calculator(new OperationDel());
            calculator1.printResult();
        }
        if (operation == '*') {

            Calculator calculator1 = new Calculator(new OperationUmn());
            calculator1.printResult();
        }


    }
}
