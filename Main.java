
public class Main {

	public static void main(String[] args) {
		Fachada fachada = new Fachada();
		
		Post_it postit = fachada.criarsimp();
		Post_it postit_taf = fachada.criartarefa();
		
		fachada.arquivar(postit);
		
		fachada.ver_arq();
		
		System.out.println("Post its com a tag Livro: ");
		try {
			fachada.buscar("Livro");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Todos os postits:");
		fachada.visualizar();
	}

}
