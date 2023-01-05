package com.example.calculator1

import java.io.File
fun main() {
    var suanshi:String=""
    var timu:String=""
    var daan:String=""
    var timut:String=""
    var daant:String=""
    println("请输入运算式中运算符种类的个数：")
    val n: Int =Integer.valueOf(readLine())
    println("请输入生成运算式的数量：")
    val num: Int =Integer.valueOf(readLine())
    if (n == 1) {
        println(num)
        for(i in 1..num step 1) {
            suanshi= oneyunsuan(i)
            timu=suanshi.substring(0..suanshi.indexOf("="))
            daan=suanshi.substring((suanshi.indexOf("=")+1)..(suanshi.length-1))
            timut=timut.plus(timu).plus('\n')
            daant=daant.plus(daan).plus('\n')
            println(suanshi)
        }
    } else if (n == 2) {
        for(i in 1..num step 1){
            suanshi=twoyunsuan(i)
            timu=suanshi.substring(0..suanshi.indexOf("="))
            daan=suanshi.substring((suanshi.indexOf("=")+1)..(suanshi.length-1))
            timut=timut.plus(timu).plus('\n')
            daant=daant.plus(daan).plus('\n')
            println(suanshi)
        }
    } else if (n == 3) {
        for(i in 1..num){
            suanshi= threeyunsuan(i)
            timu=suanshi.substring(0..suanshi.indexOf("="))
            daan=suanshi.substring((suanshi.indexOf("=")+1)..(suanshi.length-1))
            timut=timut.plus(timu).plus('\n')
            daant=daant.plus(daan).plus('\n')
            println(suanshi)
        }
    } else if (n == 4) {
        for(i in 1..num) {
            suanshi=fouryunsuan(i)
            timu=suanshi.substring(0..suanshi.indexOf("="))
            daan=suanshi.substring((suanshi.indexOf("=")+1)..(suanshi.length-1))
            timut=timut.plus(timu).plus('\n')
            daant=daant.plus(daan).plus('\n')
            println(suanshi)
        }
    } else {
        println("输入错误")
    }
    var recordsFile_timu = File("timu.txt")
    recordsFile_timu.appendText(timut)
    var recordsFile_daan = File("daan.txt")
    recordsFile_daan.appendText(daant)
}
//C:\Users\Lenovo\AndroidStudioProjects\calculator1