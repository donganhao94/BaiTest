
public class Rental {
	private int rentDays;
	private int idMovie;

	public Rental(int rentDays, int idMovie) {
		super();
		this.rentDays = rentDays;
		this.idMovie = idMovie;
	}

	public int getRentDays() {
		return rentDays;
	}

	public void setRentDays(int rentDays) {
		this.rentDays = rentDays;
	}

	public int getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}

}
