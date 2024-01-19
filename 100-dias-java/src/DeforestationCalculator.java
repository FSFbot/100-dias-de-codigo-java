public class DeforestationCalculator {
    private static final double FOOTBALL_FIELD_AREA = 105 * 68; // in m²

    public static double calculateFootballFields(double deforestedAreaInKm2) {
        double deforestedAreaInM2 = deforestedAreaInKm2 * 1_000_000; // convert km² to m²
        return deforestedAreaInM2 / FOOTBALL_FIELD_AREA;
    }

    public static void main(String[] args) {
        double deforestedAreaInKm2 = 1.034; // example input
        double footballFields = calculateFootballFields(deforestedAreaInKm2);
        System.out.printf("%.3f km² is equivalent to %.0f football fields.\n", deforestedAreaInKm2, footballFields);
    }
}
