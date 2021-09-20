package bisdi.pertemuan04;

public class Increment {
    public static void main(String[] args){
        int x = 3;
        System.out.println("Sebelum memanggil method, nilai x adalah "+ x);
        increment(x);
        System.out.println("SETELAH memanggil method, nilai x adalah "+ x);
    }

    public static void increment(int n){
        n++;
        System.out.println("Nilai n di dalam method adalah "+n);
    }
}


