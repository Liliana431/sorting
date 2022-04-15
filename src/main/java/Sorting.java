public class Sorting {
    //сортировка массива
    private int[] a;   //ссылка на массив

    public Sorting(int[] arr){
        //инициализация класса, нужен массив
        a = arr;
    }

    public void printer(){
        // вывод массива в консоль
        for (int j : a) {
            System.out.print(j + ", ");
        }
    }

    public void sorter(){
        // сортировка массива, используется алгоритм сортировки пузырьком
        for (int out = a.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(a[in] > a[in + 1]) {
                    int x = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = x;
                }
            }
        }
    }
}
