(ns clojure-first-project.basics.filter-map-reduce)

; filter, map, reduce

(defn quantidade-de-alunos-por-ano
  [ano alunos]
  (let [alunos-ano (filter #(= ano %) alunos)]
    (count alunos-ano)))



(defn soma-elementos-vetor
  [elementos]
  (reduce + elementos))


(defn media-tamanho-nomes
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))

(quantidade-de-alunos-por-ano 3 [5 5 2 3 3 1])
