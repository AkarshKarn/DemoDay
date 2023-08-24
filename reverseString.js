// Write a program to print the given string in reverse order.

function reverseString(str) {

    let newString = "";
    for (let i = str.length - 1; i >= 0; i--) {
        newString += str[i];
    }
    return newString;
}


const string = "This is my String";

const result = reverseString(string);
console.log(result);



