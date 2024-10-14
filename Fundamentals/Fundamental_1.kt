fun main(){
    val a=3
    var b=4
//     println(a+b)
//  a=4    //Val cannot be redefined
    b=7
    var name: String="Sajjad"
    val nom=558
//  println(name+nom)

//  println("The person"+ name+"is of age is "+ nom)
//     println("The person $name is of age $nom")    //use string templates bot
//     println("The person $name is of age, ${nom+3}")   //adding
    
    var pis =3.14   //val cannot be reassigned //kotlin by default treats it as a double not a float
    var pi =3.14F   //F tells him that "Yo this is not a double this is a float"
//     println(pi)
//     println(pi::class)   //tells the datatype of the variable
    var flag=true
//     var flag:boolean=true
//     var flag:Char='F'
//     println(flag)
//     println(flag::class)
    var x:Int=2
    var y:Long=x.toLong()
    println(x+y)
    
    var names="Sajjad"
    var name2="Ahmad"
    println("The first letter of name is ${names[0]} and the second is ${names[1]} and the lenght of string is ${names.length} and this name in uppercase is ${names.toUpperCase()}")
	println(names.compareTo(name2))
    println(names.indexOf("d"))
    
    var products=3
    var price=400
    println(products>price)
    if(products>price){
        println("The products are more than the price")
    }
    else{
        println("No bro the price is more")
    }
    val time=20
//     val greeting=if(time>21) "Good moring" else "Good evening!"
    val greeting= time>21? "Good moring":"Good evening!"
    println(greeting)
}