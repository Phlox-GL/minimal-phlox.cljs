
(ns app.updater )

(defn updater [store op op-data op-id op-time]
  (case op
    :states
      (let [[cursor new-state] op-data]
        (assoc-in store (concat [:states] cursor [:data]) new-state))
    (do (println "unknown op" op op-data) store)))
