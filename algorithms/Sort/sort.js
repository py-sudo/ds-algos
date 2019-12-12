// let arr = [1,3,5,6,72,2,4,2,1,14,321,5,6]



//O(n^2)
function selection_sort(arr) {
    for (let i = 0; i < arr.length - 1; i++) {

        let minIndex = i;

        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        let temp = A[i];
        A[i] = A[minIndex];
        A[minIndex] = temp;
    }

}

function bubble_sort(arr) {

    let temp;
    let swapped;
    for (let i = 0; i < arr.length; i++) {
        swapped = false;
        for (let j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                //swap
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped)
            break;
    }


}
// bubble_sort(arr)
//nlogn merge sort
let merge_source = [9, 7, 8, 1, 2, 3];

function merge(left, right) {
    let newArr = [];

    while (left.length && right.length) {
        if (left[0] > right[0]) {
            count += left.length;
            newArr.push(right.shift());
        } else {
            newArr.push(left.shift());
        }

    }
    while (left.length) {
        newArr.push(left.shift())
    }
    while (right.length) {
        newArr.push(right.shift())
    }
    return newArr;

}

function mergeSort(arr) {
    if (arr.length < 2)
        return arr;

    let mid = Math.floor(arr.length / 2);

    let left = arr.slice(0, mid);
    let right = arr.slice(mid);
    let leftArr = mergeSort(left);
    let rightArr = mergeSort(right);

    return merge(leftArr, rightArr);

}



function main() {

}

main()