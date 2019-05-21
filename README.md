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

## 条件控制
#if表达式
    可以赋值给一个变量
    可以用区间 if(x in 1..9)
#when表达式
    既可以作为表达式，也可以是语句使用
    when(x){
        1 -> print(")
        2 -> print
        else{
            print()
        }
    }
    可以使用区间
    when(x){
        0,1 -> print()
        in 2...9 -> print()
    }

    使用 in 表示包含
    使用 is 来表示是不是一个特定的类型
 ## 循环控制
 # for
    for() 循环里面可以是代码块： item:Int in ints
    for(i in array.indices)
    for ((index,value) in array.withindex){
        print("$index is $value")
    }
   # while , do while
   # repeat
   # foreach
   
 ## 返回和跳转
    return
    continue
    break
   #标签
   @dd,@loop等都可以
 ## 标签处返回
    return @a 1  表示从标签a处返回1；
 
 
 # 类和对象  
   ## 定义
   ## 类的属性 
    使用 var, val定义 ， 没有new关键字
   ## 构造器  可以有一个主构造器和多个次构造器,主构造器是类头部的一部分
   ## getter setter
    var <propertyName>[propertyType][propertyValue]
    [getter]
    [setter]
   ## field关键字，只能用于属性的访问器
   ## init 关键字
   ## 次构造函数
    class ff constructor(name:String){
        init{ //初始化代码段
            ......
        }
        
        constructor ff(val name:string){
            ......
        }
        var no:Int = 0
            get() = Field
            set(value) field = value
    }
   ##空的主构造函数，不想让访问，就得private
    class dd private constructor(){
    }
    
   ## 抽象类
   ## 嵌套类
   ## 内部类 inner关键字
   ## 匿名内部类
   
   ## 类的修饰符
    abstract
    final
    enum
    open //可继承，默认是final
    annotation //注解类
   ## accessModifier 访问权限修饰符
    public
    protected
    private
    internal //同一个模块内
  
   
    