public static double polyEval(List<Double> coefficients, double x) {
    if (coefficients == null || coefficients.isEmpty()) {
        throw new IllegalArgumentException("Coefficient list cannot be null or empty.");
        // Or return a default value like 0.0 if that's more appropriate for your application.
    }
    // ... (rest of the code remains the same)
}
