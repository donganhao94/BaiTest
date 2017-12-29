
public class NewReleasePrice implements IPrice {

	@Override
	public double getCharge(int rentDays) {
		if (rentDays <= 0)
			return 0;
		return 4000 * rentDays;
	}

	@Override
	public double getFrequentRenterPoints(int rentDays) {
		if (rentDays <= 0)
			return 0;
		if (rentDays == 1)
			return 1;
		return 2;
	}

}
