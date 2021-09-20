package bisdi.pertemuan04;

public class TestVoidMethod {
    public static void main(String[] args){
        int realScore = 92;
        System.out.print("Nilai final dari "+realScore+" adalah: ");
        printGrade(realScore);
        realScore = 58;
        System.out.print("Nilai final dari "+realScore+" adalah: ");
        printGrade(realScore);
    }

    public static void printGrade(double score){
        if (score>=90){
            System.out.println('A');
        }
        else if(score>=80){
            System.out.println('B');
        }
        else if(score>=70){
            System.out.println('C');
        }
        else if(score>=60){
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}


