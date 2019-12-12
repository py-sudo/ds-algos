const ArrayList = require('./ArrayList');


function main(){


    let myArr = new ArrayList(3);

    myArr.insert(0,"a");
    myArr.insert(1,"b");
    myArr.insert(2,"A")
    console.log(myArr.size());

}

main()