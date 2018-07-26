public abstract class Post_it {
	private String descricao;
	private String tags;

	public Post_it(String descricao, String tags) {
		this.descricao = descricao;
		this.tags = tags;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
		
}