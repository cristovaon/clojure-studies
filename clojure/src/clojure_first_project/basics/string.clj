(ns clojure-first-project.basics.string
  :require [clojure.string :as str])

; string manipulation with string namespace
(def myName "Cristovão Pessoa Cândido Neto")
(str/blank? myName)
(str/includes? myName "Cris")
(str/index-of myName "Neto")
(str/split myName #" ")
(str/split myName #"\d")
(str/join " " ["Primitive" "Types"])
(str/replace "I am 19" #"19" "20")
(str/lower-case myName)
(str/upper-case myName)
