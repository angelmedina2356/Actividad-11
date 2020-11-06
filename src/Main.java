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
public class Main {
    public static void main (String args []){
      String ecuaacion, figura;

      Circle c = new Circle();
      Square s = new Square();
      Triangle t = new Triangle();
      
      System.out.println("Seleccionar propiedad a calcular: área o perímetro.");
            System.out.println("a = Area");
                  System.out.println("p = Perimetro");
      Scanner sc = new Scanner(System.in);
      ecuaacion = sc.nextLine();
      if ("a".equals(ecuaacion))
      {
                System.out.println("Seleccionar la figura");
                                System.out.println("b = Cuadrado");
                                System.out.println("c = Circulo");
                                System.out.println("d = Triangulo");
                                
                Scanner fig = new Scanner (System.in);
                figura = fig.nextLine();
                if (null !=figura)
                switch (figura){
                    case"b":
                        s.getArea();
                        break;
                    case"c":
                        c.getArea();
                        break;
                    case"d":
                        t.getArea();
                        break;
                }
                    
      }
      else if ("p".equals(ecuaacion))
      {
          System.out.println("Seleccionar la figura");
                                System.out.println("e = Cuadrado");
                                System.out.println("f = Circulo");
                                System.out.println("g = Triangulo");
                Scanner fig2 = new Scanner (System.in);
                figura = fig2.nextLine();
                if (null != figura)
                switch (figura) {
              case "e":
                  s.getPerimeter();
                  break;
              case "f":
                  c.getPerimeter();
                  break;
              case "g":
                  t.getPerimeter();
                  break;
              default:
                  break;

                }
      }
          
      
      
      

    }  
}
