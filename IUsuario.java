
public interface IUsuario {
	public Post_simp criarsimp();

	public Post_taf criartarefa();

	public void arquivar(Post_it postit);
	
	public void ver_arq();

	public void buscar(String tag) throws Exception;
	
	public void visualizar();
}
