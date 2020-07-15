
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundDown {

	public static void main(String[] args) {

		BigDecimal rawValue = new BigDecimal("145.376543456789");
		BigDecimal value = rawValue.setScale(-1, RoundingMode.DOWN);
		System.out.println(value);

	}
}
