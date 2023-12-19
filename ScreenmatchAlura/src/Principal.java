public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Fantástico Sr Raposo";
        meuFilme.anoDeLancamento = 2009;
        meuFilme.duracaoEmMinutos = 140;

        meuFilme.exibeFichaTecnica();
    }
}
