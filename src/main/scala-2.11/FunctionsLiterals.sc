//Function Literals

val x=List.range(1,10)
val evens=x.filter((i:Int)=> i%2==0 )
val evens1=x.filter(_ %2==0)

x.foreach((i:Int)=>println(i))
x.foreach(println(_))
x.foreach(println)