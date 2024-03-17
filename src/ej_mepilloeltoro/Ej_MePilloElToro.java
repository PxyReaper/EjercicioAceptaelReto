/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_mepilloeltoro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        ArrayList<String> autor = new ArrayList<>();
        ArrayList<Integer> evaluacion = new ArrayList<>();
        int numero = 0;
        String autores;
        String comprobacion;
       
        int posicion = 0;
        numero = entrada.nextInt();
        entrada.nextLine();
        while (numero != 0)
        {
            posicion = 0;
            for (int i = 0; i <  numero; i++)
            {
                autores = entrada.nextLine();
                comprobacion = entrada.nextLine();
                if (!autor.contains(autores))
                {
                    autor.add(autores);
                    evaluacion.add(0);
                    posicion++;
                
                }
                    if (comprobacion.equals("CORRECTO"))
                    {
                    
                        evaluacion.set(posicion -1,evaluacion.get(posicion-1) +1);
                    } else
                    {
                 
                        evaluacion.set(posicion-1, evaluacion.get(posicion-1)-1 );

                    }

            }
            mostrarAutor(autor, evaluacion);

            numero = Integer.parseInt(entrada.nextLine());
            autor.clear();
            evaluacion.clear();

        }
    }

    public static void mostrarAutor(ArrayList<String> arrayAutores, ArrayList<Integer> arrayEvaluacion) {
        arrayAutores.sort(String::compareTo);
        for (int i = 0; i < arrayAutores.size(); i++)
        {
                if (arrayEvaluacion.get(i) != 0)
            {
                System.out.println(arrayAutores.get(i) +","  + " " + arrayEvaluacion.get(i));
            }
        }
        System.out.println("------");

    }

}
