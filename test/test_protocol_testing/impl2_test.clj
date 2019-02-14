(ns test-protocol-testing.impl2-test
  (:require
    [test-protocol-testing.a-protocol-test :as protocol-test]
    [test-protocol-testing.impl2 :as impl2]))


(defn test-ns-hook []
  (binding [protocol-test/*impl* (impl2/->ProtocolImpl2)]
    (println "Running impl2-test")
    (protocol-test/test-suite)
    (println "[DONE] Running impl2-test")))
