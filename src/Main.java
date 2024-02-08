import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criar instâncias de Curso, Mentoria e Bootcamp
        Curso curso1 = new Curso("Curso Java", "Descrição Curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição Curso JS", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição Mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criar instâncias de Dev
        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        // Imprimir informações sobre o progresso de Camila
        imprimirProgressoDev(devCamila);

        System.out.println("-------");

        // Criar instâncias de Dev
        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);

        // Imprimir informações sobre o progresso de João
        imprimirProgressoDev(devJoao);
    }

    // Método auxiliar para imprimir o progresso de Dev
    private static void imprimirProgressoDev(Dev dev) {
        System.out.println("Conteúdos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("-- Após Progresso --");
        System.out.println("Conteúdos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev.getNome() + ": " + dev.getConteudosConcluidos());
        System.out.println("XP " + dev.getNome() + ": " + dev.calcularTotalXp());
    }
}
