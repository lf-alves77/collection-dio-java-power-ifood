import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class exemploList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //Dada uma lista com 7 notas de um aluno(7, 8.5, 9.3, 5, 7, 0, 3.6), faça:


        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);


        System.out.println(notas.toString());


        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));  
        
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

       // System.out.println("Exiba a soma das notas: ");
       //7 Iterator<Double> iterator = notas.iterator();
        //Double soma = 0.0;

        //while(iterator.hasNext()){
         //   Double next = iterator.next();
           // soma += next;


        //}

        //System.out.println("Exiba a soma: " + soma );


        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);


        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);


        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);
        
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        








   



    }
    
}
