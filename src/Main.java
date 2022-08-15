import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void Main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java Básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java básico");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do curso");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ devCaio.getNome() + ": " + devCaio.getConteudosInscritos());
        devCaio.progredir();
        System.out.println("---------------------------------------------------");
        System.out.println("Conteúdos Inscritos "+ devCaio.getNome() + ": " + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ devCaio.getNome() + ": " + devCaio.getConteudosConcluidos());
        System.out.println("XP: " + devCaio.calcularTotalXP());

        System.out.println("---------------------------------------------------");
        Dev devLuna = new Dev();
        devLuna.setNome("Luna");
        devLuna.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ devLuna.getNome() + ": " + devLuna.getConteudosInscritos());
        devLuna.progredir();
        devLuna.progredir();
        devLuna.progredir();
        System.out.println("---------------------------------------------------");
        System.out.println("Conteúdos Inscritos "+ devLuna.getNome() + ": " + devLuna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ devLuna.getNome() + ": " + devLuna.getConteudosConcluidos());
        System.out.println("XP: " + devLuna.calcularTotalXP());
    }
}