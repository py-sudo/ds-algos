

// find missing elements in a Integer array containing 
//  numbers from 1 to 100.

function findMissingElement(arr,count){
    // count = arr.length +1;
    let expectedSum = (count+1) * count/2;
    let actualSum =0;
    arr.forEach(e=>{
        actualSum+=e;
    });
    let missingEle = expectedSum - actualSum;
    return missingEle;
}

function getMissingNo(arr)  
{ 
    let total = 1; 
  
    for (let i = 2; i <=(arr.length + 1); i++)  // 1 missing number
    { 
        total += i; 

        total -= arr[i - 2]; 
    } 
    return total; 
}

// if there is more than 1 element

function findMissElements(arr){
    
    let temp =[];
    
    for(let i=0;i<arr.length;i++){
        temp[i] =0;
    }



    arr.forEach(e=>{
        temp[e] =1;
    })
  
    for(let i =0;i<temp.length;i++){
        if(temp[i]==0 && i!=0)
            console.log(i)
    }
    



}



function main(){
    let arr = [1,2,3,5];
    let arr1 = [ 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 ];
    console.log(getMissingNo(arr));
    console.log(findMissingElement(arr,arr.length+1));
    findMissElements(arr1)
}

main()