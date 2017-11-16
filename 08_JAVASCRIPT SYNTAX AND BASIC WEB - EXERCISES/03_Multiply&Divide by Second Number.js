function multiplyAndDivide(arr) {
    let number1=Number(arr[0]);
    let number2=Number(arr[1]);
    let result=0;

    if (number1<=number2){
        result=number1*number2;
    }
    else{
        result=number1/number2;
    }

    console.log(result)
}