import java.util.Scanner;


public class ucakBiletiHesaplama {
    public static void main(String[] args) {

        int age, distance, tripType;
        double normalPrice, ageDiscount13, ageDiscount24, ageDiscount65,discountedAmount13,discountedAmount24,discountedAmount65;

        Scanner input = new Scanner(System.in);

        System.out.print("yaşınızı giriniz:");
        age = input.nextInt();

        System.out.print("mesafeyi km türünden giriniz:");
        distance = input.nextInt();

        System.out.print("yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) :");
        tripType = input.nextInt();

        normalPrice = (distance*0.10);
        ageDiscount13 = (normalPrice*0.5);
        ageDiscount24 = (normalPrice*0.10);
        ageDiscount65 = (normalPrice*0.3);
        discountedAmount13 = normalPrice - ageDiscount13;
        discountedAmount24 = normalPrice - ageDiscount24;
        discountedAmount65 = normalPrice - ageDiscount65;



        if (age >= 0 && distance >= 0 && tripType == 1 || tripType == 2  ) {

            if (age < 13 && tripType == 1 ) {

                System.out.print("ücret : " + ( normalPrice - discountedAmount13) );

            } else if (age > 11 && age < 25 && tripType == 1) {

                System.out.print("ücret : " +(normalPrice - discountedAmount24));

            }else if (age > 65 && tripType == 1) {

                System.out.print("ücret :" + (normalPrice - discountedAmount65));

            }else if (age < 13 && tripType == 2){

                System.out.print("ücret : " + (normalPrice - discountedAmount13)*1.2*2);

            }else if (age > 12 && age < 24 && tripType == 2) {

                System.out.print("ücret : " + (normalPrice - discountedAmount24)*1.2*2);
            }else if ( age > 65 && tripType == 2) {

                System.out.print("ücret : " + (normalPrice - discountedAmount65)*1.2*2);
            }else if (age > 24 && age < 65 && tripType == 1) {

                System.out.print("ücret : " + (normalPrice-(normalPrice*0.1)));

            }else if (age > 24 && age < 65 && tripType == 2){

                System.out.print("ücret : "+ (normalPrice - (normalPrice*0.2))*2);

            }


        }else {
            System.out.print("Hatalı veri girdiniz!");
        }

    }
}
