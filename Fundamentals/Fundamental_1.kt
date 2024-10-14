import java.util.Scanner
fun greet(name:String):String{
          return "Hello I am $name"
}
fun add(q:Int,e:Int) = q+e      //short form
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
//     println(x+y)
    
    var names="Sajjad"
    var name2="Ahmad"
//     println("The first letter of name is ${names[0]} and the second is ${names[1]} and the lenght of string is ${names.length} and this name in uppercase is ${names.toUpperCase()}")
// 	println(names.compareTo(name2))
//     println(names.indexOf("d"))
    
    var products=3
    var price=400
//     println(products>price)
    if(products>price){
        println("The products are more than the price")
    }
    else{
        println("No bro the price is more")
    }
    val time=20
    val greeting=if(time>21) "Good moring" else "Good evening!"
//     println(greeting)
    
    //this is switch case
    val day=3
    val result=when(day){
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else-> "Invalid Day!"
    }
//     println(result)
   
   val number=24
    val result2=when{
        number>30->"Not good"
        number in 1..10->"Good"
        number in 11..20->"Very Good"
        number in 21..30->"Extreemely Good"
        else->"Invalid Range!"
    }
    println(result2)
    
//     var Apples=0
//     while(Apples<5){
//         println("Apples still ripping!")
//         Apples++
//     }
    
//     do{
//         println("Apples still ripping!")
//         Apples++
//     }while(Apples<5)

//     val scanner = Scanner(System.`in`) // This allows for input
//     var inputNum:Int
//     var isValid:Boolean=false
    
//     do{
//         println("Enter the number:")
//         inputNum=scanner.nextInt()
//         isValid=inputNum>0
//         if(!isValid){
//             println("invalid output! try agaain!")
//         }
//     }while(!isValid)
//     println("You entered a valud number: $inputNum")
//        val scanner = Scanner(System.`in`)
//        var inputNum:String
//       println("Enter the number:")
//      inputNum=readLine()
//     println(inputNum)
		val cars= arrayOf("Volvo","IBM","FORD")     //use arrayOf
        cars[0]="Ferrari"
//     	cars= arrayOf("sds","sd","FORsdD")    //here pops up the array
    	println(cars[0])
        val trucks= listOf("Volvo","IBM","FORD")
//         trucks[0]="Ferrari"        //this pops error, immutable list
// 		for(x in trucks){
//             println(x)
//         }
//         for(i in 1..5){
//             println(i)
//         }

        var greetresult=greet("John")
        println(greetresult)
        
        var testo=add(3,5)
        println(testo)

}