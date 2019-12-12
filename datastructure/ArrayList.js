function checkIndex(index,len){
    if(typeof index !='number'){
        return {error:true,msg:'Index is NaN'};
    }

    if(len == 0 && index==0){
        return{error:false,msg:"ok"};
    }

    if(index > len - 1 ){
        return {error:true,msg:'Index out of bound!'};
    }
    return{error:false,msg:"ok"};

}

function checkElement(e){
    
    if(typeof e =='undefined'|| e == null){
       return {error:true,msg:'Invalid arguments!'};
    }
    return{error:false,msg:"ok"};

}

class ArrayList {

    constructor(size){
 
        if(Array.from(arguments).length>0){
            if(typeof size !='number'|| size<=0){
                throw new Error('Invalid arguments');
            }
            
            this.arr = new Array(size);
            this.len = size;
        }else
            throw new Error('Invalid arguments');
        

    }

    insert(index,e){

    
        if(checkIndex(index,this.arr.length).error){
            throw new Error(checkIndex(index,this.arr.length).msg);
        }

        if(checkElement(e).error){
            throw new Error(checkElement(e).msg);
        }

        

        let firstHalf = this.arr.slice(0,index);
        let secondHalf = this.arr.slice(index);
        firstHalf.push(e);

        this.arr = firstHalf.concat(secondHalf);


    }

    get(index){

        if(checkIndex(index,this.arr.length).error){
            throw new Error(checkIndex(index,this.arr.length).msg);
        }

        return this.arr(index);

    }

    delete(index){
        if(checkIndex(index,this.arr.length).error){
            throw new Error(checkIndex(index,this.arr.length).msg);
        }
        let temp = this.arr[index];

        this.arr.slice(0,index).concat(this.arr.slice(index+1));
        return temp;
    }

    size(){
        return this.arr.length;
    }

}

module.exports = ArrayList;