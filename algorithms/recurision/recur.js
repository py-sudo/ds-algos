function foo(n) {
  if (n < 1) return;
  else foo(n - 1);
  console.log("hello world  " + n);
}

function factorial(n) {
  if (n == 0) return 1;
  else return n * factorial(n - 1);
}


function fibonacci(n){
    // if(n<0) return error
    if(n==1 || n==2) return n-1; // case 1 and 2 will return 0 and 1 respectively
    else return fibonacci(n-1) + fibonacci(n-2)
}

function fibonacci_loop(n){
    let current = 1;
    let preNum = 0;
    let prepreNum = 0;
    
    if(n<0) return;
    if(n==1) return 0;
    if(n==2) return 1;
    for(let i=3;i<=n;i++){
        prepreNum = preNum;
        preNum=current;
        current= preNum+prepreNum;
    }
    return current;
}

function main() {
   let loop = fibonacci_loop(4);
   let recur = fibonacci(4)
   console.log(loop)
   console.log(recur)

}

main();
