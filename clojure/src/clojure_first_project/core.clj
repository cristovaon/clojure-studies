(ns clojure-first-project.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn remover-ultima-compra
  [compras]
  (pop compras))

(defn calcula-media
  [nota1 nota2 nota3]
  (/ (+ nota1 nota2 nota3) 3))

(calcula-media 1 2 3)

(remover-ultima-compra ["Compras"])