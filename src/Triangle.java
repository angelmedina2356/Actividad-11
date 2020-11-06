
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Triangle implements Shape{
double area, base, altura, perimetro, aa, bb, cc;
   public Triangle(){}
   
    @Override
    public void getArea() {
        Scanner tb = new Scanner(System.in);
        Scanner th = new Scanner(System.in);
        System.out.println("Cual es la base del triangulo");
        base = tb.nextDouble();
        System.out.println("Cual es la altura del triangulo");
        altura = th.nextDouble();
        area = (base*altura)/2;
       System.out.println("El area del triangulo es: "+area);
    }

   @Override
    public void getPerimeter() {
         Scanner a = new Scanner(System.in);
                  Scanner b = new Scanner(System.in);
                           Scanner c = new Scanner(System.in);
         System.out.println("Dime la medida de un lado del trinagulo");
         aa = a.nextDouble();
         System.out.println("Dime la medida de otro lado del trinagulo");
         bb = b.nextDouble();
         System.out.println("Dime la medida de otro lado del trinagulo");
         cc = b.nextDouble();
         perimetro = aa+bb+cc;
         System.out.println("El perimetro del triangulo es: "+perimetro);
    }
    
}
