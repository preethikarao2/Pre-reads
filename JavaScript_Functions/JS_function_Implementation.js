numbers = [18,21,13,40,5]
sum = 0;
function doubleMap(number) {
    return number*number;
}
function canVote(number) {
    if (age >= 18){
      return true;
   }
   return false;
}
function sumArray(number) {
    sum = sum+number;
    return sum;
}
function getElement(number) {
    return number;
}
const calculate = function(numbers,logic) {
    let output = []
    for(iter=0;iter < numbers.length;iter++) {
        result = logic(numbers[iter]);
        if(result)
        output.push(result);
    }
    return output;
    
}
console.log("map function without inbuilt function");
console.log(calculate(numbers,doubleMap));
console.log("filter function without inbuilt function");
console.log(calculate(numbers,canVote));
console.log("reduce function without inbuilt function");
calculate(numbers,sumArray);
console.log(sum);
console.log("for each function without inbuilt function");
console.log(calculate(numbers,getElement));
