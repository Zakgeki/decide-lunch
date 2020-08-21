(defproject decide-lunch "0.1.0-SNAPSHOT"
  :description "A program to determine where to go to lunch using a weighted list"
  :url "http://example.com/FIXME"
  :license {:name "The MIT License (MIT)"
            :url "https://www.mit-license.org"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot decide-lunch.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
