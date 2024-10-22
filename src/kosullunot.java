import java.util.Scanner;


public class kosullunot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        double average = (mat + fizik + kimya + muzik+turkce)/5;
        if(0<=mat&&mat<=100&&0<=fizik&&fizik<=100&&0<=kimya&&kimya<=100&&0<=muzik&&muzik<=100&&0<=turkce&&turkce<=100){
            System.out.println("ortalamanız" + average);
            if(average>55){
                System.out.println("sınıfı geçtiniz");

            }
            else{
                System.out.println("sınıfı geçemediniz seneye tekrar deneyiniz!!!");
            }


        }
        else{
            System.out.println("notlarınız geçerli değil");
        }


    }
}
