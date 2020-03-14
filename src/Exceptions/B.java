package Exceptions;

import java.io.IOException;

public class B extends A {
@Override
    void m()  throws Exception{

}
@Override
    void method2() throws C {
    try{
        super.method2();
    }catch (IOException e){
        e.printStackTrace();
    }
}

}
