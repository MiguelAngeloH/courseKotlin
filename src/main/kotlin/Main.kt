package com.mikels
fun main(args:Array<String>) {
   fun calculo(vararg numeros:Int){
    for (n in numeros){
        println(n)
    }
   }
    calculo(1,2)
    calculo(1,2,3,4,5,6,7,8,9)
}