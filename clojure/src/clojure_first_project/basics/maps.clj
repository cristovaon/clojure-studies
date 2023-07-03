(ns clojure-first-project.basics.maps)



(defn get-compras
  []
  {:tomate {:quantidade 5 :preco 2}
   :arroz  {:quantidade 3 :preco 3}})

(get-compras)

(get (get-compras) :tomate)

; if the map is nil, it returns NullPointerException
((get-compras) :tomate)

; recommended way
(:tomate (get-compras))

; nested key
(:quantidade (:tomate (get-compras)))

; default value if key is not found
(:batata (compras) {:quantidade 0 :preco 0})

; merges two maps, overrides if there's equal keys
(conj (get-compras) {:alface {:quantidade 8 :preco 2}})

; adds key in the map
(assoc (get-compras) :alface {:quantidade 2 :preco 4})

; removes n keys from the map
(dissoc (get-compras) :tomate :arroz)

; updates an existing key
(assoc (get-compras) :tomate {:quantidade 15 :preco 20})

; appropriate way to update a key in a raw map
(update {:name "Cristovao" :age 20} :age inc)

; update a key in a nested map
(update-in (get-compras) [:tomate :preco] * 2)
