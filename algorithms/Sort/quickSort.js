function swap(arr,a,b){
    let temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}

function quickSort(arr){
    let i= -1;
    let p = arr.length - 1;
    if(p==0)
        return;

    for(let j =0;j<arr.length;j++){
        if(arr[j]<=arr[p]){
            i++;
            swap(arr,i,j)
        }
    }

    //partitioning 
    if(i>=0){
        let left = arr.slice(0,i);
        let right = arr.slice(i);
        // console.log(i);
    
        // console.log(left);
        // console.log(right);
    
    
        quickSort(left);
        quickSort(right);
    }
   
    
}

function main() {
    let arr = [2,5,3,1,10,4];
    quickSort(arr);
    console.log(arr);
}

main();

/*
quick sort algo:

QuickSort(arr,firstIndex,LastIndex)

if(firstIndex<lastIndex){ // two or more element in array
    r = partition(arr,firstIndex,LastIndex)
    QuickSort(arr,firstIndex,r-1); //left part of array
    QuickSort(arr,r+1,lastIndex); //Right part of array

}


partition(arr,firstIndex,LastIndex)
    p = lastindex;
    i = firstIndex-1;

    for(j=firstIndex to LastIndex)
        if(arr[j]<= arr[p])
            i++;
            swap(arr,i,p)
    
    return i;


*/