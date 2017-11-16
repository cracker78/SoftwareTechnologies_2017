function printNumbersInReversedOrder(arr) {
    arr.reverse()

    let num=arr.length;

    for(let i=0; i<num; i++){
        console.log(arr[i]);
    }

}