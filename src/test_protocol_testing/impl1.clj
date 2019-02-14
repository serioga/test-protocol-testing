(ns test-protocol-testing.impl1
  (:require
    [test-protocol-testing.a-protocol :as protocol]))


(deftype ProtocolImpl1 []
  protocol/AProtocol
  (bar [this a b]
    (println "ProtocolImpl1" "bar")
    (print-str "bar" a b))
  (baz [this a]
    (println "ProtocolImpl1" "baz")
    (print-str "baz" a)))
