(ns test-protocol-testing.a-protocol)

(set! *warn-on-reflection* true)


(defprotocol AProtocol
  "A doc string for AProtocol abstraction"
  (bar [this a b] "bar docs")
  (baz [this a] "baz docs"))

