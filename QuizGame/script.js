const quizData = [
    { question: "Default value of int in Java", options: ["null", "0", "1", "-1"], answer: "0" },
    { question: "Default value of boolean in Java", options: ["true", "false", "0", "null"], answer: "false" },
    { question: "Keyword used to inherit a class", options: ["implements", "extends", "inherit", "super"], answer: "extends" },
    { question: "Keyword used to implement an interface", options: ["extends", "implements", "interface", "super"], answer: "implements" },
    { question: "Java is a ___ language", options: ["Procedural", "Object-Oriented", "Functional", "Scripting"], answer: "Object-Oriented" },
    { question: "Entry point method of Java program", options: ["start", "main", "run", "execute"], answer: "main" },
    { question: "Package imported by default", options: ["java.util", "java.io", "java.lang", "java.net"], answer: "java.lang" },
    { question: "Operator for concatenation in Java", options: ["+", "&", "concat", "*"], answer: "+" },
    { question: "Symbol for single-line comments", options: ["//", "/*", "<!--", "**"], answer: "//" },
    { question: "Symbol for multi-line comments", options: ["//", "/* */", "<!-- -->", "** **"], answer: "/* */" },
    { question: "Keyword to create an object", options: ["class", "new", "this", "super"], answer: "new" },
    { question: "Keyword to refer to current object", options: ["that", "this", "super", "self"], answer: "this" },
    { question: "Keyword to call parent class constructor", options: ["super", "this", "parent", "extends"], answer: "super" },
    { question: "Loop that checks condition after execution", options: ["for", "while", "do-while", "foreach"], answer: "do-while" },
    { question: "Statement to exit from a loop", options: ["break", "continue", "return", "exit"], answer: "break" }
];

let currentQuestion = 0;
let score = 0;

const questionEl = document.getElementById("question");
const optionsEl = document.getElementById("options");
const nextBtn = document.getElementById("next-btn");
const prevBtn = document.getElementById("prev-btn");
const skipBtn = document.getElementById("skip-btn");
const scoreContainer = document.getElementById("score-container");
const startScreen = document.getElementById("start-screen");
const quizBox = document.getElementById("quiz-box");

document.getElementById("start-btn").onclick = () => {
    startScreen.style.display = "none";
    quizBox.style.display = "block";
    loadQuestion();
};

function loadQuestion() {
    const q = quizData[currentQuestion];
    questionEl.textContent = `Q${currentQuestion + 1}: ${q.question}`;
    optionsEl.innerHTML = "";
    q.options.forEach(opt => {
        const btn = document.createElement("button");
        btn.textContent = opt;
        btn.onclick = () => selectAnswer(opt);
        optionsEl.appendChild(btn);
    });

    // Hide previous button if first question
    prevBtn.style.display = currentQuestion === 0 ? "none" : "inline-block";

    // Show skip until user selects answer
    skipBtn.style.display = "inline-block";
    nextBtn.style.display = "none";
}

function selectAnswer(selected) {
    const correct = quizData[currentQuestion].answer;
    if (selected === correct) score++;

    nextBtn.style.display = "inline-block";
    skipBtn.style.display = "none";

    Array.from(optionsEl.children).forEach(button => {
        button.disabled = true;
        if (button.textContent === correct) {
            button.style.background = "#4caf50";
            button.style.color = "white";
        } else if (button.textContent === selected) {
            button.style.background = "#f44336";
            button.style.color = "white";
        }
    });
}

nextBtn.onclick = () => {
    currentQuestion++;
    if (currentQuestion < quizData.length) {
        loadQuestion();
    } else {
        showScore();
    }
};

prevBtn.onclick = () => {
    currentQuestion--;
    loadQuestion();
};

skipBtn.onclick = () => {
    currentQuestion++;
    if (currentQuestion < quizData.length) {
        loadQuestion();
    } else {
        showScore();
    }
};

function showScore() {
    quizBox.style.display = "none";
    scoreContainer.style.display = "block";
    scoreContainer.textContent = `Your Score: ${score} / ${quizData.length}`;
}
