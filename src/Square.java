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
public class Square implements Shape{
double area, a, perimetro;
   public Square(){}
   
    @Override
    public void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el lado de cuadrado");
        a = scanner.nextDouble();
        area=a*a;
        System.out.println(area);  
    }

    @Override
    public void getPerimeter() {
         Scanner key = new Scanner(System.in);
         System.out.println("ingrese el lado de cuadrado");
         a = key.nextDouble();
         perimetro=a*4;
         System.out.println(perimetro);      
    }
    
}