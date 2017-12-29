
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Movie> movie;
	private double points;

	public Customer(String name) {
		this.name = name;
		movie = new ArrayList<Movie>();
		points = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getRentals() {
		return movie;
	}

	public void setRentals(List<Movie> movie) {
		this.movie = movie;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public int addList(Movie m) {
		if (movie.size() == 5)
			return 0;
		for (int i = 0; i < movie.size(); i++) {
			if (movie.get(i).getId() == m.getId())
				return -1;
		}
		movie.add(m);
		return 1;
	}

	public int remove(Movie m, int rentDays) {
		for (int i = 0; i < movie.size(); i++) {
			if (movie.get(i).getId() == m.getId()) {
				points = points + movie.get(i).getFrequentRenterPoints(rentDays);
				movie.remove(i);
				return 1;
			}
		}
		return 0;
	}

	public void inHoaDon(ArrayList<Rental> r) {
		double tong = 0;
		System.out.println("Ten khach hang: " + name);
		for (Rental rt : r) {
			for (int i = 0; i < movie.size(); i++) {
				Movie m = movie.get(i);
				if (m.getId() == rt.getIdMovie()) {
					String loai;
					if (m.getPrice() instanceof RegularPrice)
						loai = "RegularPrice";
					else if (m.getPrice() instanceof NewReleasePrice)
						loai = "NewReleasePrice";
					else if (m.getPrice() instanceof ChildrensPrice)
						loai = "ChildrensPrice";
					else
						loai = "Khong xac dinh";
					int rentDays = rt.getRentDays();
					double gia = movie.get(i).getCharge(rentDays);
					tong = tong + gia;
					System.out.println("Phim: " + m.getTitle() + "(ID: " + m.getId() + ". Loai: " + loai
							+ "). So ngay muon: " + rentDays + " .Gia: " + gia);
					points = points + m.getFrequentRenterPoints(rt.getRentDays());
					movie.remove(i);
				}
			}
		}
		System.out.println("Tong tien: " + tong);
		System.out.println("____________________________");
	}
}