/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_mepilloeltoro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ej_MePilloElToro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/ej_mepilloeltoro/datos");
        Scanner entrada = new Scanner(archivo);
        int numero = 0;
        String[] autor;
        String comprobacion;
        int[] evaluacion;

        numero = entrada.nextInt();
        entrada.nextLine();
        while (numero != 0)
        {

            autor = new String[numero];
            evaluacion = new int[numero];

            for (int i = 0; i < autor.length; i++)
            {

                autor[i] = entrada.nextLine();
                comprobacion = entrada.nextLine();

                if (comprobacion.equals("CORRECTO"))
                {
                    evaluacion[i]++;
                } else
                {
                    evaluacion[i]--;

                }
                if (i != 0 && autor[i].equals(autor[i - 1]))
                {
                    evaluacion[i - 1] += evaluacion[i];
                }

            }
            mostrarAutor(autor, evaluacion);

            numero = Integer.parseInt(entrada.nextLine());

        }
    }

    public static void mostrarAutor(String[] arrayAutores, int[] arrayEvaluacion) {
        for (int i = 0; i < arrayAutores.length; i++)
        {
            if (i == 0)
            {
                 if (arrayEvaluacion[i] != 0 )
            {
                System.out.println(arrayAutores[i] + "," + " " + arrayEvaluacion[i]);
            }
            }else{
            
                if (arrayEvaluacion[i] != 0 &&  !arrayAutores[i].equals(arrayAutores[i-1]))
                {
                    System.out.println(arrayAutores[i] + "," + " " +arrayEvaluacion[i]);
                }
            
            }
           
        }
        System.out.println("---");
    }
}
