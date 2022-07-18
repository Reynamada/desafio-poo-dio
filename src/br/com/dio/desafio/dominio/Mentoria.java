package br.com.dio.desafio.dominio;

import java.time.LocalDate;
//(extends) a classe mentoria é filha de Conteudo
public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n***** MENTORIAS *****\n" +
                "Titulo= " + getTitulo() + " " +
                "\nDescrição= " + getDescricao() + " " +
                "\nData= " + data +
                "\n";
    }
}
