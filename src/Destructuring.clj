(ns Destructuring)

;; Getting a specific value
(first [1, 2, 3])

;; Remaining values
(rest [1, 2, 3])

;; Combining both
(first (rest [1, 2, 3]))

;; Multiple values in sequential
(let [[a b] [1 2]]
  (+ a b))

;; Unneeded values
(let [[_ [_ a _]] [1 [1 2 3]]]
  a)

;; Later values are ignored
(let [[a b] [1 2 3]]
  (+ a b))

;; Nil binding
(let [[_ b] [1]]
  b)

;; Associative
(let [{H2 :a, S6 :b} {:a 2, :b 6}]
  (+ H2 S6))
