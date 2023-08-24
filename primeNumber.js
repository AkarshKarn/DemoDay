// Write a Javascript program to check if any given number is prime number or not.

function isPrime(n) {
    
    if (n <= 1)
        return false;

    
    for (let i = 2; i < n; i++)
        if (n % i == 0)
            return false;

    return true;
}



isPrime(11) 
    ? console.log("true") 
    : console.log("false");