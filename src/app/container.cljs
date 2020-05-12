
(ns app.container
  (:require [phlox.core :refer [defcomp hslx rect circle text container graphics create-list]]))

(defcomp
 comp-container
 (store)
 (let [states (:states store)
       cursor []
       state (or (:data states) {:count 0})]
   (container
    {}
    (rect {:position [40 80]
           :size [80 80]
           :fill (hslx 200 60 90)
           :on {:pointertap (fn [e d!] (d! cursor (update state :count inc)))}})
    (text {:text (str "Clicked " (:count state) " times.")
           :position [20 20]
           :style {:fill (hslx 240 80 80)
                   :font-family "Helvetica Neue"
                   :font-weight 300}}))))
