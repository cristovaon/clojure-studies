(ns clojure-first-project.basics.let)

; let
(defn calcula-imposto-retido
  "salario < 1000 - não tem imposto
   salario < 2000 - imposto 10%
   salario >= 2000 - imposto 10%
   "
  [salario]
  (let [imposto-faixa01 0
        imposto-faixa02 0.1
        imposto-faixa03 0.2]
    (if (<= salario 1000)
      (* salario imposto-faixa01)
      (if (< salario 2000)
        (* salario imposto-faixa02)
        (* salario imposto-faixa03)))))


(defn get-valor-total
  "Calcula o valor total incluindo a multa"
  [valor]
  (let [percentual-multa 0.1
        valor-multa (* valor percentual-multa)]
    (+ valor valor-multa)))
