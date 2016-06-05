def exec(callBack :Int => Unit): Unit = {
  callBack(1)
}

val plusOne=(i:Int)=>println("AAAAAAAAAAAA     " + (i+1))

exec(plusOne)
////////////////////////////////////////////////
def exec2(x:Int, f:(Int,Int)=>Int,f2:Int=>Unit)={
  val y=10
  f2(f(x,y))
}

exec2(20,(x:Int,y:Int)=>x+y,plusOne)

////////////////////////

def executeXTimes(callBack:Int=>Unit, numTimes:Int)={
  for(i<-1 to numTimes) callBack(2)
}

executeXTimes(plusOne,2)

//////////////

def executeAndPrint(f:(Int,Int)=>Int, x:Int,y:Int)={
  val result=f(x,y)
  println(result)

}

val sum=(x:Int,y:Int)=>x+y
val multiply=(x:Int,y:Int)=>x*y

executeAndPrint(sum,1,2)
executeAndPrint(multiply,2,5)

////////////////////////////

def exec3(callBack:(Any,Any)=>Unit,x:Any,y:Any)={
  callBack(x,y)
}

val printTwoThings=(a:Any,b:Any)=>{
  println(a)
  println(b)
}

case class Person(name:String)

exec3(printTwoThings,"Hello",Person("Dave"))

