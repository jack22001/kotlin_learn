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
  
# 继承
   ## Any 类，超类 
    提供了equals(),hashCode(),toString()方法
   ## 构造函数
    子类有主构造函数
        必须在主构造函数中初始化基类
    子类无主构造函数
        super关键字初始化基类
   ##重写
    open修饰符修饰方法，子类可以重写，用override关键字
    如果有多个相同的方法（如果继承多个类或接口，里面有相同的方法），必须重写
   ## 属性重写
    属性必须有兼容类型
    可以用一个var重写val的属性，但反过来不行，因为，val属性提供了默认的getter方法，禁用了setter方法
# 接口
   ## 定义
   类似java8 interface, 可以有空实现
   interface a{
    fun foo{
        print("dd")
    }
   }
   ## 属性
    必须是空抽象的，不能初始化，实现接口的类必须初始化属性
    interface a{
        override var name:String
    }
# 扩展 可以对一个类的属性和方法进行扩展，且不需要decorator模式，
# 扩展是个静态行为，不会对类代码本身造成任何影响
   #扩展函数 
    fun receiverType.functionName(param){}
   # 若成员函数和扩展函数一致，
   # 扩展一个空对象
   # 分发接受者   扩展接受者
   #伴生对象的扩展
    class MyClass{
        companion object{}
    }
    
   #** 伴生对象内的成员 相当于 java中的静态成员，其生命周期伴随类始终，在伴生对象内部，可以定义变量和函数，可以用
   # 直接用类名引用
   #对于伴生对象扩展函数有两种形式，一种是类内扩展，一种是类外扩展，这两种形式扩展后的名字可以一样，互不影响
   1. 类内伴生扩展和类外伴生扩展，互不影响
   2. 当同名是，类内的函数优先用类内的扩展
   3. 类内的伴生扩展只能被类内的函数使用，类外的函数和类伴生函数不能用
   4. 类外的伴生扩展，可以被类内的伴生对象的函数使用