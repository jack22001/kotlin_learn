# kotlin_learn
kotlin android learn

第一天:
切到androidX
constraintlayout 报错，版本换到1.1.3错误消失


函数体 fun关键字
fun a(a:Int,b:Int):Int{//参数类型Int，返回参数Int；
return a+b;}
or
fun a(a:Int,b:Int) = a+b //返回参数自动推断
or
fun a(a:Int,b:Int):Unit{}//无返回值得参数，类似void

vararg 关键字
函数的可变长参数
fun vars(vararg v:Int){
for(vt in v){
print(vt);
}
}



