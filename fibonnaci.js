// Write a Javascript rogram to generate fibonacci series up to n terms.


//const num = parseInt();
let n1 = 0, n2 = 1, nextTerm;

console.log('Fibonacci Series:');

number = 10;

for (let i = 1; i <= number; i++) {
    console.log(n1);
    nextTerm = n1 + n2;
    n1 = n2;
    n2 = nextTerm;
}