package services;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Figurinha;
import repositories.FigurinhaRepository;

public class FigurinhaService {
	private FigurinhaRepository figurinhaRepository = new FigurinhaRepository();
    ArrayList<String> figurinhas = new ArrayList<String>();

	  public void inserir(Figurinha figurinha) {
		  System.out.println("Salvando....");
		  figurinhaRepository.criarFigurinha(figurinha);
		  System.out.println("Figurinha salva com sucesso!");
	  }
	  
	  public void atualizar(Figurinha figurinha) {
		  System.out.println("Atualizando....");
		  figurinhaRepository.atualizarFigurinhas(figurinha);
		  System.out.println("Figurinha atualizada com sucesso!");
	  }
	  
	  public void remover(int figurinhaId) {
		  System.out.println("Removendo....");
		  figurinhaRepository.deletarFigurinha(figurinhaId);
		  System.out.println("Figurinha removida com sucesso!");
	  }
	  
	  public void download(Figurinha figurinha, String coluna, String tipoArquivo) throws IOException, SQLException {
		  System.out.println("Salvando....");
		  figurinhaRepository.download(figurinha, coluna, tipoArquivo);
		  System.out.println("Figurinha salva com sucesso!");
	  }
	  
	  public ArrayList<Figurinha> listarFigurinhas() {
		  System.out.println("Carregando figurinhas!");
		  return figurinhaRepository.listarFigurinhas();
	  }
	  
	  public Iterable<Figurinha> lerArquivo(File pathName) {
		  System.out.println("pathName: " + pathName);
		  return figurinhaRepository.ler(pathName);
	  }
	  
	  public Iterable<Figurinha> importarBin(File pathName) {
		  System.out.println("pathName: " + pathName);
		  return figurinhaRepository.importarBin(pathName);
	  }
	  
	  public void exportar() {
		  System.out.println("Exportando...");
		  figurinhaRepository.exportar();
	  }
	  
	  public void exportarBin() {
		  System.out.println("Exportando...");
		  figurinhaRepository.exportarBinario();
	  }
}
