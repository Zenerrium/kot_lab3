interface HorseInt{
    val food: String
    val location: String
    fun makeNoise()
    fun runspeed()
}

interface EagleInt {
    val size: String
    val wingL: Double
    fun flightAltitude()
    fun flightSpeed()
}
    
class Horse(override val food: String, override val location: String) : HorseInt {
    override fun makeNoise() {
        println("Лошадь издает звук")
    }
    override fun runspeed() {
        println("Лошадь бежит")
    }
}

class Eagle(override val size: String, override val wingL: Double) : EagleInt {
    override fun flightAltitude() {
        println("Орел летит")
    }
    override fun flightSpeed() {
        println("Орел ускоряется")
    }
}

class Pegasus(horse: HorseInt, eagle: EagleInt): HorseInt by horse, EagleInt by eagle

fun main() {
    val horse = Horse("Корм", "Поле")
    val eagle = Eagle("Большой", 3.5)
    val Pegas = Pegasus(horse, eagle)

    println("Еда: " + Pegas.food)
    println("Локация: " + Pegas.location)
    println("Размер: " + Pegas.size)
    println("Размах крыльев: " + Pegas.wingL)

    Pegas.makeNoise()
    Pegas.runspeed()
    Pegas.flightAltitude()
    Pegas.flightSpeed()
}
