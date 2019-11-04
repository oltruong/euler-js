package com.oltruong

import com.oltruong.lib.PalindromeFinder
import com.oltruong.lib.PrimeFinder

class Problem5 {

    static def getValue() {
        smallestMultiple(20)
    }

    static def smallestMultiple(number) {


        List<Boolean> primes = PrimeFinder.primeFinder(number)

        def result=1

        for (i in 1..primes.size()-1){
            if (primes.get(i)){
                int maxPower=i
                while (maxPower<=number){
                    maxPower  *=i
                }
                result *=maxPower/i
            }
        }

        result



    }


}
