
public class ChildrensPrice implements IPrice {

	@Override
	public double getCharge(int rentDays) {
		if (rentDays <= 0)
			return 0;
		if (rentDays < 4)
			return 2500;
		return (rentDays - 3) * 1500 + 2500;
	}

	@Override
	public double getFrequentRenterPoints(int rentDays) {
		if (rentDays <= 0)
			return 0;
		return 1;
	}
}
