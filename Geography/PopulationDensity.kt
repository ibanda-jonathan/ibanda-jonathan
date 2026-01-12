/**
 * Senior 3 Geography: Population Density Calculator
 * Formula: Density = Total Population / Land Area (sq km)
 */
fun main() {
    // 1. Data for Uganda (Approximate 2026 Estimates)
    val countryName = "Uganda"
    val totalPopulation = 48500000.0 // Approx 48.5 Million
    val landAreaSqKm = 241038.0      // Total area of Uganda

    // 2. Data for a specific District (e.g., Iganga)
    val districtName = "Iganga"
    val districtPopulation = 550000.0 
    val districtAreaSqKm = 1010.0

    // 3. Calculation Function
    fun calculateDensity(pop: Double, area: Double): Double {
        return pop / area
    }

    val ugandaDensity = calculateDensity(totalPopulation, landAreaSqKm)
    val igangaDensity = calculateDensity(districtPopulation, districtAreaSqKm)

    // 4. Output Results
    println("--- Geography Statistics: Population Density ---")
    println("$countryName Density: ${"%.2f".format(ugandaDensity)} people/sq km")
    println("$districtName Density: ${"%.2f".format(igangaDensity)} people/sq km")
    
    // 5. Geographical Interpretation
    if (ugandaDensity > 100) {
        println("Status: High Population Density (Pressure on land resources).")
    } else {
        println("Status: Moderate to Low Population Density.")
    }
}
