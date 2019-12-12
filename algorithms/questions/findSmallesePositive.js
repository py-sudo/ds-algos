

function findMiss_self(arr){

    let temp;
    for(let i=0;i<arr.length;i++){
        while (arr[i]<=arr.length && arr[i]>0&& arr[arr[i]-1]!=arr[i]){
            let index = arr[i] -1;
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] =temp;
            // console.log(arr);
        }
    }
    
    for(let i=0;i<arr.length;i++){
        if(arr[i]!= i+1){
            return i +1;
        }
    }
    return arr.length+1;

}

