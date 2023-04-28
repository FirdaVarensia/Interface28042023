/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author user
 */
public class MyClass implements MyInterface1, MyInterface2{
    public void MyMethod1(){
        System.out.println("Hello ");
    }
    public void  MyMethod2(){
        System.out.println("Hello Java");
    }
    public void MyMethod3(){
        System.out.println("Hello Indonesia");
    }

    @Override
    public void myMethod1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void myMethod2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void myMethod3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
