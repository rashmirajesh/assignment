const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverseWords(sentence) {
    // Split the sentence into words using space as the delimiter
    const words = sentence.split(' ');

    // Initialize an array to store the reversed words
    const reversedWords = [];

    // Reverse each word and add it to the reversedWords array
    for (const word of words) {
        const reversedWord = reverseString(word);
        reversedWords.push(reversedWord);
    }

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseString(str) {
    // Split the string into an array of characters, reverse it, and join it back
    return str.split('').reverse().join('');
}

rl.question('Enter a sentence: ', (inputSentence) => {
    const reversedSentence = reverseWords(inputSentence);
    console.log('Reversed Sentence:', reversedSentence);
    rl.close();
});