//comparision operators
let a = 5;
let b =3;
console.log("5>3",a>b);

//checks value
a = 5;
b = "5";
console.log("5==5",a==b);

//cheks with the data types 
console.log("5===5",a===b);
console.log("5!==5",a!==b);

//logical operators gives true or false 

let x=6>9;
let y=2>1;
console.log("x && y",x && y);

console.log("x || y",x || y);

console.log("!x",!x);

//conditional statement 

let age = 45;
if(age>=60){
    console.log("senior citizen");
}
else if(50<=age<60){
    console.log("elder citizen");
}
else if(18<=age<50){
    console.log("youngster");
}else{
    console.log("kids");
}

//ternary operators
//condition : true output : false output
let res = age>=40 ? "adult" : "not adult";
console.log(res);

// alert("hello!"); //one time pop up
// prompt("log in"); //pop up message with the user input

// let mes = prompt("log in");
// console.log(mes);

//for-of loop is used for the string and object
let str =  "effigo";
for(let i of str){
    console.log(i);
}

//for-in loop is used for the object

let student = {
    name:"rahul kumar",
    age:20,
    cpa:7.9,
    isPass: true
};

for(let i in student){
    console.log(i);
}

//printing all the even numbers from 0 to 100

for(let i=0; i<=100; i++){
    if(i%2===0){
        console.log(i);
    }
}

