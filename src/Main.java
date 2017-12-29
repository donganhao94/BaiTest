import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> khach = new ArrayList<>();
		khach.add(new Customer("hao"));
		khach.add(new Customer("truc"));
		khach.add(new Customer("thinh"));
		ArrayList<Movie> movie = new ArrayList<>();
		movie.add(new Movie(0, "0", new RegularPrice()));
		movie.add(new Movie(1, "1", new RegularPrice()));
		movie.add(new Movie(2, "2", new NewReleasePrice()));
		movie.add(new Movie(3, "3", new NewReleasePrice()));
		movie.add(new Movie(4, "4", new RegularPrice()));
		movie.add(new Movie(5, "5", new ChildrensPrice()));
		movie.add(new Movie(6, "6", new RegularPrice()));
		movie.add(new Movie(7, "7", new NewReleasePrice()));
		System.out.println(khach.get(0).addList(movie.get(1)));
		ArrayList<Rental> r=new ArrayList<>();
		r.add(new Rental(3, movie.get(1).getId()));
		System.out.println(khach.get(0).addList(movie.get(5)));
		r.add(new Rental(4, movie.get(5).getId()));
		System.out.println(khach.get(0).addList(movie.get(3)));
		r.add(new Rental(1, movie.get(3).getId()));
		khach.get(0).inHoaDon(r);
	}
}
