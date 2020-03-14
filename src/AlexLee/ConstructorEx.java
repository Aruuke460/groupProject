package AlexLee;

public class ConstructorEx {
    String name;
    int age;

    public ConstructorEx(){
        System.out.println("No arg");
    }
    public ConstructorEx(String name1,int age2){
        name = name1;
        age = age2;
        System.out.println("With two arg");
    }

}
