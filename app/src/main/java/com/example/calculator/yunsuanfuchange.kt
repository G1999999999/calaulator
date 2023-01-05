package com.example.calculator1

fun yunsuanfuchange(opp:String):String{
    var op=opp
    if(op=="*"){
        op="×"
    }
    if(op=="/"){
        op="÷"
    }
    return op
}