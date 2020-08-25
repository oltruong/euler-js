(ns euler.problem1
    (:gen-class))

(defn problem1
      []
      (reduce + (filter #(or (= (mod % 5) 0) (= (mod % 3) 0)) (range 1000)))
      )