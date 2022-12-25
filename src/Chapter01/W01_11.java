package chapters.Chapter01;

public class W01_11 {

	public static void main(String[] args) {
		double secondinyear = 365 * 24 * 3600;

		double currentpopulation = 312032486;
		double birthinyear = secondinyear / 7.0;
		double deathinyear = secondinyear / 13.0;
		double immigrantinyear = secondinyear / 45.0;

		for (int i = 1; i < 6; i++) {
			currentpopulation = (birthinyear + immigrantinyear - deathinyear) + currentpopulation;
			System.out.println(i + ". Yıl Popülasyon=" + currentpopulation);
		}

	}

}
