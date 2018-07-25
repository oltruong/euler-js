"use strict";

function problem() {

    let number =1;

    let counter=2;

    while(divisors(number)<=500){
        number += counter;
        counter++;
    }

    return number;

    function divisors(number){
        let divisorsNumber=2;
        const square=Math.sqrt(number);
        for (let i=2;i<=square;i++){
            if (number % i==0){
                divisorsNumber+=2;
            }
        }

        if (square*square== number){
            divisorsNumber--;
        }
        return divisorsNumber;
    }
}

module.exports = problem;