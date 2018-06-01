(ns it-does-not.work
  (:require [http]))

(defn -main [& args]
  (-> (http/createServer
       (fn [req res]
         (.end res "Bye!")))
      (.listen 8080)))
