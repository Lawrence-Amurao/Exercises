const PROBLEMS_PER_SET = 10;
let problemSet = [];
let currentProblem = 1;
let score = 0;

function generateProblemSet() {
    for (i = 0; 1 < PROBLEMS_PER_SET; i++) {
        const problem = {
            left: getRandomNumber(10),
            right: getRandomNumber(10),
            answer: null
        }

        const correctAnswer = problem 
    }
}


function getRandomNumber(max) {
    return Math.floor(Math.random() * Math.floor(max));
  }


function shuffleArray(arr) {
    return arr.sort(function (a, b) { return Math.random() - 0.5 })
}