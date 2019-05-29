package main.hw;

public class Exception {
    public static void main(String[] args) {

        int result = 0;
// {{"1", "1", "1", "1", "2"}, {"1", "1", "1", "1"}} - ошибка MyArraySizeException
// {{"1", "1", "1", "a"}, {"1", "1", "1", "1"}} - ошибка MyArrayDataException
//{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}} - правильный вариант, массив int 4x4
        String[][] array = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            result = method(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Сумма элементов массива равна " + String.valueOf(result));
    }

    public static int method(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int count = 0;
        int value = 0;
        int row = 0;
        int cell = 0;

        if(array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException("Ошибка! Нужен  двумерный строковый массив размером 4х4");
        }

        for(int i=1;i<3;i++){
            row = i;
            for(int c=1;c<5;c++){
                cell = c;
                try{
                    value = Integer.parseInt(array[i-1][c-1]);
                    count += value;
                } catch (IllegalArgumentException e){
                    throw new MyArrayDataException("Ошибка! не удалось преобразовать в int "+String.valueOf(row)+" ряд, "+String.valueOf(cell)+" ячейка");
                }
            }
        }
        return count;
    }
}

