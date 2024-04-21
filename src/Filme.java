public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPrime;
    double somaDasAvalicoes;
    int totalDeAvalicoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvalicoes += nota;
        totalDeAvalicoes++;
    }

    double mediaDasAvalia(){
         return somaDasAvalicoes / totalDeAvalicoes;
    }


}
