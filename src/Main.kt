import javax.print.attribute.IntegerSyntax

fun main (args: Array<String>) {

    val calc = Hitung()
    val penjumlahan:Penjumlahan = Penjumlahan(number1 = 0,number2 = 0)
    print("Masukkan nilai 1 : ")
    penjumlahan.number1 = Integer.valueOf(readLine())
    print("Masukkan nilai 2 : ")
    penjumlahan.number2 = Integer.valueOf(readLine())

    // menggunakan method
    calc.hasil()
    println("penjumlahan : ${penjumlahan.hasil()}")
}




