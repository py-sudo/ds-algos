//add from top to bottom
//from the left to right
//


//nlogn heap sort
//complete binary tree
//parrent > children


//n : number of nodes
// i : index of nodes to be heapified




function swap(tree, a, b) {
    let temp = tree[a];
    tree[a] = tree[b];
    tree[b] = temp;
}


//build complete binary tree
// from h-1
// moving upwards

// parent = (i-1)/2
//c1 = 2i+1
//c2 = 2i+2

function heapify(tree, index) {

    if (index >= tree.length)
        return;

    let c1 = 2 * index + 1;
    let c2 = 2 * index + 2;
    let max = index;

    if (c1 < tree.length && tree[c1] > tree[max]) {
        max = c1;
    }

    if (c2 < tree.length && tree[c2] > tree[max]) {
        max = c2;
    }

    if (max != index) {
        swap(tree, max, index); //swapped value
        heapify(tree, max)
    }
}




function buildHeap(tree){

    let lastNodeIndex = tree.length-1;
    let parent = (lastNodeIndex-1)/2;

    for(let i=parent;i>=0;i--){
        heapify(tree,i)       
    }
}


function heapSort(tree){
    //In a complete binary tree, the root is always the largest element
    // parent has to be larger than children
    let sortedArr = [];

    for(let i=tree.length-1;i>=0;i--){
        swap(tree,0,i);
        let val = tree.pop();
        sortedArr.unshift(val);
        heapify(tree,0);

    }
    return sortedArr;
}



function main() {

    //  let tree = [4, 10, 3, 5, 1, 2];
    let tree = [2,5,3,1,10,4];
  
     // heapify(tree,0);
     buildHeap(tree);
     let arr = heapSort(tree);
     console.log(arr)
  }
  
  main()