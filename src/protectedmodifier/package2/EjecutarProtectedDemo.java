package protectedmodifier.package2;
import protectedmodifier.package1.*;

//Como se esta heredando de Protected Demo, se puede usar el metodo
public class EjecutarProtectedDemo extends ProtectedDemo{
    public static void main(String[] args) {
        EjecutarProtectedDemo objEjecutarProtectedDemo = new EjecutarProtectedDemo();
        objEjecutarProtectedDemo.mostrar();
    }
}
