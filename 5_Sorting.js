const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter an array of numbers separated by spaces: ', (input) => {
    // Split the user input into an array of numbers
    const inputArray = input.split(' ').map(Number);

    // Check if the inputArray contains valid numbers
    if (inputArray.some(isNaN)) {
        console.log('Invalid input. Please enter a valid array of numbers.');
    } else {
        // Sort the array in descending order
        inputArray.sort((a, b) => b - a);

        // Print the sorted array
        console.log('Sorted in descending order:', inputArray);
    }

    rl.close();
});