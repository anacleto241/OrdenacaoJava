package ordenacaojava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String arquivoCSV = "C:\\Users\\fabri\\OneDrive\\Documentos\\Faculdade\\4° Período SI\\Estrutura de Dados II\\OrdenacaoJava\\dadosConcurso.csv";
        List<Candidato> candidatos = new ArrayList<>();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            String linha;
            boolean primeiraLinha = true;
            
            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }
                
                String[] dados = linha.split(","); 
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                LocalDate dataAniversario = LocalDate.parse(dados[2], formatter);
                int pontuacao = Integer.parseInt(dados[3]);
                
                Candidato candidato = new Candidato(id, nome, dataAniversario, pontuacao);
                candidatos.add(candidato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Candidato[] candidatosArray = candidatos.toArray(new Candidato[0]);
        
        InsertionSort<Candidato> sorter = new InsertionSort<>();
        sorter.sort(candidatosArray);

        System.out.println("Candidatos Ordenados:");
        for (Candidato candidato : candidatosArray) {
            System.out.println(candidato);
        }
    }
}
