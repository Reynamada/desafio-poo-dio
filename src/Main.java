import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargahoraria(4);

        //Creamos um curso a partir da minha classe conteudo (Polimorfismo):Instanciar um objeto de diversas formas
        Conteudo conteudo= new Curso();
        Conteudo conteudo1= new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição de mentoria");
        mentoria.setData(LocalDate.now());

     /*   System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devReyna = new Dev();
        devReyna.setNome("Reyna");
        devReyna.inscribirBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Reyna"+ devReyna.getConteudosInscritos());
        devReyna.progredir();
        devReyna.progredir();

        System.out.println(".");
        System.out.println("Conteudos inscritos Reyna"+ devReyna.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Reyna"+ devReyna.getConteudosConcluidos());
        System.out.println("XP: "+ devReyna.calcularTotalXp());

        System.out.println(".............................");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscribirBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(".");
        System.out.println("Conteudos inscritos Joao"+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao"+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }
}
