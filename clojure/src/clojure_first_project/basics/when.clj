(ns clojure-first-project.basics.when)

; when statement
(defn print-welcome-message
  [age]
  (when (>= age 18)
    (println "Boas vindas para você")
    (println "Que é maior de idade!")))
