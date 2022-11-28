import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoList {



    /*Dadas as seguintes informações sobre meus gatos, crie uma lista e ordene exibindo:
     * (Nome - Idade - Cor);
     * 
     * Gato 1 = nome: Jon, idade: 18, cor: preto
     * Gato 2 = nome: Simba, idade: 6, cor: tigrado
     * Gato 3 = nome: Jon, idade: 12, cor: amarelo
     */

     /**
     * @param args
     */
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));


        }};
        System.out.println("--\tOrdem de Inscrição\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
        Collections.sort(meusGatos, new comparatorIdade());
     //   meusGatos.sort(new comparatorIdade());
        System.out.println(meusGatos);




        

     }
    
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }


}


    class comparatorIdade implements Comparator<Gato>{

        private Gato g1;

        /**
         * @param g1
         * @param g2
         * @return
         */
        @Override
        public int compare(Gato g1, Gato g2) {
            this.g1 = g1;
            this.g1 = g1;
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }




    } 
