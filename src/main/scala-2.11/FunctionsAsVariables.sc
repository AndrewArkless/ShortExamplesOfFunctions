//Functions as Variables

val double=(i:Int)=>{i *2}
double(2)
double(3)

val list=List.range(1,5)
list.map(i=>double(i))
list.map(double)


val f:(Int)=>Boolean = i => {i % 2==0}
val f1:Int=>Boolean = i => i % 2 ==0
val f2:Int=>Boolean = _ % 2 ==0

def myRange(list:List[Int],f:Int=>Int)={
  list.map(f)
}

myRange(list,double)


