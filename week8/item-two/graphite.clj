(ns examplecom.etc.graphite
  (:require [riemann.graphite :refer :all]
            [riemann.config :refer :all]))


(defn add-enviornment-to-graphite [event] (str
"productiona.hosts.", (riemann.graphite/graphite-path-percentiles event)))

(def graph (async-queue! :graphite {:queue-size 1000}
             (graphite {:host "graphitea" :path add-enviornment-to-graphite})))