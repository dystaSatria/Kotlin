class Food(val name: String, val taste: String, val brand: String, val price: Double) {
    
    fun displayInfo() {
        println("Food: $name")
        println("Taste: $taste")
        println("Brand: $brand")
        println("Price: $price")
    }
}

fun main() {
    
    val food1 = Food("Fried Rice", "Savory", "Simple Eats", 15.0)
    val food2 = Food("Chicken Satay", "Sweet and Spicy", "Sate Garden", 20.0)
    val food3 = Food("Spaghetti","Barbeque","Indofood",8.0)

    // Display food information
    println("Food 1 Information:")
    food1.displayInfo()

    println("\nFood 2 Information:")
    food2.displayInfo()
}
