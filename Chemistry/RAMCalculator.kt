fun main() {
    // Chemistry: Relative Atomic Mass (RAM) of Water (H2O)
    val hydrogenMass = 1.008
    val oxygenMass = 15.999
    
    val waterRAM = (hydrogenMass * 2) + oxygenMass
    
    println("--- S3 Chemistry: Molecular Mass ---")
    println("Compound: H2O (Water)")
    println("Calculated RAM: ${"%.3f".format(waterRAM)} g/mol")
}
