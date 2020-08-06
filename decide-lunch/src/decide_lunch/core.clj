(ns decide-lunch.core
  (:gen-class))

(defn -main
  "This program decides where we are going for lunch."
  [& args]

  (def wendys                 7)
  (def hardees   (+ wendys    2))
  (def bojangles (+ hardees   4))
  (def popeyes   (+ bojangles 6))
  (def kfc       (+ popeyes   4))
  (def bk        (+ kfc       5))
  (def tacobell  (+ bk        2))
  (def mcds      (+ tacobell  3))
  (def arbys     (+ mcds      6))
  
  (def x arbys)

  (defn print-cond [xx]
    (cond
      (< xx wendys) "Wendy's"
      (< xx hardees) "Hardee's"
      (< xx bojangles) "Bojangles"
      (< xx popeyes) "Popeyes"
      (< xx kfc) "KFC"
      (< xx bk) "BK"
      (< xx tacobell) "Tacobell"
      (< xx mcds) "McD's"
      (< xx arbys) "Arby's"
      :else "No restuarant"))

  (println (print-cond (rand-int x))))
