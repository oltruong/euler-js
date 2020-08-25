(ns euler.problems-test
    (:require [clojure.test :refer :all]
      [euler.problem1 :refer :all]
      ))

(deftest problem1-test
         (testing "Problem 1"
                  (is (= 233168 (problem1)))))

