
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Circle implements Shape{
Double radio, area, perimetro;
   public Circle(){}
    
   @Override
    public void getArea() {
        Scanner ca = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo");
        radio = ca.nextDouble();
        area = 3.14159*(radio*radio);
        System.out.println("El area es" + area);
    }

    @Override
    public void getPerimeter() {
        Scanner cp = new Scanner(System.in);
        System.out.println("Cual es el radio del circulo");
        radio = cp.nextDouble();
        perimetro = 2*Math.PI*radio;
                
        System.out.println("El perimetro es" + perimetro);
         
    }
    
}