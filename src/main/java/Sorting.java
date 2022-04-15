public class Sorting {
    //сортировка массива
    private int[] array;   //ссылка на массив

    public Sorting(int[] arr){
        //инициализация класса, нужен массив
        array = arr;
    }

    public void printer(){
        // вывод массива в консоль
        for (int j : array) {
            System.out.print(j + ", ");
        }
    }

    public int[] getArray(){
        return array;
    }

    public void sorter(){
        // сортировка массива, используется алгоритм сортировки вставками
        for (int left = 0; left < array.length; left++) {
            int x = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (x < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = x;
        }
    }
}
