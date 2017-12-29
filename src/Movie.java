
public class Movie implements IPrice {
	private int id;
	private String title;
	private IPrice price;
	
	public Movie(int id, String title, IPrice price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public IPrice getPrice() {
		return price;
	}

	public void setPrice(IPrice price) {
		this.price = price;
	}

	@Override
	public double getCharge(int rentDays) {
		return price.getCharge(rentDays);
	}

	@Override
	public double getFrequentRenterPoints(int rentDays) {
		return price.getFrequentRenterPoints(rentDays);
	}
}
