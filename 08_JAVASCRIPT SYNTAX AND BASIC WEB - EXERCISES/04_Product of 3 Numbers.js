function productOfTreeNumbers(arr) {
    let num1=Number(arr[0]);
    let num2=Number(arr[1]);
    let num3=Number(arr[2]);

    let result=num1*num2*num3;

    if(result>=0){
        console.log("Positive");
    }
    else{
        console.log("Negative");
    }
}