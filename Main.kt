open class Horse(val food: String, val location: String) {
    fun makeNoise() {
        println("Лошадь издает звук")
    }
    fun runspeed() {
        println("Лошадь бежит")
    }
}

open class Eagle(val size: String, val wingL: Double) {
    fun flightAltitude() {
        println("Орел летит")
    }
    fun flightSpeed() {
        println("Орел ускоряется")
    }
}

class Pegasus(food: String, location: String, size: String, wingL: Double) {
    private val horse = Horse(food, location)
    private val eagle = Eagle(size, wingL)

    fun makeNoise() = horse.makeNoise()
    fun runspeed() = horse.runspeed()

    fun flightAltitude() = eagle.flightAltitude()
    fun flightSpeed() = eagle.flightSpeed()

    fun getFood(): String = horse.food
    fun getLocation(): String = horse.location
    fun getSize(): String = eagle.size
    fun getWingL(): Double = eagle.wingL
}

fun main() {
    val Pegas = Pegasus("Корм", "Поле", "Большой", 3.5)

    println("Еда: " + Pegas.getFood())
    println("Локация: " + Pegas.getLocation())
    println("Размер: " + Pegas.getSize())
    println("Размах крыльев: " + Pegas.getWingL())

    Pegas.makeNoise()
    Pegas.runspeed()
    Pegas.flightAltitude()
    Pegas.flightSpeed()
}
