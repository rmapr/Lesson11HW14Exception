package Exception;

public class Main {
    public static void main(String[] args)  {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String[][] strings = new String[5][5]; //Повинно 4х4
        strings[0][0] ="1";
        strings[0][1] ="2";
        strings[0][2] ="3";
        strings[0][3] ="4";
        strings[1][0] ="5";
        strings[1][1] ="6";
        strings[1][2] ="7";
        strings[1][3] ="8";
        strings[2][0] ="9";
        strings[2][1] ="10";
        strings[2][2] ="11";
        strings[2][3] ="12";
        strings[3][0] ="13";
        strings[3][1] ="14";
        strings[3][2] ="15";
        strings[3][3] ="1w6";// невірне значення
//Для перевірки ArrayDataException закоментувати нижче 9 рядків і виправити розмірність на 4х4)
        strings[4][0] ="17";
        strings[4][1] ="18";
        strings[4][2] ="19";
        strings[4][3] ="20";
        strings[4][4] ="21";
        strings[0][4] ="22";
        strings[1][4] ="23";
        strings[2][4] ="24";
        strings[3][4] ="25";
            try {
                int sumArray = arrayValueCalculator.doCalc(strings);
                System.out.println("Сума всіх чисел масиву дорівнює: " + sumArray);
            } catch (ArraySizeException | ArrayDataException exception) {
                System.out.println(exception.getMessage());
            } finally {
                System.out.println("А чи можна при ArrayDataException на місце невірного " +
                        "значення ввести нове через Сканер і заново запустити? Я думав блок try взяти в " +
                        "цикл while з boolean змінною. Намагався, зайшов в куток, залишив, " +
                        "ще не достатньо знань.");
            }
    }
}