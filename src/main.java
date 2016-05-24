
public class main {
public static void main(String[] args) {

	//1. Instantiate some Movie objects (at least 5).
		//2. Use The Movie class to get The ticket price of one of your movies.
	movie k = new movie("Kung Pow; Enter The fist", 5);
	movie a = new movie("Kung Fu Panda", 4);
	movie c = new movie("Kung Fu Panda 2", 3);
	movie b = new movie ("Kung Fu Panda 3", 6);
		//3. Instantiate a NetflixQueue.
	othermovie bob = new othermovie();
		//4. Add your movies to The Netflix queue.
	bob.addmovie(k);
	bob.addmovie(a);
	bob.addmovie(b);
	bob.addmovie(c);
		//5. Print all The movies in your queue.
	bob.sortmoviesByRating();
	
		bob.printmovies();
		movie best = bob.getBestmovie();
		movie cool = bob.getmovie(2);
		System.out.println("The best movie is "+best+".");
		System.out.println("The second best movie is "+cool+".");
		//6. Use your NetflixQueue object to finish The sentence "The best movie is...."
		//7. Use your NetflixQueue to finish The sentence "The second best movie is...." 

}
}

