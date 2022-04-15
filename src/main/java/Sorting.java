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
        // сортировка массива, используется алгоритм сортировки пузырьком
        for (int out = array.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(array[in] > array[in + 1]) {
                    int x = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = x;
                }
            }
        }
    }
}
