import java.util.ArrayList;

public class Fachada implements IUsuario{
	
	private ArrayList<Post_it> postits = new ArrayList<Post_it>();
	private ArrayList<Post_it> arquivados = new ArrayList<Post_it>();
	
	@Override
	public void arquivar(Post_it postit){
		this.arquivados.add(postit);
	}

	@Override
	public Post_simp criarsimp() {
		Post_simp postsimp;
		postsimp= new Post_simp("Livro de ação", "Livro");
		
		postits.add(postsimp);
		
		return postsimp;
	}

	@Override
	public Post_taf criartarefa() {
		Post_taf postaf;
		postaf= new Post_taf("Livro de ação", "Lembrar de Ler", "8min");
		
		postits.add(postaf);
		
		return postaf;
	}

	@Override
	public void ver_arq() {
		for(int i = 0; i < arquivados.size(); i++) {
			Post_it postit = arquivados.get(i);
			System.out.println("===============");
			System.out.println("Descrição do Post it: " + postit.getDescricao());
			System.out.println("Tags: " + postit.getTags());
		}
	}

	@Override
	public void buscar(String tag) throws Exception {
		int postitsComTag = 0;
		
		for(int i = 0; i < postits.size(); i++) {
			Post_it postit = postits.get(i);

			if(postit.getTags().contains(tag)) {
				postitsComTag++;
				
				System.out.println("===============");
				System.out.println("Descrição do Post it: " + postit.getDescricao());
				System.out.println("Tags: " + postit.getTags());
			}
		}
		
		if(postitsComTag == 0) {
			throw new Exception("Não há nenhum Post it com a tag informada.");
		}
	}

	@Override
	public void visualizar() {
		for(int i = 0; i < postits.size(); i++) {
			Post_it postit = postits.get(i);
			System.out.println("===============");
			System.out.println("Descrição do Post it: " + postit.getDescricao());
			System.out.println("Tags: " + postit.getTags());
		}
	}

}
