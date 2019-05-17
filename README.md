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

#vararg 关键字
函数的可变长参数
fun vars(vararg v:Int){
for(vt in v){
print(vt);
}
}

# 05.14
#定义变量和常量
var 
val 常量使用前必须初始化；

#注释
#字符串模板
var a = 1
val s1 = "a is $a"
a =2
val s2 = "${s1.replace("is","was"),but now is $a}"

#NUll检查机制
"?"可以为空，"!!"如果为空抛出异常

#类型检测及自动类型检测
is运算符 类似 instanceof
//在这里还有一种方法，与Java中instanceof不同，使用!is
  // if (obj !is String){
  //   // XXX
  // }
  
#区间
".."操作符
"step"步幅
"downTo"

##基本数据类型  
kotlin没有基础的数据类型，只有封装的数据类型
Byte,Short,Int,Long,Float,Double,字符串不属于数据类型，是一个独立的数据类型
#比较两个数字
"==="比较地址和值，"=="比较值
#类型转换
每个数据类型都有toInt(),toByte()等等方法转换
#字符串
"""支持多行字符串
#字符串模板，模板表达式，"$"表示
val s="ba"
val b = "$s length is ${s.length()}"


