class Penjumlahan(var number1: Int, var number2: Int) : Hitung() {
    override fun hasil(): Int {
        return (number1 + number2)
    }
}