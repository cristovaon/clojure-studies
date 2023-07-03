(ns clojure-first-project.basics.higher-order-functions)

; higher-order functions
(defn get-taxa-padrao
  []
  0.3)

(defn get-taxa-padrao-database
  []
  0.2)

(defn imposto-retido
  [get-taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario (get-taxa-padrao))))


(imposto-retido get-taxa-padrao 1000)

(defn get-taxa-padrao-por-ambiente
  [ambiente]
  (if (= ambiente :teste)
    get-taxa-padrao
    get-taxa-padrao-database))

(imposto-retido (get-taxa-padrao-por-ambiente :producao) 1000)

; função anônima
((fn [x]  (* x 2)) 3)
(#(* 2 %) 3)

(imposto-retido (fn [] 0.10) 1000)
(imposto-retido (constantly 0.10) 1000)

