(ns test-protocol-testing.impl1-test
  (:require
    [test-protocol-testing.a-protocol-test :as protocol-test]
    [test-protocol-testing.impl1 :as impl1]))


(defn test-ns-hook []
  (binding [protocol-test/*impl* (impl1/->ProtocolImpl1)]
    (println "Running impl1-test")
    (protocol-test/test-suite)
    (println "[DONE] Running impl1-test")))
