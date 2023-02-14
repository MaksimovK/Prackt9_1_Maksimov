import Insects.*
class Myxa(var kolvolapok: Int, var kolvovoloskov: Int, name: String, speed: Double, color: String, eat: String, habitat: String) : Insect(name, speed, color, eat, habitat)
{
    private var fly = true

    public fun CanFly() {
        println("$name может летать")
    }

    public fun Time(){
        var b : Double
        do {
            print("Введите растояние между точками (в км): ")
            b = readLine()!!.toDouble()
        }while (b <= 0)

        var speed = 30.0

        println("Муха пролетит за ${b / 30.0} секунд")
    }

    override fun GetInfo() {
        println("Название насекомого $name")
        println("Цвет $name $color")
        println("Скорость $name, $speed ")
    }

}