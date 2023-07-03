 (ns clojure-first-project.basics.vector)

; get element by index
(defn get-third-element
  [elements]
  (get elements 2 "Unknown"))

(defn replace-first-element
  [elements new-element]
  (assoc elements 0 new-element))
