package bisdi.pertemuan04;

public class TestReturnGradeMethod {
    public static void main(String[] args){
        int realScore = 92;
        System.out.println("Nilai final dari "+realScore+" adalah "+getGrade(realScore));
        realScore = 58;
        System.out.println("Nilai final dari "+realScore+" adalah "+getGrade(realScore));
    }

    public static char getGrade(double score){
        if (score >= 90.0)
            return 'A';
        else if (score >= 80.0)
            return 'B';
        else if (score >= 70.0)
            return 'C';
        else if (score >= 60.0)
            return 'D';
        else
            return 'F';
    }
}


