let arr=[43,44,54,56]
let a=arr.map((value,index,array)=>{
    console.log(value,index,array)
    return value+1
});
console.log(a)