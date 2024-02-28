//for loop used for accessing the elements of the array

let cities = ["Delhi","Patna","Bangalore","pune"];
// for(let i =0; i<cities.length;i++){
//     console.log(cities[i]);
// }

//the elements of an array can be accessed by using for-of loop also
for(let i of cities){
       console.log(i);
}

//to print the elements in the upper case
for(let i of cities){
    console.log(i.toUpperCase());
}

//an array of marks is given , print the average of the marks in the class

let marks = [85,97,44,37,76,60];
let sum = 0;
for(let i =0; i<marks.length; i++){
    sum = sum + marks[i];
}
let avg = sum/marks.length;
console.log(avg);

//array methods
//push() and pop() methods make changes in the original array itself
let items = ["chips","mango","papaya","nuts"];
items.push("pen");
console.log(items);

items.pop();
console.log(items);

//toString method does not make changes in the original array it returns a new array
console.log(items.toString());
console.log(items);

//concatenation of two arrays
let newArray = marks.concat(items);
console.log(newArray);

// shift and unsift methods of an array
//shift methods works as a pop method but from the front 
items.shift();
console.log(items);

items.unshift("bottles");
console.log(items);

//slice method
let value = items.slice(1,3);
console.log(value);

//splice method this method will make changes in the original array splice(strIdx, remove, add element)
items.splice(2,1,"laptop");
console.log(items);