fun main() {
    // Biology: BMI = Mass (kg) / Height (m)²
    val weightKg = 65.0 
    val heightMeters = 1.7
    
    val bmi = weightKg / (heightMeters * heightMeters)
    
    println("--- Senior 3 Biology: Health Report ---")
    println("Weight: $weightKg kg")
    println("Height: $heightMeters m")
    println("Calculated BMI: ${"%.2f".format(bmi)}")
    
    when {
        bmi < 18.5 -> println("Status: Underweight")
        bmi in 18.5..24.9 -> println("Status: Healthy Weight")
        else -> println("Status: Overweight")
    }
}
