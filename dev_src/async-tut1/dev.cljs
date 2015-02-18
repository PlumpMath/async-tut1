(ns async-tut1.dev
  (:require [async-tut1.core]
            [figwheel.client :as fw]))

(fw/start {:on-jsload (fn [] (print "reloaded"))})
