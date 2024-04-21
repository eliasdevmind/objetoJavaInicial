package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private  int temporadas;
    private boolean ativa;
    private int episodiosPorTeporada;
    private int minutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodiosPorTeporada() {
        return episodiosPorTeporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
//ouw
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodiosPorTeporada(int episodiosPorTeporada) {
        this.episodiosPorTeporada = episodiosPorTeporada;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTeporada * minutosPorEpisodios;
    }
}



