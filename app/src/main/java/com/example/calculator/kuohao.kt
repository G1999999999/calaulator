package com.example.calculator1

fun kuohao(dengshi1:String): String {
    var dengshi=dengshi1
    var index_temp= mutableListOf<Int>()
    for(i in 0..(dengshi.length-1)){
        if(dengshi[i]=='×'||dengshi[i]=='÷'){
                index_temp= index_temp.plus(i) as MutableList<Int>//index_temp乘的索引
            }
    }
    for(a in 0..(index_temp.size-1)) {
        var i= index_temp[a]
        if(baohan(dengshi,i-1)){
            continue
        }
        var dcheng:Int=0
        for(m in i-1 downTo 0){
            if(dengshi[m]=='+'||(dengshi[m]=='-'&&dengshi[m-1]!='(')||dengshi[m]=='×'||dengshi[m]=='÷'){
                dcheng=m
                break
            }
        }
        if(dengshi[dcheng]=='×'||dengshi[dcheng]=='÷'){
                continue
            }else{
            var a1=dengshi.substring(0..(i-1))
            var a2=dengshi.substring(i..dengshi.length-1)
            dengshi = "(".plus(a1).plus(")").plus(a2)
            for(w in 0..index_temp.size-1){
                index_temp[w]=index_temp[w]+2
            }
        }

    }
    return dengshi
}