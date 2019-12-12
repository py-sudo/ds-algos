
// Find duplicates in O(n) time and O(1) extra space | Set 1
// mark element with negative sign

//let arr = [1, 2, 3, 1, 3, 6, 6,-1,-3,-5,-7];
// let arr = [1,2,3];
let arr = [2, 3, 6, 4, 1, 1];
// let arr = [-1,-3]
// let arr = [7,8,9,11,12]


function moveNegToLeft(arr){

    let j=0
    let temp;
    for(let i=0;i<arr.length;i++){
        if(arr[i]<0){
            temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            j++;
        
        }
    }
 
    return j;
}

function findMissingPositive(arr) 
{ 
    let i; 
    for (i = 0; i < arr.length; i++) { 
        
        let x = Math.abs(arr[i]); 

        if (x - 1 < arr.length && arr[x - 1] > 0) {
            arr[x - 1] = -arr[x - 1]; 
            console.log(arr[x-1]);
        }
            
    } 
    // Mark arr[i] as visited by making 
    // arr[arr[i] - 1] negative. Note that 
    // 1 is subtracted because index start 
    // from 0 and positive numbers start from 1 

    //  let arr = [2, 3, 6, 4, 1, 1];

    // Return the first index value at which 
    // is positive 
    for (i = 0; i < arr.length; i++) 
        if (arr[i] > 0) 
            return i + 1; // 1 is added becuase indexes 
    // start from 0 

    return arr.length + 1; 
} 

/* Find the smallest positive missing  
   number in an array that contains 
   both positive and negative integers */
function findMissing(arr, size) 
{ 
    // First separate positive and 
    // negative numbers 
    let shift = moveNegToLeft(arr, size); 
    let arr2 = [];
    let j = 0; 
    for (let i = shift; i < arr.length; i++) { 
        arr2[j] = arr[i]; 
        j++; 
    } 
    // Shift the array and call 
    // findMissingPositive for 
    // positive part 
    return findMissingPositive(arr2); 

} 




// given an array A of N integers, 
// returns the smallest positive integer (greater than 0) that does not occur in A.

// For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

// Given A = [1, 2, 3], the function should return 4.

// Given A = [−1, −3], the function should return 1.

console.log('a')

function solution() {
    // You can write to stdout for debugging purposes, e.g.
    // console.log('this is a debug message');
    let url = 'https://www.example.com/articles';
    fetch(url)
    .then((res)=>{
         if (!res.ok) 
            throw Error(res.statusText);
       return res.json();
    })
    .then((data)=>{
        addToDom(data);
    })
    .catch((err)=>{
        console.log(err);
    })

}
