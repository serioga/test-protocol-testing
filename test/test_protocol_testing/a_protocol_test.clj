(ns test-protocol-testing.a-protocol-test
  (:require
    [clojure.test :as test]
    [test-protocol-testing.a-protocol :as protocol]))


(def ^:dynamic *impl* nil)

(test/deftest test-bar
  (println "Running test-bar")
  (test/is (= "bar 1 2" (protocol/bar *impl* 1 2))))


(test/deftest test-baz
  (println "Running test-baz")
  (test/is (= "baz 3" (protocol/baz *impl* 3))))


(defn test-suit
  []
  (test-bar)
  (test-baz))


(defn test-ns-hook [])
