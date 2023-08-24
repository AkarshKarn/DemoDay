// Write a program in JavaScript to check the given number in array is prime number or not.

const arr = [1,15,26,93,31,17,2,3,4,5,6,7,8,9]; 


function isPrime(num) {
  for (let i = 2; num > i; i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return num > 1;
}

console.log(arr.filter(isPrime));