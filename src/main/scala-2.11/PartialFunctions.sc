val divide =(x:Int) => 42/x

val dividePF=new PartialFunction[Int,Int] {
  def apply(x:Int)=43/x
  def isDefinedAt(x:Int)= x != 0
}

dividePF.isDefinedAt(0)

val dividePF1: PartialFunction[Int,Int]={
  case d: Int if d != 0 => 42/d
}

//val a=List(0,1,2,3).map(dividePF1) blows up!

val a=List(0,2,3) collect (dividePF1) //ignores 0

dividePF1(1)
dividePF1.isDefinedAt(0)
val convertLowNumberToString=new PartialFunction[Int,String] {
  val nums=Array("One","Two","Three", "Four", "Five")
  def apply(i:Int)=nums(i-1)
  def isDefinedAt(i:Int)= i>0 && i<6

}

val convertLowNumberToString1:PartialFunction[Int,String]= {
  case i:Int if i>0 && i<6 => {
    val nums=Array("One","Two","Three", "Four", "Five")
    nums(i-1)
  }
}

convertLowNumberToString1(2)

val convertHighNumberToString:PartialFunction[Int,String]={

  case i:Int if i>5 && i<11 => {
    val nums=Array("Six","Seven","Eight", "Nine", "Ten")
    nums(i-6)
  }
}

val convertNumber12:PartialFunction[Int,String]={
  case i:Int if i==12 => {
   "Twelve"
  }
}
convertHighNumberToString(8)

val handle1to10=convertLowNumberToString1 orElse convertHighNumberToString orElse convertNumber12
List(1,2,30,43,32,12,3,11).collect(handle1to10)

handle1to10.isDefinedAt(11)
handle1to10(12)
//
dividePF1(0)




