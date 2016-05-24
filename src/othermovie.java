import java.util.ArrayList;
import java.util.Collections;

public class othermovie {
	
	ArrayList<movie> movies = new ArrayList<movie>();
	
	public movie getBestmovie(){
		this.sortmoviesByRating();
		return movies.get(0);
	}

	public void addmovie(movie movie) {
		movies.add(movie);
	}
	
	public movie getmovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getmovie() method.");
		return null;
	}
	
	public void sortmoviesByRating() {
		Collections.sort(movies);
	}

	public void printmovies() {
		System.out.println("Your Netflix queue contains: ");
		for (movie movie : movies) {
			System.out.println(movie);
		}
	}

}





