// Andrés de Jesús Martínez Castillo A014411447 IMT
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.t1.p1;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class SPPAMartinezCT1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Promedio de alumno");
   
        double cal1, cal2, cal3, cal4, cal5, prom;
        int mat;
        String  res;
                
        Scanner kb= new Scanner (System.in);
        
        System.out.println("Ingrese su matricula");
        mat= kb.nextInt();
        
        System.out.println("");
        System.out.println("Ingrese sus 5 calificaciones en base 10 ");
        cal1= kb.nextInt();
        cal2= kb.nextInt();
        cal3= kb.nextInt();
        cal4= kb.nextInt();
        cal5= kb.nextInt();
        
        prom= (cal1+cal2+cal3+cal4+cal5)/5;
        System.out.println("Promedio="+prom);
        
        if (prom>7.0){
            res="APROBADO";
        }else{
            res="REPROBADO";
        }
        
        System.out.println("El alumno:"+mat+" está:"+res);
        }    
    }
    
