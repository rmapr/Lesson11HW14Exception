package run;

import exception.ArrayDataException;
import exception.ArraySizeException;

public class ArrayValueCalculator {
    public int doCalc(String[][] strArrayToInt) throws ArraySizeException, ArrayDataException {
        int sum = 0;
//3. При передачі масиву іншого розміру в метод doCalc необхідно викинути виняток ArraySizeException.
        for (String[] strings : strArrayToInt) {
            if (strArrayToInt.length != 4 || strings.length != 4)
                throw new ArraySizeException("Двомірний масив повинен бути 4х4");
        }
//4. Метод doCalc повинен пройтися за всіма елементами масиву і перетворити в int
//(використовувати Integer#parseInt) і підсумувати. Після загального підсумовування
//метод повертає фінальний результат у вигляді int.
        for (int i = 0; i < strArrayToInt.length; i++) {
            for (int j = 0; j < strArrayToInt[i].length; j++) {
//5.Якщо в якомусь елементі масиву перетворення не вдалося (наприклад, в комірці лежить
//символ або текст замість числа), тоді викинути виняток ArrayDataException, з деталізацією
//в якому саме комірці лежать невірні дані.
                try {
                    sum += Integer.parseInt(strArrayToInt[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("В ячейці: [" + i + "][" + j + "] некоректне значення");
                }
            }
        }
        return sum;
    }
}
