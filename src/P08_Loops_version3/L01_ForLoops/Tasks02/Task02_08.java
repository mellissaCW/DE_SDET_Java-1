package P08_Loops_version3.L01_ForLoops.Tasks02;

public class Task02_08 {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın
        String str = "Selamlar";
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");

        }
        System.out.println();
        // cozum 2
        for (int i = 0; i <str.length() ; i++) {
            String harf = str.substring(i,i+1);
            System.out.print(harf+" ");

        }


    }
}
