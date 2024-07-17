package semi.vo;

public class movieVo {
	private int movieNum;
	private String movieTitle;
	private String movieContent;
	private String director;
	private String genre;
	private String rating;
	private String image;
	public movieVo() {}
	public movieVo(int movieNum, String movieTitle, String movieContent, String director, String genre, String rating,
			String image) {
		super();
		this.movieNum = movieNum;
		this.movieTitle = movieTitle;
		this.movieContent = movieContent;
		this.director = director;
		this.genre = genre;
		this.rating = rating;
		this.image = image;
	}
	public int getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieContent() {
		return movieContent;
	}
	public void setMovieContent(String movieContent) {
		this.movieContent = movieContent;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
