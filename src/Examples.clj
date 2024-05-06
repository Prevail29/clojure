(ns Examples)

;; Increment x by 1
((fn [x]
   (+ x 1)) 1)

;; Subtract 1 from x 
((fn [x]
   (- x 1)) 5)

;; Multiply x with 2
((fn [x]
   (* x 2)) 3)

;; Divide x with 2
((fn [x]
   (/ x 2)) 10)