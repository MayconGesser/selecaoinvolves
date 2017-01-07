package objetos;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DocumentoCSV {
	private LinkedHashMap<String,ArrayList<String>> colunas;
	private ArrayList<String> linhas;
	
	public DocumentoCSV(){
		this.colunas = new LinkedHashMap<>();
		this.linhas = new ArrayList<>();
	}
	
	public void addColuna(String chave){
		this.colunas.put(chave, new ArrayList<>());
	}
	
	public void inserirNaColuna(String coluna,String valor){
		this.colunas.get(coluna).add(valor);
	}
	
	public void inserirLinha(String linha){	//TODO:Melhorar esse metodo
		this.linhas.add(linha);
	}
	
	public ArrayList<String> getColuna(String coluna) {
		return colunas.get(coluna);
	}
	
	public void imprimirColuna(String coluna){
		ArrayList<String> valores = this.colunas.get(coluna);
		for(String s : valores){
			System.out.println(s);
		}
	}
	
	public void imprimirCSVCompleto(){
		for(String linha : this.linhas){
			System.out.println(linha);
		}
	}
	
	public int getNumeroTotalRegistros(){
		return this.linhas.size();
	}
	
	public int getNumeroTotalColunas(){
		return this.colunas.size();
	}
	
	public String[] getNomesColunas(){
		String[] retorno = new String[this.colunas.size()];
		retorno = this.colunas.keySet().toArray(retorno);
		return retorno;
	}
}