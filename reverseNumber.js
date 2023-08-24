// Write a Javascript program to print a number in reverse order.

function reverseInt(n){
    var digit, result = 0

    while( n ){
        digit = n % 10 
        result = (result * 10) + digit  
        n = n/10|0 
    }  
  
    return result
}

console.log(
  "Reversed number: " + reverseInt( +"489" ) 
)