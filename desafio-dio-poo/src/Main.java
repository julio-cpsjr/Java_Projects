import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulio = new Dev();
        devJulio.setNome("Julio");
        devJulio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julio:" + devJulio.getConteudoInscritos());
        devJulio.progedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Julio:" + devJulio.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Julio:" + devJulio.getConteudoConcluidos());
        System.out.println("XP:" + devJulio.calcularTotalXp());

        System.out.println("----------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudoInscritos());
        devMaria.progedir();
        devMaria.progedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Maria:" + devMaria.getConteudoConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());



    }
}
