package P03_ScannerClassAndTypeCasting.Tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Banka Hesabınız Var mı ? ");
        boolean isAnswer = scan.nextBoolean();
        System.out.println(isAnswer);


    }
}
