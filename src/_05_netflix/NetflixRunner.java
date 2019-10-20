package _05_netflix;

public class NetflixRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie one = new Movie("one", 1);
		Movie two = new Movie("two", 2);
		Movie three = new Movie("three", 3);
		Movie four = new Movie("four", 4);
		Movie five = new Movie("five", 5);
		one.getTicketPrice();
		NetflixQueue first = new NetflixQueue();
		first.addMovie(one);
		first.addMovie(two);
		first.addMovie(three);
		first.addMovie(four);
		first.addMovie(five);
		first.printMovies();
		first.sortMoviesByRating();
		System.out.println("the best movie is: "+first.getBestMovie());
		System.out.println("the second best movie is: "+ first.getMovie(1));
	}

}
