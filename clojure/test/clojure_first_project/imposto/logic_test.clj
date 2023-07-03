 (ns clojure-first-project.imposto.logic-test
  (:require [clojure.test :refer :all]
            [clojure-first-project.core :refer :all]))

"Se o valor da compra for até 100, deve-se cobrar 15 reais de taxa de entrega.
 Se for maior que 100 e menor que 200, 5 reais.
 Se for acima de 200, a taxa é gratuita.
"

 (deftest calcula-taxa-entrega-test
   (testing "15 reais"
     (is (= 15 (calcula-taxa-entrega 1)))
     (is (= 15 (calcula-taxa-entrega 100))))
   (testing "5 reais"
     (is (= 5 (calcula-taxa-entrega 100.0001)))
     (is (= 5 (calcula-taxa-entrega 200))))
   (testing "0 reais"
     (is (= 0 (calcula-taxa-entrega 200.01)))
     (is (= 0 (calcula-taxa-entrega 4999)))))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
