public class Post_taf extends Post_it {
	private String tempolimite;
	
	public Post_taf (String descricao, String tags, String tempolimite) {
		super(descricao, tags);
		this.tempolimite= tempolimite;
	}

	public String getTempolimite() {
		return tempolimite;
	}

	public void setTempolimite(String tempolimite) {
		this.tempolimite = tempolimite;
	}
}