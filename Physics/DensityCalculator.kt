fun main() {
    // S3 Physics: Density = Mass / Volume
    val mass = 500.0 // grams
    val volume = 250.0 // cm³
    
    val density = mass / volume
    
    println("--- S3 Physics Lab Results ---")
    println("Object Density: $density g/cm³")
    
    if (density < 1.0) {
        println("Result: This object will FLOAT.")
    } else {
        println("Result: This object will SINK.")
    }
}
