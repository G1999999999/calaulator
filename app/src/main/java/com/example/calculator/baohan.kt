package com.example.calculator1

fun baohan(a:String,i: Int): Boolean {
    var a1:String=""
    a1=a.substring(0..i-1)
    val b=a1.indexOf("-")
    if(('+' in a1)||(('-' in a1)&&a1[b-1]!='(')||('×' in a1)||('÷' in a1)){
        return false
    }else{
        return true
    }
}