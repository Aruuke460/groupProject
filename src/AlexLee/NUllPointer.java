package AlexLee;

public class NUllPointer {
    public static void main(String[] args) {
        try {
            int[] b = {2};
            System.out.println(b[0]);
        }catch(NullPointerException e){
            System.out.println("Your array is null");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("YOur index is out of bounds");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}