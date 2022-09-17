public class Main {
    public static void main(String[] args) {
        char grade = 'E';

        switch (grade) {
            case 'A' -> System.out.println("\nMükemmel : Geçtiniz");
            case 'B' -> System.out.println("\nPekiyi : Geçtiniz");
            case 'C' -> System.out.println("\nİyi : Geçtiniz");
            case 'D' -> System.out.println("\nOrta : Geçtiniz");
           /* case 'E' -> System.out.println("\nZayıf : Geçtiniz");
            case 'F' -> System.out.println("\nMalesef : Kaldınız");*/
            case 'E', 'F' -> System.out.println("\nMalesef : Kaldınız");
            default -> System.out.println("\nGeçersiz not girişi yaptınız.");
        }

       /* int deger = switch (grade) {
            case 'A' -> 5;
            case 'B' -> 4;
            case 'C' -> 3;
            case 'D' -> 2;
            case 'F' -> 1;
            default -> 1;
        };*/

        System.out.print("\nAlınan notun sayısal değeri: ");

        System.out.println(switch (grade) {
            case 'A' -> 5;
            case 'B' -> 4;
            case 'C' -> 3;
            case 'D' -> 2;
            case 'E', 'F' -> 1;
            default -> 0;
        });

        int dayOfWeek = 10;

        System.out.printf("\nThe week of the day %d is equal to %s", dayOfWeek, switch (dayOfWeek) {
            case 1:
                yield "Monday";
            case 2:
                yield "Tuesday";
            case 3:
                yield "Wednesday";
            case 4:
                yield "Thursday";
            case 5:
                yield "Firday";
            case 6:
                yield "Saturday";
            case 7:
                yield "Sunday";
            default:
                yield "Error! You have assigned uncompatible Day of the week expression.";
        } + "\n");

    }
}
