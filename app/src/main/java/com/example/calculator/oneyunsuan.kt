package com.example.calculator1

import kotlin.random.Random
fun oneyunsuan(num:Int): String{
    println("请输入第"+num+"个式子运算符的个数：")
    val numop: Int =Integer.valueOf(readLine())
    println("请输入第"+num+"个式子运算符1的种类：")
    var op1: String? =readLine()
    val randomnum= List(numop+1){ Random.nextInt(-10,10)}.toMutableList()
    var dengshi_op= listOf<String>()
    var sum:Double=0.0
    op1= op1?.let { yunsuanfuchange(it) }
    for(i in 1..numop){
            dengshi_op = dengshi_op.plusElement(op1.toString())
    }
    var chuhaosuoyin= listOf<Int>()
    for (a in 0..dengshi_op.size - 1) {
        if (dengshi_op[a] == "÷" && randomnum[a + 1] == 0) {
            chuhaosuoyin=chuhaosuoyin.plusElement(a)
        }
    }
    for(i in 0..chuhaosuoyin.size-1){
        randomnum[chuhaosuoyin[i]+1] = Random.nextInt(-10, 10)
        while(randomnum[chuhaosuoyin[i]+1]==0) {
            randomnum[chuhaosuoyin[i]+1] = Random.nextInt(-10, 10)
            if (randomnum[chuhaosuoyin[i]+1] != 0) {
                break
            }
        }
    }
    for(i in 1..(randomnum.size-1)){
        if(i==1){
            sum=randomnum[0].toDouble()
        }
        if(dengshi_op[i-1]=="+") {
            sum=sum+randomnum[i]
        }
        else if(dengshi_op[i-1]=="×"){
            sum=sum*randomnum[i]
        }
        else if(dengshi_op[i-1]=="÷"){
            sum=sum/randomnum[i]
        }
        else{
            sum=sum-randomnum[i]
        }
    }
    var a=1
    var shuzi:String=""
    var dengshi:String=""
    for(i in randomnum){
        shuzi = i.toString()
        if(i<0) {
            shuzi="(".plus(shuzi).plus(")")
        }
        if(a!=randomnum.size) {
            dengshi=dengshi.plus(shuzi)
            dengshi=dengshi.plus(dengshi_op[a-1])
            a++
        }
        else{
            shuzi = i.toString()
            if(i<0) {
                dengshi = dengshi.plus("(").plus(shuzi).plus(")")
            }
            else{
                dengshi = dengshi.plus(shuzi)
            }
            dengshi=dengshi.plus("=")
            dengshi=dengshi.plus(sum.toString())
        }
    }
    dengshi= kuohao(dengshi)
    return  dengshi
}