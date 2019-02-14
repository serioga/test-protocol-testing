(ns test-protocol-testing.impl2
  (:require
    [test-protocol-testing.a-protocol :as protocol]))


(deftype ProtocolImpl2 []
  protocol/AProtocol
  (bar [this a b]
    (println "ProtocolImpl2" "bar")
    (print-str "bar" a b))
  (baz [this a]
    (println "ProtocolImpl2" "baz")
    (print-str "baz" a)))
