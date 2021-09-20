package bisdi.pertemuan04;

public class TestMax {

    public static void main(String[] args){
        int i=5;
        int j=2;
        int k = max(i,j);
        System.out.println("Nilai maximum dari "+i+" dan "+j+" adalah "+k);
    }

    public static int max(int num1, int num2){
        int maxResult;
        if (num1>num2)
            maxResult = num1;
        else
            maxResult = num2;
        return maxResult;
    }
}

