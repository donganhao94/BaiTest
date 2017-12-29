
public class RegularPrice implements IPrice {

	@Override
	public double getCharge(int rentDays) {
		if (rentDays <= 0)
			return 0;
		if (rentDays < 3)
			return 3000;
		return (rentDays - 2) * 1000 + 3000;
	}

	@Override
	public double getFrequentRenterPoints(int rentDays) {
		if (rentDays <= 0)
			return 0;
		return 1;
	}
}
