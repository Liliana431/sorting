public class Main {
    public static void main(String[] args) {
        Sorting array = new Sorting(new int[] {5, 2, 6, 7, 3, 1, 2, 9});

        array.printer();
        System.out.println("");
        array.sorter();
        array.printer();
    }
}
