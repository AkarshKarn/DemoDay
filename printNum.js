// Write a program to print numbers from 1-100 without using loops.

function PrintNumbers(start, end){
    console.log(start);

    if(start < end){
        PrintNumbers((start + 1), end);
    }
}


PrintNumbers(1, 100);