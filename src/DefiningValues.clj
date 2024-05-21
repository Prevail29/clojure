(ns DefiningValues)

;; Define constant
(def tau 6.28)

;; Calculating with constant
(* tau 2)

;; Using constant in funciton
((fn [x]
   (+ tau x)) 2)

;; Multiply number with Pi
((fn [x]
   (let [Pi 3.14]
     (* Pi x))) 10)


