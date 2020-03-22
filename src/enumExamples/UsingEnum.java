package enumExamples;

public class UsingEnum {
    public static void main(String[] args) {
       // Base.LetterGrade grade;
       // grade = Base.LetterGrade.A;
        Base.LetterGrade grade = Base.LetterGrade.B;
        switch(grade){
            case A:
                System.out.println("YOu got an A");
                break;
            case B:
                System.out.println("Not bad");
                break;
            case C:
                System.out.println("You could do better");
                break;
            case D:
                System.out.println("Not so good");
                break;
            case F:
                System.out.println("You failed");
                break;
        }
    }
}
