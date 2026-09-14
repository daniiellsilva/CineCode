import br.com.cinecode.cine.calculo.CalculadoraDeTempo;
import br.com.cinecode.cine.calculo.FiltroRecomendacao;
import br.com.cinecode.cine.modelos.Episodio;
import br.com.cinecode.cine.modelos.Filme;
import br.com.cinecode.cine.modelos.Serie;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Jogo da Imitação");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setDuracaoEmMinutos(114);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(8);
        System.out.println("Total de Avaliações: " + meuFilme.getSomaAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie blackmirror = new Serie();
        blackmirror.setNome("Black Mirror");
        blackmirror.setAnoDeLancamento(2011);
        blackmirror.exibeFichaTecnica();
        blackmirror.setTemportadas(7);
        blackmirror.setEpisodiosPorTemporada(4);
        blackmirror.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + blackmirror.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("A Rede Social");
        outroFilme.setAnoDeLancamento(2010);
        outroFilme.setDuracaoEmMinutos(115);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(blackmirror);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(blackmirror);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);
    }
}