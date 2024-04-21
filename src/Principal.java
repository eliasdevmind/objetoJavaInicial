public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println(meuFilme.somaDasAvalicoes);
        System.out.println(meuFilme.totalDeAvalicoes);
        System.out.println(meuFilme.mediaDasAvalia());
    }
}