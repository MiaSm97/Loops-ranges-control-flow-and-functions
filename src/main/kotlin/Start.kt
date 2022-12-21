fun main(){
        for(i in 1..100 step 2){
            if(i <= 50){
                number1(i)
            }else{
                number2(i)
            }
        }
}
fun number1(number: Int){
    println("Number i < 50: $number")
}
fun number2(number: Int){
    println("Number i > 50: $number")
}
/*Write a loop that prints numbers from 1 to 100, increasing by 2 (so 1, 3, 5...).
Use two different printing functions for values below 50 and values above 50.
 */
