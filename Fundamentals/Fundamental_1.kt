fun main(){
    val a=3
    var b=4
    println(a+b)
//  a=4    //Val cannot be redefined
    b=7
    var name: String="Sajjad"
    val nom=558
//  println(name+nom)
//  println("The person"+ name+"is of age is "+ nom)
    println("The person $name is of age $nom")    //use string templates bot
    println("The person $name is of age, ${nom+3}")   //adding
    
    var pis =3.14   //val cannot be reassigned //kotlin by default treats it as a double not a float
    var pi =3.14F   //F tells him that "Yo this is not a double this is a float"
    println(pi)
    println(pi::class)

}