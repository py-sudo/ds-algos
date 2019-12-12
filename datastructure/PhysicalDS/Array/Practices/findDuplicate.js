
// mark the cell value to negtive
// with index equal to the 

function findDup(arr){
    let dupArr = [];
    for(let i=0;i<arr.length;i++){
        let index = Math.abs(arr[i]);
        
        if(arr[index]>0)
            arr[index] = - arr[index];
        else
            dupArr.push(index);
    }

}

function main(){

}