List(1,2,3,4,"Cat",3,"Dog") collect {
  case i:Int => i *2
  case s:String=>s.toUpperCase
}

List(1,"AAAA",2.0,1.445,4,5,"mmm",'l') collect {
  case d:Double=>d*100
}

val sample= 1 to 10
val isEven:PartialFunction[Int,String]={
  case i:Int if (i % 2==0) => i + " is even"
}

val isOdd:PartialFunction[Int,String]={
  case i:Int if (i % 2!=0) => i + " is odd"
}

sample collect (isOdd orElse isEven)
sample map (isOdd orElse isEven)



