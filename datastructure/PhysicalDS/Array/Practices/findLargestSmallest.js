

function findLargest(arr){

    let max = Number.MIN_VALUE;

    arr.forEach(element => {
        if(element>max){ // change to < if wants to output smallest
            max = element;
        }
            
    });

    console.log(max);
}   

function main(){
    let arr = [-20, 34, 21, -87, 92, 2147483647]
    findLargest(arr);
}

main()