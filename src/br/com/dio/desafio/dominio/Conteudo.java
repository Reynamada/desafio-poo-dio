package br.com.dio.desafio.dominio;
//classe MÃE de mentorias e cursos (conteudos)
// Todo Bootcamp vai ter conteudo
//nao consigo instanciar um conteudo (new) em MAIN porque a classe é abstracta
//se creo essa classe para poder implementar os atributos e os metodos calcular xp nas clases filhas (herança)
//para evitar a repetiçao de codigo

public abstract class Conteudo {
    //constantes, so os filhos e a classe conteudo vai ter acceso(protected)
    protected static final double XP_PADRAO = 10d;

    private  String titulo;
    private  String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
