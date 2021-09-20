package bisdi.pertemuan04;

public class MethodDemo {
    public static int sum(int i1, int i2){
        int result = 0;
        System.out.println("i  Result");
        for (int i = i1; i <= i2; i++) {
            result += result + 1;
            System.out.format("%d    %d %n", i, result);
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println("Jumlah akumulasi 1 s.d 2 adalah "+sum(1,3));
//        System.out.println("Jumlah akumulasi 1 s.d 5 adalah "+sum(1,5));
    }



}
